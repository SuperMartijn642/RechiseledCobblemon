package com.supermartijn642.rechiseled.cobblemon;

import com.cobblemon.mod.common.CobblemonBlocks;
import com.cobblemon.mod.common.CobblemonSounds;
import com.supermartijn642.core.block.BlockProperties;
import com.supermartijn642.rechiseled.Rechiseled;
import com.supermartijn642.rechiseled.api.blocks.BlockSpecification;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockBuilder;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Consumer;

/**
 * Created 18/03/2026 by SuperMartijn642
 */
@SuppressWarnings("unused")
public class RechiseledCobblemonBlocks {

    // Apricorn planks
    private static final Consumer<BlockProperties> APRICORN_PLANKS_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASS).destroyTime(2.0F).explosionResistance(3.0F).sound(SoundType.WOOD).ignitedByLava();
    private static final Consumer<RechiseledBlockBuilder> APRICORN_PLANKS_CONFIGURER = b -> b.properties(APRICORN_PLANKS_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.ACACIA_PLANKS).recipe(RechiseledCobblemonRecipes.APRICORN_PLANKS).itemAndBlockTag(RechiseledCobblemon.identifier("apricorn_planks")).withStairs(s -> s.itemAndBlockTag(Rechiseled.identifier("apricorn_planks_stairs"))).withSlabs(s -> s.itemAndBlockTag(Rechiseled.identifier("apricorn_planks_slabs")));
    public static final RechiseledBlockType APRICORN_PLANKS_BEAMS = create("apricorn_planks_beams", "Apricorn Plank Beams").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_BRICK_PATTERN = create("apricorn_planks_brick_pattern", "Apricorn Plank Brick Pattern").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_BRICK_PAVING = create("apricorn_planks_brick_paving", "Apricorn Plank Brick Paving").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_BRICKS = create("apricorn_planks_bricks", "Apricorn Plank Bricks").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_CRATE = create("apricorn_planks_crate", "Apricorn Planks Crate").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_DIAGONAL_STRIPES = create("apricorn_planks_diagonal_stripes", "Diagonal Apricorn Plank Stripes").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_DIAGONAL_TILES = create("apricorn_planks_diagonal_tiles", "Diagonal Apricorn Plank Tiles").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_DOTTED = create("apricorn_planks_dotted", "Dotted Apricorn Planks").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_FLOORING = create("apricorn_planks_flooring", "Apricorn Plank Flooring").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_LARGE_TILES = create("apricorn_planks_large_tiles", "Large Apricorn Plank Tiles").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_MOSAIC = create("apricorn_planks_mosaic", "Apricorn Plank Mosaic").configure(APRICORN_PLANKS_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType APRICORN_PLANKS_PATTERN = create("apricorn_planks_pattern", "Apricorn Plank Pattern").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_ROTATED_BRICKS = create("apricorn_planks_rotated_bricks", "Rotated Apricorn Plank Bricks").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_SMALL_BRICKS = create("apricorn_planks_small_bricks", "Small Apricorn Plank Bricks").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_SMALL_TILES = create("apricorn_planks_small_tiles", "Small Apricorn Plank Tiles").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_SQUARES = create("apricorn_planks_squares", "Apricorn Plank Squares").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_TILES = create("apricorn_planks_tiles", "Apricorn Plank Tiles").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_WAVY = create("apricorn_planks_wavy", "Wavy Apricorn Planks").configure(APRICORN_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType APRICORN_PLANKS_WOVEN = create("apricorn_planks_woven", "Woven Apricorn Planks").configure(APRICORN_PLANKS_CONFIGURER).build();
    // Black tumblestone
    private static final Consumer<BlockProperties> BLACK_TUMBLESTONE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM).destroyTime(1.0F).explosionResistance(1.0F).sound(CobblemonSounds.TUMBLESTONE_BLOCK_SOUNDS).requiresCorrectTool();
    private static final Consumer<RechiseledBlockBuilder> BLACK_TUMBLESTONE_CONFIGURER = b -> b.properties(BLACK_TUMBLESTONE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.AMETHYST_BLOCK).recipe(RechiseledCobblemonRecipes.BLACK_TUMBLESTONE).itemAndBlockTag(RechiseledCobblemon.identifier("black_tumblestone")).withStairs(s -> s.itemAndBlockTag(Rechiseled.identifier("black_tumblestone_stairs"))).withSlabs(s -> s.itemAndBlockTag(Rechiseled.identifier("black_tumblestone_slabs")));
    public static final RechiseledBlockType BLACK_TUMBLESTONE_BEAMS = create("black_tumblestone_beams", "Black Tumblestone Beams").configure(BLACK_TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_BRICK_PATTERN = create("black_tumblestone_brick_pattern", "Black Tumblestone Brick Pattern").configure(BLACK_TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_BRICKS = create("black_tumblestone_bricks", "Black Tumblestone Bricks").configure(BLACK_TUMBLESTONE_CONFIGURER).regularVariant(() -> CobblemonBlocks.BLACK_TUMBLESTONE_BRICKS, () -> CobblemonBlocks.BLACK_TUMBLESTONE_BRICK_STAIRS, () -> CobblemonBlocks.BLACK_TUMBLESTONE_BRICK_SLAB).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_CHECKERBOARD = create("black_tumblestone_checkerboard", "Checkerboard Black Tumblestone").configure(BLACK_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_CHISELED_BRICKS = create("black_tumblestone_chiseled_bricks", "Chiseled Black Tumblestone Bricks").configure(BLACK_TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).regularVariant(() -> CobblemonBlocks.CHISELED_BLACK_TUMBLESTONE_BRICKS).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_CHISELED_PILLAR = create("black_tumblestone_chiseled_pillar", "Chiseled Black Tumblestone Pillar").configure(BLACK_TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_CHISELED_SQUARES = create("black_tumblestone_chiseled_squares", "Chiseled Black Tumblestone Squares").configure(BLACK_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_DIAGONAL_TILES = create("black_tumblestone_diagonal_tiles", "Diagonal Black Tumblestone Tiles").configure(BLACK_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_DIAGONAL_TILES_PILLAR = create("black_tumblestone_diagonal_tiles_pillar", "Diagonal Black Tumblestone Tiles Pillar").configure(BLACK_TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_JEWEL = create("black_tumblestone_jewel", "Black Tumblestone Jewel").configure(BLACK_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_POLISHED = create("black_tumblestone_polished", "Polished Black Tumblestone").configure(BLACK_TUMBLESTONE_CONFIGURER).regularVariant(() -> CobblemonBlocks.POLISHED_BLACK_TUMBLESTONE, () -> CobblemonBlocks.POLISHED_BLACK_TUMBLESTONE_STAIRS, () -> CobblemonBlocks.POLISHED_BLACK_TUMBLESTONE_SLAB).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_SQUARES = create("black_tumblestone_squares", "Black Tumblestone Squares").configure(BLACK_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_TILES = create("black_tumblestone_tiles", "Black Tumblestone Tiles").configure(BLACK_TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType BLACK_TUMBLESTONE_WOVEN = create("black_tumblestone_woven", "Black Tumblestone Woven").configure(BLACK_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    // Saccharine planks
    private static final Consumer<BlockProperties> SACCHARINE_PLANKS_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASS).destroyTime(2.0F).explosionResistance(3.0F).sound(SoundType.WOOD).ignitedByLava();
    private static final Consumer<RechiseledBlockBuilder> SACCHARINE_PLANKS_CONFIGURER = b -> b.properties(SACCHARINE_PLANKS_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.ACACIA_PLANKS).recipe(RechiseledCobblemonRecipes.SACCHARINE_PLANKS).itemAndBlockTag(RechiseledCobblemon.identifier("saccharine_planks")).withStairs(s -> s.itemAndBlockTag(Rechiseled.identifier("saccharine_planks_stairs"))).withSlabs(s -> s.itemAndBlockTag(Rechiseled.identifier("saccharine_planks_slabs")));
    public static final RechiseledBlockType SACCHARINE_PLANKS_BEAMS = create("saccharine_planks_beams", "Saccharine Plank Beams").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_BRICK_PATTERN = create("saccharine_planks_brick_pattern", "Saccharine Plank Brick Pattern").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_BRICK_PAVING = create("saccharine_planks_brick_paving", "Saccharine Plank Brick Paving").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_BRICKS = create("saccharine_planks_bricks", "Saccharine Plank Bricks").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_CRATE = create("saccharine_planks_crate", "Saccharine Planks Crate").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_DIAGONAL_STRIPES = create("saccharine_planks_diagonal_stripes", "Diagonal Saccharine Plank Stripes").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_DIAGONAL_TILES = create("saccharine_planks_diagonal_tiles", "Diagonal Saccharine Plank Tiles").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_DOTTED = create("saccharine_planks_dotted", "Dotted Saccharine Planks").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_FLOORING = create("saccharine_planks_flooring", "Saccharine Plank Flooring").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_LARGE_TILES = create("saccharine_planks_large_tiles", "Large Saccharine Plank Tiles").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_MOSAIC = create("saccharine_planks_mosaic", "Saccharine Plank Mosaic").configure(SACCHARINE_PLANKS_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_PATTERN = create("saccharine_planks_pattern", "Saccharine Plank Pattern").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_ROTATED_BRICKS = create("saccharine_planks_rotated_bricks", "Rotated Saccharine Plank Bricks").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_SMALL_BRICKS = create("saccharine_planks_small_bricks", "Small Saccharine Plank Bricks").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_SMALL_TILES = create("saccharine_planks_small_tiles", "Small Saccharine Plank Tiles").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_SQUARES = create("saccharine_planks_squares", "Saccharine Plank Squares").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_TILES = create("saccharine_planks_tiles", "Saccharine Plank Tiles").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_WAVY = create("saccharine_planks_wavy", "Wavy Saccharine Planks").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    public static final RechiseledBlockType SACCHARINE_PLANKS_WOVEN = create("saccharine_planks_woven", "Woven Saccharine Planks").configure(SACCHARINE_PLANKS_CONFIGURER).build();
    // Sky tumblestone
    private static final Consumer<BlockProperties> SKY_TUMBLESTONE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).destroyTime(1.0F).explosionResistance(1.0F).sound(CobblemonSounds.TUMBLESTONE_BLOCK_SOUNDS).requiresCorrectTool();
    private static final Consumer<RechiseledBlockBuilder> SKY_TUMBLESTONE_CONFIGURER = b -> b.properties(SKY_TUMBLESTONE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.AMETHYST_BLOCK).recipe(RechiseledCobblemonRecipes.SKY_TUMBLESTONE).itemAndBlockTag(RechiseledCobblemon.identifier("sky_tumblestone")).withStairs(s -> s.itemAndBlockTag(Rechiseled.identifier("sky_tumblestone_stairs"))).withSlabs(s -> s.itemAndBlockTag(Rechiseled.identifier("sky_tumblestone_slabs")));
    public static final RechiseledBlockType SKY_TUMBLESTONE_BEAMS = create("sky_tumblestone_beams", "Sky Tumblestone Beams").configure(SKY_TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_BRICK_PATTERN = create("sky_tumblestone_brick_pattern", "Sky Tumblestone Brick Pattern").configure(SKY_TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_BRICKS = create("sky_tumblestone_bricks", "Sky Tumblestone Bricks").configure(SKY_TUMBLESTONE_CONFIGURER).regularVariant(() -> CobblemonBlocks.SKY_TUMBLESTONE_BRICKS, () -> CobblemonBlocks.SKY_TUMBLESTONE_BRICK_STAIRS, () -> CobblemonBlocks.SKY_TUMBLESTONE_BRICK_SLAB).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_CHECKERBOARD = create("sky_tumblestone_checkerboard", "Checkerboard Sky Tumblestone").configure(SKY_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_CHISELED_BRICKS = create("sky_tumblestone_chiseled_bricks", "Chiseled Sky Tumblestone Bricks").configure(SKY_TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).regularVariant(() -> CobblemonBlocks.CHISELED_SKY_TUMBLESTONE_BRICKS).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_CHISELED_PILLAR = create("sky_tumblestone_chiseled_pillar", "Chiseled Sky Tumblestone Pillar").configure(SKY_TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_CHISELED_SQUARES = create("sky_tumblestone_chiseled_squares", "Chiseled Sky Tumblestone Squares").configure(SKY_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_DIAGONAL_TILES = create("sky_tumblestone_diagonal_tiles", "Diagonal Sky Tumblestone Tiles").configure(SKY_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_DIAGONAL_TILES_PILLAR = create("sky_tumblestone_diagonal_tiles_pillar", "Diagonal Sky Tumblestone Tiles Pillar").configure(SKY_TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_JEWEL = create("sky_tumblestone_jewel", "Sky Tumblestone Jewel").configure(SKY_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_POLISHED = create("sky_tumblestone_polished", "Polished Sky Tumblestone").configure(SKY_TUMBLESTONE_CONFIGURER).regularVariant(() -> CobblemonBlocks.POLISHED_SKY_TUMBLESTONE, () -> CobblemonBlocks.POLISHED_SKY_TUMBLESTONE_STAIRS, () -> CobblemonBlocks.POLISHED_SKY_TUMBLESTONE_SLAB).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_SQUARES = create("sky_tumblestone_squares", "Sky Tumblestone Squares").configure(SKY_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_TILES = create("sky_tumblestone_tiles", "Sky Tumblestone Tiles").configure(SKY_TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType SKY_TUMBLESTONE_WOVEN = create("sky_tumblestone_woven", "Sky Tumblestone Woven").configure(SKY_TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    // Tumblestone
    private static final Consumer<BlockProperties> TUMBLESTONE_BLOCK_PROPERTIES = p -> p.mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM).destroyTime(1.0F).explosionResistance(1.0F).sound(CobblemonSounds.TUMBLESTONE_BLOCK_SOUNDS).requiresCorrectTool();
    private static final Consumer<RechiseledBlockBuilder> TUMBLESTONE_CONFIGURER = b -> b.properties(TUMBLESTONE_BLOCK_PROPERTIES).miningTagsFrom(() -> Blocks.AMETHYST_BLOCK).recipe(RechiseledCobblemonRecipes.TUMBLESTONE).itemAndBlockTag(RechiseledCobblemon.identifier("tumblestone")).withStairs(s -> s.itemAndBlockTag(Rechiseled.identifier("tumblestone_stairs"))).withSlabs(s -> s.itemAndBlockTag(Rechiseled.identifier("tumblestone_slabs")));
    public static final RechiseledBlockType TUMBLESTONE_BEAMS = create("tumblestone_beams", "Tumblestone Beams").configure(TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType TUMBLESTONE_BRICK_PATTERN = create("tumblestone_brick_pattern", "Tumblestone Brick Pattern").configure(TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType TUMBLESTONE_BRICKS = create("tumblestone_bricks", "Tumblestone Bricks").configure(TUMBLESTONE_CONFIGURER).regularVariant(() -> CobblemonBlocks.TUMBLESTONE_BRICKS, () -> CobblemonBlocks.TUMBLESTONE_BRICK_STAIRS, () -> CobblemonBlocks.TUMBLESTONE_BRICK_SLAB).build();
    public static final RechiseledBlockType TUMBLESTONE_CHECKERBOARD = create("tumblestone_checkerboard", "Checkerboard Tumblestone").configure(TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType TUMBLESTONE_CHISELED_BRICKS = create("tumblestone_chiseled_bricks", "Chiseled Tumblestone Bricks").configure(TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).regularVariant(() -> CobblemonBlocks.CHISELED_TUMBLESTONE_BRICKS).build();
    public static final RechiseledBlockType TUMBLESTONE_CHISELED_PILLAR = create("tumblestone_chiseled_pillar", "Chiseled Tumblestone Pillar").configure(TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).build();
    public static final RechiseledBlockType TUMBLESTONE_CHISELED_SQUARES = create("tumblestone_chiseled_squares", "Chiseled Tumblestone Squares").configure(TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType TUMBLESTONE_DIAGONAL_TILES = create("tumblestone_diagonal_tiles", "Diagonal Tumblestone Tiles").configure(TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType TUMBLESTONE_DIAGONAL_TILES_PILLAR = create("tumblestone_diagonal_tiles_pillar", "Diagonal Tumblestone Tiles Pillar").configure(TUMBLESTONE_CONFIGURER).specification(BlockSpecification.PILLAR).build();
    public static final RechiseledBlockType TUMBLESTONE_JEWEL = create("tumblestone_jewel", "Tumblestone Jewel").configure(TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType TUMBLESTONE_POLISHED = create("tumblestone_polished", "Polished Tumblestone").configure(TUMBLESTONE_CONFIGURER).regularVariant(() -> CobblemonBlocks.POLISHED_TUMBLESTONE, () -> CobblemonBlocks.POLISHED_TUMBLESTONE_STAIRS, () -> CobblemonBlocks.POLISHED_TUMBLESTONE_SLAB).build();
    public static final RechiseledBlockType TUMBLESTONE_SQUARES = create("tumblestone_squares", "Tumblestone Squares").configure(TUMBLESTONE_CONFIGURER).noConnectingVariant().build();
    public static final RechiseledBlockType TUMBLESTONE_TILES = create("tumblestone_tiles", "Tumblestone Tiles").configure(TUMBLESTONE_CONFIGURER).build();
    public static final RechiseledBlockType TUMBLESTONE_WOVEN = create("tumblestone_woven", "Tumblestone Woven").configure(TUMBLESTONE_CONFIGURER).noConnectingVariant().build();

    private static RechiseledBlockBuilder create(String identifier, String translation){
        return RechiseledCobblemon.REGISTRATION.block(identifier).translation(translation);
    }

    public static void init(){
        // Cause this class to be initialized
    }
}
