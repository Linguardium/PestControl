package mod.linguardium.pestcontrol.items;

import mod.linguardium.pestcontrol.PestControl;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class initItems {
    final static FoodComponent CreeperFoodComponent =  new FoodComponent.Builder().hunger(4).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 1), 0.3F).meat().build();

    public static final Item SPIDER_LEG = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final CreeperSkin CREEPER_SKIN = new CreeperSkin(new Item.Settings().group(ItemGroup.MISC).food(CreeperFoodComponent));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(PestControl.MOD_ID, "spider_leg"), SPIDER_LEG);
        Registry.register(Registry.ITEM, new Identifier(PestControl.MOD_ID, "creeper_skin"), CREEPER_SKIN);
    }
}
