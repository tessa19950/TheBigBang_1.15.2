package com.homebrewCult.TheBigBang.lists;

import com.homebrewCult.TheBigBang.TheBigBang;
import com.homebrewCult.TheBigBang.blocks.DangerSignTile;
import com.homebrewCult.TheBigBang.inventory.DangerSignContainer;

import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TheBigBang.MODID)
public class BlockList {
	
	public static Block MITHRIL_ORE = null;
	public static Block ADAMANTIUM_ORE = null;
	public static Block ORIHALCON_ORE = null;
	
	@ObjectHolder("danger_sign")
	public static final Block DANGER_SIGN = null;
	@ObjectHolder("danger_sign")
	public static final TileEntityType<DangerSignTile> DANGER_SIGN_TILE = null;
	@ObjectHolder("danger_sign")
	public static final ContainerType<DangerSignContainer> DANGER_SIGN_CONTAINER = null;
	public static final int DANGER_SIGN_GUI_ID = 0;
}
