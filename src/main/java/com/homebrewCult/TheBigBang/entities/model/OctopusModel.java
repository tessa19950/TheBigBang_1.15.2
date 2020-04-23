package com.homebrewCult.TheBigBang.entities.model;

import com.google.common.primitives.Floats;
import com.homebrewCult.TheBigBang.util.MathUtility;

import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OctopusModel <T extends Entity> extends QuadrupedModel<T>
{
	private final ModelRenderer bb_main;	
	private final ModelRenderer Eye1;
	private final ModelRenderer Eye2;
	private final ModelRenderer Eye3;
	private final ModelRenderer Eye4;
	private final ModelRenderer Eye5;
	private final ModelRenderer Eye6;
	private final ModelRenderer Eye7;
	private final ModelRenderer Eye8;
	private final ModelRenderer Leg1;
	private final ModelRenderer Segment1;
	private final ModelRenderer Segment2;
	private final ModelRenderer Segment3;
	private final ModelRenderer Leg2;
	private final ModelRenderer Segment4;
	private final ModelRenderer Segment5;
	private final ModelRenderer Segment6;
	private final ModelRenderer Leg3;
	private final ModelRenderer Segment7;
	private final ModelRenderer Segment8;
	private final ModelRenderer Segment9;
	private final ModelRenderer Leg4;
	private final ModelRenderer Segment10;
	private final ModelRenderer Segment11;
	private final ModelRenderer Segment12;
	private final ModelRenderer Leg5;
	private final ModelRenderer Segment13;
	private final ModelRenderer Segment14;
	private final ModelRenderer Segment15;
	private final ModelRenderer Leg6;
	private final ModelRenderer Segment16;
	private final ModelRenderer Segment17;
	private final ModelRenderer Segment18;
	
	private Float oscillationTimer = 0f;
	
	private Float limbTopSegmentMaxRot = 0.75f;
	private Float limbMiddleSegmentMaxRot = 1f;
	private Float limbBottomSegmentMaxRot = 1.25f;
	
	private Float limbMiddleSegmentTimeOffset = -1f;
	private Float limbBottomSegmentTimeOffset = -2f;
	
	public OctopusModel() 
	{
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		MathUtility.addModelBox(bb_main, 0, 0, -8.0F, -36.0F, -8.0F, 16, 16, 16, 0.0F, false);

		Eye1 = new ModelRenderer(this);
		Eye1.setRotationPoint(0.0F, -4.0F, -8.0F);
		MathUtility.addModelBox(Eye1, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye2 = new ModelRenderer(this);
		Eye2.setRotationPoint(-7.0F, -4.0F, -7.0F);
		setRotationAngle(Eye2, 0.0F, 0.7854F, 0.0F);
		MathUtility.addModelBox(Eye2, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye3 = new ModelRenderer(this);
		Eye3.setRotationPoint(-8.0F, -4.0F, 0.0F);
		setRotationAngle(Eye3, 0.0F, 1.5708F, 0.0F);
		MathUtility.addModelBox(Eye3, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye4 = new ModelRenderer(this);
		Eye4.setRotationPoint(-7.0F, -4.0F, 7.0F);
		setRotationAngle(Eye4, 0.0F, 2.3562F, 0.0F);
		MathUtility.addModelBox(Eye4, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye5 = new ModelRenderer(this);
		Eye5.setRotationPoint(0.0F, -4.0F, 8.0F);
		setRotationAngle(Eye5, 0.0F, 3.1416F, 0.0F);
		MathUtility.addModelBox(Eye5, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye6 = new ModelRenderer(this);
		Eye6.setRotationPoint(7.0F, -4.0F, 7.0F);
		setRotationAngle(Eye6, 0.0F, -2.3562F, 0.0F);
		MathUtility.addModelBox(Eye6, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye7 = new ModelRenderer(this);
		Eye7.setRotationPoint(8.0F, -4.0F, 0.0F);
		setRotationAngle(Eye7, 0.0F, -1.5708F, 0.0F);
		MathUtility.addModelBox(Eye7, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Eye8 = new ModelRenderer(this);
		Eye8.setRotationPoint(7.0F, -4.0F, -7.0F);
		setRotationAngle(Eye8, 0.0F, -0.7854F, 0.0F);
		MathUtility.addModelBox(Eye8, 0, 32, -2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F, false);

		Leg1 = new ModelRenderer(this);
		Leg1.setRotationPoint(0.0F, 24.0F, 0.0F);

		Segment1 = new ModelRenderer(this);
		Segment1.setRotationPoint(0.0F, -20.0F, -7.0F);
		Leg1.addChild(Segment1);
		MathUtility.addModelBox(Segment1, 22, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Segment2 = new ModelRenderer(this);
		Segment2.setRotationPoint(0.0F, 6.0F, 0.0F);
		Segment1.addChild(Segment2);
		MathUtility.addModelBox(Segment2, 32, 32, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false);

		Segment3 = new ModelRenderer(this);
		Segment3.setRotationPoint(0.0F, 5.0F, 0.0F);
		Segment2.addChild(Segment3);
		MathUtility.addModelBox(Segment3, 42, 32, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false);

		Leg2 = new ModelRenderer(this);
		Leg2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Leg2, 0.0F, -1.0472F, 0.0F);

		Segment4 = new ModelRenderer(this);
		Segment4.setRotationPoint(0.0F, -20.0F, -7.0F);
		Leg2.addChild(Segment4);
		MathUtility.addModelBox(Segment4, 22, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Segment5 = new ModelRenderer(this);
		Segment5.setRotationPoint(0.0F, 6.0F, 0.0F);
		Segment4.addChild(Segment5);
		MathUtility.addModelBox(Segment5, 32, 32, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false);

		Segment6 = new ModelRenderer(this);
		Segment6.setRotationPoint(0.0F, 5.0F, 0.0F);
		Segment5.addChild(Segment6);
		MathUtility.addModelBox(Segment6, 42, 32, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false);

		Leg3 = new ModelRenderer(this);
		Leg3.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Leg3, 0.0F, -2.0944F, 0.0F);

		Segment7 = new ModelRenderer(this);
		Segment7.setRotationPoint(0.0F, -20.0F, -7.0F);
		Leg3.addChild(Segment7);
		MathUtility.addModelBox(Segment7, 22, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Segment8 = new ModelRenderer(this);
		Segment8.setRotationPoint(0.0F, 6.0F, 0.0F);
		Segment7.addChild(Segment8);
		MathUtility.addModelBox(Segment8, 32, 32, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false);

		Segment9 = new ModelRenderer(this);
		Segment9.setRotationPoint(0.0F, 5.0F, 0.0F);
		Segment8.addChild(Segment9);
		MathUtility.addModelBox(Segment9, 42, 32, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false);

		Leg4 = new ModelRenderer(this);
		Leg4.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Leg4, 0.0F, 3.1416F, 0.0F);

		Segment10 = new ModelRenderer(this);
		Segment10.setRotationPoint(0.0F, -20.0F, -7.0F);
		Leg4.addChild(Segment10);
		MathUtility.addModelBox(Segment10, 22, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Segment11 = new ModelRenderer(this);
		Segment11.setRotationPoint(0.0F, 6.0F, 0.0F);
		Segment10.addChild(Segment11);
		MathUtility.addModelBox(Segment11, 32, 32, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false);

		Segment12 = new ModelRenderer(this);
		Segment12.setRotationPoint(0.0F, 5.0F, 0.0F);
		Segment11.addChild(Segment12);
		MathUtility.addModelBox(Segment12, 42, 32, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false);

		Leg5 = new ModelRenderer(this);
		Leg5.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Leg5, 0.0F, 2.0944F, 0.0F);

		Segment13 = new ModelRenderer(this);
		Segment13.setRotationPoint(0.0F, -20.0F, -7.0F);
		Leg5.addChild(Segment13);
		MathUtility.addModelBox(Segment13, 22, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Segment14 = new ModelRenderer(this);
		Segment14.setRotationPoint(0.0F, 6.0F, 0.0F);
		Segment13.addChild(Segment14);
		MathUtility.addModelBox(Segment14, 32, 32, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false);

		Segment15 = new ModelRenderer(this);
		Segment15.setRotationPoint(0.0F, 5.0F, 0.0F);
		Segment14.addChild(Segment15);
		MathUtility.addModelBox(Segment15, 42, 32, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false);

		Leg6 = new ModelRenderer(this);
		Leg6.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(Leg6, 0.0F, 1.0472F, 0.0F);

		Segment16 = new ModelRenderer(this);
		Segment16.setRotationPoint(0.0F, -20.0F, -7.0F);
		Leg6.addChild(Segment16);
		MathUtility.addModelBox(Segment16, 22, 32, -1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Segment17 = new ModelRenderer(this);
		Segment17.setRotationPoint(0.0F, 6.0F, 0.0F);
		Segment16.addChild(Segment17);
		MathUtility.addModelBox(Segment17, 32, 32, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false);

		Segment18 = new ModelRenderer(this);
		Segment18.setRotationPoint(0.0F, 5.0F, 0.0F);
		Segment17.addChild(Segment18);
		MathUtility.addModelBox(Segment18, 42, 32, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false);
	}

	/*
	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) 
	{
		bb_main.render(scale);
		Eye1.render(scale);
		Eye2.render(scale);
		Eye3.render(scale);
		Eye4.render(scale);
		Eye5.render(scale);
		Eye6.render(scale);
		Eye7.render(scale);
		Eye8.render(scale);
		Leg1.render(scale);
		Leg2.render(scale);
		Leg3.render(scale);
		Leg4.render(scale);
		Leg5.render(scale);
		Leg6.render(scale);
	}
	*/
	
	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);		
		oscillationTimer = (entityIn.ticksExisted + partialTick) * .5f;
	}
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) 
	{	
		this.Eye1.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye1.rotateAngleY = Floats.constrainToRange(netHeadYaw, -45, 45) * ((float)Math.PI / 180F);
		this.Eye2.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye2.rotateAngleY = Floats.constrainToRange(netHeadYaw, 0, 90) * ((float)Math.PI / 180F);
		this.Eye3.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye3.rotateAngleY = Floats.constrainToRange(netHeadYaw, 45, 135) * ((float)Math.PI / 180F);
		this.Eye4.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye4.rotateAngleY = Floats.constrainToRange(netHeadYaw, 90, 180) * ((float)Math.PI / 180F);
		this.Eye5.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye5.rotateAngleY = Floats.constrainToRange(netHeadYaw, 180, 180) * ((float)Math.PI / 180F);
		this.Eye6.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye6.rotateAngleY = Floats.constrainToRange(netHeadYaw, -180, -90) * ((float)Math.PI / 180F);
		this.Eye7.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye7.rotateAngleY = Floats.constrainToRange(netHeadYaw, -135, -45) * ((float)Math.PI / 180F);
		this.Eye8.rotateAngleX = Floats.constrainToRange(headPitch, -45, 45) * ((float)Math.PI / 180F);
		this.Eye8.rotateAngleY = Floats.constrainToRange(netHeadYaw, -90, 0) * ((float)Math.PI / 180F);
		
		this.Segment1.rotateAngleX = -0.3f + ((float)Math.cos(oscillationTimer) * limbTopSegmentMaxRot);
		this.Segment2.rotateAngleX = (float)Math.cos(oscillationTimer + limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.Segment3.rotateAngleX = (float)Math.cos(oscillationTimer + limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
		
		this.Segment4.rotateAngleX = -0.3f + -((float)Math.cos(oscillationTimer) * limbTopSegmentMaxRot);
		this.Segment5.rotateAngleX = (float)Math.cos(oscillationTimer + -limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.Segment6.rotateAngleX = (float)Math.cos(oscillationTimer + -limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
		
		this.Segment7.rotateAngleX = -0.3f + ((float)Math.cos(oscillationTimer + 1) * limbTopSegmentMaxRot);
		this.Segment8.rotateAngleX = (float)Math.cos(oscillationTimer + 1 + limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.Segment9.rotateAngleX = (float)Math.cos(oscillationTimer + 1 + limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
		
		this.Segment10.rotateAngleX = -0.3f + -((float)Math.cos(oscillationTimer + 1) * limbTopSegmentMaxRot);
		this.Segment11.rotateAngleX = (float)Math.cos(oscillationTimer + 1 + -limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.Segment12.rotateAngleX = (float)Math.cos(oscillationTimer + 1 + -limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
		
		this.Segment13.rotateAngleX = -0.3f + ((float)Math.cos(oscillationTimer + 2) * limbTopSegmentMaxRot);
		this.Segment14.rotateAngleX = (float)Math.cos(oscillationTimer + 2 + limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.Segment15.rotateAngleX = (float)Math.cos(oscillationTimer + 2 + limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
		
		this.Segment16.rotateAngleX = -0.3f + -((float)Math.cos(oscillationTimer + 2) * limbTopSegmentMaxRot);
		this.Segment17.rotateAngleX = (float)Math.cos(oscillationTimer + 2 + -limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.Segment18.rotateAngleX = (float)Math.cos(oscillationTimer + 2 + -limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
	}
}
