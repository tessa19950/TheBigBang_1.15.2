package com.homebrewCult.TheBigBang.entities.model;

import com.homebrewCult.TheBigBang.util.MathUtility;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//Made with Blockbench
//Paste this code into your mod.

@OnlyIn(Dist.CLIENT)
public class StumpModel<T extends Entity> extends QuadrupedModel<T> {
	
	private final ModelRenderer leg_back_right;
	private final ModelRenderer leg_back_left;
	private final ModelRenderer leg_front_right;
	private final ModelRenderer leg_front_left;
	private final ModelRenderer body;
	
	public StumpModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 64;
		textureHeight = 64;

		leg_back_right = new ModelRenderer(this);
		leg_back_right.setRotationPoint(-8.0F, 18.0F, 8.0F);
		MathUtility.addModelBox(leg_back_right, 0, 0, -2.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, false);

		leg_back_left = new ModelRenderer(this);
		leg_back_left.setRotationPoint(8.0F, 18.0F, 8.0F);
		MathUtility.addModelBox(leg_back_left, 0, 0, -2.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, false);

		leg_front_right = new ModelRenderer(this);
		leg_front_right.setRotationPoint(-8.0F, 18.0F, -8.0F);
		MathUtility.addModelBox(leg_front_right, 0, 0, -2.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, false);

		leg_front_left = new ModelRenderer(this);
		leg_front_left.setRotationPoint(8.0F, 18.0F, -8.0F);
		MathUtility.addModelBox(leg_front_left, 0, 0, -2.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		MathUtility.addModelBox(body, 0, 0, -8.0F, -23.0F, -8.0F, 16, 20, 16, 0.0F, false);
	}
	
	/* DEPRECATED
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	{
		if(this.isChild)
		{
	        GlStateManager.translatef(0.0F, 0.6F, 0.0F);
			GlStateManager.scalef(0.6F, 0.6F, 0.6F);
		}
		leg_back_right.render(f5);
		leg_back_left.render(f5);
		leg_front_right.render(f5);
		leg_front_left.render(f5);
		body.render(f5);
	}
	*/
	
	
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_front_left.rotateAngleX = MathHelper.cos(limbSwing * 3F) * 3F * limbSwingAmount;
		this.leg_front_right.rotateAngleX = MathHelper.cos(limbSwing * 3F + (float)Math.PI) * 3F * limbSwingAmount;
		this.leg_back_left.rotateAngleX = MathHelper.cos(limbSwing * 3F + (float)Math.PI) * 3F * limbSwingAmount;
		this.leg_back_right.rotateAngleX = MathHelper.cos(limbSwing * 3F) * 3F * limbSwingAmount;
	}
	

	public void setRotationAngle(ModelRenderer renderer, float x, float y, float z) {
		renderer.rotateAngleX = x;
		renderer.rotateAngleY = y;
		renderer.rotateAngleZ = z;
	}	

}

