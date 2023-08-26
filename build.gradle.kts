subprojects {
    apply(plugin = "java-library")

    dependencies {
        add("compileOnlyApi", "eu.cloudnetservice.cloudnet:node:4.0.0-RC9")
    }

    extensions.getByType<JavaPluginExtension>().apply {
        toolchain.languageVersion = JavaLanguageVersion.of(17)
    }

    repositories {
        mavenCentral()
        maven("https://repository.derklaro.dev/releases/")
    }
}