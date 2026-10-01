// Top-level build file.
// Shared module configuration lives in build-logic convention plugins
// (test.android.application, test.android.library, test.jvm.library).
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
