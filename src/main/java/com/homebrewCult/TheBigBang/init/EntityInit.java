package com.homebrewCult.TheBigBang.init;

import com.homebrewCult.TheBigBang.TheBigBang;
import com.homebrewCult.TheBigBang.entities.BlueMushroomEntity;
import com.homebrewCult.TheBigBang.entities.BlueSnailEntity;
import com.homebrewCult.TheBigBang.entities.ColdEyeEntity;
import com.homebrewCult.TheBigBang.entities.CopperDrakeEntity;
import com.homebrewCult.TheBigBang.entities.CurseEyeEntity;
import com.homebrewCult.TheBigBang.entities.DarkDrakeEntity;
import com.homebrewCult.TheBigBang.entities.DarkJrYetiEntity;
import com.homebrewCult.TheBigBang.entities.DarkStoneGolemEntity;
import com.homebrewCult.TheBigBang.entities.DarkYetiEntity;
import com.homebrewCult.TheBigBang.entities.DrakeEntity;
import com.homebrewCult.TheBigBang.entities.EvilEyeEntity;
import com.homebrewCult.TheBigBang.entities.FireGolemEntity;
import com.homebrewCult.TheBigBang.entities.GreenSnailEntity;
import com.homebrewCult.TheBigBang.entities.IceDrakeEntity;
import com.homebrewCult.TheBigBang.entities.IceGolemEntity;
import com.homebrewCult.TheBigBang.entities.JrYetiEntity;
import com.homebrewCult.TheBigBang.entities.MixedGolemEntity;
import com.homebrewCult.TheBigBang.entities.OctopusEntity;
import com.homebrewCult.TheBigBang.entities.OrangeMushroomEntity;
import com.homebrewCult.TheBigBang.entities.RedDrakeEntity;
import com.homebrewCult.TheBigBang.entities.RedSnailEntity;
import com.homebrewCult.TheBigBang.entities.RibbonPigEntity;
import com.homebrewCult.TheBigBang.entities.StoneGolemEntity;
import com.homebrewCult.TheBigBang.entities.StumpEntity;
import com.homebrewCult.TheBigBang.entities.YetiEntity;
import com.homebrewCult.TheBigBang.entities.ZombieMushroomEntity;
import com.homebrewCult.TheBigBang.entities.render.BlueMushroomRenderer;
import com.homebrewCult.TheBigBang.entities.render.BlueSnailRenderer;
import com.homebrewCult.TheBigBang.entities.render.ColdEyeRenderer;
import com.homebrewCult.TheBigBang.entities.render.CopperDrakeRenderer;
import com.homebrewCult.TheBigBang.entities.render.CurseEyeRenderer;
import com.homebrewCult.TheBigBang.entities.render.DarkDrakeRenderer;
import com.homebrewCult.TheBigBang.entities.render.DarkJrYetiRenderer;
import com.homebrewCult.TheBigBang.entities.render.DarkStoneGolemRenderer;
import com.homebrewCult.TheBigBang.entities.render.DarkYetiRenderer;
import com.homebrewCult.TheBigBang.entities.render.DrakeRenderer;
import com.homebrewCult.TheBigBang.entities.render.EvilEyeRenderer;
import com.homebrewCult.TheBigBang.entities.render.FireGolemRenderer;
import com.homebrewCult.TheBigBang.entities.render.GreenSnailRenderer;
import com.homebrewCult.TheBigBang.entities.render.IceDrakeRenderer;
import com.homebrewCult.TheBigBang.entities.render.IceGolemRenderer;
import com.homebrewCult.TheBigBang.entities.render.JrYetiRenderer;
import com.homebrewCult.TheBigBang.entities.render.MixedGolemRenderer;
import com.homebrewCult.TheBigBang.entities.render.OctopusRenderer;
import com.homebrewCult.TheBigBang.entities.render.OrangeMushroomRenderer;
import com.homebrewCult.TheBigBang.entities.render.RedDrakeRenderer;
import com.homebrewCult.TheBigBang.entities.render.RedSnailRenderer;
import com.homebrewCult.TheBigBang.entities.render.RibbonPigRenderer;
import com.homebrewCult.TheBigBang.entities.render.StoneGolemRenderer;
import com.homebrewCult.TheBigBang.entities.render.StumpRenderer;
import com.homebrewCult.TheBigBang.entities.render.YetiRenderer;
import com.homebrewCult.TheBigBang.entities.render.ZombieMushroomRenderer;
import com.homebrewCult.TheBigBang.lists.ItemList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TheBigBang.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(TheBigBang.MODID)
public class EntityInit {
	public static final EntityType<StumpEntity> STUMP_ENTITY = null;
	public static final EntityType<OctopusEntity> OCTOPUS_ENTITY = null;
	public static final EntityType<EvilEyeEntity> EVIL_EYE_ENTITY = null;	
	public static final EntityType<CurseEyeEntity> CURSE_EYE_ENTITY = null;
	public static final EntityType<ColdEyeEntity> COLD_EYE_ENTITY = null;
	public static final EntityType<OrangeMushroomEntity> ORANGE_MUSHROOM_ENTITY = null;
	public static final EntityType<BlueMushroomEntity> BLUE_MUSHROOM_ENTITY = null;
	public static final EntityType<ZombieMushroomEntity> ZOMBIE_MUSHROOM_ENTITY = null;
	public static final EntityType<JrYetiEntity> JRYETI_ENTITY = null;
	public static final EntityType<DarkJrYetiEntity> DARK_JRYETI_ENTITY = null;
	public static final EntityType<GreenSnailEntity> GREEN_SNAIL_ENTITY = null;
	public static final EntityType<BlueSnailEntity> BLUE_SNAIL_ENTITY = null;
	public static final EntityType<RedSnailEntity> RED_SNAIL_ENTITY = null;
	public static final EntityType<RibbonPigEntity> RIBBON_PIG_ENTITY = null;
	public static final EntityType<StoneGolemEntity> STONE_GOLEM_ENTITY = null;
	public static final EntityType<DarkStoneGolemEntity> DARK_STONE_GOLEM_ENTITY = null;
	public static final EntityType<MixedGolemEntity> MIXED_GOLEM_ENTITY = null;
	public static final EntityType<IceGolemEntity> ICE_GOLEM_ENTITY = null;
	public static final EntityType<FireGolemEntity> FIRE_GOLEM_ENTITY = null;
	public static final EntityType<DrakeEntity> DRAKE_ENTITY = null;
	public static final EntityType<CopperDrakeEntity> COPPER_DRAKE_ENTITY = null;
	public static final EntityType<DarkDrakeEntity> DARK_DRAKE_ENTITY = null;
	public static final EntityType<IceDrakeEntity> ICE_DRAKE_ENTITY = null;
	public static final EntityType<RedDrakeEntity> RED_DRAKE_ENTITY = null;
	public static final EntityType<YetiEntity> YETI_ENTITY = null;
	public static final EntityType<DarkYetiEntity> DARK_YETI_ENTITY = null;

	@SuppressWarnings("unchecked")
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll (
			(EntityType<StumpEntity>) registerEntityType(StumpEntity::new, EntityClassification.CREATURE, 1f, 1.5f, "stump_entity"),
			(EntityType<OctopusEntity>)registerEntityType(OctopusEntity::new, EntityClassification.CREATURE, 1f, 2.5f, "octopus_entity"),	
			(EntityType<EvilEyeEntity>)registerEntityType(EvilEyeEntity::new, EntityClassification.MONSTER, 1.2f, 1f, "evil_eye_entity"),
			(EntityType<CurseEyeEntity>)registerEntityType(CurseEyeEntity::new, EntityClassification.MONSTER, 1.2f, 1f, "curse_eye_entity"),
			(EntityType<ColdEyeEntity>)registerEntityType(ColdEyeEntity::new, EntityClassification.MONSTER, 1.2f, 1f, "cold_eye_entity"),
			(EntityType<OrangeMushroomEntity>)registerEntityType(OrangeMushroomEntity::new, EntityClassification.CREATURE, 1f, 1.4f, "orange_mushroom_entity"),
			(EntityType<BlueMushroomEntity>)registerEntityType(BlueMushroomEntity::new, EntityClassification.CREATURE, 1f, 1.4f, "blue_mushroom_entity"),
			(EntityType<ZombieMushroomEntity>)registerEntityType(ZombieMushroomEntity::new, EntityClassification.CREATURE, 1f, 1.4f, "zombie_mushroom_entity"),
			(EntityType<JrYetiEntity>)registerEntityType(JrYetiEntity::new, EntityClassification.CREATURE, 0.8f, 0.8f, "jryeti_entity"),
			(EntityType<DarkJrYetiEntity>)registerEntityType(DarkJrYetiEntity::new, EntityClassification.CREATURE, 0.8f, 0.8f, "dark_jryeti_entity"),	
			(EntityType<GreenSnailEntity>)registerEntityType(GreenSnailEntity::new, EntityClassification.CREATURE, 0.6f, 0.5f, "green_snail_entity"),	
			(EntityType<BlueSnailEntity>)registerEntityType(BlueSnailEntity::new, EntityClassification.CREATURE, 0.8f, 0.8f, "blue_snail_entity"),	
			(EntityType<RedSnailEntity>)registerEntityType(RedSnailEntity::new, EntityClassification.CREATURE, 0.8f, 0.8f, "red_snail_entity"),	
			(EntityType<RibbonPigEntity>)registerEntityType(RibbonPigEntity::new, EntityClassification.CREATURE, 1.6f, 1f, "ribbon_pig_entity"),
			(EntityType<StoneGolemEntity>)registerEntityType(StoneGolemEntity::new, EntityClassification.CREATURE, 1.4f, 3.6f, "stone_golem_entity"),
			(EntityType<DarkStoneGolemEntity>)registerEntityType(DarkStoneGolemEntity::new, EntityClassification.CREATURE, 1.4f, 3.6f, "dark_stone_golem_entity"),
			(EntityType<MixedGolemEntity>)registerEntityType(MixedGolemEntity::new, EntityClassification.CREATURE, 1.4f, 3.6f, "mixed_golem_entity"),	
			(EntityType<IceGolemEntity>)registerEntityType(IceGolemEntity::new, EntityClassification.CREATURE, 1.4f, 3.6f, "ice_golem_entity"),
			(EntityType<FireGolemEntity>)registerEntityType(FireGolemEntity::new, EntityClassification.CREATURE, 1.4f, 3.6f, "fire_golem_entity"),
			(EntityType<DrakeEntity>)registerEntityType(DrakeEntity::new, EntityClassification.CREATURE, 1.8f, 2f, "drake_entity"),
			(EntityType<CopperDrakeEntity>)registerEntityType(CopperDrakeEntity::new, EntityClassification.CREATURE, 1.8f, 2f, "copper_drake_entity"),
			(EntityType<DarkDrakeEntity>)registerEntityType(DarkDrakeEntity::new, EntityClassification.MONSTER, 1.8f, 2f, "dark_drake_entity"),
			(EntityType<IceDrakeEntity>)registerEntityType(IceDrakeEntity::new, EntityClassification.MONSTER, 1.8f, 2f, "ice_drake_entity"),
			(EntityType<RedDrakeEntity>)registerEntityType(RedDrakeEntity::new, EntityClassification.MONSTER, 1.8f, 2f, "red_drake_entity"),
			(EntityType<YetiEntity>)registerEntityType(YetiEntity::new, EntityClassification.MONSTER, 2f, 3f, "yeti_entity"),
			(EntityType<DarkYetiEntity>)registerEntityType(DarkYetiEntity::new, EntityClassification.MONSTER, 2f, 3f, "dark_yeti_entity")
		);
		
		registerEntityWorldSpawn(STUMP_ENTITY, 2, 4, Biomes.FOREST);
		registerEntityWorldSpawn(OCTOPUS_ENTITY, 2, 8, Biomes.GRAVELLY_MOUNTAINS, Biomes.STONE_SHORE);
		registerEntityWorldSpawn(EVIL_EYE_ENTITY, 1, 2, Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.BADLANDS, Biomes.BADLANDS_PLATEAU, Biomes.ERODED_BADLANDS, Biomes.MODIFIED_BADLANDS_PLATEAU, Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU, Biomes.WOODED_BADLANDS_PLATEAU);
		registerEntityWorldSpawn(CURSE_EYE_ENTITY, 1, 2, Biomes.SWAMP, Biomes.SWAMP_HILLS);
		registerEntityWorldSpawn(COLD_EYE_ENTITY, 1, 2, Biomes.SNOWY_MOUNTAINS, Biomes.SNOWY_MOUNTAINS, Biomes.SNOWY_TAIGA, Biomes.SNOWY_TAIGA_HILLS, Biomes.SNOWY_TAIGA_MOUNTAINS, Biomes.SNOWY_TUNDRA);
		registerEntityWorldSpawn(ORANGE_MUSHROOM_ENTITY, 2, 6, Biomes.FOREST);
		registerEntityWorldSpawn(BLUE_MUSHROOM_ENTITY, 2, 6, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS);
		registerEntityWorldSpawn(ZOMBIE_MUSHROOM_ENTITY, 2, 6, Biomes.DARK_FOREST, Biomes.DARK_FOREST_HILLS);
		registerEntityWorldSpawn(JRYETI_ENTITY, 2, 4, Biomes.SNOWY_MOUNTAINS, Biomes.SNOWY_MOUNTAINS, Biomes.SNOWY_TAIGA, Biomes.SNOWY_TAIGA_HILLS, Biomes.SNOWY_TAIGA_MOUNTAINS, Biomes.SNOWY_TUNDRA);
		registerEntityWorldSpawn(DARK_JRYETI_ENTITY, 2, 4, Biomes.SNOWY_MOUNTAINS, Biomes.SNOWY_MOUNTAINS, Biomes.SNOWY_TAIGA, Biomes.SNOWY_TAIGA_HILLS, Biomes.SNOWY_TAIGA_MOUNTAINS, Biomes.SNOWY_TUNDRA);
		registerEntityWorldSpawn(GREEN_SNAIL_ENTITY, 4, 10, Biomes.FLOWER_FOREST, Biomes.SUNFLOWER_PLAINS);
		registerEntityWorldSpawn(BLUE_SNAIL_ENTITY, 2, 8, Biomes.FLOWER_FOREST, Biomes.SUNFLOWER_PLAINS);
		registerEntityWorldSpawn(RED_SNAIL_ENTITY, 2, 8, Biomes.FLOWER_FOREST, Biomes.SUNFLOWER_PLAINS);
		registerEntityWorldSpawn(RIBBON_PIG_ENTITY, 2, 8, Biomes.BEACH);
	}
	
    public static <T extends Entity> EntityType<?> registerEntityType(EntityType.IFactory<T> factoryIn, EntityClassification classification, float width, float height, String name) {
		return EntityType.Builder.create(factoryIn, EntityClassification.CREATURE).size(width, height).build(TheBigBang.MODID + name).setRegistryName(TheBigBang.MODID, name);
	}
    
	public static void registerEntityWorldSpawn(EntityType<?> entity, int minGroupCount, int maxGroupCount, Biome... biomes) {
		for(Biome biome : biomes) {
			if(biome != null) {
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, minGroupCount, maxGroupCount));
			}
		}
	}	
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(STUMP_ENTITY, new StumpRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(OCTOPUS_ENTITY, new OctopusRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EVIL_EYE_ENTITY, new EvilEyeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(CURSE_EYE_ENTITY, new CurseEyeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(COLD_EYE_ENTITY, new ColdEyeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ORANGE_MUSHROOM_ENTITY, new OrangeMushroomRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(BLUE_MUSHROOM_ENTITY, new BlueMushroomRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ZOMBIE_MUSHROOM_ENTITY, new ZombieMushroomRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(GREEN_SNAIL_ENTITY, new GreenSnailRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(BLUE_SNAIL_ENTITY, new BlueSnailRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(RED_SNAIL_ENTITY, new RedSnailRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(JRYETI_ENTITY, new JrYetiRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(DARK_JRYETI_ENTITY, new DarkJrYetiRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(RIBBON_PIG_ENTITY, new RibbonPigRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(STONE_GOLEM_ENTITY, new StoneGolemRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(DARK_STONE_GOLEM_ENTITY, new DarkStoneGolemRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(MIXED_GOLEM_ENTITY, new MixedGolemRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ICE_GOLEM_ENTITY, new IceGolemRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(FIRE_GOLEM_ENTITY, new FireGolemRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(DRAKE_ENTITY, new DrakeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(COPPER_DRAKE_ENTITY, new CopperDrakeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(DARK_DRAKE_ENTITY, new DarkDrakeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(ICE_DRAKE_ENTITY, new IceDrakeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(RED_DRAKE_ENTITY, new RedDrakeRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(YETI_ENTITY, new YetiRenderer.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(DARK_YETI_ENTITY, new DarkYetiRenderer.RenderFactory());
	}
	
	@SubscribeEvent
	public static void registerEntityItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll (
				ItemList.STUMP_SPAWN_EGG = registerEntitySpawnEgg(STUMP_ENTITY, 0x886633, 0x3e2e17, "stump_spawn_egg"),
				ItemList.OCTOPUS_SPAWN_EGG = registerEntitySpawnEgg(OCTOPUS_ENTITY, 0x6356B5, 0xBD4E86, "octopus_spawn_egg"),
				ItemList.EVIL_EYE_SPAWN_EGG = registerEntitySpawnEgg(EVIL_EYE_ENTITY, 0xFFDD00, 0xBB7711, "evil_eye_spawn_egg"),
				ItemList.CURSE_EYE_SPAWN_EGG = registerEntitySpawnEgg(CURSE_EYE_ENTITY, 0x66AA66, 0x99EE22, "curse_eye_spawn_egg"),
				ItemList.COLD_EYE_SPAWN_EGG = registerEntitySpawnEgg(COLD_EYE_ENTITY, 0xDDDDDD, 0xAAAAAA, "cold_eye_spawn_egg"),
				ItemList.ORANGE_MUSHROOM_SPAWN_EGG = registerEntitySpawnEgg(ORANGE_MUSHROOM_ENTITY, 0xFF8800, 0xFFEEDD, "orange_mushroom_spawn_egg"),
				ItemList.BLUE_MUSHROOM_SPAWN_EGG = registerEntitySpawnEgg(BLUE_MUSHROOM_ENTITY, 0x55BBEE, 0xFFEEDD, "blue_mushroom_spawn_egg"),
				ItemList.ZOMBIE_MUSHROOM_SPAWN_EGG = registerEntitySpawnEgg(ZOMBIE_MUSHROOM_ENTITY, 0xBB9988, 0xEEEEFF, "zombie_mushroom_spawn_egg"),
				ItemList.JRYETI_SPAWN_EGG = registerEntitySpawnEgg(JRYETI_ENTITY, 0xFFFFFF, 0x888879, "jryeti_spawn_egg"),
				ItemList.DARK_JRYETI_SPAWN_EGG = registerEntitySpawnEgg(DARK_JRYETI_ENTITY, 0x998877, 0x332211, "dark_jryeti_spawn_egg"),
				ItemList.GREEN_SNAIL_SPAWN_EGG = registerEntitySpawnEgg(GREEN_SNAIL_ENTITY, 0x228888, 0xFFFFFF, "green_snail_spawn_egg"),
				ItemList.BLUE_SNAIL_SPAWN_EGG = registerEntitySpawnEgg(BLUE_SNAIL_ENTITY, 0x0055AA, 0xFFFFDD, "blue_snail_spawn_egg"),
				ItemList.RED_SNAIL_SPAWN_EGG = registerEntitySpawnEgg(RED_SNAIL_ENTITY, 0xDD0044, 0xFFFFDD, "red_snail_spawn_egg"),
				ItemList.RIBBON_PIG_SPAWN_EGG = registerEntitySpawnEgg(RIBBON_PIG_ENTITY, 0xFCEFDF, 0xEB544D, "ribbon_pig_spawn_egg"),
				ItemList.STONE_GOLEM_SPAWN_EGG = registerEntitySpawnEgg(STONE_GOLEM_ENTITY, 0xC4C4B5, 0x497224, "stone_golem_spawn_egg"),
				ItemList.DARK_STONE_GOLEM_SPAWN_EGG = registerEntitySpawnEgg(DARK_STONE_GOLEM_ENTITY, 0x5A5A5A, 0x497224, "dark_stone_golem_spawn_egg"),
				ItemList.MIXED_GOLEM_SPAWN_EGG = registerEntitySpawnEgg(MIXED_GOLEM_ENTITY, 0xC4C4B5, 0x5A5A5A, "mixed_golem_spawn_egg"),
				ItemList.ICE_GOLEM_SPAWN_EGG = registerEntitySpawnEgg(ICE_GOLEM_ENTITY, 0x9ACAE9, 0xF2F2F2, "ice_golem_spawn_egg"),
				ItemList.FIRE_GOLEM_SPAWN_EGG = registerEntitySpawnEgg(FIRE_GOLEM_ENTITY, 0x952400, 0xEAD901, "fire_golem_spawn_egg"),
				ItemList.DRAKE_SPAWN_EGG = registerEntitySpawnEgg(DRAKE_ENTITY, 0x4C6A6B, 0xCDCDBE, "drake_spawn_egg"),
				ItemList.COPPER_DRAKE_SPAWN_EGG = registerEntitySpawnEgg(COPPER_DRAKE_ENTITY, 0x6A6A48, 0xC9B6A5, "copper_drake_spawn_egg"),
				ItemList.DARK_DRAKE_SPAWN_EGG = registerEntitySpawnEgg(DARK_DRAKE_ENTITY, 0x576B6A, 0xEAEAD9, "dark_drake_spawn_egg"),
				ItemList.ICE_DRAKE_SPAWN_EGG = registerEntitySpawnEgg(ICE_DRAKE_ENTITY, 0x7F9FBE, 0xDCDCEC, "ice_drake_spawn_egg"),
				ItemList.RED_DRAKE_SPAWN_EGG = registerEntitySpawnEgg(RED_DRAKE_ENTITY, 0x7A5B5B, 0xEAEADA, "red_drake_spawn_egg"),
				ItemList.YETI_SPAWN_EGG = registerEntitySpawnEgg(YETI_ENTITY, 0xFEFEFC, 0xD7A583, "yeti_spawn_egg"),
				ItemList.DARK_YETI_SPAWN_EGG = registerEntitySpawnEgg(DARK_YETI_ENTITY, 0x968574, 0xD7A583, "dark_yeti_spawn_egg")
		);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) {
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ItemGroup.MISC));
		item.setRegistryName(TheBigBang.MODID, name);
		return item;
	}
}
