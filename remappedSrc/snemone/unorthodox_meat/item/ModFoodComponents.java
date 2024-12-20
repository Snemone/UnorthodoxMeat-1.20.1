package snemone.unorthodox_meat.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent MEAT = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).meat().build();
    public static final FoodComponent COOKED_MEAT = new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build();
}
