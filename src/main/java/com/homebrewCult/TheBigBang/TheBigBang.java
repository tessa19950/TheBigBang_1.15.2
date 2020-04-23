package com.homebrewCult.TheBigBang;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import com.homebrewCult.TheBigBang.init.EntityInit;
import com.homebrewCult.TheBigBang.network.BigBangPacketHandler;
import com.homebrewCult.TheBigBang.util.ClientProxy;
import com.homebrewCult.TheBigBang.util.IProxy;
import com.homebrewCult.TheBigBang.util.ServerProxy;
import org.apache.logging.log4j.LogManager;

@Mod(TheBigBang.MODID)
public final class TheBigBang {
	
	public static final String MODID = "thebigbang";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public TheBigBang() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		proxy.Init();
		BigBangPacketHandler.packetHandlerInit();
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		EntityInit.registerEntityRenders();
	}
	
	public static void print (String message) {
		System.out.print("[The Big Bang Info] " + message + "\n");
	}
}
