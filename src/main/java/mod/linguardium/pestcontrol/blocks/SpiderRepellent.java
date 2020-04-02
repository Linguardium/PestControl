package mod.linguardium.pestcontrol.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class SpiderRepellent extends RepellentStick {
    protected SpiderRepellent(Settings settings) {
        super(settings);
    }


    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new SpiderRepellentEntity();
    }
}
