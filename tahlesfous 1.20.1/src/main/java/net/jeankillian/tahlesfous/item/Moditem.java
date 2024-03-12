package net.jeankillian.tahlesfous.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jeankillian.tahlesfous.Tahlesfous;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Moditem {
    public static final Item CACA = registerItem("caca", new Item(new FabricItemSettings()));
    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(CACA);
    }

    private static Item registerItem(String name, Item item){
       return Registry.register(Registries.ITEM, new Identifier(Tahlesfous.MOD_ID, name), item);
    }
    public static void registerModitem(){
        Tahlesfous.LOGGER.info("registering Mod Items for " + Tahlesfous.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(Moditem::addItemToIngredientItemGroup);
    }
}
