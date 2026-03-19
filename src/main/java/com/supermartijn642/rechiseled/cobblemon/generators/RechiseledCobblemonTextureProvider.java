package com.supermartijn642.rechiseled.cobblemon.generators;

import com.supermartijn642.rechiseled.api.ChiseledTextureProvider;
import com.supermartijn642.rechiseled.cobblemon.RechiseledCobblemon;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

/**
 * Created 18/03/2026 by SuperMartijn642
 */
public class RechiseledCobblemonTextureProvider extends ChiseledTextureProvider {

    public RechiseledCobblemonTextureProvider(String modid, FabricDataOutput output){
        super(modid, output);
    }

    @Override
    protected void createTextures(){
        // Create plank textures
        this.createPlankTextures(ResourceLocation.fromNamespaceAndPath("cobblemon", "block/wood/apricorn_planks"), "block/apricorn_planks");
        this.createPlankTextures(ResourceLocation.fromNamespaceAndPath("cobblemon", "block/wood/saccharine_planks"), "block/saccharine_planks");

        // Create tumblestone textures
        List<String> tumblestoneSuffixes = List.of(
            "beams",
            "brick_pattern",
            "bricks",
            "checkerboard",
            "chiseled_bricks_side", "chiseled_bricks_end",
            "chiseled_pillar_side", "chiseled_pillar_end",
            "chiseled_squares",
            "diagonal_tiles",
            "diagonal_tiles_pillar_side", "diagonal_tiles_pillar_end",
            "jewel",
            "polished",
            "squares",
            "tiles",
            "woven"
        );
        PaletteMap skyTumblestonePalette = this.createPaletteMap(
            RechiseledCobblemon.identifier("palettes/tumblestone"),
            RechiseledCobblemon.identifier("palettes/sky_tumblestone")
        );
        PaletteMap blackTumblestonePalette = this.createPaletteMap(
            RechiseledCobblemon.identifier("palettes/tumblestone"),
            RechiseledCobblemon.identifier("palettes/black_tumblestone")
        );
        for(String suffix : tumblestoneSuffixes){
            ResourceLocation texture = RechiseledCobblemon.identifier("block/tumblestone_" + suffix);
            skyTumblestonePalette.applyToTexture(texture, "block/sky_tumblestone_" + suffix);
            blackTumblestonePalette.applyToTexture(texture, "block/black_tumblestone_" + suffix);
        }
    }
}
