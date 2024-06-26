// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
        classpath ("com.google.gms:google-services:4.3.13")

        var nav_version = "2.5.0"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ("androidx.navigation.safeargs") version "2.4.2" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    id ("com.google.gms.google-services") version "4.3.14" apply false
}