package net.jeankillian.tahlesfous;

import net.fabricmc.api.ModInitializer;

import net.jeankillian.tahlesfous.item.Moditem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tahlesfous implements ModInitializer {
	public static final String MOD_ID = "tahlesfous";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditem.registerModitem();
	}
}