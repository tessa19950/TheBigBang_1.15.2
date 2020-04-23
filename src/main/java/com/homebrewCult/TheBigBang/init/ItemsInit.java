package com.homebrewCult.TheBigBang.init;

import com.homebrewCult.TheBigBang.TheBigBang;
import com.homebrewCult.TheBigBang.items.CustomDisk;
import com.homebrewCult.TheBigBang.items.DangerSignItem;
import com.homebrewCult.TheBigBang.lists.BlockList;
import com.homebrewCult.TheBigBang.lists.ItemList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TheBigBang.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TheBigBang.MODID)
public class ItemsInit {	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
				ItemList.ADAMANTIUM_ORE = new BlockItem(BlockList.ADAMANTIUM_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.ADAMANTIUM_ORE.getRegistryName()),
				ItemList.MITHRIL_ORE = new BlockItem(BlockList.MITHRIL_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.MITHRIL_ORE.getRegistryName()),
				ItemList.ORIHALCON_ORE = new BlockItem(BlockList.ORIHALCON_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.ORIHALCON_ORE.getRegistryName()),
				ItemList.ADAMANTIUM = registerMiscItem(event, "adamantium"),
				ItemList.MITHRIL = registerMiscItem(event, "mithril"),
				ItemList.ORIHALCON = registerMiscItem(event, "orihalcon"),			
				ItemList.ADAMANTIUM_PLATE = registerMiscItem(event, "adamantium_plate"),
				ItemList.MITHRIL_PLATE = registerMiscItem(event, "mithril_plate"),
				ItemList.ORIHALCON_PLATE = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(TheBigBang.MODID, "orihalcon_plate"),			
				ItemList.ADAMANTIUM_NUGGET = registerMiscItem(event, "adamantium_nugget"),
				ItemList.MITHRIL_NUGGET = registerMiscItem(event, "mithril_nugget"),
				ItemList.ORIHALCON_NUGGET = registerMiscItem(event, "orihalcon_nugget"),
				
				ItemList.OCTOPUS_LEG = registerMiscItem(event, "octopus_leg"),
				ItemList.EVIL_EYE_TAIL = registerMiscItem(event, "evil_eye_tail"),
				ItemList.CURSE_EYE_TAIL = registerMiscItem(event, "curse_eye_tail"),
				ItemList.COLD_EYE_TAIL = registerMiscItem(event, "cold_eye_tail"),
				ItemList.BLUE_MUSHROOM_CAP = registerMiscItem(event, "blue_mushroom_cap"),
				ItemList.ORANGE_MUSHROOM_CAP = registerMiscItem(event, "orange_mushroom_cap"),
				ItemList.UNDEAD_CHARM = registerMiscItem(event, "undead_charm"),
				ItemList.RED_SNAIL_SHELL = registerMiscItem(event, "red_snail_shell"),
				ItemList.BLUE_SNAIL_SHELL = registerMiscItem(event, "blue_snail_shell"),
				ItemList.GREEN_SNAIL_SHELL = registerMiscItem(event, "green_snail_shell"),
				ItemList.JRYETI_SKIN = registerMiscItem(event, "jryeti_skin"),
				ItemList.DARK_JRYETI_SKIN = registerMiscItem(event, "dark_jryeti_skin"),
				ItemList.PIGS_RIBBON = registerMiscItem(event, "pigs_ribbon"),
				
				ItemList.DANGER_SIGN = new DangerSignItem(BlockList.DANGER_SIGN, new Item.Properties().maxStackSize(1).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.DANGER_SIGN.getRegistryName()),
				
				ItemList.MUSIC_DISC_AMORIA = new CustomDisk("Maplestory - Amoria", SoundInit.RECORD_AMORIA, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_amoria"),
				ItemList.MUSIC_DISC_AQUA = new CustomDisk("Maplestory - Aqua", SoundInit.RECORD_AQUA, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_aqua"),
				ItemList.MUSIC_DISC_ARIANT = new CustomDisk("Maplestory - Ariant", SoundInit.RECORD_ARIANT, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_ariant"),
				ItemList.MUSIC_DISC_DILLEKE = new CustomDisk("Maplestory - Dilleke", SoundInit.RECORD_DILLEKE, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_dilleke"),
				ItemList.MUSIC_DISC_ELLINIA = new CustomDisk("Maplestory - Ellinia", SoundInit.RECORD_ELLINIA, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_ellinia"),
				ItemList.MUSIC_DISC_HARBOR = new CustomDisk("Maplestory - Harbor", SoundInit.RECORD_HARBOR, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_harbor"),
				ItemList.MUSIC_DISC_HENESYS = new CustomDisk("Maplestory - Henesys", SoundInit.RECORD_HENESYS, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_henesys"),
				ItemList.MUSIC_DISC_KERNING = new CustomDisk("Maplestory - Kerning", SoundInit.RECORD_KERNING, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_kerning"),
				ItemList.MUSIC_DISC_LUDIBRIUM = new CustomDisk("Maplestory - Ludibrium", SoundInit.RECORD_LUDIBRIUM, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_ludibrium"),
				ItemList.MUSIC_DISC_OMEGA = new CustomDisk("Maplestory - Omega", SoundInit.RECORD_OMEGA, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_omega"),
				ItemList.MUSIC_DISC_ORBIS = new CustomDisk("Maplestory - Orbis", SoundInit.RECORD_ORBIS, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_orbis"),
				ItemList.MUSIC_DISC_PERION = new CustomDisk("Maplestory - Perion", SoundInit.RECORD_PERION, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_perion"),
				ItemList.MUSIC_DISC_RAINDROP = new CustomDisk("Maplestory - Raindrop", SoundInit.RECORD_RAINDROP, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_raindrop"),
				ItemList.MUSIC_DISC_SQUARE = new CustomDisk("Maplestory - Square", SoundInit.RECORD_SQUARE, new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)).setRegistryName("music_disc_square")
		);
	}
	
	public static Item registerMiscItem(final RegistryEvent.Register<Item> event, String name) {
		return new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(TheBigBang.MODID, name);
	}
}
