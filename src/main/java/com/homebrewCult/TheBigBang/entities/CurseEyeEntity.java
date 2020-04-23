package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class CurseEyeEntity extends AbstractEyeEntity {	
	
	public CurseEyeEntity(EntityType<? extends AbstractEyeEntity> type, World worldIn) {
		super((EntityType<? extends AbstractEyeEntity>) EntityInit.CURSE_EYE_ENTITY, worldIn);
	}
}
