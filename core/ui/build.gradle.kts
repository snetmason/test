plugins {
    id("test.android.library")
}

android {
    namespace = "com.snetmason.test.core.ui"
}

dependencies {
    api(projects.core.common)
}
