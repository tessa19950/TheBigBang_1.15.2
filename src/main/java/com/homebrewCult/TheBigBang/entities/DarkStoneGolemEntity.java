package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class DarkStoneGolemEntity extends AbstractGolemEntity {

	public DarkStoneGolemEntity(EntityType<? extends AbstractGolemEntity> type, World worldIn) {
		super((EntityType<? extends AbstractGolemEntity>) EntityInit.DARK_STONE_GOLEM_ENTITY, worldIn);
	}

}
