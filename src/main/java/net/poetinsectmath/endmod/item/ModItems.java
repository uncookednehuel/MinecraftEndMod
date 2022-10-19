package net.poetinsectmath.endmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.poetinsectmath.endmod.EndMod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item END_STEW = registerItem("end_stew",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(EndMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        EndMod.LOGGER.debug("Registering mod items for " + EndMod.MOD_ID);
    }
}
