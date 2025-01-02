package com.mono.moptimism.features;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class Culling {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MoptimismConfig config = AutoConfig.getConfigHolder(MoptimismConfig.class).getConfig();
            if (config.enableCulling) {
                // Apply culling optimizations
                applySettings(client);
            }
        });
        System.out.println("Culling feature registered!");
    }

    public static void applySettings(MinecraftClient client) {
        // Example: Apply culling optimization logic
        client.options.viewDistance = 8;  // Lower view distance as an example
    }
}
