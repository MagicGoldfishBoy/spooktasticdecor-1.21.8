package com.goldfish.spooktasticdecor.block;

import javax.annotation.Nullable;

import com.goldfish.spooktasticdecor.registry.simpleblockregistry;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

public class ZombieLog extends RotatedPillarBlock {

    public ZombieLog(Properties properties) {
        super(properties);
    }

        @Override
        public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate)
        {
            if (ItemAbilities.AXE_STRIP == itemAbility)
            {
                return simpleblockregistry.ZOMBIE_LOG_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            return super.getToolModifiedState(state, context, itemAbility, simulate);
        }
}
    // @Override
    // public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player, ItemStack stack, ToolAction action) {
    //     if (action == ToolActions.AXE_STRIP && stack.getItem() instanceof AxeItem) {
    //         // Replace 'YourStrippedLogBlock.BLOCK_STATE_HERE' with the actual BlockState of your stripped log
    //         // You might need to copy properties like axis from the original log state
    //         return simpleblockregistry.ZOMBIE_LOG_STRIPPED.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS)); 
    //     }
    //     return super.getToolModifiedState(state, world, pos, player, stack, action);
    // }
    

