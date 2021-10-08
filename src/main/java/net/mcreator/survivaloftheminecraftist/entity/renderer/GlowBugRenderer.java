package net.mcreator.survivaloftheminecraftist.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.survivaloftheminecraftist.entity.GlowBugEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GlowBugRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GlowBugEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGlowBug(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("survival_of_the_minecraftist:textures/glowbug.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("survival_of_the_minecraftist:textures/glowbug_glowing.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGlowBug extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer Sting_r1;
		private final ModelRenderer Body2_r1;
		private final ModelRenderer wings;
		private final ModelRenderer RWing;
		private final ModelRenderer LWing;
		public ModelGlowBug() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 15.0F, -10.0F);
			Head.setTextureOffset(0, 5).addBox(0.0F, -7.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(22, 23).addBox(-3.0F, -4.0F, -4.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 22.0F, 0.0F);
			Body.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -10.0F, 7.0F, 5.0F, 10.0F, 0.0F, false);
			Body.setTextureOffset(6, 6).addBox(-3.0F, -5.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(6, 4).addBox(-3.0F, -5.0F, -9.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(4, 6).addBox(2.0F, -5.0F, -9.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(6, 0).addBox(2.0F, -5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(4, 4).addBox(-3.0F, -5.0F, -6.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(8, 0).addBox(2.0F, -5.0F, -3.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			Sting_r1 = new ModelRenderer(this);
			Sting_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
			Body.addChild(Sting_r1);
			setRotationAngle(Sting_r1, -0.3491F, 0.0F, 0.0F);
			Sting_r1.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Body2_r1 = new ModelRenderer(this);
			Body2_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
			Body.addChild(Body2_r1);
			setRotationAngle(Body2_r1, -0.2182F, 0.0F, 0.0F);
			Body2_r1.setTextureOffset(0, 15).addBox(-3.0F, -10.0F, 1.0F, 5.0F, 4.0F, 8.0F, 0.0F, false);
			wings = new ModelRenderer(this);
			wings.setRotationPoint(-2.0F, -13.0F, 0.0F);
			Body.addChild(wings);
			RWing = new ModelRenderer(this);
			RWing.setRotationPoint(-2.0F, 2.0F, -5.0F);
			wings.addChild(RWing);
			RWing.setTextureOffset(18, 15).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			RWing.setTextureOffset(18, 18).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			RWing.setTextureOffset(20, 19).addBox(-2.0F, 0.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LWing = new ModelRenderer(this);
			LWing.setRotationPoint(5.0F, 3.0F, -5.0F);
			wings.addChild(LWing);
			LWing.setTextureOffset(20, 19).addBox(0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LWing.setTextureOffset(18, 18).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			LWing.setTextureOffset(18, 15).addBox(0.0F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RWing.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LWing.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
