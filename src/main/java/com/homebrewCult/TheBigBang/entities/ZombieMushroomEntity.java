package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class ZombieMushroomEntity extends AbstractMushroomEntity{	
	public ZombieMushroomEntity(EntityType<? extends AbstractMushroomEntity> type, World worldIn) {
		super((EntityType<? extends AbstractMushroomEntity>) EntityInit.ZOMBIE_MUSHROOM_ENTITY, worldIn);
	}
	
}
