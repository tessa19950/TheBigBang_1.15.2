package com.homebrewCult.TheBigBang.entities.model; 
import net.minecraft.client.renderer.entity.model.QuadrupedModel;

import com.homebrewCult.TheBigBang.util.MathUtility;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

@OnlyIn(Dist.CLIENT)
public class AbstractYetiModel <T extends Entity> extends QuadrupedModel<T> {
	
	private final ModelRenderer Hip_Bone;
	private final ModelRenderer Back_Bone;
	private final ModelRenderer Head_Bone;
	private final ModelRenderer HornX_Bone;
	private final ModelRenderer HornY_Bone;
	private final ModelRenderer Jaw_Bone;
	private final ModelRenderer LeftUpArm_Bone;
	private final ModelRenderer Furstrip_Bone3;
	private final ModelRenderer LeftLowArm_Bone;
	private final ModelRenderer FurStrip_Bone2;
	private final ModelRenderer LeftHand_Bone;
	private final ModelRenderer FurStrip_Bone;
	private final ModelRenderer RightUpArm_Bone;
	private final ModelRenderer Furstrip_Bone2;
	private final ModelRenderer RightLowArm_Bone2;
	private final ModelRenderer FurStrip_Bone3;
	private final ModelRenderer RightHand_Bone2;
	private final ModelRenderer FurStrip_Bone4;
	private final ModelRenderer LeftUpleg_Bone;
	private final ModelRenderer LeftLowLeg_Bone;
	private final ModelRenderer RightUpleg_Bone;
	private final ModelRenderer RightLowLeg_Bone;

	public AbstractYetiModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 128;
		textureHeight = 128;

		Hip_Bone = new ModelRenderer(this);
		Hip_Bone.setRotationPoint(0.0F, 16.0F, 10.0F);
		setRotationAngle(Hip_Bone, -0.2618F, 0.0F, 0.0F);
		MathUtility.addModelBox(Hip_Bone, 80, 28, -7.0F, -17.0F, -6.0F, 14, 18, 10, 0.0F, false);

		Back_Bone = new ModelRenderer(this);
		Back_Bone.setRotationPoint(0.0F, -18.0F, 0.0F);
		setRotationAngle(Back_Bone, 0.5236F, 0.0F, 0.0F);
		Hip_Bone.addChild(Back_Bone);
		MathUtility.addModelBox(Back_Bone, 0, 74, -13.0F, -21.0F, -10.0F, 26, 24, 14, 0.0F, false);

		Head_Bone = new ModelRenderer(this);
		Head_Bone.setRotationPoint(0.0F, -10.0F, -5.0F);
		Back_Bone.addChild(Head_Bone);
		MathUtility.addModelBox(Head_Bone, 10, 2, -9.0F, -12.0F, -23.0F, 18, 14, 22, 0.0F, false);
		MathUtility.addModelBox(Head_Bone, 80, 32, 0.0F, -17.0F, -17.0F, 0, 6, 24, 0.0F, false);

		HornX_Bone = new ModelRenderer(this);
		HornX_Bone.setRotationPoint(0.0F, -15.5F, -15.5F);
		setRotationAngle(HornX_Bone, 0.0F, -0.7854F, 0.0F);
		Head_Bone.addChild(HornX_Bone);
		MathUtility.addModelBox(HornX_Bone, 69, 0, 0.0F, -3.5F, -3.5F, 0, 7, 7, 0.0F, false);

		HornY_Bone = new ModelRenderer(this);
		HornY_Bone.setRotationPoint(0.0F, -15.5F, -15.5F);
		setRotationAngle(HornY_Bone, 0.0F, 0.7854F, 0.0F);
		Head_Bone.addChild(HornY_Bone);
		MathUtility.addModelBox(HornY_Bone, 69, 0, 0.0F, -3.5F, -3.5F, 0, 7, 7, 0.0F, false);

		Jaw_Bone = new ModelRenderer(this);
		Jaw_Bone.setRotationPoint(0.0F, -2.0F, -3.0F);
		Head_Bone.addChild(Jaw_Bone);
		MathUtility.addModelBox(Jaw_Bone, 0, 38, -10.0F, 0.0F, -21.0F, 20, 12, 20, 0.0F, false);

		LeftUpArm_Bone = new ModelRenderer(this);
		LeftUpArm_Bone.setRotationPoint(13.0F, -15.0F, -3.0F);
		setRotationAngle(LeftUpArm_Bone, -0.1745F, 0.0F, -0.0873F);
		Back_Bone.addChild(LeftUpArm_Bone);
		MathUtility.addModelBox(LeftUpArm_Bone, 0, 0, 0.0F, -4.0F, -4.0F, 8, 16, 8, 0.0F, false);

		Furstrip_Bone3 = new ModelRenderer(this);
		Furstrip_Bone3.setRotationPoint(8.0F, 3.0F, 4.0F);
		setRotationAngle(Furstrip_Bone3, 0.0F, -0.7854F, 0.0F);
		LeftUpArm_Bone.addChild(Furstrip_Bone3);
		MathUtility.addModelBox(Furstrip_Bone3, 0, 26, 0.0F, -6.0F, 0.0F, 4, 12, 0, 0.0F, false);

		LeftLowArm_Bone = new ModelRenderer(this);
		LeftLowArm_Bone.setRotationPoint(4.0F, 11.0F, 0.0F);
		setRotationAngle(LeftLowArm_Bone, -0.5236F, 0.0F, 0.0F);
		LeftUpArm_Bone.addChild(LeftLowArm_Bone);
		MathUtility.addModelBox(LeftLowArm_Bone, 80, 62, -6.0F, -1.0F, -6.0F, 12, 16, 12, 0.0F, false);

		FurStrip_Bone2 = new ModelRenderer(this);
		FurStrip_Bone2.setRotationPoint(6.0F, 5.0F, 6.0F);
		setRotationAngle(FurStrip_Bone2, 0.0F, -0.7854F, 0.0F);
		LeftLowArm_Bone.addChild(FurStrip_Bone2);
		MathUtility.addModelBox(FurStrip_Bone2, 0, 26, 0.0F, -6.0F, 0.0F, 4, 12, 0, 0.0F, false);

		LeftHand_Bone = new ModelRenderer(this);
		LeftHand_Bone.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotationAngle(LeftHand_Bone, 0.4363F, -0.1745F, 0.0F);
		LeftLowArm_Bone.addChild(LeftHand_Bone);
		MathUtility.addModelBox(LeftHand_Bone, 64, 96, -8.0F, 0.0F, -8.0F, 16, 16, 16, 0.0F, false);
		MathUtility.addModelBox(LeftHand_Bone, 72, 0, -7.0F, 13.0F, -7.0F, 14, 6, 14, 0.0F, false);

		FurStrip_Bone = new ModelRenderer(this);
		FurStrip_Bone.setRotationPoint(8.0F, 6.0F, 8.0F);
		setRotationAngle(FurStrip_Bone, 0.0F, -0.7854F, 0.0F);
		LeftHand_Bone.addChild(FurStrip_Bone);
		MathUtility.addModelBox(FurStrip_Bone, 0, 26, 0.0F, -6.0F, 0.0F, 4, 12, 0, 0.0F, false);

		RightUpArm_Bone = new ModelRenderer(this);
		RightUpArm_Bone.setRotationPoint(-13.0F, -15.0F, -3.0F);
		setRotationAngle(RightUpArm_Bone, -0.1745F, 0.0F, 0.0873F);
		Back_Bone.addChild(RightUpArm_Bone);
		MathUtility.addModelBox(RightUpArm_Bone, 0, 0, -8.0F, -4.0F, -4.0F, 8, 16, 8, 0.0F, false);

		Furstrip_Bone2 = new ModelRenderer(this);
		Furstrip_Bone2.setRotationPoint(-8.0F, 3.0F, 4.0F);
		setRotationAngle(Furstrip_Bone2, 0.0F, -2.3562F, 0.0F);
		RightUpArm_Bone.addChild(Furstrip_Bone2);
		MathUtility.addModelBox(Furstrip_Bone2, 0, 26, 0.0F, -6.0F, 0.0F, 4, 12, 0, 0.0F, false);

		RightLowArm_Bone2 = new ModelRenderer(this);
		RightLowArm_Bone2.setRotationPoint(-4.0F, 11.0F, 0.0F);
		setRotationAngle(RightLowArm_Bone2, -0.5236F, 0.0F, 0.0F);
		RightUpArm_Bone.addChild(RightLowArm_Bone2);
		MathUtility.addModelBox(RightLowArm_Bone2, 80, 62, -6.0F, -1.0F, -6.0F, 12, 16, 12, 0.0F, false);

		FurStrip_Bone3 = new ModelRenderer(this);
		FurStrip_Bone3.setRotationPoint(-6.0F, 5.0F, 6.0F);
		setRotationAngle(FurStrip_Bone3, 0.0F, -2.3562F, 0.0F);
		RightLowArm_Bone2.addChild(FurStrip_Bone3);
		MathUtility.addModelBox(FurStrip_Bone3, 0, 26, 0.0F, -6.0F, 0.0F, 4, 12, 0, 0.0F, false);

		RightHand_Bone2 = new ModelRenderer(this);
		RightHand_Bone2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotationAngle(RightHand_Bone2, 0.4363F, 0.1745F, 0.0F);
		RightLowArm_Bone2.addChild(RightHand_Bone2);
		MathUtility.addModelBox(RightHand_Bone2, 64, 96, -8.0F, 0.0F, -8.0F, 16, 16, 16, 0.0F, false);
		MathUtility.addModelBox(RightHand_Bone2, 72, 0, -7.0F, 13.0F, -7.0F, 14, 6, 14, 0.0F, false);

		FurStrip_Bone4 = new ModelRenderer(this);
		FurStrip_Bone4.setRotationPoint(-8.0F, 6.0F, 8.0F);
		setRotationAngle(FurStrip_Bone4, 0.0F, -2.3562F, 0.0F);
		RightHand_Bone2.addChild(FurStrip_Bone4);
		MathUtility.addModelBox(FurStrip_Bone4, 0, 26, 0.0F, -6.0F, 0.0F, 4, 12, 0, 0.0F, false);

		LeftUpleg_Bone = new ModelRenderer(this);
		LeftUpleg_Bone.setRotationPoint(5.0F, 14.0F, 7.0F);
		setRotationAngle(LeftUpleg_Bone, -0.5236F, 0.0F, 0.0F);
		MathUtility.addModelBox(LeftUpleg_Bone, 1, 114, -2.5F, 0.0F, -2.5F, 5, 6, 5, 0.0F, false);

		LeftLowLeg_Bone = new ModelRenderer(this);
		LeftLowLeg_Bone.setRotationPoint(0.0F, 6.0F, 0.0F);
		setRotationAngle(LeftLowLeg_Bone, 0.5236F, 0.0F, 0.0F);
		LeftUpleg_Bone.addChild(LeftLowLeg_Bone);
		MathUtility.addModelBox(LeftLowLeg_Bone, 22, 113, -3.0F, -2.0F, -3.0F, 6, 6, 6, 0.0F, false);
		MathUtility.addModelBox(LeftLowLeg_Bone, 43, 120, -2.5F, 2.0F, -2.5F, 5, 3, 5, 0.0F, false);

		RightUpleg_Bone = new ModelRenderer(this);
		RightUpleg_Bone.setRotationPoint(-5.0F, 14.0F, 7.0F);
		setRotationAngle(RightUpleg_Bone, -0.5236F, 0.0F, 0.0F);
		MathUtility.addModelBox(RightUpleg_Bone, 1, 114, -2.5F, 0.0F, -2.5F, 5, 6, 5, 0.0F, false);

		RightLowLeg_Bone = new ModelRenderer(this);
		RightLowLeg_Bone.setRotationPoint(0.0F, 6.0F, 0.0F);
		setRotationAngle(RightLowLeg_Bone, 0.5236F, 0.0F, 0.0F);
		RightUpleg_Bone.addChild(RightLowLeg_Bone);
		MathUtility.addModelBox(RightLowLeg_Bone, 22, 113, -3.0F, -2.0F, -3.0F, 6, 6, 6, 0.0F, false);
		MathUtility.addModelBox(RightLowLeg_Bone, 43, 120, -2.5F, 2.0F, -2.5F, 5, 3, 5, 0.0F, false);
	}

	/* DEPRECATED
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Hip_Bone.render(f5);
		LeftUpleg_Bone.render(f5);
		RightUpleg_Bone.render(f5);
	}
	*/
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.Head_Bone.rotateAngleX = Math.min(headPitch * ((float)Math.PI / 180F), 0);
	    this.Head_Bone.rotateAngleY = MathHelper.clamp(netHeadYaw * ((float)Math.PI / 180F), -0.2f, 0.2f);
	    
	    //LegWork
		float leftLegSwing = MathHelper.cos(limbSwing * 0.6f);
        float rightLegSwing = MathHelper.cos(limbSwing * 0.6f + (float)Math.PI);
	    this.LeftUpleg_Bone.rotateAngleX = MathHelper.clamp(-0.4f + leftLegSwing * 3F * limbSwingAmount, -1.4f, 1.4f);
	    this.RightUpleg_Bone.rotateAngleX = MathHelper.clamp(-0.4f + rightLegSwing * 3F * limbSwingAmount, -1.4f, 1.4f);
	    this.LeftLowLeg_Bone.rotateAngleX = MathHelper.clamp(0.4f + leftLegSwing * 1F * limbSwingAmount, -1.4f, 1.4f);
	    this.RightLowLeg_Bone.rotateAngleX = MathHelper.clamp(0.4f + rightLegSwing * 1F * limbSwingAmount, -1.4f, 1.4f);
	    
	    //ArmWork
		float leftArmSwing = MathHelper.cos(limbSwing * 0.6f);
        float rightArmSwing = MathHelper.cos(limbSwing * 0.6f + (float)Math.PI);
	    this.LeftUpArm_Bone.rotateAngleX = MathHelper.clamp(-0.4f + leftArmSwing * 2F * limbSwingAmount, -1.4f, 1.4f);
	    this.RightUpArm_Bone.rotateAngleX = MathHelper.clamp(-0.4f + rightArmSwing * 2F * limbSwingAmount, -1.4f, 1.4f);
	    this.LeftLowArm_Bone.rotateAngleX = MathHelper.clamp(-0.3f + leftLegSwing * -2F * limbSwingAmount, -1.4f, 1.4f);
	    this.RightLowArm_Bone2.rotateAngleX = MathHelper.clamp(-0.3f + rightLegSwing * -2F * limbSwingAmount, -1.4f, 1.4f);
	}
	
	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}
}