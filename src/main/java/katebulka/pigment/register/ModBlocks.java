package katebulka.pigment.register;

import katebulka.pigment.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.block.Blocks;

public class ModBlocks {
    private static Block registerBlock(String name, Block input_block) {
        Block block = Registry.register(Registries.BLOCK, new Identifier(ExampleMod.ID, name), input_block);
        Registry.register(Registries.ITEM, new Identifier(ExampleMod.ID, name), new BlockItem(input_block, new FabricItemSettings()));

        return block;
    }

    private static Block registerConcreteBricks(String color, DyeColor mapcolor) {
        return registerBlock(color + "_concrete_bricks", new Block(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.8F)));
    }

    private static Block registerConcreteBricksSlab(String color, DyeColor mapcolor) {
        return registerBlock(color + "_concrete_bricks_slab", new SlabBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.8F)));
    }

    private static Block registerConcreteBricksStairs(String color, DyeColor mapcolor, BlockState block) {
        return registerBlock(color + "_concrete_bricks_stairs", new StairsBlock(block, FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.8F)));
    }

    private static Block registerConcreteBricksWall(String color, DyeColor mapcolor) {
        return registerBlock(color + "_concrete_bricks_wall", new WallBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.8F)));
    }

    private static Block registerTerracottaBricks(String color, MapColor mapcolor) {
        return registerBlock(color + "_terracotta_bricks", new Block(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerTerracottaBricksSlab(String color, MapColor mapcolor) {
        return registerBlock(color + "_terracotta_bricks_slab", new SlabBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerTerracottaBricksStairs(String color, MapColor mapColor, BlockState block) {
        return registerBlock(color + "_terracotta_bricks_stairs", new StairsBlock(block, FabricBlockSettings.create().mapColor(mapColor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerTerracottaBricksWall(String color, MapColor mapcolor) {
        return registerBlock(color + "_terracotta_bricks_wall", new WallBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerPatternedWool(String color, MapColor mapcolor) {
        return registerBlock(color + "_patterned_wool", new Block(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()));
    }

    private static Block registerPatternedWoolCarpet(String color, DyeColor mapcolor) {
        return registerBlock(color + "_patterned_wool_carpet", new DyedCarpetBlock(mapcolor, FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()));
    }

    private static Block registerTerracottaShingles(String color, MapColor mapcolor) {
        return registerBlock(color + "_terracotta_shingles", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerTerracottaShinglesSlab(String color, MapColor mapcolor) {
        return registerBlock(color + "_terracotta_shingles_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerTerracottaShinglesStairs(String color, MapColor mapColor, BlockState block) {
        return registerBlock(color + "_terracotta_shingles_stairs", new StairsBlock(block, FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(mapColor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    private static Block registerTerracottaShinglesWall(String color, MapColor mapcolor) {
        return registerBlock(color + "_terracotta_shingles_wall", new WallBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(mapcolor).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    }

    public static final Block WHITE_PATTERNED_WOOL = registerPatternedWool("white", MapColor.WHITE);
    public static final Block BLACK_PATTERNED_WOOL = registerPatternedWool("black", MapColor.BLACK);
    public static final Block LIGHT_GRAY_PATTERNED_WOOL = registerPatternedWool("light_gray", MapColor.LIGHT_GRAY);
    public static final Block RED_PATTERNED_WOOL = registerPatternedWool("red", MapColor.RED);
    public static final Block PINK_PATTERNED_WOOL = registerPatternedWool("pink", MapColor.PINK);
    public static final Block CYAN_PATTERNED_WOOL = registerPatternedWool("cyan", MapColor.CYAN);
    public static final Block BLUE_PATTERNED_WOOL = registerPatternedWool("blue", MapColor.BLUE);
    public static final Block LIGHT_BLUE_PATTERNED_WOOL = registerPatternedWool("light_blue", MapColor.LIGHT_BLUE);
    public static final Block PURPLE_PATTERNED_WOOL = registerPatternedWool("purple", MapColor.PURPLE);
    public static final Block YELLOW_PATTERNED_WOOL = registerPatternedWool("yellow", MapColor.YELLOW);
    public static final Block ORANGE_PATTERNED_WOOL = registerPatternedWool("orange", MapColor.ORANGE);
    public static final Block GRAY_PATTERNED_WOOL = registerPatternedWool("gray", MapColor.GRAY);
    public static final Block MAGENTA_PATTERNED_WOOL = registerPatternedWool("magenta", MapColor.MAGENTA);
    public static final Block GREEN_PATTERNED_WOOL = registerPatternedWool("green", MapColor.GREEN);
    public static final Block LIME_PATTERNED_WOOL = registerPatternedWool("lime", MapColor.LIME);
    public static final Block BROWN_PATTERNED_WOOL = registerPatternedWool("brown", MapColor.BROWN);

    public static final Block WHITE_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("white", DyeColor.WHITE);
    public static final Block BLACK_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("black", DyeColor.BLACK);
    public static final Block LIGHT_GRAY_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("light_gray", DyeColor.LIGHT_GRAY);
    public static final Block RED_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("red", DyeColor.RED);
    public static final Block PINK_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("pink", DyeColor.PINK);
    public static final Block CYAN_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("cyan", DyeColor.CYAN);
    public static final Block BLUE_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("blue", DyeColor.BLUE);
    public static final Block LIGHT_BLUE_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("light_blue", DyeColor.LIGHT_BLUE);
    public static final Block PURPLE_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("purple", DyeColor.PURPLE);
    public static final Block YELLOW_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("yellow", DyeColor.YELLOW);
    public static final Block ORANGE_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("orange", DyeColor.ORANGE);
    public static final Block GRAY_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("gray", DyeColor.GRAY);
    public static final Block MAGENTA_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("magenta", DyeColor.MAGENTA);
    public static final Block GREEN_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("green", DyeColor.GREEN);
    public static final Block LIME_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("lime", DyeColor.LIME);
    public static final Block BROWN_PATTERNED_WOOL_CARPET = registerPatternedWoolCarpet("brown", DyeColor.BROWN);

    public static final Block WHITE_CONCRETE_BRICKS = registerConcreteBricks("white", DyeColor.WHITE);
    public static final Block BLACK_CONCRETE_BRICKS = registerConcreteBricks("black", DyeColor.BLACK);
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS = registerConcreteBricks("light_gray", DyeColor.LIGHT_GRAY);
    public static final Block RED_CONCRETE_BRICKS = registerConcreteBricks("red", DyeColor.RED);
    public static final Block PINK_CONCRETE_BRICKS = registerConcreteBricks("pink", DyeColor.PINK);
    public static final Block CYAN_CONCRETE_BRICKS = registerConcreteBricks("cyan", DyeColor.CYAN);
    public static final Block BLUE_CONCRETE_BRICKS = registerConcreteBricks("blue", DyeColor.BLUE);
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS = registerConcreteBricks("light_blue", DyeColor.LIGHT_BLUE);
    public static final Block PURPLE_CONCRETE_BRICKS = registerConcreteBricks("purple", DyeColor.PURPLE);
    public static final Block YELLOW_CONCRETE_BRICKS = registerConcreteBricks("yellow", DyeColor.YELLOW);
    public static final Block ORANGE_CONCRETE_BRICKS = registerConcreteBricks("orange", DyeColor.ORANGE);
    public static final Block GRAY_CONCRETE_BRICKS = registerConcreteBricks("gray", DyeColor.GRAY);
    public static final Block MAGENTA_CONCRETE_BRICKS = registerConcreteBricks("magenta", DyeColor.MAGENTA);
    public static final Block GREEN_CONCRETE_BRICKS = registerConcreteBricks("green", DyeColor.GREEN);
    public static final Block LIME_CONCRETE_BRICKS = registerConcreteBricks("lime", DyeColor.LIME);
    public static final Block BROWN_CONCRETE_BRICKS = registerConcreteBricks("brown", DyeColor.BROWN);

    public static final Block WHITE_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("white", DyeColor.WHITE);
    public static final Block BLACK_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("black", DyeColor.BLACK);
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("light_gray", DyeColor.LIGHT_GRAY);
    public static final Block RED_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("red", DyeColor.RED);
    public static final Block PINK_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("pink", DyeColor.PINK);
    public static final Block CYAN_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("cyan", DyeColor.CYAN);
    public static final Block BLUE_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("blue", DyeColor.BLUE);
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("light_blue", DyeColor.LIGHT_BLUE);
    public static final Block PURPLE_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("purple", DyeColor.PURPLE);
    public static final Block YELLOW_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("yellow", DyeColor.YELLOW);
    public static final Block ORANGE_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("orange", DyeColor.ORANGE);
    public static final Block GRAY_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("gray", DyeColor.GRAY);
    public static final Block MAGENTA_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("magenta", DyeColor.MAGENTA);
    public static final Block GREEN_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("green", DyeColor.GREEN);
    public static final Block LIME_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("lime", DyeColor.LIME);
    public static final Block BROWN_CONCRETE_BRICKS_SLAB = registerConcreteBricksSlab("brown", DyeColor.BROWN);

    public static final Block WHITE_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("white", DyeColor.WHITE, WHITE_CONCRETE_BRICKS.getDefaultState());
    public static final Block BLACK_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("black", DyeColor.BLACK, BLACK_CONCRETE_BRICKS.getDefaultState());
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("light_gray", DyeColor.LIGHT_GRAY, LIGHT_GRAY_CONCRETE_BRICKS.getDefaultState());
    public static final Block RED_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("red", DyeColor.RED, RED_CONCRETE_BRICKS.getDefaultState());
    public static final Block PINK_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("pink", DyeColor.PINK, PINK_CONCRETE_BRICKS.getDefaultState());
    public static final Block CYAN_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("cyan", DyeColor.CYAN, CYAN_CONCRETE_BRICKS.getDefaultState());
    public static final Block BLUE_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("blue", DyeColor.BLUE, BLUE_CONCRETE_BRICKS.getDefaultState());
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("light_blue", DyeColor.LIGHT_BLUE, LIGHT_BLUE_CONCRETE_BRICKS.getDefaultState());
    public static final Block PURPLE_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("purple", DyeColor.PURPLE, PURPLE_CONCRETE_BRICKS.getDefaultState());
    public static final Block YELLOW_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("yellow", DyeColor.YELLOW, YELLOW_CONCRETE_BRICKS.getDefaultState());
    public static final Block ORANGE_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("orange", DyeColor.ORANGE, ORANGE_CONCRETE_BRICKS.getDefaultState());
    public static final Block GRAY_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("gray", DyeColor.GRAY, GRAY_CONCRETE_BRICKS.getDefaultState());
    public static final Block MAGENTA_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("magenta", DyeColor.MAGENTA, MAGENTA_CONCRETE_BRICKS.getDefaultState());
    public static final Block GREEN_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("green", DyeColor.GREEN, GREEN_CONCRETE_BRICKS.getDefaultState());
    public static final Block LIME_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("lime", DyeColor.LIME, LIME_CONCRETE_BRICKS.getDefaultState());
    public static final Block BROWN_CONCRETE_BRICKS_STAIRS = registerConcreteBricksStairs("brown", DyeColor.BROWN, BROWN_CONCRETE_BRICKS.getDefaultState());

    public static final Block WHITE_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("white", DyeColor.WHITE);
    public static final Block BLACK_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("black", DyeColor.BLACK);
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("light_gray", DyeColor.LIGHT_GRAY);
    public static final Block RED_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("red", DyeColor.RED);
    public static final Block PINK_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("pink", DyeColor.PINK);
    public static final Block CYAN_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("cyan", DyeColor.CYAN);
    public static final Block BLUE_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("blue", DyeColor.BLUE);
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("light_blue", DyeColor.LIGHT_BLUE);
    public static final Block PURPLE_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("purple", DyeColor.PURPLE);
    public static final Block YELLOW_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("yellow", DyeColor.YELLOW);
    public static final Block ORANGE_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("orange", DyeColor.ORANGE);
    public static final Block GRAY_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("gray", DyeColor.GRAY);
    public static final Block MAGENTA_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("magenta", DyeColor.MAGENTA);
    public static final Block GREEN_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("green", DyeColor.GREEN);
    public static final Block LIME_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("lime", DyeColor.LIME);
    public static final Block BROWN_CONCRETE_BRICKS_WALL = registerConcreteBricksWall("brown", DyeColor.BROWN);

    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks", new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_BRICKS = registerTerracottaBricks("white", MapColor.TERRACOTTA_WHITE);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerTerracottaBricks("black", MapColor.TERRACOTTA_BLACK);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerTerracottaBricks("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block RED_TERRACOTTA_BRICKS = registerTerracottaBricks("red", MapColor.TERRACOTTA_RED);
    public static final Block PINK_TERRACOTTA_BRICKS = registerTerracottaBricks("pink", MapColor.TERRACOTTA_PINK);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerTerracottaBricks("cyan", MapColor.TERRACOTTA_CYAN);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerTerracottaBricks("blue", MapColor.TERRACOTTA_BLUE);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerTerracottaBricks("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerTerracottaBricks("purple", MapColor.TERRACOTTA_PURPLE);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerTerracottaBricks("yellow", MapColor.TERRACOTTA_YELLOW);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerTerracottaBricks("orange", MapColor.TERRACOTTA_ORANGE);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerTerracottaBricks("gray", MapColor.TERRACOTTA_GRAY);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerTerracottaBricks("magenta", MapColor.TERRACOTTA_MAGENTA);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerTerracottaBricks("green", MapColor.TERRACOTTA_GREEN);
    public static final Block LIME_TERRACOTTA_BRICKS = registerTerracottaBricks("lime", MapColor.TERRACOTTA_LIME);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerTerracottaBricks("brown", MapColor.TERRACOTTA_BROWN);

    public static final Block TERRACOTTA_BRICKS_SLAB = registerBlock("terracotta_bricks_slab", new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("white", MapColor.TERRACOTTA_WHITE);
    public static final Block BLACK_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("black", MapColor.TERRACOTTA_BLACK);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block RED_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("red", MapColor.TERRACOTTA_RED);
    public static final Block PINK_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("pink", MapColor.TERRACOTTA_PINK);
    public static final Block CYAN_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("cyan", MapColor.TERRACOTTA_CYAN);
    public static final Block BLUE_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("blue", MapColor.TERRACOTTA_BLUE);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final Block PURPLE_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("purple", MapColor.TERRACOTTA_PURPLE);
    public static final Block YELLOW_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("yellow", MapColor.TERRACOTTA_YELLOW);
    public static final Block ORANGE_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("orange", MapColor.TERRACOTTA_ORANGE);
    public static final Block GRAY_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("gray", MapColor.TERRACOTTA_GRAY);
    public static final Block MAGENTA_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("magenta", MapColor.TERRACOTTA_MAGENTA);
    public static final Block GREEN_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("green", MapColor.TERRACOTTA_GREEN);
    public static final Block LIME_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("lime", MapColor.TERRACOTTA_LIME);
    public static final Block BROWN_TERRACOTTA_BRICKS_SLAB = registerTerracottaBricksSlab("brown", MapColor.TERRACOTTA_BROWN);

    public static final Block TERRACOTTA_BRICKS_STAIRS = registerBlock("terracotta_bricks_stairs", new StairsBlock(TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("white", MapColor.TERRACOTTA_WHITE, WHITE_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block BLACK_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("black", MapColor.TERRACOTTA_BLACK, BLACK_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY, LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block RED_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("red", MapColor.TERRACOTTA_RED, RED_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block PINK_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("pink", MapColor.TERRACOTTA_PINK, PINK_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block CYAN_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("cyan", MapColor.TERRACOTTA_CYAN, CYAN_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block BLUE_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("blue", MapColor.TERRACOTTA_BLUE, BLUE_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE, LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block PURPLE_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("purple", MapColor.TERRACOTTA_PURPLE, PURPLE_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block YELLOW_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("yellow", MapColor.TERRACOTTA_YELLOW, YELLOW_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block ORANGE_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("orange", MapColor.TERRACOTTA_ORANGE, ORANGE_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block GRAY_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("gray", MapColor.TERRACOTTA_GRAY, GRAY_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block MAGENTA_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("magenta", MapColor.TERRACOTTA_MAGENTA, MAGENTA_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block GREEN_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("green", MapColor.TERRACOTTA_GREEN, GREEN_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block LIME_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("lime", MapColor.TERRACOTTA_LIME, LIME_TERRACOTTA_BRICKS.getDefaultState());
    public static final Block BROWN_TERRACOTTA_BRICKS_STAIRS = registerTerracottaBricksStairs("brown", MapColor.TERRACOTTA_BROWN, BROWN_TERRACOTTA_BRICKS.getDefaultState());

    public static final Block TERRACOTTA_BRICKS_WALL = registerBlock("terracotta_bricks_wall", new WallBlock(FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("white", MapColor.TERRACOTTA_WHITE);
    public static final Block BLACK_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("black", MapColor.TERRACOTTA_BLACK);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block RED_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("red", MapColor.TERRACOTTA_RED);
    public static final Block PINK_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("pink", MapColor.TERRACOTTA_PINK);
    public static final Block CYAN_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("cyan", MapColor.TERRACOTTA_CYAN);
    public static final Block BLUE_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("blue", MapColor.TERRACOTTA_BLUE);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final Block PURPLE_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("purple", MapColor.TERRACOTTA_PURPLE);
    public static final Block YELLOW_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("yellow", MapColor.TERRACOTTA_YELLOW);
    public static final Block ORANGE_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("orange", MapColor.TERRACOTTA_ORANGE);
    public static final Block GRAY_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("gray", MapColor.TERRACOTTA_GRAY);
    public static final Block MAGENTA_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("magenta", MapColor.TERRACOTTA_MAGENTA);
    public static final Block GREEN_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("green", MapColor.TERRACOTTA_GREEN);
    public static final Block LIME_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("lime", MapColor.TERRACOTTA_LIME);
    public static final Block BROWN_TERRACOTTA_BRICKS_WALL = registerTerracottaBricksWall("brown", MapColor.TERRACOTTA_BROWN);

    public static final Block TERRACOTTA_SHINGLES = registerBlock("terracotta_shingles", new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_SHINGLES = registerTerracottaShingles("white", MapColor.TERRACOTTA_WHITE);
    public static final Block BLACK_TERRACOTTA_SHINGLES = registerTerracottaShingles("black", MapColor.TERRACOTTA_BLACK);
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES = registerTerracottaShingles("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block RED_TERRACOTTA_SHINGLES = registerTerracottaShingles("red", MapColor.TERRACOTTA_RED);
    public static final Block PINK_TERRACOTTA_SHINGLES = registerTerracottaShingles("pink", MapColor.TERRACOTTA_PINK);
    public static final Block CYAN_TERRACOTTA_SHINGLES = registerTerracottaShingles("cyan", MapColor.TERRACOTTA_CYAN);
    public static final Block BLUE_TERRACOTTA_SHINGLES = registerTerracottaShingles("blue", MapColor.TERRACOTTA_BLUE);
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES = registerTerracottaShingles("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final Block PURPLE_TERRACOTTA_SHINGLES = registerTerracottaShingles("purple", MapColor.TERRACOTTA_PURPLE);
    public static final Block YELLOW_TERRACOTTA_SHINGLES = registerTerracottaShingles("yellow", MapColor.TERRACOTTA_YELLOW);
    public static final Block ORANGE_TERRACOTTA_SHINGLES = registerTerracottaShingles("orange", MapColor.TERRACOTTA_ORANGE);
    public static final Block GRAY_TERRACOTTA_SHINGLES = registerTerracottaShingles("gray", MapColor.TERRACOTTA_GRAY);
    public static final Block MAGENTA_TERRACOTTA_SHINGLES = registerTerracottaShingles("magenta", MapColor.TERRACOTTA_MAGENTA);
    public static final Block GREEN_TERRACOTTA_SHINGLES = registerTerracottaShingles("green", MapColor.TERRACOTTA_GREEN);
    public static final Block LIME_TERRACOTTA_SHINGLES = registerTerracottaShingles("lime", MapColor.TERRACOTTA_LIME);
    public static final Block BROWN_TERRACOTTA_SHINGLES = registerTerracottaShingles("brown", MapColor.TERRACOTTA_BROWN);

    public static final Block TERRACOTTA_SHINGLES_SLAB = registerBlock("terracotta_shingles_slab", new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("white", MapColor.TERRACOTTA_WHITE);
    public static final Block BLACK_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("black", MapColor.TERRACOTTA_BLACK);
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block RED_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("red", MapColor.TERRACOTTA_RED);
    public static final Block PINK_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("pink", MapColor.TERRACOTTA_PINK);
    public static final Block CYAN_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("cyan", MapColor.TERRACOTTA_CYAN);
    public static final Block BLUE_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("blue", MapColor.TERRACOTTA_BLUE);
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final Block PURPLE_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("purple", MapColor.TERRACOTTA_PURPLE);
    public static final Block YELLOW_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("yellow", MapColor.TERRACOTTA_YELLOW);
    public static final Block ORANGE_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("orange", MapColor.TERRACOTTA_ORANGE);
    public static final Block GRAY_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("gray", MapColor.TERRACOTTA_GRAY);
    public static final Block MAGENTA_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("magenta", MapColor.TERRACOTTA_MAGENTA);
    public static final Block GREEN_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("green", MapColor.TERRACOTTA_GREEN);
    public static final Block LIME_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("lime", MapColor.TERRACOTTA_LIME);
    public static final Block BROWN_TERRACOTTA_SHINGLES_SLAB = registerTerracottaShinglesSlab("brown", MapColor.TERRACOTTA_BROWN);

    public static final Block TERRACOTTA_SHINGLES_STAIRS = registerBlock("terracotta_shingles_stairs", new StairsBlock(TERRACOTTA_SHINGLES.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("white", MapColor.TERRACOTTA_WHITE, WHITE_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block BLACK_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("black", MapColor.TERRACOTTA_BLACK, BLACK_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY, LIGHT_GRAY_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block RED_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("red", MapColor.TERRACOTTA_RED, RED_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block PINK_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("pink", MapColor.TERRACOTTA_PINK, PINK_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block CYAN_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("cyan", MapColor.TERRACOTTA_CYAN, CYAN_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block BLUE_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("blue", MapColor.TERRACOTTA_BLUE, BLUE_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE, LIGHT_BLUE_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block PURPLE_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("purple", MapColor.TERRACOTTA_PURPLE, PURPLE_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block YELLOW_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("yellow", MapColor.TERRACOTTA_YELLOW, YELLOW_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block ORANGE_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("orange", MapColor.TERRACOTTA_ORANGE, ORANGE_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block GRAY_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("gray", MapColor.TERRACOTTA_GRAY, GRAY_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block MAGENTA_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("magenta", MapColor.TERRACOTTA_MAGENTA, MAGENTA_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block GREEN_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("green", MapColor.TERRACOTTA_GREEN, GREEN_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block LIME_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("lime", MapColor.TERRACOTTA_LIME, LIME_TERRACOTTA_SHINGLES.getDefaultState());
    public static final Block BROWN_TERRACOTTA_SHINGLES_STAIRS = registerTerracottaShinglesStairs("brown", MapColor.TERRACOTTA_BROWN, BROWN_TERRACOTTA_SHINGLES.getDefaultState());

    public static final Block TERRACOTTA_SHINGLES_WALL = registerBlock("terracotta_shingles_wall", new WallBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT).mapColor(MapColor.ORANGE).instrument(Instrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));
    public static final Block WHITE_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("white", MapColor.TERRACOTTA_WHITE);
    public static final Block BLACK_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("black", MapColor.TERRACOTTA_BLACK);
    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
    public static final Block RED_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("red", MapColor.TERRACOTTA_RED);
    public static final Block PINK_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("pink", MapColor.TERRACOTTA_PINK);
    public static final Block CYAN_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("cyan", MapColor.TERRACOTTA_CYAN);
    public static final Block BLUE_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("blue", MapColor.TERRACOTTA_BLUE);
    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
    public static final Block PURPLE_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("purple", MapColor.TERRACOTTA_PURPLE);
    public static final Block YELLOW_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("yellow", MapColor.TERRACOTTA_YELLOW);
    public static final Block ORANGE_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("orange", MapColor.TERRACOTTA_ORANGE);
    public static final Block GRAY_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("gray", MapColor.TERRACOTTA_GRAY);
    public static final Block MAGENTA_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("magenta", MapColor.TERRACOTTA_MAGENTA);
    public static final Block GREEN_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("green", MapColor.TERRACOTTA_GREEN);
    public static final Block LIME_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("lime", MapColor.TERRACOTTA_LIME);
    public static final Block BROWN_TERRACOTTA_SHINGLES_WALL = registerTerracottaShinglesWall("brown", MapColor.TERRACOTTA_BROWN);

    public static void init() {
        // colored blocks group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(Items.PINK_CONCRETE,
                    WHITE_CONCRETE_BRICKS, LIGHT_GRAY_CONCRETE_BRICKS, GRAY_CONCRETE_BRICKS, BLACK_CONCRETE_BRICKS, BROWN_CONCRETE_BRICKS, RED_CONCRETE_BRICKS,
                    ORANGE_CONCRETE_BRICKS, YELLOW_CONCRETE_BRICKS, LIME_CONCRETE_BRICKS, GREEN_CONCRETE_BRICKS, CYAN_CONCRETE_BRICKS, LIGHT_BLUE_CONCRETE_BRICKS,
                    BLUE_CONCRETE_BRICKS, PURPLE_CONCRETE_BRICKS, MAGENTA_CONCRETE_BRICKS, PINK_CONCRETE_BRICKS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(Items.PINK_TERRACOTTA,
                    WHITE_TERRACOTTA_BRICKS, LIGHT_GRAY_TERRACOTTA_BRICKS, GRAY_TERRACOTTA_BRICKS, BLACK_TERRACOTTA_BRICKS, BROWN_TERRACOTTA_BRICKS, RED_TERRACOTTA_BRICKS,
                    ORANGE_TERRACOTTA_BRICKS, YELLOW_TERRACOTTA_BRICKS, LIME_TERRACOTTA_BRICKS, GREEN_TERRACOTTA_BRICKS, CYAN_TERRACOTTA_BRICKS, LIGHT_BLUE_TERRACOTTA_BRICKS,
                    BLUE_TERRACOTTA_BRICKS, PURPLE_TERRACOTTA_BRICKS, MAGENTA_TERRACOTTA_BRICKS, PINK_TERRACOTTA_BRICKS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(Items.PINK_TERRACOTTA,
                    WHITE_TERRACOTTA_SHINGLES, LIGHT_GRAY_TERRACOTTA_SHINGLES, GRAY_TERRACOTTA_SHINGLES, BLACK_TERRACOTTA_SHINGLES, BROWN_TERRACOTTA_SHINGLES, RED_TERRACOTTA_SHINGLES,
                    ORANGE_TERRACOTTA_SHINGLES, YELLOW_TERRACOTTA_SHINGLES, LIME_TERRACOTTA_SHINGLES, GREEN_TERRACOTTA_SHINGLES, CYAN_TERRACOTTA_SHINGLES, LIGHT_BLUE_TERRACOTTA_SHINGLES,
                    BLUE_TERRACOTTA_SHINGLES, PURPLE_TERRACOTTA_SHINGLES, MAGENTA_TERRACOTTA_SHINGLES, PINK_TERRACOTTA_SHINGLES);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(Items.PINK_CARPET,
                    WHITE_PATTERNED_WOOL_CARPET, LIGHT_GRAY_PATTERNED_WOOL_CARPET, GRAY_PATTERNED_WOOL_CARPET, BLACK_PATTERNED_WOOL_CARPET, BROWN_PATTERNED_WOOL_CARPET, RED_PATTERNED_WOOL_CARPET,
                    ORANGE_PATTERNED_WOOL_CARPET, YELLOW_PATTERNED_WOOL_CARPET, LIME_PATTERNED_WOOL_CARPET, GREEN_PATTERNED_WOOL_CARPET, CYAN_PATTERNED_WOOL_CARPET, LIGHT_BLUE_PATTERNED_WOOL_CARPET,
                    BLUE_PATTERNED_WOOL_CARPET, PURPLE_PATTERNED_WOOL_CARPET, MAGENTA_PATTERNED_WOOL_CARPET, PINK_PATTERNED_WOOL_CARPET);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(Items.PINK_CARPET,
                    WHITE_PATTERNED_WOOL, LIGHT_GRAY_PATTERNED_WOOL, GRAY_PATTERNED_WOOL, BLACK_PATTERNED_WOOL, BROWN_PATTERNED_WOOL, RED_PATTERNED_WOOL,
                    ORANGE_PATTERNED_WOOL, YELLOW_PATTERNED_WOOL, LIME_PATTERNED_WOOL, GREEN_PATTERNED_WOOL, CYAN_PATTERNED_WOOL, LIGHT_BLUE_PATTERNED_WOOL,
                    BLUE_PATTERNED_WOOL, PURPLE_PATTERNED_WOOL, MAGENTA_PATTERNED_WOOL, PINK_PATTERNED_WOOL);
        });

        // build blocks group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addBefore(Items.COAL_BLOCK,
                    Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_BRICKS, ModBlocks.TERRACOTTA_BRICKS_STAIRS, ModBlocks.TERRACOTTA_BRICKS_SLAB, ModBlocks.TERRACOTTA_BRICKS_WALL,
                    Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_BRICKS, ModBlocks.WHITE_TERRACOTTA_BRICKS_STAIRS, ModBlocks.WHITE_TERRACOTTA_BRICKS_SLAB, ModBlocks.WHITE_TERRACOTTA_BRICKS_WALL,
                    Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS_WALL,
                    Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_BRICKS, ModBlocks.GRAY_TERRACOTTA_BRICKS_STAIRS, ModBlocks.GRAY_TERRACOTTA_BRICKS_SLAB, ModBlocks.GRAY_TERRACOTTA_BRICKS_WALL,
                    Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_BRICKS, ModBlocks.BLACK_TERRACOTTA_BRICKS_STAIRS, ModBlocks.BLACK_TERRACOTTA_BRICKS_SLAB, ModBlocks.BLACK_TERRACOTTA_BRICKS_WALL,
                    Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_BRICKS, ModBlocks.BROWN_TERRACOTTA_BRICKS_STAIRS, ModBlocks.BROWN_TERRACOTTA_BRICKS_SLAB, ModBlocks.BROWN_TERRACOTTA_BRICKS_WALL,
                    Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_BRICKS, ModBlocks.RED_TERRACOTTA_BRICKS_STAIRS, ModBlocks.RED_TERRACOTTA_BRICKS_SLAB, ModBlocks.RED_TERRACOTTA_BRICKS_WALL,
                    Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_BRICKS, ModBlocks.ORANGE_TERRACOTTA_BRICKS_STAIRS, ModBlocks.ORANGE_TERRACOTTA_BRICKS_SLAB, ModBlocks.ORANGE_TERRACOTTA_BRICKS_WALL,
                    Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_BRICKS, ModBlocks.YELLOW_TERRACOTTA_BRICKS_STAIRS, ModBlocks.YELLOW_TERRACOTTA_BRICKS_SLAB, ModBlocks.YELLOW_TERRACOTTA_BRICKS_WALL,
                    Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_BRICKS, ModBlocks.LIME_TERRACOTTA_BRICKS_STAIRS, ModBlocks.LIME_TERRACOTTA_BRICKS_SLAB, ModBlocks.LIME_TERRACOTTA_BRICKS_WALL,
                    Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_BRICKS, ModBlocks.GREEN_TERRACOTTA_BRICKS_STAIRS, ModBlocks.GREEN_TERRACOTTA_BRICKS_SLAB, ModBlocks.GREEN_TERRACOTTA_BRICKS_WALL,
                    Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_BRICKS, ModBlocks.CYAN_TERRACOTTA_BRICKS_STAIRS, ModBlocks.CYAN_TERRACOTTA_BRICKS_SLAB, ModBlocks.CYAN_TERRACOTTA_BRICKS_WALL,
                    Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS_WALL,
                    Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_BRICKS, ModBlocks.BLUE_TERRACOTTA_BRICKS_STAIRS, ModBlocks.BLUE_TERRACOTTA_BRICKS_SLAB, ModBlocks.BLUE_TERRACOTTA_BRICKS_WALL,
                    Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_BRICKS, ModBlocks.PURPLE_TERRACOTTA_BRICKS_STAIRS, ModBlocks.PURPLE_TERRACOTTA_BRICKS_SLAB, ModBlocks.PURPLE_TERRACOTTA_BRICKS_WALL,
                    Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_BRICKS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS_SLAB, ModBlocks.MAGENTA_TERRACOTTA_BRICKS_WALL,
                    Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_BRICKS, ModBlocks.PINK_TERRACOTTA_BRICKS_STAIRS, ModBlocks.PINK_TERRACOTTA_BRICKS_SLAB, ModBlocks.PINK_TERRACOTTA_BRICKS_WALL
                    );
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addBefore(Items.COAL_BLOCK,
                    ModBlocks.TERRACOTTA_SHINGLES, ModBlocks.TERRACOTTA_SHINGLES_STAIRS, ModBlocks.TERRACOTTA_SHINGLES_SLAB, ModBlocks.TERRACOTTA_SHINGLES_WALL,
                    Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_SHINGLES, ModBlocks.WHITE_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.WHITE_TERRACOTTA_SHINGLES_SLAB, ModBlocks.WHITE_TERRACOTTA_SHINGLES_WALL,
                    Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES_WALL,
                    Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_SHINGLES, ModBlocks.GRAY_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.GRAY_TERRACOTTA_SHINGLES_SLAB, ModBlocks.GRAY_TERRACOTTA_SHINGLES_WALL,
                    Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_SHINGLES, ModBlocks.BLACK_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.BLACK_TERRACOTTA_SHINGLES_SLAB, ModBlocks.BLACK_TERRACOTTA_SHINGLES_WALL,
                    Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_SHINGLES, ModBlocks.BROWN_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.BROWN_TERRACOTTA_SHINGLES_SLAB, ModBlocks.BROWN_TERRACOTTA_SHINGLES_WALL,
                    Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_SHINGLES, ModBlocks.RED_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.RED_TERRACOTTA_SHINGLES_SLAB, ModBlocks.RED_TERRACOTTA_SHINGLES_WALL,
                    Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_SHINGLES, ModBlocks.ORANGE_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.ORANGE_TERRACOTTA_SHINGLES_SLAB, ModBlocks.ORANGE_TERRACOTTA_SHINGLES_WALL,
                    Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_SHINGLES, ModBlocks.YELLOW_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.YELLOW_TERRACOTTA_SHINGLES_SLAB, ModBlocks.YELLOW_TERRACOTTA_SHINGLES_WALL,
                    Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_SHINGLES, ModBlocks.LIME_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.LIME_TERRACOTTA_SHINGLES_SLAB, ModBlocks.LIME_TERRACOTTA_SHINGLES_WALL,
                    Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_SHINGLES, ModBlocks.GREEN_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.GREEN_TERRACOTTA_SHINGLES_SLAB, ModBlocks.GREEN_TERRACOTTA_SHINGLES_WALL,
                    Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_SHINGLES, ModBlocks.CYAN_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.CYAN_TERRACOTTA_SHINGLES_SLAB, ModBlocks.CYAN_TERRACOTTA_SHINGLES_WALL,
                    Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES_WALL,
                    Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_SHINGLES, ModBlocks.BLUE_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.BLUE_TERRACOTTA_SHINGLES_SLAB, ModBlocks.BLUE_TERRACOTTA_SHINGLES_WALL,
                    Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_SHINGLES, ModBlocks.PURPLE_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.PURPLE_TERRACOTTA_SHINGLES_SLAB, ModBlocks.PURPLE_TERRACOTTA_SHINGLES_WALL,
                    Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_SLAB, ModBlocks.MAGENTA_TERRACOTTA_SHINGLES_WALL,
                    Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_SHINGLES, ModBlocks.PINK_TERRACOTTA_SHINGLES_STAIRS, ModBlocks.PINK_TERRACOTTA_SHINGLES_SLAB, ModBlocks.PINK_TERRACOTTA_SHINGLES_WALL
            );
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addBefore(Items.COAL_BLOCK,
                    Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_BRICKS, ModBlocks.WHITE_CONCRETE_BRICKS_STAIRS, ModBlocks.WHITE_CONCRETE_BRICKS_SLAB, ModBlocks.WHITE_CONCRETE_BRICKS_WALL,
                    Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_BRICKS_WALL,
                    Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_BRICKS, ModBlocks.GRAY_CONCRETE_BRICKS_STAIRS, ModBlocks.GRAY_CONCRETE_BRICKS_SLAB, ModBlocks.GRAY_CONCRETE_BRICKS_WALL,
                    Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_BRICKS, ModBlocks.BLACK_CONCRETE_BRICKS_STAIRS, ModBlocks.BLACK_CONCRETE_BRICKS_SLAB, ModBlocks.BLACK_CONCRETE_BRICKS_WALL,
                    Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_BRICKS, ModBlocks.BROWN_CONCRETE_BRICKS_STAIRS, ModBlocks.BROWN_CONCRETE_BRICKS_SLAB, ModBlocks.BROWN_CONCRETE_BRICKS_WALL,
                    Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_BRICKS, ModBlocks.RED_CONCRETE_BRICKS_STAIRS, ModBlocks.RED_CONCRETE_BRICKS_SLAB, ModBlocks.RED_CONCRETE_BRICKS_WALL,
                    Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_BRICKS, ModBlocks.ORANGE_CONCRETE_BRICKS_STAIRS, ModBlocks.ORANGE_CONCRETE_BRICKS_SLAB, ModBlocks.ORANGE_CONCRETE_BRICKS_WALL,
                    Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_BRICKS, ModBlocks.YELLOW_CONCRETE_BRICKS_STAIRS, ModBlocks.YELLOW_CONCRETE_BRICKS_SLAB, ModBlocks.YELLOW_CONCRETE_BRICKS_WALL,
                    Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_BRICKS, ModBlocks.LIME_CONCRETE_BRICKS_STAIRS, ModBlocks.LIME_CONCRETE_BRICKS_SLAB, ModBlocks.LIME_CONCRETE_BRICKS_WALL,
                    Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_BRICKS, ModBlocks.GREEN_CONCRETE_BRICKS_STAIRS, ModBlocks.GREEN_CONCRETE_BRICKS_SLAB, ModBlocks.GREEN_CONCRETE_BRICKS_WALL,
                    Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_BRICKS, ModBlocks.CYAN_CONCRETE_BRICKS_STAIRS, ModBlocks.CYAN_CONCRETE_BRICKS_SLAB, ModBlocks.CYAN_CONCRETE_BRICKS_WALL,
                    Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_STAIRS, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_BRICKS_WALL,
                    Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_BRICKS, ModBlocks.BLUE_CONCRETE_BRICKS_STAIRS, ModBlocks.BLUE_CONCRETE_BRICKS_SLAB, ModBlocks.BLUE_CONCRETE_BRICKS_WALL,
                    Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_BRICKS, ModBlocks.PURPLE_CONCRETE_BRICKS_STAIRS, ModBlocks.PURPLE_CONCRETE_BRICKS_SLAB, ModBlocks.PURPLE_CONCRETE_BRICKS_WALL,
                    Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_BRICKS, ModBlocks.MAGENTA_CONCRETE_BRICKS_STAIRS, ModBlocks.MAGENTA_CONCRETE_BRICKS_SLAB, ModBlocks.MAGENTA_CONCRETE_BRICKS_WALL,
                    Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_BRICKS, ModBlocks.PINK_CONCRETE_BRICKS_STAIRS, ModBlocks.PINK_CONCRETE_BRICKS_SLAB, ModBlocks.PINK_CONCRETE_BRICKS_WALL
            );
        });
    }
}
