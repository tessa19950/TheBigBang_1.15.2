package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class MixedGolemEntity extends AbstractGolemEntity {
	public MixedGolemEntity(EntityType<? extends AbstractGolemEntity> type, World worldIn) {
		super((EntityType<? extends AbstractGolemEntity>) EntityInit.MIXED_GOLEM_ENTITY, worldIn);
	}

}
