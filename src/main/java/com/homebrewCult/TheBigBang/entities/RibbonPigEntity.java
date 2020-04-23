package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.world.World;

public class RibbonPigEntity extends PigEntity {
	public RibbonPigEntity(EntityType<? extends PigEntity> type, World worldIn) {
		super((EntityType<? extends PigEntity>) EntityInit.RIBBON_PIG_ENTITY, worldIn);
	}
}
