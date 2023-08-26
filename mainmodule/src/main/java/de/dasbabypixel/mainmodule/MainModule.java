package de.dasbabypixel.mainmodule;

import de.dasbabypixel.dependencymodule.TestApiClass;
import dev.derklaro.aerogel.Singleton;
import eu.cloudnetservice.driver.module.ModuleLifeCycle;
import eu.cloudnetservice.driver.module.ModuleTask;
import eu.cloudnetservice.driver.module.driver.DriverModule;

@Singleton
public class MainModule extends DriverModule {
    @ModuleTask(lifecycle = ModuleLifeCycle.STARTED)
    public void start(TestApiClass api) {
        api.printSuccess(getClass());
    }
}
