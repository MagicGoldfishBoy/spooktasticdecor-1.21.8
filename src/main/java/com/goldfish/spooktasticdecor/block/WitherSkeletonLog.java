package com.goldfish.spooktasticdecor.block;

import javax.annotation.Nullable;

import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

public class WitherSkeletonLog extends RotatedPillarBlock {

    public WitherSkeletonLog(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate)
    {
        if (ItemAbilities.AXE_STRIP == itemAbility)
        {
            return simpleblockregistry.WITHER_SKELETON_LOG_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
        }
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
    
}
