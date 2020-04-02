package mod.linguardium.pestcontrol.blocks;

import mod.linguardium.pestcontrol.PestControl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class CreeperRepellentEntity extends RepellentEntity  {
    List<EntityType> eType = DefaultedList.copyOf(null,
                                EntityType.CREEPER,
                                Registry.ENTITY_TYPE.get(new Identifier("creeperspores.creeperling"))

    );
    public CreeperRepellentEntity() {
        super(initBlocks.CREEPER_REPELLENT_ENTITY);
    }

    @Override
    public boolean entityCompare(Entity e) {
        return eType.contains(e.getType());
    }
}
