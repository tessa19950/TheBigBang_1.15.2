package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class EvilEyeEntity extends AbstractEyeEntity{	
	public EvilEyeEntity(EntityType<? extends AbstractEyeEntity> type, World worldIn) {
		super((EntityType<? extends AbstractEyeEntity>) EntityInit.EVIL_EYE_ENTITY, worldIn);
	}
}




