package com.mono.moptimism;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import com.mono.moptimism.features.FeatureRegistry;
import com.mono.moptimism.features.MaximumPowerMode;
import com.mono.moptimism.features.ResourceReduction;
import com.mono.moptimism.features.Culling;
import com.mono.moptimism.features.LightOptimization;
import com.mono.moptimism.features.MoptimismConfig;
import net.minecraft.client.MinecraftClient;
import me.shedaniel.autoconfig.AutoConfig;

public class Main implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("mOPTIMISM Mod Initialized!");
        MoptimismConfig config = AutoConfig.getConfigHolder(MoptimismConfig.class).getConfig();
        config.applySettings(MinecraftClient.getInstance());
        FeatureRegistry.initialize();
        MaximumPowerMode.register();
        ResourceReduction.register();
        Culling.register();
        LightOptimization.register();
        System.out.println("mOPTIMISM Mod Initialized!");
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            System.out.println("mOPTIMISM: Optimizing server performance...");
        });
    }
}
