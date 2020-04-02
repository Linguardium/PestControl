package mod.linguardium.pestcontrol.blocks;

import net.minecraft.entity.*;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UndeadRepellentEntity extends RepellentEntity  {
    public UndeadRepellentEntity() {
        super(initBlocks.UNDEAD_REPELLENT_ENTITY);
    }


    @Override
    public boolean entityCompare(Entity e) {
        if (e instanceof LivingEntity)
            return ((LivingEntity) e).getGroup()== EntityGroup.UNDEAD;
        return false;
    }
}
