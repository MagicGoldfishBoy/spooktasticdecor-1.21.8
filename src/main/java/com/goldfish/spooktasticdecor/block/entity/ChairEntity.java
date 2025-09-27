package com.goldfish.spooktasticdecor.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.syncher.SynchedEntityData;

public class ChairEntity extends Entity {

    public ChairEntity(EntityType<?> type, Level level) {
        super(type, level);
        this.noPhysics = true;     // don’t collide with blocks
       // this.noCulling = true;     // always render (optional, avoids weird invisibility)
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        // No custom data needed
    }

    @Override
    protected void readAdditionalSaveData(ValueInput input) {
        // Not persistent → no NBT data
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput output) {
        // Not persistent → no NBT data
    }

    @Override
    public boolean shouldBeSaved() {
        return false; // don’t save seat entities across world saves
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide()) {
            BlockPos pos = this.blockPosition();

            // remove if no rider or block is gone
            if (this.getPassengers().isEmpty() || this.level().isEmptyBlock(pos)) {
                this.discard();
                this.level().gameEvent(GameEvent.ENTITY_DIE, pos, GameEvent.Context.of(this));
            }
        }
    }

    @Override
    public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
        // allow punching the seat to remove it
        this.discard();
        return true;
    }
}

//extends Entity {
//     public ChairEntity(EntityType<?> type, Level world) {
//         super(type, world);
//     }

//     @Override
//     protected void defineSynchedData(SynchedEntityData.Builder builder) {

//     }

//     @Override
//     public boolean hurtServer(ServerLevel world, DamageSource source, float amount) {
//         return false;
//     }

//     @Override
//     protected void readAdditionalSaveData(ValueInput valueInput) {

//     }

//     @Override
//     protected void addAdditionalSaveData(ValueOutput valueOutput) {

//     }

//     protected void kill(){
//         this.remove(RemovalReason.KILLED);
//         this.gameEvent(GameEvent.ENTITY_DIE);
//     }

//     @Override
//     protected void removePassenger(Entity passenger) {
//         super.removePassenger(passenger);
//         this.kill();
//     }
// }



