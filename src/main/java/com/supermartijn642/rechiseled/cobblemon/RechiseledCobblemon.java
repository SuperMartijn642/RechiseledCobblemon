package com.supermartijn642.rechiseled.cobblemon;

import com.supermartijn642.core.item.CreativeItemGroup;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.rechiseled.api.registration.RechiseledRegistration;
import com.supermartijn642.rechiseled.cobblemon.generators.RechiseledCobblemonTextureProvider;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

/**
 * Created 18/03/2026 by SuperMartijn642
 */
public class RechiseledCobblemon implements ModInitializer {

    public static final String MODID = "rechiseledcobblemon";

    public static ResourceLocation identifier(String path){
        return new ResourceLocation(MODID, path);
    }

    public static final RechiseledRegistration REGISTRATION = RechiseledRegistration.get(MODID);
    @SuppressWarnings("Convert2MethodRef")
    public static final CreativeItemGroup GROUP = (CreativeItemGroup)REGISTRATION.itemGroup(() -> RechiseledCobblemonBlocks.SKY_TUMBLESTONE_CHISELED_PILLAR.getRegularBlock(), "Rechiseled: Cobblemon");

    @Override
    public void onInitialize(){
        // Make sure the blocks get loaded
        RechiseledCobblemonBlocks.init();
        RechiseledCobblemonRecipes.init();

        // Register data providers for generating all the json files
        GeneratorRegistrationHandler handler = GeneratorRegistrationHandler.get(RechiseledCobblemon.MODID);
        handler.addProvider(output -> new RechiseledCobblemonTextureProvider(MODID, output));
        REGISTRATION.registerDataProviders();
    }
}
