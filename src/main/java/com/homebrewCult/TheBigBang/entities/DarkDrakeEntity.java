package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class DarkDrakeEntity extends AbstractDrakeEntity {

	public DarkDrakeEntity(EntityType<? extends AbstractDrakeEntity> type, World worldIn) {
		super((EntityType<? extends AbstractDrakeEntity>) EntityInit.DARK_DRAKE_ENTITY, worldIn);
	}

}
