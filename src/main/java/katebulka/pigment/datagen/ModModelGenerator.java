package katebulka.pigment.datagen;

import katebulka.pigment.ExampleMod;
import katebulka.pigment.register.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool whiteConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.WHITE_CONCRETE_BRICKS);
        whiteConcreteBricks.slab(ModBlocks.WHITE_CONCRETE_BRICKS_SLAB);
        whiteConcreteBricks.stairs(ModBlocks.WHITE_CONCRETE_BRICKS_STAIRS);
        whiteConcreteBricks.wall(ModBlocks.WHITE_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool blackConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BLACK_CONCRETE_BRICKS);
        blackConcreteBricks.slab(ModBlocks.BLACK_CONCRETE_BRICKS_SLAB);
        blackConcreteBricks.stairs(ModBlocks.BLACK_CONCRETE_BRICKS_STAIRS);
        blackConcreteBricks.wall(ModBlocks.BLACK_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool grayConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.GRAY_CONCRETE_BRICKS);
        grayConcreteBricks.slab(ModBlocks.GRAY_CONCRETE_BRICKS_SLAB);
        grayConcreteBricks.stairs(ModBlocks.GRAY_CONCRETE_BRICKS_STAIRS);
        grayConcreteBricks.wall(ModBlocks.GRAY_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGrayConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS);
        lightGrayConcreteBricks.slab(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_SLAB);
        lightGrayConcreteBricks.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_STAIRS);
        lightGrayConcreteBricks.wall(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool redConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.RED_CONCRETE_BRICKS);
        redConcreteBricks.slab(ModBlocks.RED_CONCRETE_BRICKS_SLAB);
        redConcreteBricks.stairs(ModBlocks.RED_CONCRETE_BRICKS_STAIRS);
        redConcreteBricks.wall(ModBlocks.RED_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool greenConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.GREEN_CONCRETE_BRICKS);
        greenConcreteBricks.slab(ModBlocks.GREEN_CONCRETE_BRICKS_SLAB);
        greenConcreteBricks.stairs(ModBlocks.GREEN_CONCRETE_BRICKS_STAIRS);
        greenConcreteBricks.wall(ModBlocks.GREEN_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool limeConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIME_CONCRETE_BRICKS);
        limeConcreteBricks.slab(ModBlocks.LIME_CONCRETE_BRICKS_SLAB);
        limeConcreteBricks.stairs(ModBlocks.LIME_CONCRETE_BRICKS_STAIRS);
        limeConcreteBricks.wall(ModBlocks.LIME_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool blueConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BLUE_CONCRETE_BRICKS);
        blueConcreteBricks.slab(ModBlocks.BLUE_CONCRETE_BRICKS_SLAB);
        blueConcreteBricks.stairs(ModBlocks.BLUE_CONCRETE_BRICKS_STAIRS);
        blueConcreteBricks.wall(ModBlocks.BLUE_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlueConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS);
        lightBlueConcreteBricks.slab(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_SLAB);
        lightBlueConcreteBricks.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_STAIRS);
        lightBlueConcreteBricks.wall(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool purpleConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.PURPLE_CONCRETE_BRICKS);
        purpleConcreteBricks.slab(ModBlocks.PURPLE_CONCRETE_BRICKS_SLAB);
        purpleConcreteBricks.stairs(ModBlocks.PURPLE_CONCRETE_BRICKS_STAIRS);
        purpleConcreteBricks.wall(ModBlocks.PURPLE_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool pinkConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.PINK_CONCRETE_BRICKS);
        pinkConcreteBricks.slab(ModBlocks.PINK_CONCRETE_BRICKS_SLAB);
        pinkConcreteBricks.stairs(ModBlocks.PINK_CONCRETE_BRICKS_STAIRS);
        pinkConcreteBricks.wall(ModBlocks.PINK_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool magentaConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.MAGENTA_CONCRETE_BRICKS);
        magentaConcreteBricks.slab(ModBlocks.MAGENTA_CONCRETE_BRICKS_SLAB);
        magentaConcreteBricks.stairs(ModBlocks.MAGENTA_CONCRETE_BRICKS_STAIRS);
        magentaConcreteBricks.wall(ModBlocks.MAGENTA_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool brownConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BROWN_CONCRETE_BRICKS);
        brownConcreteBricks.slab(ModBlocks.BROWN_CONCRETE_BRICKS_SLAB);
        brownConcreteBricks.stairs(ModBlocks.BROWN_CONCRETE_BRICKS_STAIRS);
        brownConcreteBricks.wall(ModBlocks.BROWN_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool orangeConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.ORANGE_CONCRETE_BRICKS);
        orangeConcreteBricks.slab(ModBlocks.ORANGE_CONCRETE_BRICKS_SLAB);
        orangeConcreteBricks.stairs(ModBlocks.ORANGE_CONCRETE_BRICKS_STAIRS);
        orangeConcreteBricks.wall(ModBlocks.ORANGE_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool yellowConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.YELLOW_CONCRETE_BRICKS);
        yellowConcreteBricks.slab(ModBlocks.YELLOW_CONCRETE_BRICKS_SLAB);
        yellowConcreteBricks.stairs(ModBlocks.YELLOW_CONCRETE_BRICKS_STAIRS);
        yellowConcreteBricks.wall(ModBlocks.YELLOW_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool cyanConcreteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.CYAN_CONCRETE_BRICKS);
        cyanConcreteBricks.slab(ModBlocks.CYAN_CONCRETE_BRICKS_SLAB);
        cyanConcreteBricks.stairs(ModBlocks.CYAN_CONCRETE_BRICKS_STAIRS);
        cyanConcreteBricks.wall(ModBlocks.CYAN_CONCRETE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool terracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.TERRACOTTA_BRICKS);
        terracottaBricks.slab(ModBlocks.TERRACOTTA_BRICKS_SLAB);
        terracottaBricks.stairs(ModBlocks.TERRACOTTA_BRICKS_STAIRS);
        terracottaBricks.wall(ModBlocks.TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool whiteTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.WHITE_TERRACOTTA_BRICKS);
        whiteTerracottaBricks.slab(ModBlocks.WHITE_TERRACOTTA_BRICKS_SLAB);
        whiteTerracottaBricks.stairs(ModBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS);
        whiteTerracottaBricks.wall(ModBlocks.WHITE_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool blackTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BLACK_TERRACOTTA_BRICKS);
        blackTerracottaBricks.slab(ModBlocks.BLACK_TERRACOTTA_BRICKS_SLAB);
        blackTerracottaBricks.stairs(ModBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS);
        blackTerracottaBricks.wall(ModBlocks.BLACK_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool grayTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.GRAY_TERRACOTTA_BRICKS);
        grayTerracottaBricks.slab(ModBlocks.GRAY_TERRACOTTA_BRICKS_SLAB);
        grayTerracottaBricks.stairs(ModBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS);
        grayTerracottaBricks.wall(ModBlocks.GRAY_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        lightGrayTerracottaBricks.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB);
        lightGrayTerracottaBricks.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS);
        lightGrayTerracottaBricks.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool redTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.RED_TERRACOTTA_BRICKS);
        redTerracottaBricks.slab(ModBlocks.RED_TERRACOTTA_BRICKS_SLAB);
        redTerracottaBricks.stairs(ModBlocks.RED_TERRACOTTA_BRICKS_STAIRS);
        redTerracottaBricks.wall(ModBlocks.RED_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool greenTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.GREEN_TERRACOTTA_BRICKS);
        greenTerracottaBricks.slab(ModBlocks.GREEN_TERRACOTTA_BRICKS_SLAB);
        greenTerracottaBricks.stairs(ModBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS);
        greenTerracottaBricks.wall(ModBlocks.GREEN_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool limeTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIME_TERRACOTTA_BRICKS);
        limeTerracottaBricks.slab(ModBlocks.LIME_TERRACOTTA_BRICKS_SLAB);
        limeTerracottaBricks.stairs(ModBlocks.LIME_TERRACOTTA_BRICKS_STAIRS);
        limeTerracottaBricks.wall(ModBlocks.LIME_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool blueTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BLUE_TERRACOTTA_BRICKS);
        blueTerracottaBricks.slab(ModBlocks.BLUE_TERRACOTTA_BRICKS_SLAB);
        blueTerracottaBricks.stairs(ModBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS);
        blueTerracottaBricks.wall(ModBlocks.BLUE_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        lightBlueTerracottaBricks.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB);
        lightBlueTerracottaBricks.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS);
        lightBlueTerracottaBricks.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool purpleTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.PURPLE_TERRACOTTA_BRICKS);
        purpleTerracottaBricks.slab(ModBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB);
        purpleTerracottaBricks.stairs(ModBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS);
        purpleTerracottaBricks.wall(ModBlocks.PURPLE_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool pinkTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.PINK_TERRACOTTA_BRICKS);
        pinkTerracottaBricks.slab(ModBlocks.PINK_TERRACOTTA_BRICKS_SLAB);
        pinkTerracottaBricks.stairs(ModBlocks.PINK_TERRACOTTA_BRICKS_STAIRS);
        pinkTerracottaBricks.wall(ModBlocks.PINK_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool magentaTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
        magentaTerracottaBricks.slab(ModBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB);
        magentaTerracottaBricks.stairs(ModBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS);
        magentaTerracottaBricks.wall(ModBlocks.MAGENTA_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool brownTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BROWN_TERRACOTTA_BRICKS);
        brownTerracottaBricks.slab(ModBlocks.BROWN_TERRACOTTA_BRICKS_SLAB);
        brownTerracottaBricks.stairs(ModBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS);
        brownTerracottaBricks.wall(ModBlocks.BROWN_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool orangeTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.ORANGE_TERRACOTTA_BRICKS);
        orangeTerracottaBricks.slab(ModBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB);
        orangeTerracottaBricks.stairs(ModBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS);
        orangeTerracottaBricks.wall(ModBlocks.ORANGE_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool yellowTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.YELLOW_TERRACOTTA_BRICKS);
        yellowTerracottaBricks.slab(ModBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB);
        yellowTerracottaBricks.stairs(ModBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS);
        yellowTerracottaBricks.wall(ModBlocks.YELLOW_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool cyanTerracottaBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.CYAN_TERRACOTTA_BRICKS);
        cyanTerracottaBricks.slab(ModBlocks.CYAN_TERRACOTTA_BRICKS_SLAB);
        cyanTerracottaBricks.stairs(ModBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS);
        cyanTerracottaBricks.wall(ModBlocks.CYAN_TERRACOTTA_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool terracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.TERRACOTTA_SHINGLES);
        terracottaShingles.slab(ModBlocks.TERRACOTTA_SHINGLES_SLAB);
        terracottaShingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_STAIRS);
        terracottaShingles.wall(ModBlocks.TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool whiteTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.WHITE_TERRACOTTA_SHINGLES);
        whiteTerracottaShingles.slab(ModBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB);
        whiteTerracottaShingles.stairs(ModBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS);
        whiteTerracottaShingles.wall(ModBlocks.WHITE_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool blackTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BLACK_TERRACOTTA_SHINGLES);
        blackTerracottaShingles.slab(ModBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB);
        blackTerracottaShingles.stairs(ModBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS);
        blackTerracottaShingles.wall(ModBlocks.BLACK_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool grayTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.GRAY_TERRACOTTA_SHINGLES);
        grayTerracottaShingles.slab(ModBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB);
        grayTerracottaShingles.stairs(ModBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS);
        grayTerracottaShingles.wall(ModBlocks.GRAY_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES);
        lightGrayTerracottaShingles.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB);
        lightGrayTerracottaShingles.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS);
        lightGrayTerracottaShingles.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool redTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.RED_TERRACOTTA_SHINGLES);
        redTerracottaShingles.slab(ModBlocks.RED_TERRACOTTA_SHINGLES_SLAB);
        redTerracottaShingles.stairs(ModBlocks.RED_TERRACOTTA_SHINGLES_STAIRS);
        redTerracottaShingles.wall(ModBlocks.RED_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool greenTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.GREEN_TERRACOTTA_SHINGLES);
        greenTerracottaShingles.slab(ModBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB);
        greenTerracottaShingles.stairs(ModBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS);
        greenTerracottaShingles.wall(ModBlocks.GREEN_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool limeTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIME_TERRACOTTA_SHINGLES);
        limeTerracottaShingles.slab(ModBlocks.LIME_TERRACOTTA_SHINGLES_SLAB);
        limeTerracottaShingles.stairs(ModBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS);
        limeTerracottaShingles.wall(ModBlocks.LIME_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool blueTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BLUE_TERRACOTTA_SHINGLES);
        blueTerracottaShingles.slab(ModBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB);
        blueTerracottaShingles.stairs(ModBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS);
        blueTerracottaShingles.wall(ModBlocks.BLUE_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES);
        lightBlueTerracottaShingles.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB);
        lightBlueTerracottaShingles.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS);
        lightBlueTerracottaShingles.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool purpleTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.PURPLE_TERRACOTTA_SHINGLES);
        purpleTerracottaShingles.slab(ModBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB);
        purpleTerracottaShingles.stairs(ModBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS);
        purpleTerracottaShingles.wall(ModBlocks.PURPLE_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool pinkTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.PINK_TERRACOTTA_SHINGLES);
        pinkTerracottaShingles.slab(ModBlocks.PINK_TERRACOTTA_SHINGLES_SLAB);
        pinkTerracottaShingles.stairs(ModBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS);
        pinkTerracottaShingles.wall(ModBlocks.PINK_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool magentaTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.MAGENTA_TERRACOTTA_SHINGLES);
        magentaTerracottaShingles.slab(ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB);
        magentaTerracottaShingles.stairs(ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS);
        magentaTerracottaShingles.wall(ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool brownTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.BROWN_TERRACOTTA_SHINGLES);
        brownTerracottaShingles.slab(ModBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB);
        brownTerracottaShingles.stairs(ModBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS);
        brownTerracottaShingles.wall(ModBlocks.BROWN_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool orangeTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.ORANGE_TERRACOTTA_SHINGLES);
        orangeTerracottaShingles.slab(ModBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB);
        orangeTerracottaShingles.stairs(ModBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS);
        orangeTerracottaShingles.wall(ModBlocks.ORANGE_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool yellowTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.YELLOW_TERRACOTTA_SHINGLES);
        yellowTerracottaShingles.slab(ModBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB);
        yellowTerracottaShingles.stairs(ModBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS);
        yellowTerracottaShingles.wall(ModBlocks.YELLOW_TERRACOTTA_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool cyanTerracottaShingles = blockStateModelGenerator.registerCubeAllModelTexturePool(
                ModBlocks.CYAN_TERRACOTTA_SHINGLES);
        cyanTerracottaShingles.slab(ModBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB);
        cyanTerracottaShingles.stairs(ModBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS);
        cyanTerracottaShingles.wall(ModBlocks.CYAN_TERRACOTTA_SHINGLES_WALL);

        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_PATTERNED_WOOL, ModBlocks.WHITE_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLACK_PATTERNED_WOOL, ModBlocks.BLACK_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_PATTERNED_WOOL, ModBlocks.LIGHT_GRAY_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.RED_PATTERNED_WOOL, ModBlocks.RED_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PINK_PATTERNED_WOOL, ModBlocks.PINK_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.CYAN_PATTERNED_WOOL, ModBlocks.CYAN_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BLUE_PATTERNED_WOOL, ModBlocks.BLUE_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_BLUE_PATTERNED_WOOL, ModBlocks.LIGHT_BLUE_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.PURPLE_PATTERNED_WOOL, ModBlocks.PURPLE_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.YELLOW_PATTERNED_WOOL, ModBlocks.YELLOW_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.ORANGE_PATTERNED_WOOL, ModBlocks.ORANGE_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GRAY_PATTERNED_WOOL, ModBlocks.GRAY_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.MAGENTA_PATTERNED_WOOL, ModBlocks.MAGENTA_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.GREEN_PATTERNED_WOOL, ModBlocks.GREEN_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIME_PATTERNED_WOOL, ModBlocks.LIME_PATTERNED_WOOL_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.BROWN_PATTERNED_WOOL, ModBlocks.BROWN_PATTERNED_WOOL_CARPET);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // ...

    }
}
