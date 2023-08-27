package de.dasbabypixel.dependencymodule;

import dev.derklaro.aerogel.Singleton;

import java.util.logging.Logger;

@Singleton
public class TestApiClass {
    public void printSuccess(Class<?> cls) {
        Logger.getLogger(cls.getSimpleName()).info(cls.getSimpleName() + ": TestApi Success");
    }
}
