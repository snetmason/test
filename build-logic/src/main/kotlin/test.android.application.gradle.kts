plugins {
    id("com.android.application")
    // NOTE: org.jetbrains.kotlin.android is NOT applied — AGP 9 has built-in
    // Kotlin support and applying it is an error.
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_25
        targetCompatibility = JavaVersion.VERSION_25
    }
    kotlin {
        jvmToolchain(25)
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    add("implementation", platform(libs.androidx.compose.bom))
    add("implementation", libs.androidx.ui)
    add("implementation", libs.androidx.ui.graphics)
    add("implementation", libs.androidx.ui.tooling.preview)
    add("implementation", libs.androidx.material3)
    add("implementation", libs.androidx.core.ktx)
}
