package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class RedDrakeEntity extends AbstractDrakeEntity {
	public RedDrakeEntity(EntityType<? extends AbstractDrakeEntity> type, World worldIn) {
		super((EntityType<? extends AbstractDrakeEntity>) EntityInit.RED_DRAKE_ENTITY, worldIn);
	}

}
