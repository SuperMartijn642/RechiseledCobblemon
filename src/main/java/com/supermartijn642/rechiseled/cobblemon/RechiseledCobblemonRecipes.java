package com.supermartijn642.rechiseled.cobblemon;

import com.cobblemon.mod.common.CobblemonBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.cobblemon.RechiseledCobblemon.REGISTRATION;

/**
 * Created 18/03/2026 by SuperMartijn642
 */
public class RechiseledCobblemonRecipes {

    public static final ResourceLocation APRICORN_PLANKS = location("apricorn_planks");
    public static final ResourceLocation BLACK_TUMBLESTONE = location("black_tumblestone");
    public static final ResourceLocation SACCHARINE_PLANKS = location("saccharine_planks");
    public static final ResourceLocation SKY_TUMBLESTONE = location("sky_tumblestone");
    public static final ResourceLocation TUMBLESTONE = location("tumblestone");

    private static ResourceLocation location(String name){
        return ResourceLocation.fromNamespaceAndPath(RechiseledCobblemon.MODID, name);
    }

    public static void init(){
        // Apricorn planks
        regularBlockOnly(APRICORN_PLANKS, () -> CobblemonBlocks.APRICORN_PLANKS);
        // Saccharine planks
        regularBlockOnly(SACCHARINE_PLANKS, () -> CobblemonBlocks.SACCHARINE_PLANKS);
        // Tumblestone
        regularBlockOnly(TUMBLESTONE, () -> CobblemonBlocks.CHISELED_POLISHED_TUMBLESTONE);
        regularSet(TUMBLESTONE, () -> CobblemonBlocks.SMOOTH_TUMBLESTONE, () -> CobblemonBlocks.SMOOTH_TUMBLESTONE_STAIRS, () -> CobblemonBlocks.SMOOTH_TUMBLESTONE_SLAB);
        // Sky tumblestone
        regularBlockOnly(SKY_TUMBLESTONE, () -> CobblemonBlocks.CHISELED_POLISHED_SKY_TUMBLESTONE);
        regularSet(SKY_TUMBLESTONE, () -> CobblemonBlocks.SMOOTH_SKY_TUMBLESTONE, () -> CobblemonBlocks.SMOOTH_SKY_TUMBLESTONE_STAIRS, () -> CobblemonBlocks.SMOOTH_SKY_TUMBLESTONE_SLAB);
        // Black tumblestone
        regularBlockOnly(BLACK_TUMBLESTONE, () -> CobblemonBlocks.CHISELED_POLISHED_BLACK_TUMBLESTONE);
        regularSet(BLACK_TUMBLESTONE, () -> CobblemonBlocks.SMOOTH_BLACK_TUMBLESTONE, () -> CobblemonBlocks.SMOOTH_BLACK_TUMBLESTONE_STAIRS, () -> CobblemonBlocks.SMOOTH_BLACK_TUMBLESTONE_SLAB);
    }

    private static void regularBlockOnly(ResourceLocation recipe, Supplier<ItemLike> block){
        REGISTRATION.chiselingEntry(recipe, entry -> entry.regularBlock(block.get()));
    }

    private static void regularSet(ResourceLocation recipe, Supplier<ItemLike> block, Supplier<ItemLike> stairs, Supplier<ItemLike> slab){
        REGISTRATION.chiselingEntry(recipe, entry -> {
            entry.regularBlock(block.get());
            entry.regularStairs(stairs.get());
            entry.regularSlab(slab.get());
        });
    }
}
