package com.hamburger.ccp.client.model;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.mudhut.ffpackage.client.model.classic_suits.AnimatronicClassicSuitModel;
import net.mudhut.ffpackage.level.entity.Endo01;

// Your animatronic suit model, make sure you include the ear groups, even if
// the animatronic model doesn't have moving ears!
public class BAGFreddySuitModel<T extends Endo01> extends AnimatronicClassicSuitModel<T> {
	private final ModelPart Root;
	private final ModelPart LeftLeg;
	private final ModelPart LowerLeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LowerRightLeg;
	private final ModelPart Torso;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart LeftEar;
	private final ModelPart RightEar;

	public BAGFreddySuitModel(ModelPart root) {
		super(root);
		this.Root = root.getChild("Root");
		this.LeftLeg = this.Root.getChild("LeftLeg");
		this.LowerLeftLeg = this.LeftLeg.getChild("LowerLeftLeg");
		this.RightLeg = this.Root.getChild("RightLeg");
		this.LowerRightLeg = this.RightLeg.getChild("LowerRightLeg");
		this.Torso = this.Root.getChild("Torso");
		this.RightArm = this.Torso.getChild("RightArm");
		this.LeftArm = this.Torso.getChild("LeftArm");
		this.Head = this.Torso.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.LeftEar = this.Head.getChild("LeftEar");
		this.RightEar = this.Head.getChild("RightEar");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftLeg = Root.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(20, 44).mirror().addBox(-3.0F, -1.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 51).mirror().addBox(-3.0F, 6.5F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(3.0F, -14.0F, 0.0F));

		PartDefinition LowerLeftLeg = LeftLeg.addOrReplaceChild("LowerLeftLeg", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(-3.0F, 0.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition RightLeg = Root.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(20, 44).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(44, 51).addBox(-3.0F, 6.5F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.25F)), PartPose.offset(-3.0F, -14.0F, 0.0F));

		PartDefinition LowerRightLeg = RightLeg.addOrReplaceChild("LowerRightLeg", CubeListBuilder.create().texOffs(20, 65).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition Torso = Root.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(20, 20).addBox(-6.0F, -16.0F, -4.0F, 12.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(68, 45).addBox(-5.5F, -16.0F, -4.0F, 11.0F, 16.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -14.0F, 0.0F));

		PartDefinition RightArm = Torso.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 41).addBox(-4.5F, -2.5F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.25F))
				.texOffs(0, 20).addBox(-4.5F, -2.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, -13.0F, 0.0F));

		PartDefinition LeftArm = Torso.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.5F, -2.5F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(0, 20).mirror().addBox(-0.5F, -2.0F, -2.5F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.5F, -13.0F, 0.0F));

		PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(52, 22).addBox(-3.5F, -4.0F, -8.0F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(78, 37).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(62, 37).addBox(-2.0F, -14.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F))
				.texOffs(30, 5).addBox(-8.0F, -11.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 5).mirror().addBox(5.0F, -11.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 0).addBox(-5.0F, -9.5F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(60, 28).addBox(-3.5F, 0.0F, -3.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -4.5F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}