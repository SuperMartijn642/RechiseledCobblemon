package com.supermartijn642.rechiseled.cobblemon;

import com.supermartijn642.core.item.CreativeItemGroup;
import com.supermartijn642.core.registry.GeneratorRegistrationHandler;
import com.supermartijn642.rechiseled.api.registration.RechiseledRegistration;
import com.supermartijn642.rechiseled.cobblemon.generators.RechiseledCobblemonTextureProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

/**
 * Created 18/03/2026 by SuperMartijn642
 */
@Mod(RechiseledCobblemon.MODID)
public class RechiseledCobblemon {

    public static final String MODID = "rechiseledcobblemon";

    public static ResourceLocation identifier(String path){
        return new ResourceLocation(MODID, path);
    }

    public static final RechiseledRegistration REGISTRATION = RechiseledRegistration.get(MODID);
    @SuppressWarnings("Convert2MethodRef")
    public static final CreativeItemGroup GROUP = (CreativeItemGroup)REGISTRATION.itemGroup(() -> RechiseledCobblemonBlocks.SKY_TUMBLESTONE_CHISELED_PILLAR.getRegularBlock(), "Rechiseled: Cobblemon");

    public RechiseledCobblemon(){
        // Make sure the blocks get loaded
        RechiseledCobblemonBlocks.init();
        RechiseledCobblemonRecipes.init();

        // Register data providers for generating all the json files
        GeneratorRegistrationHandler handler = GeneratorRegistrationHandler.get(RechiseledCobblemon.MODID);
        handler.addProvider(((dataGenerator, existingFileHelper) -> new RechiseledCobblemonTextureProvider(MODID, dataGenerator, existingFileHelper)));
        REGISTRATION.registerDataProviders();
    }
}
