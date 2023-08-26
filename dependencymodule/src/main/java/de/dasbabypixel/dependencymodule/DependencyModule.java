package de.dasbabypixel.dependencymodule;

import dev.derklaro.aerogel.Singleton;
import eu.cloudnetservice.driver.module.ModuleLifeCycle;
import eu.cloudnetservice.driver.module.ModuleTask;
import eu.cloudnetservice.driver.module.driver.DriverModule;

@Singleton
public class DependencyModule extends DriverModule {
    @ModuleTask(lifecycle = ModuleLifeCycle.STARTED)
    public void start(TestApiClass api) {
        api.printSuccess(getClass());
    }
}
