// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer bottom;
	private final ModelRenderer wall;
	private final ModelRenderer handel;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(bottom);
		bottom.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -2.0F, 10.0F, 1.0F, 8.0F, 0.0F, false);
		bottom.setTextureOffset(0, 9).addBox(-4.0F, -1.0F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 9).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		wall = new ModelRenderer(this);
		wall.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(wall);
		wall.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 11.0F, 1.0F, 0.0F, false);
		wall.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, 7.0F, 8.0F, 11.0F, 1.0F, 0.0F, false);
		wall.setTextureOffset(10, 6).addBox(-6.0F, -12.0F, -2.0F, 1.0F, 11.0F, 8.0F, 0.0F, false);
		wall.setTextureOffset(0, 0).addBox(5.0F, -12.0F, -2.0F, 1.0F, 11.0F, 8.0F, 0.0F, false);
		wall.setTextureOffset(0, 0).addBox(4.0F, -12.0F, -3.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		wall.setTextureOffset(0, 0).addBox(-5.0F, -12.0F, -3.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		wall.setTextureOffset(0, 0).addBox(-5.0F, -12.0F, 6.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		wall.setTextureOffset(0, 0).addBox(4.0F, -12.0F, 6.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		handel = new ModelRenderer(this);
		handel.setRotationPoint(0.0F, 24.0F, 0.0F);
		handel.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		handel.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		handel.setTextureOffset(0, 0).addBox(-1.0F, -11.0F, -7.0F, 2.0F, 9.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		all.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		handel.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}