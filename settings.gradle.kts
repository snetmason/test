pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Test"

// Convention plugins (test.android.application, test.android.library, test.jvm.library)
includeBuild("build-logic")

// Type-safe project accessors: projects.app, projects.core.ui, ...
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
include(":core:common")
include(":core:ui")
include(":feature:home")
