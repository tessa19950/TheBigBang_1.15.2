package com.homebrewCult.TheBigBang.entities.model;
import com.homebrewCult.TheBigBang.entities.AbstractEyeEntity;
import com.homebrewCult.TheBigBang.util.MathUtility;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//Made with Blockbench
//Paste this code into your mod.

@OnlyIn(Dist.CLIENT)
public class AbstractEyeModel<T extends Entity> extends QuadrupedModel<T> {
	
	private float oscillationTimer = 0f;
	private float oscillationSpeed = .2f;
	
	private float limbBaseRot = .5f;
	private Float limbTopSegmentMaxRot = .2f;
	private Float limbMiddleSegmentMaxRot = .4f;
	private Float limbBottomSegmentMaxRot = .6f;
	private Float limbMiddleSegmentTimeOffset = -1f;
	private Float limbBottomSegmentTimeOffset = -2f;
	
	private final ModelRenderer Body;
	private final ModelRenderer LegLowLeft;
	private final ModelRenderer LegLowRight;
	private final ModelRenderer Neck;
	private final ModelRenderer Head;
	private final ModelRenderer CheekLeft;
	private final ModelRenderer CheekRight;
	private final ModelRenderer Mouth;
	private final ModelRenderer Teeth;
	private final ModelRenderer TailStart;
	private final ModelRenderer TailMiddle;
	private final ModelRenderer TailEnd;

	public AbstractEyeModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		 
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 23.0F, 1.0F);
		MathUtility.addModelBox(Body, 36, 0, -5.0F, -11.0F, -7.0F, 10, 10, 12, 0.0F, false);
		MathUtility.addModelBox(Body, 68, 22, 5.0F, -7.0F, -2.0F, 8, 2, 2, 0.0F, false);
		MathUtility.addModelBox(Body, 68, 0, -13.0F, -7.0F, -2.0F, 8, 2, 2, 0.0F, false);

		LegLowLeft = new ModelRenderer(this);
		LegLowLeft.setRotationPoint(-12.0F, -6.0F, -1.0F);
		Body.addChild(LegLowLeft);
		MathUtility.addModelBox(LegLowLeft, 74, 26, -1.0F, 1.0F, -1.0F, 2, 6, 2, 0.0F, false);

		LegLowRight = new ModelRenderer(this);
		LegLowRight.setRotationPoint(12.0F, -6.0F, -1.0F);
		Body.addChild(LegLowRight);
		MathUtility.addModelBox(LegLowRight, 74, 4, -1.0F, 1.0F, -1.0F, 2, 6, 2, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, -5.0F, -5.0F);
		setRotationAngle(Neck, -0.5236F, 0.0F, 0.0F);
		Body.addChild(Neck);
		MathUtility.addModelBox(Neck, 0, 47, -4.0F, -5.0F, -10.0F, 8, 8, 10, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.4142F, -9.2426F);
		setRotationAngle(Head, 0.5236F, 0.0F, 0.0F);
		Neck.addChild(Head);
		MathUtility.addModelBox(Head, 0, 0, -5.0F, -5.9142F, -3.7574F, 10, 8, 8, 0.0F, false);

		CheekLeft = new ModelRenderer(this);
		CheekLeft.setRotationPoint(0.0F, 2.0858F, -3.7574F);
		Head.addChild(CheekLeft);
		MathUtility.addModelBox(CheekLeft, 18, 33, 0.0F, -1.0F, -0.5F, 6, 2, 2, 0.0F, false);

		CheekRight = new ModelRenderer(this);
		CheekRight.setRotationPoint(0.0F, 2.0858F, -3.7574F);
		Head.addChild(CheekRight);
		MathUtility.addModelBox(CheekRight, 18, 29, -6.0F, -1.0F, -0.5F, 6, 2, 2, 0.0F, false);

		Mouth = new ModelRenderer(this);
		Mouth.setRotationPoint(0.0F, -0.4142F, -1.7574F);
		Head.addChild(Mouth);
		MathUtility.addModelBox(Mouth, 0, 29, -3.1F, -3.9F, -1.8F, 6, 6, 3, 0.0F, false);
		MathUtility.addModelBox(Mouth, 0, 38, -2.5F, -2.5F, -1.8F, 5, 4, 2, 0.0F, false);
		MathUtility.addModelBox(Mouth, 8, 21, -5.0F, -4.0F, -1.8F, 10, 8, 0, 0.0F, false);
		MathUtility.addModelBox(Mouth, 20, 37, -2.0F, 1.0F, -2.4F, 4, 3, 2, 0.0F, false);

		Teeth = new ModelRenderer(this);
		Teeth.setRotationPoint(0.0F, -0.2929F, -0.364F);
		Mouth.addChild(Teeth);
		MathUtility.addModelBox(Teeth, 8, 16, -5.0F, -3.7071F, -1.536F, 10, 4, 0, 0.0F, false);

		TailStart = new ModelRenderer(this);
		TailStart.setRotationPoint(0.0F, -7.0F, 2.0F);
		setRotationAngle(TailStart, 0.7854F, 0.0F, 0.0F);
		Body.addChild(TailStart);
		MathUtility.addModelBox(TailStart, 39, 22, -3.5F, -2.5F, -1.0F, 7, 7, 12, 0.0F, false);

		TailMiddle = new ModelRenderer(this);
		TailMiddle.setRotationPoint(0.0F, 0.5F, 10.0F);
		setRotationAngle(TailMiddle, -0.7854F, 0.0F, 0.0F);
		TailStart.addChild(TailMiddle);
		MathUtility.addModelBox(TailMiddle, 44, 41, -2.5F, -2.0F, -1.0F, 5, 5, 9, 0.0F, false);

		TailEnd = new ModelRenderer(this);
		TailEnd.setRotationPoint(0.0F, 0.5F, 7.5F);
		setRotationAngle(TailEnd, -0.7854F, 0.0F, 0.0F);
		TailMiddle.addChild(TailEnd);
		MathUtility.addModelBox(TailEnd, 49, 55, -1.5F, -1.5F, -0.5F, 3, 3, 6, 0.0F, false);
	}
	
	/* DEPRECATED
	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		Body.render(scale);
        this.LegLowLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LegLowRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	}
	*/
	
	@Override
	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);		
		oscillationTimer = (entityIn.ticksExisted + partialTick) * oscillationSpeed;
		
		AbstractEyeEntity entity = (AbstractEyeEntity)entityIn;
		if(entity.isAngry) {
			this.CheekLeft.rotateAngleZ = -0.3f;
			this.CheekRight.rotateAngleZ = 0.3f;
			this.Mouth.translateRotate(MathUtility.getTranslationMatrix(0, 0.35f + ((float)Math.cos(oscillationTimer) * 0.05f), 0));
			this.Teeth.translateRotate(MathUtility.getTranslationMatrix(0, 0f + ((float)Math.cos(oscillationTimer) * -0.08f), 0));
		} else {
			this.CheekLeft.rotateAngleZ = 0;
			this.CheekRight.rotateAngleZ = 0;
			this.Mouth.translateRotate(MathUtility.getTranslationMatrix(0, 0, 0));
			this.Teeth.translateRotate(MathUtility.getTranslationMatrix(0, 0, 0));
		}
	}
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	    this.Head.rotateAngleX = 0.5f + (headPitch * ((float)Math.PI / 180F));
	    this.Neck.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		
		this.TailStart.rotateAngleX = limbBaseRot + ((float)Math.cos(oscillationTimer) * limbTopSegmentMaxRot);
		this.TailMiddle.rotateAngleX = (float)Math.cos(oscillationTimer + limbMiddleSegmentTimeOffset) * limbMiddleSegmentMaxRot;
		this.TailEnd.rotateAngleX = (float)Math.cos(oscillationTimer + limbBottomSegmentTimeOffset) * limbBottomSegmentMaxRot;
	}
	
	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}
}