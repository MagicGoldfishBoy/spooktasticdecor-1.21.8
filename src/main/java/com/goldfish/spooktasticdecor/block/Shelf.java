package com.goldfish.spooktasticdecor.block;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Shelf extends HorizontalDirectionalBlock {

    public static final MapCodec<Shelf> CODEC = simpleCodec(Shelf::new);
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public Shelf(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(@SuppressWarnings("null") StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Override
    public VoxelShape getShape(@SuppressWarnings("null") BlockState state, @SuppressWarnings("null") BlockGetter world, @SuppressWarnings("null") BlockPos pos, @SuppressWarnings("null") net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(FACING)) {
            case Direction.NORTH -> Shapes.box(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
            case Direction.EAST -> Shapes.box(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
            case Direction.SOUTH -> Shapes.box(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
            case Direction.WEST -> Shapes.box(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
            default -> Shapes.box(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);
        };
        return facing;
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(@SuppressWarnings("null") BlockPlaceContext pContext) {
       return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }
    
}
