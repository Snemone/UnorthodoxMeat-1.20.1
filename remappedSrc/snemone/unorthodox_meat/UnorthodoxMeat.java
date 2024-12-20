package snemone.unorthodox_meat;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snemone.unorthodox_meat.item.ModItems;

public class UnorthodoxMeat implements ModInitializer {
	public static final String MOD_ID = "unorthodox_meat";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info(MOD_ID + " has initialized");

		//Registers Items
		ModItems.registerModItems();
	}
}