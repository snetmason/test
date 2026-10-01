plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
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
