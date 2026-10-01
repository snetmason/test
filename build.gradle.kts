// Top-level build file.
// Shared module configuration lives in build-logic convention plugins
// (test.android.application, test.android.library, test.jvm.library).
// NOTE: org.jetbrains.kotlin.android is intentionally absent — AGP 9 has
// built-in Kotlin support and applying it is an error.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
