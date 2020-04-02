package mod.linguardium.pestcontrol.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class initBlocks {
    public static BlockEntityType<SpiderRepellentEntity> SPIDER_REPELLENT_ENTITY;
    public static SpiderRepellent SPIDER_REPELLENT = new SpiderRepellent(FabricBlockSettings.of(Material.PART).lightLevel(15).breakInstantly().nonOpaque().breakByHand(true).noCollision().sounds(BlockSoundGroup.WOOD).build());

    public static BlockEntityType<CreeperRepellentEntity> CREEPER_REPELLENT_ENTITY;
    public static CreeperRepellent CREEPER_REPELLENT = new CreeperRepellent(FabricBlockSettings.of(Material.PART).lightLevel(15).breakInstantly().nonOpaque().breakByHand(true).noCollision().sounds(BlockSoundGroup.WOOD).build());

    public static BlockEntityType<UndeadRepellentEntity> UNDEAD_REPELLENT_ENTITY;
    public static UndeadRepellent UNDEAD_REPELLENT = new UndeadRepellent(FabricBlockSettings.of(Material.PART).lightLevel(15).breakInstantly().nonOpaque().breakByHand(true).noCollision().sounds(BlockSoundGroup.WOOD).build());

    public static BlockEntityType<MonsterRepellentEntity> MONSTER_REPELLENT_ENTITY;
    public static MonsterRepellent MONSTER_REPELLENT = new MonsterRepellent(FabricBlockSettings.of(Material.PART).lightLevel(15).breakInstantly().nonOpaque().breakByHand(true).noCollision().sounds(BlockSoundGroup.WOOD).build());

    public static void init() {

        SPIDER_REPELLENT_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"pestcontrol:spider_repellent_entity", BlockEntityType.Builder.create(SpiderRepellentEntity::new, SPIDER_REPELLENT).build(null));
        Registry.register(Registry.BLOCK, new Identifier("pestcontrol", "spider_repellent"), SPIDER_REPELLENT);
        Registry.register(Registry.ITEM, new Identifier("pestcontrol", "spider_repellent"), new BlockItem(SPIDER_REPELLENT, new Item.Settings().group(ItemGroup.MISC)));

        CREEPER_REPELLENT_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"pestcontrol:creeper_repellent_entity", BlockEntityType.Builder.create(CreeperRepellentEntity::new, CREEPER_REPELLENT).build(null));
        Registry.register(Registry.BLOCK, new Identifier("pestcontrol", "creeper_repellent"), CREEPER_REPELLENT);
        Registry.register(Registry.ITEM, new Identifier("pestcontrol", "creeper_repellent"), new BlockItem(CREEPER_REPELLENT, new Item.Settings().group(ItemGroup.MISC)));

        UNDEAD_REPELLENT_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"pestcontrol:undead_repellent_entity", BlockEntityType.Builder.create(UndeadRepellentEntity::new, UNDEAD_REPELLENT).build(null));
        Registry.register(Registry.BLOCK, new Identifier("pestcontrol", "undead_repellent"), UNDEAD_REPELLENT);
        Registry.register(Registry.ITEM, new Identifier("pestcontrol", "undead_repellent"), new BlockItem(UNDEAD_REPELLENT, new Item.Settings().group(ItemGroup.MISC)));

        MONSTER_REPELLENT_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"pestcontrol:monster_repellent_entity", BlockEntityType.Builder.create(MonsterRepellentEntity::new, MONSTER_REPELLENT).build(null));
        Registry.register(Registry.BLOCK, new Identifier("pestcontrol", "monster_repellent"), MONSTER_REPELLENT);
        Registry.register(Registry.ITEM, new Identifier("pestcontrol", "monster_repellent"), new BlockItem(MONSTER_REPELLENT, new Item.Settings().group(ItemGroup.MISC)));
        
    }
}
