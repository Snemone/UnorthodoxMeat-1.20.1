package snemone.unorthodox_meat.mixin;

import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(VillagerEntity.class)
public abstract class VillagerExpMixin {
    public int getXpToDrop() {

    }
}
