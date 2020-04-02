package mod.linguardium.pestcontrol.blocks;

import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.util.math.Vector4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Tickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RepellentEntity extends BlockEntity implements Tickable {
    protected int tickCount =0;
    protected int distance = 7;
    protected boolean hurt;
    protected ArrayList<EntityType> entityType=new ArrayList();
    public RepellentEntity(BlockEntityType<?> type) {
        super(type);
        hurt=false;
    }
    public RepellentEntity(BlockEntityType<?> type, boolean damage) {
        super(type);
        hurt=damage;
    }
    public RepellentEntity(BlockEntityType<?> type, List<EntityType> deterType) {
        super(type);
        entityType.addAll(deterType);
        hurt=false;
    }
    public RepellentEntity(BlockEntityType<?> type, List<EntityType> deterType, boolean damage) {
        super(type);
        entityType.addAll(deterType);
        hurt = damage;
    }
    public boolean entityCompare(Entity e) {
        return entityType.contains(e.getType());
    }

    @Override
    public void tick() {
        BlockPos pos = this.getPos();
        if (!world.isClient()) {
            if (tickCount >= 5) {
                //Box EntBox = new Box(this.getPos().offset(Direction.NORTH, 5).offset(Direction.EAST, 5), this.getPos().offset(Direction.SOUTH, 5).offset(Direction.WEST, 5));
                Box eBox = new Box(this.getPos());
                eBox = eBox.expand(distance,1,distance);
                List<Entity> eInRange;
                eInRange = world.getEntities((Entity) null, eBox, (entity) -> entityCompare(entity) && pos.getManhattanDistance(entity.getBlockPos()) <= distance);

                List<Entity> AllEInRange = world.getEntities((Entity) null, eBox, null);
                eInRange.forEach((entity) -> {
                    boolean negX = entity.getX() < pos.getX();
                    boolean negZ = entity.getZ() < pos.getZ();
                    double DX = (negX) ? -0.5D : 0.5D;
                    double DZ = (negZ) ? -0.5D : 0.5D;//entity.getZ() - pos.getZ();
                    if ( hurt && entity instanceof LivingEntity && ((LivingEntity)entity).getRecentDamageSource()==null) {
                        entity.damage(DamageSource.MAGIC,0.5F);
                    }
//            if (negX) { DX = DX*-1; }
//            if (negZ) { DZ = DZ*-1; }
                    entity.setVelocity(DX, entity.getVelocity().getY(), DZ);
                    entity.velocityModified = true;
                    entity.velocityDirty = true;
                });
                tickCount = 0;
            } else {
                tickCount++;
            }
        }
    }
}
