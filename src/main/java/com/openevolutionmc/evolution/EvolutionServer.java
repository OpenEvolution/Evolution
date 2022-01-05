package com.openevolutionmc.evolution;

import net.fabricmc.api.DedicatedServerModInitializer;

public class EvolutionServer extends Evolution implements DedicatedServerModInitializer {
    // Add server-specific initialization logic here
    @Override
    public void onInitializeServer() {
        initializeEvolution();
    }
}
