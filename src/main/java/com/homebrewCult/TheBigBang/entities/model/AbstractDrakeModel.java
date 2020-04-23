package com.homebrewCult.TheBigBang.entities.model; 

import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

@OnlyIn(Dist.CLIENT)
public class AbstractDrakeModel <T extends Entity> extends QuadrupedModel<T> {
	
	private float oscillationTimer = 0f;
	private float oscillationSpeed = .2f;
	
	private float tailStartMaxRot = .5f;
	private float tailEndMaxRot = .5f;
	private float tailEndTimeOffset = -.3f;
	
	private final ModelRenderer Body;
	private final ModelRenderer BackCervical_Bone;
	private final ModelRenderer BackLumbar_Bone;
	private final ModelRenderer BackPlate_Bone1;
	private final ModelRenderer BackPlate_Bone2;
	private final ModelRenderer BackPlate_Bone3;
	private final ModelRenderer BackPlate_Bone5;
	private final ModelRenderer BackPlate_Bone4;
	private final ModelRenderer BackPlateSmall_Bone1;
	private final ModelRenderer WingLeft_Bone;
	private final ModelRenderer WingRight_Bone;
	private final ModelRenderer NeckStart_Bone;
	private final ModelRenderer NeckEnd_Bone;
	private final ModelRenderer Head_Bone;
	private final ModelRenderer HeadHornLeft_Bone;
	private final ModelRenderer HeadHornLeftX_Bone;
	private final ModelRenderer HeadHornLeftY_Bone;
	private final ModelRenderer HeadHornRight_Bone;
	private final ModelRenderer HeadHornRightX_Bone2;
	private final ModelRenderer HeadHornRightY_Bone2;
	private final ModelRenderer Jaw_Bone;
	private final ModelRenderer EyeLeft_Bone;
	private final ModelRenderer EyeRight_Bone;
	private final ModelRenderer NoseHornX_Bone;
	private final ModelRenderer NoseHornY_Bone;
	private final ModelRenderer TailStart_Bone;
	private final ModelRenderer TailEnd_Bone;
	private final ModelRenderer BackPlateSmall_Bone3;
	private final ModelRenderer BackPlateSmall_Bone2;
	private final ModelRenderer LeftUpperLeg_Bone;
	private final ModelRenderer LeftLowerLeg_Bone;
	private final ModelRenderer LeftFoot_Bone;
	private final ModelRenderer RightUpperLeg_Bone;
	private final ModelRenderer RightLowerLeg_Bone;
	private final ModelRenderer RightFoot_Bone;
	private final ModelRenderer LeftUpperArm_Bone;
	private final ModelRenderer LeftLowerArm_Bone;
	private final ModelRenderer LeftHand_Bone;
	private final ModelRenderer RightUpperArm_Bone;
	private final ModelRenderer RightLowerArm_Bone;
	private final ModelRenderer RightHand_Bone;

	public AbstractDrakeModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addBox(47, 33, -5.0F, -30.0F, -6.0F, 10, 14, 14, 0.0F);
		Body.addBox(29, 62, -6.0F, -23.0F, -9.0F, 12, 18, 18, 0.0F);

		BackCervical_Bone = new ModelRenderer(this);
		BackCervical_Bone.setRotationPoint(0.0F, -23.0F, 7.0F);
		setRotationAngle(BackCervical_Bone, -1.2217F, 0.0F, 0.0F);
		Body.addChild(BackCervical_Bone);
		BackCervical_Bone.addBox(66, 75, -4.0F, -3.0F, -6.0F, 8, 8, 23, 0.0F);

		BackLumbar_Bone = new ModelRenderer(this);
		BackLumbar_Bone.setRotationPoint(0.0F, -23.0F, -7.0F);
		setRotationAngle(BackLumbar_Bone, 0.7854F, 0.0F, 0.0F);
		Body.addChild(BackLumbar_Bone);
		BackLumbar_Bone.addBox(0, 87, -4.0F, -3.5F, -6.0F, 8, 8, 12, 0.0F);

		BackPlate_Bone1 = new ModelRenderer(this);
		BackPlate_Bone1.setRotationPoint(0.0F, -30.0F, 1.0F);
		Body.addChild(BackPlate_Bone1);
		BackPlate_Bone1.addBox(82, 35, 0.0F, -6.0F, -3.0F, 0, 6, 5, 0.0F);

		BackPlate_Bone2 = new ModelRenderer(this);
		BackPlate_Bone2.setRotationPoint(0.0F, -29.0F, -5.0F);
		setRotationAngle(BackPlate_Bone2, 0.4363F, 0.0F, 0.0F);
		Body.addChild(BackPlate_Bone2);
		BackPlate_Bone2.addBox(82, 35, 0.0F, -6.0F, -2.5F, 0, 6, 5, 0.0F);

		BackPlate_Bone3 = new ModelRenderer(this);
		BackPlate_Bone3.setRotationPoint(0.0F, -29.0F, 7.0F);
		setRotationAngle(BackPlate_Bone3, -0.4363F, 0.0F, 0.0F);
		Body.addChild(BackPlate_Bone3);
		BackPlate_Bone3.addBox(82, 35, 0.0F, -5.5F, -3.0F, 0, 6, 5, 0.0F);

		BackPlate_Bone5 = new ModelRenderer(this);
		BackPlate_Bone5.setRotationPoint(0.0F, -24.0F, -9.0F);
		setRotationAngle(BackPlate_Bone5, 0.7854F, 0.0F, 0.0F);
		Body.addChild(BackPlate_Bone5);
		BackPlate_Bone5.addBox(82, 35, 0.0F, -6.0F, -2.0F, 0, 6, 5, 0.0F);

		BackPlate_Bone4 = new ModelRenderer(this);
		BackPlate_Bone4.setRotationPoint(0.0F, -23.0F, 10.0F);
		setRotationAngle(BackPlate_Bone4, -1.0472F, 0.0F, 0.0F);
		Body.addChild(BackPlate_Bone4);
		BackPlate_Bone4.addBox(82, 35, 0.0F, -6.0F, -4.0F, 0, 6, 5, 0.0F);

		BackPlateSmall_Bone1 = new ModelRenderer(this);
		BackPlateSmall_Bone1.setRotationPoint(0.0F, -19.0F, 12.0F);
		setRotationAngle(BackPlateSmall_Bone1, -1.2217F, 0.0F, 0.0F);
		Body.addChild(BackPlateSmall_Bone1);
		BackPlateSmall_Bone1.addBox(92, 37, 0.0F, -3.0F, -2.0F, 0, 4, 5, 0.0F);

		WingLeft_Bone = new ModelRenderer(this);
		WingLeft_Bone.setRotationPoint(5.0F, -27.0F, 1.0F);
		setRotationAngle(WingLeft_Bone, -0.2618F, 0.2618F, 0.0F);
		Body.addChild(WingLeft_Bone);
		WingLeft_Bone.addBox(96, 31, 0.0F, -9.0F, 0.0F, 0, 9, 16, 0.0F);

		WingRight_Bone = new ModelRenderer(this);
		WingRight_Bone.setRotationPoint(-4.9581F, -27.0F, 1.9587F);
		setRotationAngle(WingRight_Bone, -0.2618F, -0.2618F, 0.0F);
		Body.addChild(WingRight_Bone);
		WingRight_Bone.addBox(96, 31, 0.0F, -9.0F, 0.0F, 0, 9, 16, 0.0F);

		NeckStart_Bone = new ModelRenderer(this);
		NeckStart_Bone.setRotationPoint(0.0F, 14.0F, -10.0F);
		setRotationAngle(NeckStart_Bone, -0.6109F, 0.0F, 0.0F);
		NeckStart_Bone.addBox(0, 39, -5.0F, -11.0F, -10.0F, 10, 13, 13, 0.0F);

		NeckEnd_Bone = new ModelRenderer(this);
		NeckEnd_Bone.setRotationPoint(0.0F, -3.6865F, -11.253F);
		setRotationAngle(NeckEnd_Bone, -0.1745F, 0.0F, 0.0F);
		NeckStart_Bone.addChild(NeckEnd_Bone);
		NeckEnd_Bone.addBox(0, 20, -3.0F, -5.3135F, -7.747F, 6, 8, 10, 0.0F);

		Head_Bone = new ModelRenderer(this);
		Head_Bone.setRotationPoint(0.0F, -1.3572F, -7.766F);
		setRotationAngle(Head_Bone, 1.0472F, 0.0F, 0.0F);
		NeckEnd_Bone.addChild(Head_Bone);
		Head_Bone.addBox(0, 0, -4.0F, -4.4116F, -10.381F, 8, 6, 14, 0.0F);

		HeadHornLeft_Bone = new ModelRenderer(this);
		HeadHornLeft_Bone.setRotationPoint(3.0F, -4.9563F, 3.019F);
		setRotationAngle(HeadHornLeft_Bone, -0.7854F, 0.0F, 0.0F);
		Head_Bone.addChild(HeadHornLeft_Bone);

		HeadHornLeftX_Bone = new ModelRenderer(this);
		HeadHornLeftX_Bone.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(HeadHornLeftX_Bone, 0.0F, -0.7854F, 0.0F);
		HeadHornLeft_Bone.addChild(HeadHornLeftX_Bone);
		HeadHornLeftX_Bone.addBox(65, 5, 0.0F, -3.0F, -1.5F, 0, 5, 3, 0.0F);

		HeadHornLeftY_Bone = new ModelRenderer(this);
		HeadHornLeftY_Bone.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(HeadHornLeftY_Bone, 0.0F, 0.7854F, 0.0F);
		HeadHornLeft_Bone.addChild(HeadHornLeftY_Bone);
		HeadHornLeftY_Bone.addBox(65, 5, 0.0F, -3.0F, -1.5F, 0, 5, 3, 0.0F);

		HeadHornRight_Bone = new ModelRenderer(this);
		HeadHornRight_Bone.setRotationPoint(-3.0F, -4.9563F, 3.019F);
		setRotationAngle(HeadHornRight_Bone, -0.7854F, 0.0F, 0.0F);
		Head_Bone.addChild(HeadHornRight_Bone);

		HeadHornRightX_Bone2 = new ModelRenderer(this);
		HeadHornRightX_Bone2.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(HeadHornRightX_Bone2, 0.0F, -0.7854F, 0.0F);
		HeadHornRight_Bone.addChild(HeadHornRightX_Bone2);
		HeadHornRightX_Bone2.addBox(65, 5, 0.0F, -3.0F, -1.5F, 0, 5, 3, 0.0F);

		HeadHornRightY_Bone2 = new ModelRenderer(this);
		HeadHornRightY_Bone2.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(HeadHornRightY_Bone2, 0.0F, 0.7854F, 0.0F);
		HeadHornRight_Bone.addChild(HeadHornRightY_Bone2);
		HeadHornRightY_Bone2.addBox(65, 5, 0.0F, -3.0F, -1.5F, 0, 5, 3, 0.0F);

		Jaw_Bone = new ModelRenderer(this);
		Jaw_Bone.setRotationPoint(0.0F, 2.5884F, 1.619F);
		setRotationAngle(Jaw_Bone, -0.1745F, 0.0F, 0.0F);
		Head_Bone.addChild(Jaw_Bone);
		Jaw_Bone.addBox(34, 17, -3.5F, -2.1428F, -11.234F, 7, 4, 12, 0.0F);

		EyeLeft_Bone = new ModelRenderer(this);
		EyeLeft_Bone.setRotationPoint(1.5F, -5.0981F, 1.366F);
		setRotationAngle(EyeLeft_Bone, -0.3491F, 0.0F, 0.0F);
		Head_Bone.addChild(EyeLeft_Bone);
		EyeLeft_Bone.addBox(40, 4, -2.0F, -1.8582F, -4.0F, 4, 4, 4, 0.0F);

		EyeRight_Bone = new ModelRenderer(this);
		EyeRight_Bone.setRotationPoint(-2.0F, -5.0981F, 0.866F);
		setRotationAngle(EyeRight_Bone, -0.3491F, 0.0F, 0.0F);
		Head_Bone.addChild(EyeRight_Bone);
		EyeRight_Bone.addBox(31, 1, -1.5F, -0.8582F, -3.5F, 3, 3, 3, 0.0F);

		NoseHornX_Bone = new ModelRenderer(this);
		NoseHornX_Bone.setRotationPoint(0.0F, -6.0981F, -6.634F);
		setRotationAngle(NoseHornX_Bone, 0.0F, -0.7854F, 0.0F);
		Head_Bone.addChild(NoseHornX_Bone);
		NoseHornX_Bone.addBox(57, 4, 0.0F, -2.0F, -2.0F, 0, 4, 4, 0.0F);

		NoseHornY_Bone = new ModelRenderer(this);
		NoseHornY_Bone.setRotationPoint(0.0F, -6.0981F, -6.634F);
		setRotationAngle(NoseHornY_Bone, 0.0F, 0.7854F, 0.0F);
		Head_Bone.addChild(NoseHornY_Bone);
		NoseHornY_Bone.addBox(57, 4, 0.0F, -2.0F, -2.0F, 0, 4, 4, 0.0F);

		TailStart_Bone = new ModelRenderer(this);
		TailStart_Bone.setRotationPoint(0.0F, 13.0F, 14.0F);
		setRotationAngle(TailStart_Bone, 0.4363F, 0.0F, 0.0F);
		TailStart_Bone.addBox(92, 110, -3.0F, -3.5031F, -0.8533F, 6, 6, 12, 0.0F);

		TailEnd_Bone = new ModelRenderer(this);
		TailEnd_Bone.setRotationPoint(0.0F, -1.0F, 11.0F);
		setRotationAngle(TailEnd_Bone, 0.2618F, 0.0F, 0.0F);
		TailStart_Bone.addChild(TailEnd_Bone);
		TailEnd_Bone.addBox(74, 107, -2.0F, -1.5F, -2.0F, 4, 4, 11, 0.0F);

		BackPlateSmall_Bone3 = new ModelRenderer(this);
		BackPlateSmall_Bone3.setRotationPoint(0.0F, -1.0507F, 3.9569F);
		TailEnd_Bone.addChild(BackPlateSmall_Bone3);
		BackPlateSmall_Bone3.addBox(92, 37, 0.0F, -3.9493F, -1.9569F, 0, 4, 5, 0.0F);

		BackPlateSmall_Bone2 = new ModelRenderer(this);
		BackPlateSmall_Bone2.setRotationPoint(0.0F, -3.1964F, 7.7675F);
		TailStart_Bone.addChild(BackPlateSmall_Bone2);
		BackPlateSmall_Bone2.addBox(92, 37, 0.0F, -3.8036F, -2.7675F, 0, 4, 5, 0.0F);

		LeftUpperLeg_Bone = new ModelRenderer(this);
		LeftUpperLeg_Bone.setRotationPoint(6.0F, 13.0F, 3.0F);
		setRotationAngle(LeftUpperLeg_Bone, -1.2217F, 0.0F, 0.0F);
		LeftUpperLeg_Bone.addBox(33, 105, 0.0F, -3.0F, -5.0F, 4, 12, 8, 0.0F);

		LeftLowerLeg_Bone = new ModelRenderer(this);
		LeftLowerLeg_Bone.setRotationPoint(2.0F, 7.0F, 2.0F);
		setRotationAngle(LeftLowerLeg_Bone, 0.6981F, 0.0F, 0.0F);
		LeftUpperLeg_Bone.addChild(LeftLowerLeg_Bone);
		LeftLowerLeg_Bone.addBox(47, 115, -1.0F, -1.0F, -1.0F, 2, 2, 10, 0.0F);

		LeftFoot_Bone = new ModelRenderer(this);
		LeftFoot_Bone.setRotationPoint(0.0F, 0.5113F, 8.5572F);
		setRotationAngle(LeftFoot_Bone, -0.8727F, 0.0F, 0.0F);
		LeftLowerLeg_Bone.addChild(LeftFoot_Bone);
		LeftFoot_Bone.addBox(62, 107, -3.5F, -0.5113F, 0.4428F, 7, 10, 0, 0.0F);

		RightUpperLeg_Bone = new ModelRenderer(this);
		RightUpperLeg_Bone.setRotationPoint(-6.0F, 13.0F, 3.0F);
		setRotationAngle(RightUpperLeg_Bone, -1.2217F, 0.0F, 0.0F);
		RightUpperLeg_Bone.addBox(33, 105, -4.0F, -3.0F, -5.0F, 4, 12, 8, 0.0F);

		RightLowerLeg_Bone = new ModelRenderer(this);
		RightLowerLeg_Bone.setRotationPoint(-2.0F, 7.0F, 2.0F);
		setRotationAngle(RightLowerLeg_Bone, 0.6981F, 0.0F, 0.0F);
		RightUpperLeg_Bone.addChild(RightLowerLeg_Bone);
		RightLowerLeg_Bone.addBox(47, 115, -1.0F, -1.0F, -1.0F, 2, 2, 10, 0.0F);

		RightFoot_Bone = new ModelRenderer(this);
		RightFoot_Bone.setRotationPoint(0.0F, 0.5113F, 8.5572F);
		setRotationAngle(RightFoot_Bone, -0.8727F, 0.0F, 0.0F);
		RightLowerLeg_Bone.addChild(RightFoot_Bone);
		RightFoot_Bone.addBox(62, 107, -3.5F, -0.5113F, 0.4428F, 7, 10, 0, 0.0F);

		LeftUpperArm_Bone = new ModelRenderer(this);
		LeftUpperArm_Bone.setRotationPoint(5.0F, 9.0F, -10.0F);
		setRotationAngle(LeftUpperArm_Bone, 0.6981F, 0.0F, 0.0F);
		LeftUpperArm_Bone.addBox(0, 115, -1.0F, -2.0F, -10.0F, 3, 3, 10, 0.0F);

		LeftLowerArm_Bone = new ModelRenderer(this);
		LeftLowerArm_Bone.setRotationPoint(0.5F, -0.5F, -9.0F);
		setRotationAngle(LeftLowerArm_Bone, -1.309F, 0.0F, 0.0F);
		LeftUpperArm_Bone.addChild(LeftLowerArm_Bone);
		LeftLowerArm_Bone.addBox(4, 119, -1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);

		LeftHand_Bone = new ModelRenderer(this);
		LeftHand_Bone.setRotationPoint(0.0F, 0.0F, -6.0F);
		setRotationAngle(LeftHand_Bone, 0.9599F, 0.0F, 0.0F);
		LeftLowerArm_Bone.addChild(LeftHand_Bone);
		LeftHand_Bone.addBox(0, 108, -2.0F, -3.5F, -1.0F, 4, 4, 1, 0.0F);
		LeftHand_Bone.addBox(11, 108, -2.0F, -3.5F, -2.0F, 4, 4, 1, 0.0F);

		RightUpperArm_Bone = new ModelRenderer(this);
		RightUpperArm_Bone.setRotationPoint(-6.0F, 9.0F, -10.0F);
		setRotationAngle(RightUpperArm_Bone, 0.6981F, 0.0F, 0.0F);
		RightUpperArm_Bone.addBox(0, 115, -1.0F, -2.0F, -10.0F, 3, 3, 10, 0.0F);

		RightLowerArm_Bone = new ModelRenderer(this);
		RightLowerArm_Bone.setRotationPoint(0.5F, -0.5F, -9.0F);
		setRotationAngle(RightLowerArm_Bone, -1.309F, 0.0F, 0.0F);
		RightUpperArm_Bone.addChild(RightLowerArm_Bone);
		RightLowerArm_Bone.addBox(4, 119, -1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);

		RightHand_Bone = new ModelRenderer(this);
		RightHand_Bone.setRotationPoint(0.0F, 0.0F, -6.0F);
		setRotationAngle(RightHand_Bone, 0.9599F, 0.0F, 0.0F);
		RightLowerArm_Bone.addChild(RightHand_Bone);
		RightHand_Bone.addBox(0, 108, -2.0F, -3.5F, -1.0F, 4, 4, 1, 0.0F);
		RightHand_Bone.addBox(11, 108, -2.0F, -3.5F, -2.0F, 4, 4, 1, 0.0F);
	}

	/* DEPRECATED
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		NeckStart_Bone.render(f5);
		TailStart_Bone.render(f5);
		LeftUpperLeg_Bone.render(f5);
		RightUpperLeg_Bone.render(f5);
		LeftUpperArm_Bone.render(f5);
		RightUpperArm_Bone.render(f5);
	}
	*/
	
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);		
		oscillationTimer = (entityIn.ticksExisted + partialTick) * oscillationSpeed;
	}
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.EyeLeft_Bone.rotateAngleX = -0.2f + (headPitch) * ((float)Math.PI / 180F);
		this.EyeLeft_Bone.rotateAngleY = (netHeadYaw / 4) * ((float)Math.PI / 180F);
		this.EyeRight_Bone.rotateAngleX = -0.2f + (headPitch) * ((float)Math.PI / 180F);
		this.EyeRight_Bone.rotateAngleY = (netHeadYaw / 4) * ((float)Math.PI / 180F);
		
	    this.Head_Bone.rotateAngleX = 1f + (headPitch * ((float)Math.PI / 180F));
	    this.Head_Bone.rotateAngleY = (netHeadYaw * 0.1f) * ((float)Math.PI / 180F);
	    this.Head_Bone.rotateAngleZ = (netHeadYaw * 0.4f) * ((float)Math.PI / 180F);
	    
	    this.NeckStart_Bone.rotateAngleY = (netHeadYaw * 0.1f) * ((float)Math.PI / 180F);
	    this.NeckEnd_Bone.rotateAngleY = (netHeadYaw * 0.7f) * ((float)Math.PI / 180F);
		
		this.TailStart_Bone.rotateAngleY = (float)Math.cos(oscillationTimer) * tailStartMaxRot;
		this.TailEnd_Bone.rotateAngleY = (float)Math.cos(oscillationTimer + tailEndTimeOffset) * tailEndMaxRot;
		
        this.LeftUpperLeg_Bone.rotateAngleX = -1.4f + MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RightUpperLeg_Bone.rotateAngleX = -1.4f + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LeftLowerLeg_Bone.rotateAngleX = 1f + MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RightLowerLeg_Bone.rotateAngleX = 1f + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	}
	
	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}
}