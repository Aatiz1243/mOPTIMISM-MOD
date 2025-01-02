package com.mono.moptimism.features;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.LiteralText;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.api.config.ConfigData;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.world.GameRules;

public class SystemUtilization implements ClientModInitializer {

    public static double getCPUUsage() {
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        return osBean.getSystemCpuLoad() * 100; // Returns CPU usage as a percentage
    }

    public static String getGPUUsage() {
        return "GPU usage monitoring is not implemented yet.";
    }

    public static void displayUsage(MinecraftClient client, boolean showGpu, boolean showCpu) {
        if (showCpu) {
            double cpuUsage = getCPUUsage();
            client.player.sendMessage(new LiteralText("CPU Usage: " + String.format("%.2f", cpuUsage) + "%"), false);
        }
        if (showGpu) {
            String gpuUsage = getGPUUsage();
            client.player.sendMessage(new LiteralText("GPU Usage: " + gpuUsage), false);
        }
    }

    @Override
    public void onInitializeClient() {
    }
}
