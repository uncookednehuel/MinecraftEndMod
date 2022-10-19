package net.poetinsectmath.endmod;

import net.fabricmc.api.ModInitializer;
import net.poetinsectmath.endmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndMod implements ModInitializer {
	public static final String MOD_ID = "endmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
