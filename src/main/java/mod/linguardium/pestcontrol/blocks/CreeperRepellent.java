package mod.linguardium.pestcontrol.blocks;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;

public class CreeperRepellent extends RepellentStick {
    protected CreeperRepellent(Settings settings) {
        super(settings);
    }


    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new CreeperRepellentEntity();
    }
}
