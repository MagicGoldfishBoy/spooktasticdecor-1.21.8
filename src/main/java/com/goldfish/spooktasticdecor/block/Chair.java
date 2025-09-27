package com.goldfish.spooktasticdecor.block;

import javax.annotation.Nullable;

import com.goldfish.spooktasticdecor.SpooktasticDecor;
import com.goldfish.spooktasticdecor.block.entity.ChairEntity;
import com.goldfish.spooktasticdecor.registry.CodecRegistry;
import com.goldfish.spooktasticdecor.registry.EntityRegistry;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Chair extends HorizontalDirectionalBlock {
    private static final VoxelShape SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);
    //public static final MapCodec<Chair> CODEC = simpleCodec(Chair::new);
    public Chair(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CodecRegistry.CHAIR_CODEC.get();
    }

@Override
protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
    if(!level.isClientSide()) {
        SpooktasticDecor.LOGGER.info("Right-clicking chair on server side");
        
        if (player.isPassenger()) {
            SpooktasticDecor.LOGGER.info("Player is already riding something");
            return InteractionResult.PASS;
        }
        
        try {
            ChairEntity entity = new ChairEntity(EntityRegistry.CHAIR_ENTITY.get(), level);
            
            double x = pos.getX() + 0.5;
            double y = pos.getY() + 0.3;
            double z = pos.getZ() + 0.5;
            
            entity.setPos(x, y, z);
            level.addFreshEntity(entity);
            
            level.getServer().execute(() -> {
                // More detailed debugging
                SpooktasticDecor.LOGGER.info("=== DETAILED RIDE DEBUG ===");
                SpooktasticDecor.LOGGER.info("Player can ride entity: " + entity.canRide(player));
                SpooktasticDecor.LOGGER.info("Entity can add passenger: " + entity.canAddPassenger(player));
                SpooktasticDecor.LOGGER.info("Player is passenger: " + player.isPassenger());
                SpooktasticDecor.LOGGER.info("Entity is alive: " + entity.isAlive());
                SpooktasticDecor.LOGGER.info("Entity is removed: " + entity.isRemoved());
                SpooktasticDecor.LOGGER.info("Same level: " + (player.level() == entity.level()));
                SpooktasticDecor.LOGGER.info("Entity passenger count: " + entity.getPassengers().size());
                
                // Try the reverse approach - entity tries to add player
                try {
                    // Use reflection to call the protected addPassenger method
                    java.lang.reflect.Method addPassengerMethod = Entity.class.getDeclaredMethod("addPassenger", Entity.class);
                    addPassengerMethod.setAccessible(true);
                    addPassengerMethod.invoke(entity, player);
                    SpooktasticDecor.LOGGER.info("Reflection ride success: " + player.isPassenger());
                } catch (Exception e) {
                    SpooktasticDecor.LOGGER.error("Reflection failed: " + e.getMessage());
                }
                
                boolean rideSuccess = player.startRiding(entity, true);
                SpooktasticDecor.LOGGER.info("Standard ride attempt: " + rideSuccess);
            });
            
        } catch (Exception e) {
            SpooktasticDecor.LOGGER.error("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
    return InteractionResult.SUCCESS;
}
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.box(0.25, 0.0, 0.25, 0.75, 0.5, 0.75);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}