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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RWing.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LWing.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}