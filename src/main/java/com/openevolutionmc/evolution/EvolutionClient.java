package com.openevolutionmc.evolution;

import net.fabricmc.api.ClientModInitializer;

public class EvolutionClient extends Evolution implements ClientModInitializer {
    // Add client-specific initialization logic here
    @Override
    public void onInitializeClient() {
        initializeEvolution();
    }
}
