package com.hamburger.ccp.client.model;

import com.hamburger.ccp.CCP;
import com.hamburger.ccp.level.entity.ThePenguin;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class ThePenguinModel<T extends ThePenguin> extends HierarchicalModel<T> {
    private final ModelPart Root;
    private final ModelPart Torso;
    private final ModelPart Head;
    private final ModelPart Plate;
    private final ModelPart ItemBone;
    private final ModelPart Right_eye;
    private final ModelPart Left_Eye;
    private final ModelPart BowTie;
    private final ModelPart Right_Wing;
    private final ModelPart Left_Wing;
    private final ModelPart Right_Foot;
    private final ModelPart Left_Foot;

    public ThePenguinModel(ModelPart root) {
        this.Root = root.getChild("Root");
        this.Torso = this.Root.getChild("Torso");
        this.Head = this.Torso.getChild("Head");
        this.Plate = this.Head.getChild("Plate");
        this.ItemBone = this.Plate.getChild("ItemBone");
        this.Right_eye = this.Head.getChild("Right_eye");
        this.Left_Eye = this.Head.getChild("Left_Eye");
        this.BowTie = this.Torso.getChild("BowTie");
        this.Right_Wing = this.Torso.getChild("Right_Wing");
        this.Left_Wing = this.Torso.getChild("Left_Wing");
        this.Right_Foot = this.Torso.getChild("Right_Foot");
        this.Left_Foot = this.Torso.getChild("Left_Foot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Torso = Root.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(40, 1).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.2F))
                .texOffs(0, 0).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 13.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 57).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 13.0F, 10.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 23).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(40, 32).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 5.0F, 2.0F, new CubeDeformation(-0.05F))
                .texOffs(26, 51).addBox(-1.0F, -2.5F, -7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -13.0F, 0.0F));

        PartDefinition Plate = Head.addOrReplaceChild("Plate", CubeListBuilder.create().texOffs(40, 12).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(40, 22).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, -8.0F, 0.0F));

        PartDefinition ItemBone = Plate.addOrReplaceChild("ItemBone", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition Right_eye = Head.addOrReplaceChild("Right_eye", CubeListBuilder.create().texOffs(14, 41).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -4.5F, -5.0F));

        PartDefinition Left_Eye = Head.addOrReplaceChild("Left_Eye", CubeListBuilder.create().texOffs(26, 41).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -4.5F, -5.0F));

        PartDefinition BowTie = Torso.addOrReplaceChild("BowTie", CubeListBuilder.create().texOffs(14, 51).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.5F, -5.25F));

        PartDefinition Right_Wing = Torso.addOrReplaceChild("Right_Wing", CubeListBuilder.create().texOffs(40, 39).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -11.0F, 0.0F));

        PartDefinition Left_Wing = Torso.addOrReplaceChild("Left_Wing", CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, 0.0F, -3.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -11.0F, 0.0F));

        PartDefinition Right_Foot = Torso.addOrReplaceChild("Right_Foot", CubeListBuilder.create().texOffs(14, 47).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(-3.0F, 0.0F, -4.5F));

        PartDefinition Left_Foot = Torso.addOrReplaceChild("Left_Foot", CubeListBuilder.create().texOffs(26, 47).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(3.0F, 0.0F, -4.5F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(ThePenguin entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int i2) {
        Root.render(poseStack, vertexConsumer, packedLight, packedOverlay);
    }

    @Override
    public ModelPart root() {
        return this.Root;
    }

}
