package com.homebrewCult.TheBigBang.entities;
import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class DarkYetiEntity extends AbstractYetiEntity {	

	public DarkYetiEntity(EntityType<? extends AbstractYetiEntity> type, World worldIn) {
		super((EntityType<? extends AbstractYetiEntity>) EntityInit.DARK_YETI_ENTITY, worldIn);
	}
	
}
