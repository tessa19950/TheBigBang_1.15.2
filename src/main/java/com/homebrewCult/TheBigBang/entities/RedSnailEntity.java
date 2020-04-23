package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

public class RedSnailEntity extends AbstractSnailEntity {	
	public RedSnailEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super((EntityType<? extends AnimalEntity>) EntityInit.RED_SNAIL_ENTITY, worldIn);
	}

	@Override
	public RedSnailEntity createChild(AgeableEntity ageable) {		
		return (RedSnailEntity)EntityInit.RED_SNAIL_ENTITY.create(this.world);
	}
}
