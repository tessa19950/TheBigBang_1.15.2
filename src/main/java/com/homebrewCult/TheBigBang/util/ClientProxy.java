package com.homebrewCult.TheBigBang.util;

import com.homebrewCult.TheBigBang.gui.DangerSignScreen;
import com.homebrewCult.TheBigBang.lists.BlockList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
	
	@Override
	public void Init() {
		ScreenManager.registerFactory(BlockList.DANGER_SIGN_CONTAINER, DangerSignScreen::new);
	}
	
	@Override
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}
	
	@Override
	public PlayerEntity getClientPlayer() {
		return Minecraft.getInstance().player;
	}
	
}
