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
    public static final ResourceLocation SKY_TUMBLESTONE = location("sky_tumblestone");
    public static final ResourceLocation TUMBLESTONE = location("tumblestone");

    private static ResourceLocation location(String name){
        return new ResourceLocation(RechiseledCobblemon.MODID, name);
    }

    public static void init(){
        // Apricorn planks
        regularBlockOnly(APRICORN_PLANKS, () -> CobblemonBlocks.APRICORN_PLANKS);
        // Tumblestone
        regularBlockOnly(TUMBLESTONE, () -> CobblemonBlocks.TUMBLESTONE_BLOCK);
        // Sky tumblestone
        regularBlockOnly(SKY_TUMBLESTONE, () -> CobblemonBlocks.SKY_TUMBLESTONE_BLOCK);
        // Black tumblestone
        regularBlockOnly(BLACK_TUMBLESTONE, () -> CobblemonBlocks.BLACK_TUMBLESTONE_BLOCK);
    }

    private static void regularBlockOnly(ResourceLocation recipe, Supplier<ItemLike> block){
        REGISTRATION.chiselingEntry(recipe, entry -> entry.regularBlock(block.get()));
    }
}
