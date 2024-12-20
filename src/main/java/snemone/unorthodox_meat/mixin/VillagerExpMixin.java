package snemone.unorthodox_meat.mixin;

import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PassiveEntity.class)
public abstract class VillagerExpMixin {
    public int getXpToDrop() {
        return 0;
    }
}
