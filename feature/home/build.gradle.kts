plugins {
    id("test.android.library")
}

android {
    namespace = "com.snetmason.test.feature.home"
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.core.common)
}
