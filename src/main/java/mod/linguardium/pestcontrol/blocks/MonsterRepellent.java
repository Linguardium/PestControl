package mod.linguardium.pestcontrol.blocks;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;

public class MonsterRepellent extends RepellentStick {
    protected MonsterRepellent(Settings settings) {
        super(settings);
    }


    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new MonsterRepellentEntity();
    }
}
