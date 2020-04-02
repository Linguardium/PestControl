package mod.linguardium.pestcontrol.blocks;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;

public class UndeadRepellent extends RepellentStick {
    protected UndeadRepellent(Settings settings) {
        super(settings);
    }


    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new UndeadRepellentEntity();
    }
}
