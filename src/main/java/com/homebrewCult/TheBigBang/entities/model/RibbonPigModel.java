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
public class RibbonPigModel<T extends Entity> extends QuadrupedModel<T> {
	
	private final ModelRenderer bb_main;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;

	public RibbonPigModel() {
		super(6, 0.0f, false, 0f, 0f, 0f, 0f, 0);
		
		textureWidth = 64;
		textureHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		MathUtility.addModelBox(bb_main, 36, 4, -5.0F, -15.0F, 0.0F, 10, 4, 0, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		MathUtility.addModelBox(body, 28, 8, -5.0F, -9.0F, -10.0F, 10, 14, 8, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, -6.0F);
		MathUtility.addModelBox(head, 0, 0, -4.0F, 0.0F, -8.0F, 8, 8, 8, 0.0F, true);
		MathUtility.addModelBox(head, 16, 16, -2.0F, 3.0F, -9.0F, 4, 3, 1, 0.0F, true);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(3.0F, 18.0F, 7.0F);
		MathUtility.addModelBox(leg0, 0, 19, -2.0F, 3.0F, -4.0F, 4, 3, 4, 0.0F, true);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 18.0F, 7.0F);
		MathUtility.addModelBox(leg1, 0, 19, -2.0F, 3.0F, -4.0F, 4, 3, 4, 0.0F, true);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 18.0F, -5.0F);
		MathUtility.addModelBox(leg2, 0, 19, -2.0F, 3.0F, -2.0F, 4, 3, 4, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, 18.0F, -5.0F);
		MathUtility.addModelBox(leg3, 0, 19, -2.0F, 3.0F, -2.0F, 4, 3, 4, 0.0F, true);
	}

	/* DEPRECATED
	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		
		bb_main.render(scale);
		body.render(scale);
		head.render(scale);
		leg0.render(scale);
		leg1.render(scale);
		leg2.render(scale);
		leg3.render(scale);
	}
	*/
	
	public void setRotationAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
		ModelRenderer.rotateAngleX = x;
		ModelRenderer.rotateAngleY = y;
		ModelRenderer.rotateAngleZ = z;
	}
}