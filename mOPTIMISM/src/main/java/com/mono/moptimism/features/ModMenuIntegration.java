package com.mono.moptimism.features;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import me.shedaniel.api.config.AutoConfig;

public class ModMenuIntegration implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register the configuration for mod menu
        AutoConfig.register(MoptimismConfig.class, GsonConfigSerializer::new);
        System.out.println("mOPTIMISM settings registered with Mod Menu.");
    }
}
