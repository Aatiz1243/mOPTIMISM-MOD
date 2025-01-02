package com.mono.moptimism.features;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;

public class EntityLimiter {
    public static void register() {
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (shouldLimit(entity)) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                System.out.println("Removed unnecessary entity: " + entity.getType());
            }
        });
    }

    private static boolean shouldLimit(Entity entity) {
        // Example logic: limit certain entities (e.g., item drops or mobs)
        return entity.getType().getTranslationKey().contains("zombie");
    }
}
