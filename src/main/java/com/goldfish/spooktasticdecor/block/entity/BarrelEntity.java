package com.goldfish.spooktasticdecor.block.entity;

import com.goldfish.spooktasticdecor.block.Barrel;
import com.goldfish.spooktasticdecor.registry.MetalRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Vec3i;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

public class BarrelEntity extends RandomizableContainerBlockEntity {

    public BarrelEntity(BlockPos pos, BlockState blockState) {
        super(MetalRegistry.SOUL_BRONZE_BARREL_ENTITY.get(), pos, blockState);
    }
    private NonNullList<ItemStack> items = NonNullList.withSize(36, ItemStack.EMPTY);
    private final ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
        @Override
        protected void onOpen(Level p_155062_, BlockPos p_155063_, BlockState p_155064_) {
            BarrelEntity.this.playSound(p_155064_, SoundEvents.BARREL_OPEN);
            BarrelEntity.this.updateBlockState(p_155064_, true);
        }

        @Override
        protected void onClose(Level p_155072_, BlockPos p_155073_, BlockState p_155074_) {
            BarrelEntity.this.playSound(p_155074_, SoundEvents.BARREL_CLOSE);
            BarrelEntity.this.updateBlockState(p_155074_, false);
        }

        @Override
        protected void openerCountChanged(Level p_155066_, BlockPos p_155067_, BlockState p_155068_, int p_155069_, int p_155070_) {
        }

        @Override
        protected boolean isOwnContainer(Player p_155060_) {
            if (p_155060_.containerMenu instanceof ChestMenu) {
                Container container = ((ChestMenu)p_155060_.containerMenu).getContainer();
                return container == BarrelEntity.this;
            } else {
                return false;
            }
        }
    };

    @Override
    protected void saveAdditional(ValueOutput p_422559_) {
        super.saveAdditional(p_422559_);
        if (!this.trySaveLootTable(p_422559_)) {
            ContainerHelper.saveAllItems(p_422559_, this.items);
        }
    }

    @Override
    protected void loadAdditional(ValueInput p_422397_) {
        super.loadAdditional(p_422397_);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(p_422397_)) {
            ContainerHelper.loadAllItems(p_422397_, this.items);
        }
    }

    @Override
    public int getContainerSize() {
        return 36;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.barrel");
    }

    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return ChestMenu.fourRows(id, player);
    }

    @Override
    public void startOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.incrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    @Override
    public void stopOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.decrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    public void recheckOpen() {
        if (!this.remove) {
            this.openersCounter.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    void updateBlockState(BlockState state, boolean open) {
        this.level.setBlock(this.getBlockPos(), state.setValue(Barrel.OPEN, open), 3);
    }

    void playSound(BlockState state, SoundEvent sound) {
        Vec3i vec3i = state.getValue(Barrel.FACING).getUnitVec3i();
        double d0 = this.worldPosition.getX() + 0.5 + vec3i.getX() / 2.0;
        double d1 = this.worldPosition.getY() + 0.5 + vec3i.getY() / 2.0;
        double d2 = this.worldPosition.getZ() + 0.5 + vec3i.getZ() / 2.0;
        this.level.playSound(null, d0, d1, d2, sound, SoundSource.BLOCKS, 0.5F, this.level.random.nextFloat() * 0.1F + 0.9F);
    }
}
