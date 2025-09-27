package com.goldfish.spooktasticdecor.block;

import com.goldfish.spooktasticdecor.block.entity.ChairEntity;
import com.goldfish.spooktasticdecor.registry.EntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import com.mojang.serialization.MapCodec;

import java.util.List;

public class Chair extends HorizontalDirectionalBlock {

    // Block facing property
    public static final EnumProperty<Direction> HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;

    // Chair hitbox (slightly lower than full block)
    private static final VoxelShape SHAPE = Shapes.box(0.0, 0.0, 0.0, 1.0, 0.6, 1.0);

    // Codec for block serialization
    public static final MapCodec<Chair> CODEC = simpleCodec(Chair::new);

    @Override
    public MapCodec<Chair> codec() {
        return CODEC;
    }

    public Chair(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(HORIZONTALFACING, Direction.NORTH));
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult result) {
        if (player.isCrouching()) {
            // Rotate chair when crouch-right-clicked
            level.playSound(player, pos, SoundEvents.MUD_BRICKS_HIT, SoundSource.BLOCKS,
                    1.0F, 0.9F + 0.1F * level.random.nextFloat());

            Direction blockDirection = state.getValue(HORIZONTALFACING);
            Direction newDirection = blockDirection.getClockWise();
            BlockState newState = state.setValue(HORIZONTALFACING, newDirection);
            level.setBlock(pos, newState, Block.UPDATE_ALL);

            return InteractionResult.CONSUME;
        }

        // Sitting logic — only run server-side
        if (!level.isClientSide()) {
            Entity chairEntity = this.getOrCreateChairEntity(level, pos);
            if (chairEntity != null && !player.isPassenger()) {
                return player.startRiding(chairEntity) ? InteractionResult.CONSUME : InteractionResult.PASS;
            }
            return InteractionResult.CONSUME;
        }

        return InteractionResult.SUCCESS;
    }

    /**
     * Find existing chair entity at this block or create one if missing.
     */
    private Entity getOrCreateChairEntity(Level level, BlockPos pos) {
        AABB aabb = new AABB(pos);
        List<ChairEntity> list = level.getEntitiesOfClass(ChairEntity.class, aabb);

        if (!list.isEmpty()) {
            return list.get(0); // reuse existing entity
        }

        ChairEntity entity = new ChairEntity(EntityRegistry.CHAIR_ENTITY.get(), level);
        entity.setPos(pos.getX() + 0.5, pos.getY() + 0.2, pos.getZ() + 0.5);
        level.addFreshEntity(entity);

        return entity;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTALFACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(HORIZONTALFACING,
                context.getHorizontalDirection().getOpposite());
    }
}
