package de.dasbabypixel.cyclicmodule;

import dev.derklaro.aerogel.Singleton;
import eu.cloudnetservice.driver.module.ModuleLifeCycle;
import eu.cloudnetservice.driver.module.ModuleTask;
import eu.cloudnetservice.driver.module.driver.DriverModule;

import java.util.logging.Logger;

@Singleton
public class CyclicModule extends DriverModule {
    @ModuleTask(lifecycle = ModuleLifeCycle.STARTED)
    public void start() {
        Logger.getLogger("CyclicModule").info("Loaded cyclic module");
    }
}
