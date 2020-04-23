package com.homebrewCult.TheBigBang.entities;
import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class YetiEntity extends AbstractYetiEntity {	
	public YetiEntity(EntityType<? extends AbstractYetiEntity> type, World worldIn) {
		super((EntityType<? extends AbstractYetiEntity>) EntityInit.YETI_ENTITY, worldIn);
	}
	
}
