package com.mono.moptimism.features;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class ResourceReduction {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MoptimismConfig config = AutoConfig.getConfigHolder(MoptimismConfig.class).getConfig();
            if (config.enableResourceReduction) {
                // Apply resource reduction optimizations
                applySettings(client);
            }
        });
        System.out.println("Resource Reduction feature registered!");
    }

    public static void applySettings(MinecraftClient client) {
        // Example: Reduce resource usage by lowering textures or disabling particles
        client.options.particles = 0;  // Disable particles
    }
}
