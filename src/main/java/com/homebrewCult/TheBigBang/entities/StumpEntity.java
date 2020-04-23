package com.homebrewCult.TheBigBang.entities;

import com.homebrewCult.TheBigBang.init.EntityInit;
import com.homebrewCult.TheBigBang.init.SoundInit;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class StumpEntity extends AnimalEntity {
	private static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(Items.BONE_MEAL, Items.POISONOUS_POTATO, Items.ROTTEN_FLESH);

	public StumpEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super((EntityType<? extends AnimalEntity>) EntityInit.STUMP_ENTITY, worldIn);
	}
	
	@Override
	protected void registerGoals() {
	      this.goalSelector.addGoal(0, new SwimGoal(this));
	      this.goalSelector.addGoal(1, new PanicGoal(this, 0.5D));
	      this.goalSelector.addGoal(3, new BreedGoal(this, 0.4D));
	      this.goalSelector.addGoal(4, new TemptGoal(this, 0.4D, false, TEMPTATION_ITEMS));
	      this.goalSelector.addGoal(5, new FollowParentGoal(this, 0.3D));
	      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.3D));
	      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 0.3F));
	      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
	}
	
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3d);
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundInit.STUMP_DAMAGE;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundInit.STUMP_DIE;
	}
	
	@Override
	public StumpEntity createChild(AgeableEntity ageable) {
		return (StumpEntity) EntityInit.STUMP_ENTITY.create(this.world);
	}
	
	public boolean isBreedingItem(ItemStack stack) {
		return TEMPTATION_ITEMS.test(stack);
	}
}
