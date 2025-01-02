package com.mono.moptimism.features;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.minecraft.client.MinecraftClient;

@Config(name = "moptimism_settings")
public class MoptimismConfig implements ConfigData {

    // Maximum Power Mode settings
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableMaximumPowerMode = false;

    // Resource Reduction settings
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableResourceReduction = true;

    // Culling settings
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableCulling = true;

    // Light Optimization settings
    @ConfigEntry.Gui.RequiresRestart
    public boolean enableLightOptimization = true;

    @ConfigEntry.Gui.RequiresRestart
    public boolean showCpuUtilization = true;

    @ConfigEntry.Gui.RequiresRestart
    public boolean showGpuUtilization = true;

    // GPU and CPU Utilization settings
    public boolean showGpuUtilization = false;
    public boolean showCpuUtilization = false;

    // Method to apply the settings to Minecraft
    public void applySettings(MinecraftClient client) {
        // Apply Maximum Power Mode settings
    if (enableMaximumPowerMode) {
        MaximumPowerMode.applySettings(client);
    }
    // Apply Resource Reduction settings
    if (enableResourceReduction) {
        ResourceReduction.applySettings(client);
    }

    // Apply Culling settings
    if (enableCulling) {
        Culling.applySettings(client);
    }

    // Apply Light Optimization settings
    if (enableLightOptimization) {
        LightOptimization.applySettings(client);
    }

    // Display CPU and GPU utilization if toggled
    if (showCpuUtilization || showGpuUtilization) {
        SystemUtilization.displayUsage(client, showGpuUtilization, showCpuUtilization);
    }

        // Display GPU and CPU utilization if enabled
        if (showGpuUtilization || showCpuUtilization) {
            SystemUtilization.displayUsage(client, showGpuUtilization, showCpuUtilization);
        }
    }
}

