// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer bottom;
	private final ModelRenderer wall;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		bottom.setTextureOffset(0, 11).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 1.0F, 8.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		wall = new ModelRenderer(this);
		wall.setRotationPoint(0.0F, 24.0F, 0.0F);
		wall.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bottom.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		wall.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}