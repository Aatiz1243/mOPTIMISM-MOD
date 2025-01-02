package com.mono.moptimism.features;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class MaximumPowerMode {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            MoptimismConfig config = AutoConfig.getConfigHolder(MoptimismConfig.class).getConfig();
            if (config.enableMaximumPowerMode) {
                // Apply the power mode optimizations
                applySettings(client);
            }
        });
        System.out.println("Maximum Power Mode feature registered!");
    }

    public static void applySettings(MinecraftClient client) {
        // Logic to apply the Maximum Power Mode
        client.options.renderDistance = 4;  // Example: Change render distance
        client.options.graphicsMode = MinecraftClient.GraphicsMode.FAST; // Example: Set graphics mode to fast
    }
}
