package katebulka.pigment.datagen;

import com.mojang.patchy.BlockedServers;
import katebulka.pigment.ExampleMod;
import katebulka.pigment.register.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    public static void patternedWoolRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .group("patterned_wool")
                .pattern("XY ")
                .pattern("YX ")
                .pattern("   ")
                .input('X', Items.STRING)
                .input('Y', input)
                .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter);
    }

    public static void concreteBricksRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', input)
                .criterion("has_concrete", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void terracottaBricksRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .group("terracotta_bricks")
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', input)
                .criterion("has_terracotta", conditionsFromTag(ItemTags.TERRACOTTA))
                .offerTo(exporter);
    }

    public static void dyeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, ItemConvertible block, String group, AdvancementCriterion<?> advancementCriterion) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .group(group)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('Y', input)
                .input('X', block)
                .criterion("has_item", advancementCriterion)
                .offerTo(exporter, new Identifier(ExampleMod.ID, output.asItem() + "_from_" + input.asItem()));
    }

    public static void patternedWoolCarpetRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .group("patterned_wool_carpet")
                .pattern("   ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', input)
                .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                .offerTo(exporter);
    }

    public static void terracottaShinglesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .group("terracotta_shingles")
                .pattern("   ")
                .pattern("XX ")
                .pattern("   ")
                .input('X', input)
                .criterion("has_terracotta", conditionsFromTag(ItemTags.TERRACOTTA))
                .offerTo(exporter);
    }

    public static void slabRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String group) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .group(group)
                .pattern("   ")
                .pattern("XXX")
                .pattern("   ")
                .input('X', input)
                .criterion("has_item", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void stairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String group) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .group(group)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .input('X', input)
                .criterion("has_item", conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void wallRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String group) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .group(group)
                .pattern("   ")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', input)
                .criterion("has_item", conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void stonecutting(RecipeExporter output, ItemConvertible result, Ingredient ingredient, int amount, ItemConvertible type) {
        SingleItemRecipeJsonBuilder.createStonecutting(ingredient, RecipeCategory.BUILDING_BLOCKS, result, amount)
                .criterion("has_item", conditionsFromItem(type))
                .offerTo(output, new Identifier(ExampleMod.ID, result.asItem() + "_from_" + type.asItem() + "_stonecutting"));
    }

    public static void recolorWool(RecipeExporter output, ItemConvertible from, ItemConvertible to) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, to)
                .input(ModItemTagGenerator.PATTERNED_WOOLS)
                .input(from)
                .criterion("has_item", conditionsFromItem(from))
                .offerTo(output, new Identifier(ExampleMod.ID, to.asItem() + "_from_" + from.asItem()));
    }

    public static void recolorWoolCarpet(RecipeExporter output, ItemConvertible from, ItemConvertible to) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, to)
                .input(ModItemTagGenerator.PATTERNED_WOOL_CARPETS)
                .input(from)
                .criterion("has_item", conditionsFromItem(from))
                .offerTo(output, new Identifier(ExampleMod.ID, to.asItem() + "_from_" + from.asItem()));
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("yellow", "blue", "light_blue", "light_gray", "gray", "green", "lime", "purple", "pink", "red", "orange", "cyan", "black", "white", "brown", "magenta"));

        Map<String, Item> dyeMap = new HashMap<String, Item>();

        dyeMap.put("white", Items.WHITE_DYE);
        dyeMap.put("black", Items.BLACK_DYE);
        dyeMap.put("light_gray", Items.LIGHT_GRAY_DYE);
        dyeMap.put("red", Items.RED_DYE);
        dyeMap.put("pink", Items.PINK_DYE);
        dyeMap.put("cyan", Items.CYAN_DYE);
        dyeMap.put("blue", Items.BLUE_DYE);
        dyeMap.put("light_blue", Items.LIGHT_BLUE_DYE);
        dyeMap.put("purple", Items.PURPLE_DYE);
        dyeMap.put("yellow", Items.YELLOW_DYE);
        dyeMap.put("orange", Items.ORANGE_DYE);
        dyeMap.put("gray", Items.GRAY_DYE);
        dyeMap.put("magenta", Items.MAGENTA_DYE);
        dyeMap.put("green", Items.GREEN_DYE);
        dyeMap.put("lime", Items.LIME_DYE);
        dyeMap.put("brown", Items.BROWN_DYE);

        Map<String, Block> woolMap = new HashMap<String, Block>();
        Map<String, Block> patternedWoolMap = new HashMap<String, Block>();
        Map<String, Block> terracottaMap = new HashMap<String, Block>();
        Map<String, Block> concreteMap = new HashMap<String, Block>();

        woolMap.put("white", Blocks.WHITE_WOOL);
        woolMap.put("black", Blocks.BLACK_WOOL);
        woolMap.put("light_gray", Blocks.LIGHT_GRAY_WOOL);
        woolMap.put("red", Blocks.RED_WOOL);
        woolMap.put("pink", Blocks.PINK_WOOL);
        woolMap.put("cyan", Blocks.CYAN_WOOL);
        woolMap.put("blue", Blocks.BLUE_WOOL);
        woolMap.put("light_blue", Blocks.LIGHT_BLUE_WOOL);
        woolMap.put("purple", Blocks.PURPLE_WOOL);
        woolMap.put("yellow", Blocks.YELLOW_WOOL);
        woolMap.put("orange", Blocks.ORANGE_WOOL);
        woolMap.put("gray", Blocks.GRAY_WOOL);
        woolMap.put("magenta", Blocks.MAGENTA_WOOL);
        woolMap.put("green", Blocks.GREEN_WOOL);
        woolMap.put("lime", Blocks.LIME_WOOL);
        woolMap.put("brown", Blocks.BROWN_WOOL);

        patternedWoolMap.put("white", ModBlocks.WHITE_PATTERNED_WOOL);
        patternedWoolMap.put("black", ModBlocks.BLACK_PATTERNED_WOOL);
        patternedWoolMap.put("light_gray", ModBlocks.LIGHT_GRAY_PATTERNED_WOOL);
        patternedWoolMap.put("red", ModBlocks.RED_PATTERNED_WOOL);
        patternedWoolMap.put("pink", ModBlocks.PINK_PATTERNED_WOOL);
        patternedWoolMap.put("cyan", ModBlocks.CYAN_PATTERNED_WOOL);
        patternedWoolMap.put("blue", ModBlocks.BLUE_PATTERNED_WOOL);
        patternedWoolMap.put("light_blue", ModBlocks.LIGHT_BLUE_PATTERNED_WOOL);
        patternedWoolMap.put("purple", ModBlocks.PURPLE_PATTERNED_WOOL);
        patternedWoolMap.put("yellow", ModBlocks.YELLOW_PATTERNED_WOOL);
        patternedWoolMap.put("orange", ModBlocks.ORANGE_PATTERNED_WOOL);
        patternedWoolMap.put("gray", ModBlocks.GRAY_PATTERNED_WOOL);
        patternedWoolMap.put("magenta", ModBlocks.MAGENTA_PATTERNED_WOOL);
        patternedWoolMap.put("green", ModBlocks.GREEN_PATTERNED_WOOL);
        patternedWoolMap.put("lime", ModBlocks.LIME_PATTERNED_WOOL);
        patternedWoolMap.put("brown", ModBlocks.BROWN_PATTERNED_WOOL);

        terracottaMap.put("white", Blocks.WHITE_TERRACOTTA);
        terracottaMap.put("black", Blocks.BLACK_TERRACOTTA);
        terracottaMap.put("light_gray", Blocks.LIGHT_GRAY_TERRACOTTA);
        terracottaMap.put("red", Blocks.RED_TERRACOTTA);
        terracottaMap.put("pink", Blocks.PINK_TERRACOTTA);
        terracottaMap.put("cyan", Blocks.CYAN_TERRACOTTA);
        terracottaMap.put("blue", Blocks.BLUE_TERRACOTTA);
        terracottaMap.put("light_blue", Blocks.LIGHT_BLUE_TERRACOTTA);
        terracottaMap.put("purple", Blocks.PURPLE_TERRACOTTA);
        terracottaMap.put("yellow", Blocks.YELLOW_TERRACOTTA);
        terracottaMap.put("orange", Blocks.ORANGE_TERRACOTTA);
        terracottaMap.put("gray", Blocks.GRAY_TERRACOTTA);
        terracottaMap.put("magenta", Blocks.MAGENTA_TERRACOTTA);
        terracottaMap.put("green", Blocks.GREEN_TERRACOTTA);
        terracottaMap.put("lime", Blocks.LIME_TERRACOTTA);
        terracottaMap.put("brown", Blocks.BROWN_TERRACOTTA);

        concreteMap.put("white", Blocks.WHITE_CONCRETE);
        concreteMap.put("black", Blocks.BLACK_CONCRETE);
        concreteMap.put("light_gray", Blocks.LIGHT_GRAY_CONCRETE);
        concreteMap.put("red", Blocks.RED_CONCRETE);
        concreteMap.put("pink", Blocks.PINK_CONCRETE);
        concreteMap.put("cyan", Blocks.CYAN_CONCRETE);
        concreteMap.put("blue", Blocks.BLUE_CONCRETE);
        concreteMap.put("light_blue", Blocks.LIGHT_BLUE_CONCRETE);
        concreteMap.put("purple", Blocks.PURPLE_CONCRETE);
        concreteMap.put("yellow", Blocks.YELLOW_CONCRETE);
        concreteMap.put("orange", Blocks.ORANGE_CONCRETE);
        concreteMap.put("gray", Blocks.GRAY_CONCRETE);
        concreteMap.put("magenta", Blocks.MAGENTA_CONCRETE);
        concreteMap.put("green", Blocks.GREEN_CONCRETE);
        concreteMap.put("lime", Blocks.LIME_CONCRETE);
        concreteMap.put("brown", Blocks.BROWN_CONCRETE);

        Map<Block, Block> slabMap = new HashMap<Block, Block>();
        Map<Block, Block> stairsMap = new HashMap<Block, Block>();
        Map<Block, Block> wallMap = new HashMap<Block, Block>();

        slabMap.put(ModBlocks.WHITE_TERRACOTTA_BRICKS, ModBlocks.WHITE_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.BLACK_TERRACOTTA_BRICKS, ModBlocks.BLACK_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.RED_TERRACOTTA_BRICKS, ModBlocks.RED_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.PINK_TERRACOTTA_BRICKS, ModBlocks.PINK_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.CYAN_TERRACOTTA_BRICKS, ModBlocks.CYAN_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.BLUE_TERRACOTTA_BRICKS, ModBlocks.BLUE_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.PURPLE_TERRACOTTA_BRICKS, ModBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.YELLOW_TERRACOTTA_BRICKS, ModBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.ORANGE_TERRACOTTA_BRICKS, ModBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.GRAY_TERRACOTTA_BRICKS, ModBlocks.GRAY_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.MAGENTA_TERRACOTTA_BRICKS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.GREEN_TERRACOTTA_BRICKS, ModBlocks.GREEN_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.LIME_TERRACOTTA_BRICKS, ModBlocks.LIME_TERRACOTTA_BRICKS_SLAB);
        slabMap.put(ModBlocks.BROWN_TERRACOTTA_BRICKS, ModBlocks.BROWN_TERRACOTTA_BRICKS_SLAB);

        slabMap.put(ModBlocks.WHITE_TERRACOTTA_SHINGLES, ModBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.BLACK_TERRACOTTA_SHINGLES, ModBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.RED_TERRACOTTA_SHINGLES, ModBlocks.RED_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.PINK_TERRACOTTA_SHINGLES, ModBlocks.PINK_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.CYAN_TERRACOTTA_SHINGLES, ModBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.BLUE_TERRACOTTA_SHINGLES, ModBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.PURPLE_TERRACOTTA_SHINGLES, ModBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.YELLOW_TERRACOTTA_SHINGLES, ModBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.ORANGE_TERRACOTTA_SHINGLES, ModBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.GRAY_TERRACOTTA_SHINGLES, ModBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.MAGENTA_TERRACOTTA_SHINGLES, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.GREEN_TERRACOTTA_SHINGLES, ModBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.LIME_TERRACOTTA_SHINGLES, ModBlocks.LIME_TERRACOTTA_SHINGLES_SLAB);
        slabMap.put(ModBlocks.BROWN_TERRACOTTA_SHINGLES, ModBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB);

        slabMap.put(ModBlocks.WHITE_CONCRETE_BRICKS, ModBlocks.WHITE_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.BLACK_CONCRETE_BRICKS, ModBlocks.BLACK_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.RED_CONCRETE_BRICKS, ModBlocks.RED_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.PINK_CONCRETE_BRICKS, ModBlocks.PINK_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.CYAN_CONCRETE_BRICKS, ModBlocks.CYAN_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.BLUE_CONCRETE_BRICKS, ModBlocks.BLUE_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.PURPLE_CONCRETE_BRICKS, ModBlocks.PURPLE_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.YELLOW_CONCRETE_BRICKS, ModBlocks.YELLOW_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.ORANGE_CONCRETE_BRICKS, ModBlocks.ORANGE_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.GRAY_CONCRETE_BRICKS, ModBlocks.GRAY_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.MAGENTA_CONCRETE_BRICKS, ModBlocks.MAGENTA_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.GREEN_CONCRETE_BRICKS, ModBlocks.GREEN_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.LIME_CONCRETE_BRICKS, ModBlocks.LIME_CONCRETE_BRICKS_SLAB);
        slabMap.put(ModBlocks.BROWN_CONCRETE_BRICKS, ModBlocks.BROWN_CONCRETE_BRICKS_SLAB);

        stairsMap.put(ModBlocks.WHITE_TERRACOTTA_BRICKS, ModBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.BLACK_TERRACOTTA_BRICKS, ModBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.RED_TERRACOTTA_BRICKS, ModBlocks.RED_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.PINK_TERRACOTTA_BRICKS, ModBlocks.PINK_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.CYAN_TERRACOTTA_BRICKS, ModBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.BLUE_TERRACOTTA_BRICKS, ModBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.PURPLE_TERRACOTTA_BRICKS, ModBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.YELLOW_TERRACOTTA_BRICKS, ModBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.ORANGE_TERRACOTTA_BRICKS, ModBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.GRAY_TERRACOTTA_BRICKS, ModBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.MAGENTA_TERRACOTTA_BRICKS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.GREEN_TERRACOTTA_BRICKS, ModBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.LIME_TERRACOTTA_BRICKS, ModBlocks.LIME_TERRACOTTA_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.BROWN_TERRACOTTA_BRICKS, ModBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS);

        stairsMap.put(ModBlocks.WHITE_TERRACOTTA_SHINGLES, ModBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.BLACK_TERRACOTTA_SHINGLES, ModBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.RED_TERRACOTTA_SHINGLES, ModBlocks.RED_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.PINK_TERRACOTTA_SHINGLES, ModBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.CYAN_TERRACOTTA_SHINGLES, ModBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.BLUE_TERRACOTTA_SHINGLES, ModBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.PURPLE_TERRACOTTA_SHINGLES, ModBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.YELLOW_TERRACOTTA_SHINGLES, ModBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.ORANGE_TERRACOTTA_SHINGLES, ModBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.GRAY_TERRACOTTA_SHINGLES, ModBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.MAGENTA_TERRACOTTA_SHINGLES, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.GREEN_TERRACOTTA_SHINGLES, ModBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.LIME_TERRACOTTA_SHINGLES, ModBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS);
        stairsMap.put(ModBlocks.BROWN_TERRACOTTA_SHINGLES, ModBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS);

        stairsMap.put(ModBlocks.WHITE_CONCRETE_BRICKS, ModBlocks.WHITE_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.BLACK_CONCRETE_BRICKS, ModBlocks.BLACK_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.RED_CONCRETE_BRICKS, ModBlocks.RED_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.PINK_CONCRETE_BRICKS, ModBlocks.PINK_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.CYAN_CONCRETE_BRICKS, ModBlocks.CYAN_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.BLUE_CONCRETE_BRICKS, ModBlocks.BLUE_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.PURPLE_CONCRETE_BRICKS, ModBlocks.PURPLE_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.YELLOW_CONCRETE_BRICKS, ModBlocks.YELLOW_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.ORANGE_CONCRETE_BRICKS, ModBlocks.ORANGE_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.GRAY_CONCRETE_BRICKS, ModBlocks.GRAY_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.MAGENTA_CONCRETE_BRICKS, ModBlocks.MAGENTA_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.GREEN_CONCRETE_BRICKS, ModBlocks.GREEN_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.LIME_CONCRETE_BRICKS, ModBlocks.LIME_CONCRETE_BRICKS_STAIRS);
        stairsMap.put(ModBlocks.BROWN_CONCRETE_BRICKS, ModBlocks.BROWN_CONCRETE_BRICKS_STAIRS);

        wallMap.put(ModBlocks.WHITE_TERRACOTTA_BRICKS, ModBlocks.WHITE_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.BLACK_TERRACOTTA_BRICKS, ModBlocks.BLACK_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.RED_TERRACOTTA_BRICKS, ModBlocks.RED_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.PINK_TERRACOTTA_BRICKS, ModBlocks.PINK_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.CYAN_TERRACOTTA_BRICKS, ModBlocks.CYAN_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.BLUE_TERRACOTTA_BRICKS, ModBlocks.BLUE_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.PURPLE_TERRACOTTA_BRICKS, ModBlocks.PURPLE_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.YELLOW_TERRACOTTA_BRICKS, ModBlocks.YELLOW_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.ORANGE_TERRACOTTA_BRICKS, ModBlocks.ORANGE_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.GRAY_TERRACOTTA_BRICKS, ModBlocks.GRAY_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.MAGENTA_TERRACOTTA_BRICKS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.GREEN_TERRACOTTA_BRICKS, ModBlocks.GREEN_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.LIME_TERRACOTTA_BRICKS, ModBlocks.LIME_TERRACOTTA_BRICKS_WALL);
        wallMap.put(ModBlocks.BROWN_TERRACOTTA_BRICKS, ModBlocks.BROWN_TERRACOTTA_BRICKS_WALL);

        wallMap.put(ModBlocks.WHITE_TERRACOTTA_SHINGLES, ModBlocks.WHITE_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.BLACK_TERRACOTTA_SHINGLES, ModBlocks.BLACK_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.RED_TERRACOTTA_SHINGLES, ModBlocks.RED_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.PINK_TERRACOTTA_SHINGLES, ModBlocks.PINK_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.CYAN_TERRACOTTA_SHINGLES, ModBlocks.CYAN_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.BLUE_TERRACOTTA_SHINGLES, ModBlocks.BLUE_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.PURPLE_TERRACOTTA_SHINGLES, ModBlocks.PURPLE_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.YELLOW_TERRACOTTA_SHINGLES, ModBlocks.YELLOW_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.ORANGE_TERRACOTTA_SHINGLES, ModBlocks.ORANGE_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.GRAY_TERRACOTTA_SHINGLES, ModBlocks.GRAY_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.MAGENTA_TERRACOTTA_SHINGLES, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.GREEN_TERRACOTTA_SHINGLES, ModBlocks.GREEN_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.LIME_TERRACOTTA_SHINGLES, ModBlocks.LIME_TERRACOTTA_SHINGLES_WALL);
        wallMap.put(ModBlocks.BROWN_TERRACOTTA_SHINGLES, ModBlocks.BROWN_TERRACOTTA_SHINGLES_WALL);

        wallMap.put(ModBlocks.WHITE_CONCRETE_BRICKS, ModBlocks.WHITE_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.BLACK_CONCRETE_BRICKS, ModBlocks.BLACK_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.RED_CONCRETE_BRICKS, ModBlocks.RED_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.PINK_CONCRETE_BRICKS, ModBlocks.PINK_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.CYAN_CONCRETE_BRICKS, ModBlocks.CYAN_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.BLUE_CONCRETE_BRICKS, ModBlocks.BLUE_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.PURPLE_CONCRETE_BRICKS, ModBlocks.PURPLE_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.YELLOW_CONCRETE_BRICKS, ModBlocks.YELLOW_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.ORANGE_CONCRETE_BRICKS, ModBlocks.ORANGE_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.GRAY_CONCRETE_BRICKS, ModBlocks.GRAY_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.MAGENTA_CONCRETE_BRICKS, ModBlocks.MAGENTA_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.GREEN_CONCRETE_BRICKS, ModBlocks.GREEN_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.LIME_CONCRETE_BRICKS, ModBlocks.LIME_CONCRETE_BRICKS_WALL);
        wallMap.put(ModBlocks.BROWN_CONCRETE_BRICKS, ModBlocks.BROWN_CONCRETE_BRICKS_WALL);

        // outside loop
        terracottaBricksRecipe(exporter, ModBlocks.TERRACOTTA_BRICKS, Blocks.TERRACOTTA);
        slabRecipe(exporter, ModBlocks.TERRACOTTA_BRICKS_SLAB, ModBlocks.TERRACOTTA_BRICKS, "terracotta_bricks_slab");
        stairsRecipe(exporter, ModBlocks.TERRACOTTA_BRICKS_STAIRS, ModBlocks.TERRACOTTA_BRICKS, "terracotta_bricks_stairs");
        wallRecipe(exporter, ModBlocks.TERRACOTTA_BRICKS_WALL, ModBlocks.TERRACOTTA_BRICKS, "terracotta_bricks_wall");

        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.TERRACOTTA_BRICKS), 2, ModBlocks.TERRACOTTA_BRICKS);
        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.TERRACOTTA_BRICKS), 1, ModBlocks.TERRACOTTA_BRICKS);
        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS_WALL, Ingredient.ofItems(ModBlocks.TERRACOTTA_BRICKS), 1, ModBlocks.TERRACOTTA_BRICKS);

        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS, Ingredient.ofItems(Blocks.TERRACOTTA), 1, Blocks.TERRACOTTA);
        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS_SLAB, Ingredient.ofItems(Blocks.TERRACOTTA), 2, Blocks.TERRACOTTA);
        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS_STAIRS, Ingredient.ofItems(Blocks.TERRACOTTA), 1, Blocks.TERRACOTTA);
        stonecutting(exporter, ModBlocks.TERRACOTTA_BRICKS_WALL, Ingredient.ofItems(Blocks.TERRACOTTA), 1, Blocks.TERRACOTTA);

        terracottaShinglesRecipe(exporter, ModBlocks.TERRACOTTA_SHINGLES, Blocks.TERRACOTTA);
        slabRecipe(exporter, ModBlocks.TERRACOTTA_SHINGLES_SLAB, ModBlocks.TERRACOTTA_SHINGLES, "terracotta_shingles_slab");
        stairsRecipe(exporter, ModBlocks.TERRACOTTA_SHINGLES_STAIRS, ModBlocks.TERRACOTTA_SHINGLES, "terracotta_shingles_stairs");
        wallRecipe(exporter, ModBlocks.TERRACOTTA_SHINGLES_WALL, ModBlocks.TERRACOTTA_SHINGLES, "terracotta_shingles_wall");

        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES_SLAB, Ingredient.ofItems(ModBlocks.TERRACOTTA_SHINGLES), 2, ModBlocks.TERRACOTTA_SHINGLES);
        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES_STAIRS, Ingredient.ofItems(ModBlocks.TERRACOTTA_SHINGLES), 1, ModBlocks.TERRACOTTA_SHINGLES);
        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES_WALL, Ingredient.ofItems(ModBlocks.TERRACOTTA_SHINGLES), 2, ModBlocks.TERRACOTTA_SHINGLES);

        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES, Ingredient.ofItems(Blocks.TERRACOTTA), 1, Blocks.TERRACOTTA);
        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES_SLAB, Ingredient.ofItems(Blocks.TERRACOTTA), 2, Blocks.TERRACOTTA);
        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES_STAIRS, Ingredient.ofItems(Blocks.TERRACOTTA), 1, Blocks.TERRACOTTA);
        stonecutting(exporter, ModBlocks.TERRACOTTA_SHINGLES_WALL, Ingredient.ofItems(Blocks.TERRACOTTA), 1, Blocks.TERRACOTTA);

        Registries.BLOCK.forEach(block -> {
            Identifier id = Registries.BLOCK.getId(block);

            if (id.getNamespace().equals(ExampleMod.ID)) {
                for (String keyword : colors) {
                    if (block.toString().contains(keyword)) {
                        if ((keyword.contains("light") && block.toString().contains("light"))
                                || (!keyword.contains("light") && !block.toString().contains("light"))) {
                            if (block.toString().contains("wool") && !block.toString().contains("carpet")) {
                                patternedWoolRecipe(exporter, block, woolMap.get(keyword));
                                recolorWool(exporter, dyeMap.get(keyword), block);
                            }
                            if (block.toString().contains("carpet")) {
                                patternedWoolCarpetRecipe(exporter, block, patternedWoolMap.get(keyword));
                                recolorWoolCarpet(exporter, dyeMap.get(keyword), block);
                            }
                            if (block.toString().contains("terracotta_bricks")
                                    && !block.toString().contains("slab")
                                    && !block.toString().contains("stairs")
                                    && !block.toString().contains("wall")) {
                                terracottaBricksRecipe(exporter, block, terracottaMap.get(keyword));
                                slabRecipe(exporter, slabMap.get(block), block, "terracotta_bricks_slab");
                                stairsRecipe(exporter, stairsMap.get(block), block, "terracotta_bricks_stairs");
                                wallRecipe(exporter, wallMap.get(block), block, "terracotta_bricks_wall");

                                dyeRecipe(exporter, block, dyeMap.get(keyword), ModBlocks.TERRACOTTA_BRICKS, "terracotta_bricks",
                                        conditionsFromItem(dyeMap.get(keyword)));
                                
                                stonecutting(exporter, slabMap.get(block), Ingredient.ofItems(block), 2, block);
                                stonecutting(exporter, stairsMap.get(block), Ingredient.ofItems(block), 1, block);
                                stonecutting(exporter, wallMap.get(block), Ingredient.ofItems(block), 1, block);

                                stonecutting(exporter, block, Ingredient.ofItems(terracottaMap.get(keyword)), 1, terracottaMap.get(keyword));
                                stonecutting(exporter, slabMap.get(block), Ingredient.ofItems(terracottaMap.get(keyword)), 2, terracottaMap.get(keyword));
                                stonecutting(exporter, stairsMap.get(block), Ingredient.ofItems(terracottaMap.get(keyword)), 1, terracottaMap.get(keyword));
                                stonecutting(exporter, wallMap.get(block), Ingredient.ofItems(terracottaMap.get(keyword)), 1, terracottaMap.get(keyword));
                            }
                            if (block.toString().contains("terracotta_shingles")
                                    && !block.toString().contains("slab")
                                    && !block.toString().contains("stairs")
                                    && !block.toString().contains("wall")) {
                                terracottaShinglesRecipe(exporter, block, terracottaMap.get(keyword));
                                slabRecipe(exporter, slabMap.get(block), block, "terracotta_shingles_slab");
                                stairsRecipe(exporter, stairsMap.get(block), block, "terracotta_shingles_stairs");
                                wallRecipe(exporter, wallMap.get(block), block, "terracotta_shingles_wall");

                                dyeRecipe(exporter, block, dyeMap.get(keyword), ModBlocks.TERRACOTTA_SHINGLES, "terracotta_shingles",
                                        conditionsFromItem(dyeMap.get(keyword)));

                                stonecutting(exporter, slabMap.get(block), Ingredient.ofItems(block), 2, block);
                                stonecutting(exporter, stairsMap.get(block), Ingredient.ofItems(block), 1, block);
                                stonecutting(exporter, wallMap.get(block), Ingredient.ofItems(block), 1, block);

                                stonecutting(exporter, block, Ingredient.ofItems(terracottaMap.get(keyword)), 1, terracottaMap.get(keyword));
                                stonecutting(exporter, slabMap.get(block), Ingredient.ofItems(terracottaMap.get(keyword)), 2, terracottaMap.get(keyword));
                                stonecutting(exporter, stairsMap.get(block), Ingredient.ofItems(terracottaMap.get(keyword)), 1, terracottaMap.get(keyword));
                                stonecutting(exporter, wallMap.get(block), Ingredient.ofItems(terracottaMap.get(keyword)), 1, terracottaMap.get(keyword));
                            }
                            if (block.toString().contains("concrete_bricks")
                                    && !block.toString().contains("slab")
                                    && !block.toString().contains("stairs")
                                    && !block.toString().contains("wall")) {
                                concreteBricksRecipe(exporter, block, concreteMap.get(keyword));
                                slabRecipe(exporter, slabMap.get(block), block, "concrete_bricks_slab");
                                stairsRecipe(exporter, stairsMap.get(block), block, "concrete_bricks_stairs");
                                wallRecipe(exporter, wallMap.get(block), block, "concrete_bricks_wall");

                                stonecutting(exporter, slabMap.get(block), Ingredient.ofItems(block), 2, block);
                                stonecutting(exporter, stairsMap.get(block), Ingredient.ofItems(block), 1, block);
                                stonecutting(exporter, wallMap.get(block), Ingredient.ofItems(block), 1, block);

                                stonecutting(exporter, block, Ingredient.ofItems(concreteMap.get(keyword)), 1, concreteMap.get(keyword));
                                stonecutting(exporter, slabMap.get(block), Ingredient.ofItems(concreteMap.get(keyword)), 2, concreteMap.get(keyword));
                                stonecutting(exporter, stairsMap.get(block), Ingredient.ofItems(concreteMap.get(keyword)), 1, concreteMap.get(keyword));
                                stonecutting(exporter, wallMap.get(block), Ingredient.ofItems(concreteMap.get(keyword)), 1, concreteMap.get(keyword));
                            }
                        }
                    }
                }
            }
        });
    }
}
