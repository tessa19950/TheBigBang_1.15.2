package com.homebrewCult.TheBigBang.entities.render;

import com.homebrewCult.TheBigBang.TheBigBang;
import com.homebrewCult.TheBigBang.entities.CurseEyeEntity;
import com.homebrewCult.TheBigBang.entities.model.AbstractEyeModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class CurseEyeRenderer extends MobRenderer<CurseEyeEntity, AbstractEyeModel<CurseEyeEntity>>
{
	
	public CurseEyeRenderer(EntityRendererManager manager) 
	{
		super(manager, new AbstractEyeModel<>(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(CurseEyeEntity entity) 
	{
		return new ResourceLocation(TheBigBang.MODID, "textures/entity/curse_eye_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<CurseEyeEntity>
	{
		public EntityRenderer<? super CurseEyeEntity> createRenderFor(EntityRendererManager manager) 
		{
			return new CurseEyeRenderer(manager);
		}
	}
	
}
