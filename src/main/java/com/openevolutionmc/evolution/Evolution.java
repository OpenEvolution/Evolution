package com.openevolutionmc.evolution;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Evolution {
	public static final String MOD_ID = "evolution";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// Add client and server initialization logic here
	protected void initializeEvolution() {
		LOGGER.info("Hello Fabric world!");
	}
}
