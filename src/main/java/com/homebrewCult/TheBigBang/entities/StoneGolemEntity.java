package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class StoneGolemEntity extends AbstractGolemEntity {
	public StoneGolemEntity(EntityType<? extends AbstractGolemEntity> type, World worldIn) {
		super((EntityType<? extends AbstractGolemEntity>) EntityInit.STONE_GOLEM_ENTITY, worldIn);
	}

}
