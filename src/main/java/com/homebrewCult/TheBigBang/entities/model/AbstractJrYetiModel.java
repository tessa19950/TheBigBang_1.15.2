package com.homebrewCult.TheBigBang.entities.model;

import com.homebrewCult.TheBigBang.util.MathUtility;

import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//Made with Blockbench
//Paste this code into your mod.

@OnlyIn(Dist.CLIENT)
public class AbstractJrYetiModel<T extends Entity> extends QuadrupedModel<T> {
	
	private float oscillationTimer = 0f;
	
	private final ModelRenderer Body_Bone;
	private final ModelRenderer TopFur_Bone;
	private final ModelRenderer SideFur_Bone2;
	private final ModelRenderer SideFur_Bone1;
	private final ModelRenderer FeetFur_Bone4;
	private final ModelRenderer FeetFur_Bone3;
	private final ModelRenderer FeetFur_Bone2;
	private final ModelRenderer FeetFur_Bone1;

	public AbstractJrYetiModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 64;
		textureHeight = 64;

		Body_Bone = new ModelRenderer(this);
		Body_Bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		MathUtility.addModelBox(Body_Bone, 0, 0, -7.0F, -12.0F, -7.0F, 14, 12, 14, 0.0F, false);
		MathUtility.addModelBox(Body_Bone, 0, 29, -6.0F, -14.0F, -6.0F, 12, 2, 12, 0.0F, false);

		TopFur_Bone = new ModelRenderer(this);
		TopFur_Bone.setRotationPoint(0.0F, -14.0F, -1.0F);
		Body_Bone.addChild(TopFur_Bone);
		MathUtility.addModelBox(TopFur_Bone, 42, 0, -3.0F, -3.0F, 1.0F, 6, 3, 0, 0.0F, false);

		SideFur_Bone2 = new ModelRenderer(this);
		SideFur_Bone2.setRotationPoint(-7.0F, -8.0F, 0.0F);
		setRotationAngle(SideFur_Bone2, -0.1745F, 1.5708F, 0.0F);
		Body_Bone.addChild(SideFur_Bone2);
		MathUtility.addModelBox(SideFur_Bone2, 42, 3, -3.0F, 0.0F, 0.0F, 6, 3, 0, 0.0F, false);

		SideFur_Bone1 = new ModelRenderer(this);
		SideFur_Bone1.setRotationPoint(7.0F, -8.0F, 0.0F);
		setRotationAngle(SideFur_Bone1, -0.1745F, -1.5708F, 0.0F);
		Body_Bone.addChild(SideFur_Bone1);
		MathUtility.addModelBox(SideFur_Bone1, 42, 3, -3.0F, 0.0F, 0.0F, 6, 3, 0, 0.0F, false);

		FeetFur_Bone4 = new ModelRenderer(this);
		FeetFur_Bone4.setRotationPoint(7.0F, -3.0F, 0.0F);
		setRotationAngle(FeetFur_Bone4, -0.3491F, -1.5708F, 0.0F);
		Body_Bone.addChild(FeetFur_Bone4);
		MathUtility.addModelBox(FeetFur_Bone4, 0, 26, -7.0F, 0.0F, 0.0F, 14, 3, 0, 0.0F, false);

		FeetFur_Bone3 = new ModelRenderer(this);
		FeetFur_Bone3.setRotationPoint(0.0F, -3.0F, 7.0F);
		setRotationAngle(FeetFur_Bone3, -0.3491F, 3.1416F, 0.0F);
		Body_Bone.addChild(FeetFur_Bone3);
		MathUtility.addModelBox(FeetFur_Bone3, 0, 26, -7.0F, 0.0F, 0.0F, 14, 3, 0, 0.0F, false);

		FeetFur_Bone2 = new ModelRenderer(this);
		FeetFur_Bone2.setRotationPoint(-7.0F, -3.0F, 0.0F);
		setRotationAngle(FeetFur_Bone2, -0.3491F, 1.5708F, 0.0F);
		Body_Bone.addChild(FeetFur_Bone2);
		MathUtility.addModelBox(FeetFur_Bone2, 0, 26, -7.0F, 0.0F, 0.0F, 14, 3, 0, 0.0F, false);

		FeetFur_Bone1 = new ModelRenderer(this);
		FeetFur_Bone1.setRotationPoint(0.0F, -3.0F, -7.0F);
		setRotationAngle(FeetFur_Bone1, -0.3491F, 0.0F, 0.0F);
		Body_Bone.addChild(FeetFur_Bone1);
		MathUtility.addModelBox(FeetFur_Bone1, 0, 26, -7.0F, 0.0F, 0.0F, 14, 3, 0, 0.0F, false);
	}
	
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);		
		
		ModelRenderer[] furStrips = {this.FeetFur_Bone1, this.FeetFur_Bone2, this.FeetFur_Bone3, this.FeetFur_Bone4, this.SideFur_Bone1, this.SideFur_Bone2};
		if(valueInRange(entityIn.getMotion().x, -0.0001D, 0.0001D) && valueInRange(entityIn.getMotion().z, -0.0001D, 0.0001D)) {
			oscillationTimer = (entityIn.ticksExisted + partialTick) * 0.05f;
			for (ModelRenderer fur : furStrips) {
				fur.rotateAngleX = -0.2f - (float)Math.abs(0.3f * Math.cos(oscillationTimer));
			}
			this.Body_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0.05f - (float)Math.abs(0.05f * Math.cos(oscillationTimer)), 0));
		} else {
			oscillationTimer = (entityIn.ticksExisted + partialTick) * 0.4f;
			for (ModelRenderer fur : furStrips) {
				fur.rotateAngleX = -0.2f - (float)Math.abs(0.9f * Math.cos(oscillationTimer));
			}
			this.Body_Bone.translateRotate(MathUtility.getTranslationMatrix(0, 0.05f - (float)Math.abs(0.1f * Math.cos(oscillationTimer)), 0));
		}
	}

	/* DEPRECATED
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body_Bone.render(f5);
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