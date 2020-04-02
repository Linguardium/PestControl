package mod.linguardium.pestcontrol.blocks;

import com.sun.javafx.geom.Vec2d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Tickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class SpiderRepellentEntity extends RepellentEntity  {
    List<EntityType> eType = DefaultedList.copyOf(null,
    EntityType.SPIDER,
    EntityType.CAVE_SPIDER,
    EntityType.SILVERFISH
                );
    public SpiderRepellentEntity() {
        super(initBlocks.SPIDER_REPELLENT_ENTITY);
    }

    @Override
    public boolean entityCompare(Entity e) {
        if (e instanceof LivingEntity)
            return ((LivingEntity) e).getGroup() == EntityGroup.ARTHROPOD;
        return false;
    }
}
