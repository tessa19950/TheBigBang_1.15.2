package com.homebrewCult.TheBigBang.entities.model;
import com.homebrewCult.TheBigBang.entities.AbstractMushroomEntity;
import com.homebrewCult.TheBigBang.util.MathUtility;
import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//Made with Blockbench
//Paste this code into your mod.

@OnlyIn(Dist.CLIENT)
public class AbstractMushroomModel<T extends Entity> extends QuadrupedModel<T> {
	
	private float oscillationTimer = 0f;
	
	private final ModelRenderer BodyBottom_Bone;
	private final ModelRenderer BodyMiddle_Bone;
	private final ModelRenderer BodyTop_Bone;
	private final ModelRenderer Head_Bone;
	private final ModelRenderer Cap_Bone;
	private final ModelRenderer Charm_Bone;

	public AbstractMushroomModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 128;
		textureHeight = 128;

		BodyBottom_Bone = new ModelRenderer(this);
		BodyBottom_Bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		MathUtility.addModelBox(BodyBottom_Bone, 0, 60, -6.0F, -2.0F, -6.0F, 12, 2, 12, 0.0F, false);

		BodyMiddle_Bone = new ModelRenderer(this);
		BodyMiddle_Bone.setRotationPoint(0.0F, -3.0F, 0.0F);
		BodyBottom_Bone.addChild(BodyMiddle_Bone);
		MathUtility.addModelBox(BodyMiddle_Bone, 0, 36, -8.0F, -6.0F, -8.0F, 16, 8, 16, 0.0F, false);

		BodyTop_Bone = new ModelRenderer(this);
		BodyTop_Bone.setRotationPoint(0.0F, -7.0F, 0.5F);
		setRotationAngle(BodyTop_Bone, -0.0873F, 0.0F, 0.0F);
		BodyMiddle_Bone.addChild(BodyTop_Bone);
		MathUtility.addModelBox(BodyTop_Bone, 3, 19, -7.0F, -1.0F, -7.0F, 14, 3, 14, 0.0F, false);

		Head_Bone = new ModelRenderer(this);
		Head_Bone.setRotationPoint(0.0F, -2.0F, 1.0F);
		BodyTop_Bone.addChild(Head_Bone);
		MathUtility.addModelBox(Head_Bone, 0, 0, -6.0F, -5.0F, -6.5F, 12, 7, 12, 0.0F, false);

		Cap_Bone = new ModelRenderer(this);
		Cap_Bone.setRotationPoint(0.0F, -4.0F, -0.5F);
		setRotationAngle(Cap_Bone, -0.2618F, 0.0F, 0.0F);
		Head_Bone.addChild(Cap_Bone);
		MathUtility.addModelBox(Cap_Bone, 56, 51, -9.0F, 1.0F, -9.0F, 18, 1, 18, 0.0F, false);
		MathUtility.addModelBox(Cap_Bone, 48, 0, -10.0F, -2.0F, -10.0F, 20, 4, 20, 0.0F, false);
		MathUtility.addModelBox(Cap_Bone, 72, 24, -7.0F, -3.0F, -7.0F, 14, 1, 14, 0.0F, false);
		MathUtility.addModelBox(Cap_Bone, 88, 39, -5.0F, -5.0F, -5.0F, 10, 2, 10, 0.0F, false);
		MathUtility.addModelBox(Cap_Bone, 108, 0, -2.0F, -6.0F, -2.0F, 4, 1, 4, 0.0F, false);

		Charm_Bone = new ModelRenderer(this);
		Charm_Bone.setRotationPoint(0.0F, 1.0F, -10.0F);
		setRotationAngle(Charm_Bone, -0.1745F, 0.0F, 0.0F);
		Cap_Bone.addChild(Charm_Bone);
		MathUtility.addModelBox(Charm_Bone, 108, 5, -1.5F, 0.0F, 0.0F, 3, 5, 0, 0.0F, false);
	}

	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);		
		
		AbstractMushroomEntity mushroomIn = (AbstractMushroomEntity) entityIn;
		if(mushroomIn.hasChild && mushroomIn.isChildHurt) {
	        GlStateManager.translatef(0.0F, -0.2F, 0.0F);
			GlStateManager.scalef(1.1F, 1.1F, 1.1F);
		}
		if(this.isChild) {
	        GlStateManager.translatef(0.0F, 0.6F, 0.0F);
			GlStateManager.scalef(0.6F, 0.6F, 0.6F);
		}
		
		if(valueInRange(entityIn.getMotion().x, -0.0001D, 0.0001D) && valueInRange(entityIn.getMotion().z, -0.0001D, 0.0001D)) {
			oscillationTimer = (entityIn.ticksExisted + partialTick) * 0.1f;
			//Body Bounce
			this.BodyMiddle_Bone.translateRotate(MathUtility.getTranslationMatrix(0, -0.05f + (float)Math.abs(0.1f * Math.cos(oscillationTimer)), 0));
			this.Head_Bone.translateRotate(MathUtility.getTranslationMatrix(0, -0.05f + (float)Math.abs(0.05f * Math.cos(oscillationTimer)), 0));
			
			//Reset other Bones
			this.BodyBottom_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0, 0));
			this.BodyBottom_Bone.rotateAngleX = 0f;
			this.BodyTop_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0, 0));
			this.BodyTop_Bone.rotateAngleX = 0f;
			this.Head_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0, 0));
			this.Head_Bone.rotateAngleX = 0f;
		} else {
			oscillationTimer = (entityIn.ticksExisted + partialTick) * 0.4f;
			//Body Bounce
			this.BodyBottom_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0f + (float)(Math.min(0, 0.2f * Math.cos(oscillationTimer))), 0));
			this.BodyMiddle_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0f + (float)(0.05f * Math.cos(oscillationTimer)), 0));
			this.Head_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0.03f + (float)(0.05f * Math.cos(oscillationTimer)), 0));
			
			//Body, Body Top & Head, Back n Forth Motion 
			this.BodyTop_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0, -0.03f + (float)(0.05f * Math.cos(oscillationTimer))));
			this.Head_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0, -0.03f + (float)(0.05f * Math.cos(oscillationTimer))));
			//Body, Body Top & Head, Rotating Motion
			this.BodyBottom_Bone.rotateAngleX = 0f + (float)(0.1f * Math.cos(oscillationTimer));
			this.BodyTop_Bone.rotateAngleX = 0f + (float)(0.1f * Math.cos(oscillationTimer));
			this.Head_Bone.rotateAngleX = 0f + (float)(0.1f * Math.cos(oscillationTimer));
		}
	}
	
	/* DEPRECATED
	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		BodyBottom_Bone.render(scale);
	}
	*/
	
	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}
	
	private boolean valueInRange(double inValue, double min, double max)
	{
		if(inValue > min && inValue < max) {
			return true;
		} else {
			return false;
		}
	}
}