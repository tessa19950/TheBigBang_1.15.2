package com.homebrewCult.TheBigBang.entities.render;
import com.homebrewCult.TheBigBang.TheBigBang;
import com.homebrewCult.TheBigBang.entities.StumpEntity;
import com.homebrewCult.TheBigBang.entities.model.StumpModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class StumpRenderer extends MobRenderer<StumpEntity, StumpModel<StumpEntity>>
{
	public StumpRenderer(EntityRendererManager manager) 
	{
		super(manager, new StumpModel<>(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(StumpEntity entity) 
	{
		return new ResourceLocation(TheBigBang.MODID, "textures/entity/stump_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<StumpEntity>
	{
		public EntityRenderer<? super StumpEntity> createRenderFor(EntityRendererManager manager) 
		{
			return new StumpRenderer(manager);
		}
	}
}
