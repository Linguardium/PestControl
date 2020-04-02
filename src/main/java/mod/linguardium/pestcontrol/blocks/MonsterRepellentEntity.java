package mod.linguardium.pestcontrol.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.mob.ZombieVillagerEntity;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

import java.util.List;

public class MonsterRepellentEntity extends RepellentEntity  {
    public MonsterRepellentEntity() {
        super(initBlocks.MONSTER_REPELLENT_ENTITY);
    }

    @Override
    public boolean entityCompare(Entity e) {
        return (e instanceof Monster);
    }
}
