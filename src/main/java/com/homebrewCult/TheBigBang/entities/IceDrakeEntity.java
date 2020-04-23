package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class IceDrakeEntity extends AbstractDrakeEntity {

	public IceDrakeEntity(EntityType<? extends AbstractDrakeEntity> type, World worldIn) {
		super((EntityType<? extends AbstractDrakeEntity>) EntityInit.ICE_DRAKE_ENTITY, worldIn);
	}

}
