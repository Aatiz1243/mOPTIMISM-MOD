package com.mono.moptimism.features;

public class FeatureRegistry {
    public static void initialize() {
        ChunkOptimizer.register();
        EntityLimiter.register();
        ResourceReduction.register();
        Culling.register();
        LightOptimization.register();
        MaximumPowerMode.register();
        System.out.println("All mOPTIMISM features initialized.");
    }
}
