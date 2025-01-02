package com.mono.moptimism.features;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class LightOptimization {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MoptimismConfig config = AutoConfig.getConfigHolder(MoptimismConfig.class).getConfig();
            if (config.enableLightOptimization) {
                // Apply light optimization
                applySettings(client);
            }
        });
        System.out.println("Light Optimization feature registered!");
    }

    public static void applySettings(MinecraftClient client) {
        // Example: Optimize light settings
        client.options.ao = false;  // Disable ambient occlusion
    }
}
