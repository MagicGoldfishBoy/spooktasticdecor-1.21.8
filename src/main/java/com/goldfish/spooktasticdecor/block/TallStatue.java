package com.goldfish.spooktasticdecor.block;

import javax.annotation.Nullable;

import com.goldfish.spooktasticdecor.registry.CodecRegistry;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallStatue extends HorizontalDirectionalBlock {

    public TallStatue(Properties properties) {
        super(properties);
            this.registerDefaultState(stateDefinition.any()
            .setValue(FACING, Direction.NORTH)
        );
    }
    @SuppressWarnings("null")
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @SuppressWarnings("null")
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(FACING)) {
            case Direction.NORTH -> Shapes.box(0.0, 0.0, 0.0, 1.0, 2.0, 1.0);
            case Direction.EAST -> Shapes.box(0.0, 0.0, 0.0, 1.0, 2.0, 1.0);
            case Direction.SOUTH -> Shapes.box(0.0, 0.0, 0.0, 1.0, 2.0, 1.0);
            case Direction.WEST -> Shapes.box(0.0, 0.0, 0.0, 1.0, 2.0, 1.0);
            default -> Shapes.box(0.0, 0.0, 0.0, 1.0, 2.0, 1.0);
        };
        return facing;
    }

    @SuppressWarnings("null")
    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result) {
        if (level.isClientSide()) {
            level.playSound(player, pos, SoundEvents.COPPER_HIT, SoundSource.BLOCKS);
            return InteractionResult.CONSUME;
        }
        else {
            return InteractionResult.SUCCESS;
        }
        
    }

    @SuppressWarnings("null")
    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
       return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CodecRegistry.TALL_STATUE_CODEC.get();
    }
    
}
