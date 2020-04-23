package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class CopperDrakeEntity extends AbstractDrakeEntity {

	public CopperDrakeEntity(EntityType<? extends AbstractDrakeEntity> type, World worldIn) {
		super((EntityType<? extends AbstractDrakeEntity>) EntityInit.COPPER_DRAKE_ENTITY, worldIn);
	}

}
