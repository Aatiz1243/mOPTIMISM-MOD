package com.mono.moptimism.features;

import net.minecraft.server.MinecraftServer;

public class GameRuleManager {
    public static void applyDefaultRules(MinecraftServer server) {
        server.getGameRules().getRule(GameRules.DO_DAYLIGHT_CYCLE).set(false, server);
        server.getGameRules().getRule(GameRules.DO_WEATHER_CYCLE).set(false, server);
        server.getGameRules().getRule(GameRules.DO_FIRE_TICK).set(false, server);
        System.out.println("Applied custom game rules for optimization.");
    }
}
