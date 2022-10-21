package net.poetinsectmath.endmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.poetinsectmath.endmod.EndMod;

public class ModItemGroup {
    public static final ItemGroup ENDMOD = FabricItemGroupBuilder.build(
            new Identifier(EndMod.MOD_ID, "endmod"), () -> new ItemStack(ModItems.END_STEW));
}
