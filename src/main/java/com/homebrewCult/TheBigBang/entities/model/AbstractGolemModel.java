package com.homebrewCult.TheBigBang.entities.model; 

import com.homebrewCult.TheBigBang.entities.AbstractGolemEntity;
import com.homebrewCult.TheBigBang.util.MathUtility;
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
public class AbstractGolemModel <T extends Entity> extends QuadrupedModel<T> {
	
	private float oscillationTimer = 0f;
	private float oscillationSpeed = .05f;
	
	private final ModelRenderer LeftLowerLeg_Bone;
	private final ModelRenderer LeftUpperLeg_Bone;
	private final ModelRenderer RightLowerLeg_Bone;
	private final ModelRenderer RightUpperLeg_Bone;
	private final ModelRenderer Hip_Bone;
	private final ModelRenderer Torso_Bone;
	private final ModelRenderer Head_Bone;
	private final ModelRenderer Flower1_Bone;
	private final ModelRenderer Flower1_Bone2;
	private final ModelRenderer LeftUpperArm_Bone;
	private final ModelRenderer LeftLowerArm_Bone;
	private final ModelRenderer RightUpperArm_Bone;
	private final ModelRenderer RightLowerArm_Bone;
	
	private float prevHipYOffset, prevHipZOffset, nextHipYOffset, nextHipZOffset;
	private float prevLeftLegYOffset, prevLeftLegZOffset, nextLeftLegYOffset, nextLeftLegZOffset;
	private float prevRightLegYOffset, prevRightLegZOffset, nextRightLegYOffset, nextRightLegZOffset;

	public AbstractGolemModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 128;
		textureHeight = 128;

		LeftLowerLeg_Bone = new ModelRenderer(this);
		LeftLowerLeg_Bone.setRotationPoint(8.0F, 11.5F, -3.0F);
		MathUtility.addModelBox(LeftLowerLeg_Bone, 92, 104, -4.0F, 2.5F, -5.0F, 8, 10, 10, 0.0F, false);
		MathUtility.addModelBox(LeftLowerLeg_Bone, 92, 104, -4.0F, 2.5F, -5.0F, 8, 10, 10, 0.0F, false);
		MathUtility.addModelBox(LeftLowerLeg_Bone, 92, 104, -4.0F, 2.5F, -5.0F, 8, 10, 10, 0.0F, false);
		MathUtility.addModelBox(LeftLowerLeg_Bone, 115, 97, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false);

		LeftUpperLeg_Bone = new ModelRenderer(this);
		LeftUpperLeg_Bone.setRotationPoint(10.0F, 2.0F, 0.0F);
		setRotationAngle(LeftUpperLeg_Bone, -0.3491F, 0.0F, 0.0F);
		MathUtility.addModelBox(LeftUpperLeg_Bone, 19, 114, -6.0F, 4.0F, -5.0F, 8, 4, 10, 0.0F, false);
		MathUtility.addModelBox(LeftUpperLeg_Bone, 0, 105, -2.0F, -4.0F, -5.0F, 4, 8, 10, 0.0F, false);

		RightLowerLeg_Bone = new ModelRenderer(this);
		RightLowerLeg_Bone.setRotationPoint(-8.0F, 11.5F, -3.0F);
		MathUtility.addModelBox(RightLowerLeg_Bone, 0, 30, -4.0F, 2.5F, -5.0F, 8, 10, 10, 0.0F, false);
		MathUtility.addModelBox(RightLowerLeg_Bone, 102, 97, -1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false);

		RightUpperLeg_Bone = new ModelRenderer(this);
		RightUpperLeg_Bone.setRotationPoint(-10.0F, 2.0F, 0.0F);
		setRotationAngle(RightUpperLeg_Bone, -0.3491F, 0.0F, 0.0F);
		MathUtility.addModelBox(RightUpperLeg_Bone, 63, 115, -2.0F, 5.0F, -5.0F, 8, 3, 10, 0.0F, false);
		MathUtility.addModelBox(RightUpperLeg_Bone, 46, 104, -2.0F, -4.0F, -5.0F, 3, 9, 10, 0.0F, false);

		Hip_Bone = new ModelRenderer(this);
		Hip_Bone.setRotationPoint(0.0F, 4.5F, 0.0F);
		setRotationAngle(Hip_Bone, 0.1745F, 0.0F, 0.0F);
		MathUtility.addModelBox(Hip_Bone, 80, 65, -7.0F, -5.5F, -5.0F, 14, 5, 10, 0.0F, false);

		Torso_Bone = new ModelRenderer(this);
		Torso_Bone.setRotationPoint(0.0F, -5.0F, 0.0F);
		setRotationAngle(Torso_Bone, 0.0F, 0.0F, 0.0175F);
		Hip_Bone.addChild(Torso_Bone);
		MathUtility.addModelBox(Torso_Bone, 107, 81, -2.5F, -6.5F, -2.5F, 5, 5, 5, 0.0F, false);
		MathUtility.addModelBox(Torso_Bone, 0, 0, -12.0F, -18.5F, -6.0F, 24, 11, 12, 0.0F, false);

		Head_Bone = new ModelRenderer(this);
		Head_Bone.setRotationPoint(0.0F, -20.5F, 0.0F);
		Torso_Bone.addChild(Head_Bone);
		MathUtility.addModelBox(Head_Bone, 73, 0, -6.0F, -2.0F, -5.0F, 12, 4, 10, 0.0F, false);
		MathUtility.addModelBox(Head_Bone, 73, 15, -5.5F, -1.0F, -4.5F, 11, 3, 9, 0.0F, false);
		MathUtility.addModelBox(Head_Bone, 40, 27, -6.0F, -5.0F, 0.0F, 12, 3, 0, 0.0F, false);

		Flower1_Bone = new ModelRenderer(this);
		Flower1_Bone.setRotationPoint(-3.0F, -2.0F, 0.0F);
		setRotationAngle(Flower1_Bone, 0.0F, -0.7854F, 0.0F);
		Head_Bone.addChild(Flower1_Bone);
		MathUtility.addModelBox(Flower1_Bone, 64, 24, -2.0F, -6.0F, 0.0F, 4, 6, 0, 0.0F, false);

		Flower1_Bone2 = new ModelRenderer(this);
		Flower1_Bone2.setRotationPoint(-3.0F, -2.0F, 0.0F);
		setRotationAngle(Flower1_Bone2, 0.0F, 0.7854F, 0.0F);
		Head_Bone.addChild(Flower1_Bone2);
		MathUtility.addModelBox(Flower1_Bone2, 64, 24, -2.0F, -6.0F, 0.0F, 4, 6, 0, 0.0F, false);

		LeftUpperArm_Bone = new ModelRenderer(this);
		LeftUpperArm_Bone.setRotationPoint(13.0F, -11.5F, 1.0F);
		setRotationAngle(LeftUpperArm_Bone, -0.0873F, 0.0F, 0.0F);
		Torso_Bone.addChild(LeftUpperArm_Bone);
		MathUtility.addModelBox(LeftUpperArm_Bone, 53, 35, 0.0F, -13.0F, -7.0F, 14, 17, 12, 0.0F, false);

		LeftLowerArm_Bone = new ModelRenderer(this);
		LeftLowerArm_Bone.setRotationPoint(4.0F, 7.5F, -1.0F);
		setRotationAngle(LeftLowerArm_Bone, -0.1745F, 0.0F, -0.0873F);
		LeftUpperArm_Bone.addChild(LeftLowerArm_Bone);
		MathUtility.addModelBox(LeftLowerArm_Bone, 68, 65, 0.0F, -1.5F, -1.0F, 4, 4, 3, 0.0F, false);
		MathUtility.addModelBox(LeftLowerArm_Bone, 62, 81, -3.0F, 3.5F, -4.0F, 12, 24, 8, 0.0F, false);

		RightUpperArm_Bone = new ModelRenderer(this);
		RightUpperArm_Bone.setRotationPoint(-27.0F, -11.5F, 1.0F);
		setRotationAngle(RightUpperArm_Bone, -0.0873F, 0.0F, 0.0F);
		Torso_Bone.addChild(RightUpperArm_Bone);
		MathUtility.addModelBox(RightUpperArm_Bone, 2, 51, 1.0F, -13.0F, -7.0F, 13, 17, 12, 0.0F, false);

		RightLowerArm_Bone = new ModelRenderer(this);
		RightLowerArm_Bone.setRotationPoint(6.0F, 7.5F, -1.0F);
		setRotationAngle(RightLowerArm_Bone, -0.1745F, 0.0F, 0.0873F);
		RightUpperArm_Bone.addChild(RightLowerArm_Bone);
		MathUtility.addModelBox(RightLowerArm_Bone, 53, 65, 0.0F, -1.5F, -1.0F, 4, 4, 3, 0.0F, false);
		MathUtility.addModelBox(RightLowerArm_Bone, 18, 81, -3.0F, 3.5F, -4.0F, 10, 24, 8, 0.0F, false);
	}

	/* DEPRECATED
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftUpperLeg_Bone.render(f5);
		RightUpperLeg_Bone.render(f5);
		LeftLowerLeg_Bone.render(f5);
		RightLowerLeg_Bone.render(f5);
		Hip_Bone.render(f5);
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
        AbstractGolemEntity golem = (AbstractGolemEntity) entityIn;
		
		//Legwork
		float leftLegSwing = MathHelper.cos(limbSwing * 0.6f);
        float rightLegSwing = MathHelper.cos(limbSwing * 0.6f + (float)Math.PI);
        
        if(golem.getIsTempted() && limbSwingAmount < 0.01f) {
        	//Move Hip Offset into Squat Position        	
        	prevHipYOffset = nextHipYOffset;
        	prevHipZOffset = nextHipZOffset;
        	nextHipYOffset = MathHelper.lerp(0.1f, prevHipYOffset, 0.3f);
        	nextHipZOffset = MathHelper.lerp(0.1f, prevHipZOffset, 0.3f);
        	this.Hip_Bone.translateRotate(MathUtility.getTranslationMatrix(0, nextHipYOffset, nextHipZOffset));

	        //Move Leg Rotations into Squat Positions
	        this.LeftUpperLeg_Bone.rotateAngleX = MathHelper.lerp(0.1f, this.LeftUpperLeg_Bone.rotateAngleX, -1f);
	        this.RightUpperLeg_Bone.rotateAngleX = MathHelper.lerp(0.1f, this.LeftUpperLeg_Bone.rotateAngleX, -1f);
	        
	        //Move Left Leg Offsets into Squat Positions
	        prevLeftLegYOffset = nextLeftLegYOffset;
	        prevLeftLegZOffset = nextLeftLegZOffset;
	        nextLeftLegYOffset = MathHelper.lerp(0.1f, prevLeftLegYOffset, 0.3f);
	        nextLeftLegZOffset = MathHelper.lerp(0.1f, prevLeftLegZOffset, 0.2f);
	        this.LeftUpperLeg_Bone.translateRotate(MathUtility.getTranslationMatrix(0, nextLeftLegYOffset, nextLeftLegZOffset));
	        
	        //Move Right Leg Offsets into Squat Positions
	        prevRightLegYOffset = nextRightLegYOffset;
	        prevRightLegZOffset = nextRightLegZOffset;
	        nextRightLegYOffset = MathHelper.lerp(0.1f, prevRightLegYOffset, 0.3f);
	        nextRightLegZOffset = MathHelper.lerp(0.1f, prevRightLegZOffset, 0.2f);
	        this.RightUpperLeg_Bone.translateRotate(MathUtility.getTranslationMatrix(0, nextRightLegYOffset, nextRightLegZOffset));	        
		} else {
			//Move Hip Offset into Original Position
        	prevHipYOffset = nextHipYOffset;
        	prevHipZOffset = nextHipZOffset;
        	nextHipYOffset = MathHelper.lerp(0.1f, prevHipYOffset, -0.1f);
        	nextHipZOffset = MathHelper.lerp(0.1f, prevHipZOffset, 0);
        	this.Hip_Bone.translateRotate(MathUtility.getTranslationMatrix(0, nextHipYOffset, nextHipZOffset));
	        
	        //Animate Leg Rotations for Walking
	        this.LeftUpperLeg_Bone.rotateAngleX = MathHelper.clamp(-0.5f + leftLegSwing * 6F * limbSwingAmount, -1.4f, 1.4f);
	        this.RightUpperLeg_Bone.rotateAngleX = MathHelper.clamp(-0.5f + rightLegSwing * 6F * limbSwingAmount,  -1.4f, 1.4f);;
	        
	        //Move Left Leg Offsets into Squat Positions
	        prevLeftLegYOffset = nextLeftLegYOffset;
	        prevLeftLegZOffset = nextLeftLegZOffset;
	        nextLeftLegYOffset = MathHelper.lerp(0.1f, prevLeftLegYOffset, 0f);
	        nextLeftLegZOffset = MathHelper.lerp(0.1f, prevLeftLegZOffset, 0f);
	        this.LeftUpperLeg_Bone.translateRotate(MathUtility.getTranslationMatrix(0, nextLeftLegYOffset, nextLeftLegZOffset));
	        
	        //Move Right Leg Offsets into Squat Positions
	        prevRightLegYOffset = nextRightLegYOffset;
	        prevRightLegZOffset = nextRightLegZOffset;
	        nextRightLegYOffset = MathHelper.lerp(0.1f, prevRightLegYOffset, 0f);
	        nextRightLegZOffset =  MathHelper.lerp(0.1f, prevRightLegZOffset, 0f);
	        this.RightUpperLeg_Bone.translateRotate(MathUtility.getTranslationMatrix(0, nextRightLegYOffset, nextRightLegZOffset));	
		}
        
        //Footwork
        float leftFootRaise = MathHelper.cos((limbSwing * 0.6f) + (float)Math.PI - 1.8f);
        float rightFootRaise = MathHelper.cos((limbSwing * 0.6f) - 1.8f);
        float leftFootY = MathHelper.clamp(Math.min(leftFootRaise, 0) * 3f * limbSwingAmount, -0.6f, 0.6f);
        float leftFootZ = MathHelper.clamp(0 + leftLegSwing * 5f * limbSwingAmount, -0.6f, 0.6f);
        float rightFootY = MathHelper.clamp(Math.min(rightFootRaise, 0) * 3f * limbSwingAmount, -0.6f, 0.6f);
        float rightFootZ = MathHelper.clamp(0 + rightLegSwing * 5f * limbSwingAmount, -0.6f, 0.6f);
        
        this.LeftLowerLeg_Bone.translateRotate(MathUtility.getTranslationMatrix(0, leftFootY, leftFootZ));
        this.RightLowerLeg_Bone.translateRotate(MathUtility.getTranslationMatrix(0, rightFootY, rightFootZ));

        
        //Looking at Player
		this.Torso_Bone.rotateAngleX = headPitch * (float)Math.PI / 180F * 0.6f;
		this.LeftUpperArm_Bone.rotateAngleX = (headPitch * -1) * (float)Math.PI / 180 * 0.6f;
		this.RightUpperArm_Bone.rotateAngleX = (headPitch * -1) * (float)Math.PI / 180 * 0.6f;
	    this.Head_Bone.rotateAngleY = netHeadYaw * 0.8f * ((float)Math.PI / 180F);
		
		//Breathing
	    this.Torso_Bone.translateRotate(MathUtility.getTranslationMatrix(0, (float)Math.cos(oscillationTimer) * 0.05f, 0));

		this.LeftUpperArm_Bone.translateRotate(MathUtility.getTranslationMatrix(0, (float)Math.cos(oscillationTimer) * 0.05f, 0));;
		this.RightUpperArm_Bone.translateRotate(MathUtility.getTranslationMatrix(0, (float)Math.cos(oscillationTimer) * 0.05f, 0));;
		
	}
	
	public void setRotationAngle(ModelRenderer renderer, float x, float y, float z) {
		renderer.rotateAngleX = x;
		renderer.rotateAngleY = y;
		renderer.rotateAngleZ = z;
	}
}