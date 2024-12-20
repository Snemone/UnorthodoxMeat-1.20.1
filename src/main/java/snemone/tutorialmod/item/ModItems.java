package snemone.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import snemone.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item MEAT = registerItem("mysterymeat", new Item(new FabricItemSettings()));
    public static final Item COOKED_MEAT = registerItem("cooked_mysterymeat", new Item(new FabricItemSettings()));


    public static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(MEAT);
        entries.add((COOKED_MEAT));
    }



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
