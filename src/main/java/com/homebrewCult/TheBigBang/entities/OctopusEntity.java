package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.SoundInit;
import com.homebrewCult.TheBigBang.init.EntityInit;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class OctopusEntity extends AnimalEntity {
	private static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.PUFFERFISH, Items.SALMON, Items.COD, Items.TROPICAL_FISH);

	public OctopusEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super((EntityType<? extends AnimalEntity>) EntityInit.OCTOPUS_ENTITY, worldIn);
	}
	
	@Override
	protected void registerGoals() {
	      this.goalSelector.addGoal(0, new SwimGoal(this));
	      this.goalSelector.addGoal(1, new PanicGoal(this, 0.5D));
	      this.goalSelector.addGoal(4, new TemptGoal(this, 0.4D, false, TEMPTATION_ITEMS));
	      this.goalSelector.addGoal(5, new FollowParentGoal(this, 0.3D));
	      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.3D));
	      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 0.3F));
	      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn){
		return SoundInit.OCTOPUS_DAMAGE;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundInit.OCTOPUS_DIE;
	}
	
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		return null;
	}

}
