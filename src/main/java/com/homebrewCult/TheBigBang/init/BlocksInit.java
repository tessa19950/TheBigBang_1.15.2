package com.homebrewCult.TheBigBang.init;

import com.homebrewCult.TheBigBang.TheBigBang;
import com.homebrewCult.TheBigBang.blocks.DangerSignBlock;
import com.homebrewCult.TheBigBang.blocks.DangerSignTile;
import com.homebrewCult.TheBigBang.inventory.DangerSignContainer;
import com.homebrewCult.TheBigBang.lists.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TheBigBang.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TheBigBang.MODID)
public class BlocksInit {
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll (
			BlockList.MITHRIL_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(TheBigBang.MODID, "mithril_ore"),
			BlockList.ADAMANTIUM_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(TheBigBang.MODID, "adamantium_ore"),
			BlockList.ORIHALCON_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(TheBigBang.MODID, "orihalcon_ore"),
			
			new DangerSignBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(TheBigBang.MODID, "danger_sign")
		);
	}
	
	@SubscribeEvent
	public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> event) {
		event.getRegistry().register (			
			TileEntityType.Builder.create(DangerSignTile::new, BlockList.DANGER_SIGN).build(null).setRegistryName(TheBigBang.MODID, "danger_sign")
		);
	}
	
	@SubscribeEvent
	public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> event) {
		event.getRegistry().register (IForgeContainerType.create((id, inv, data) -> {
			BlockPos pos = data.readBlockPos();
			World world = TheBigBang.proxy.getClientWorld();
			return new DangerSignContainer(id, inv, world, pos);
		}).setRegistryName("danger_sign"));
	}
}