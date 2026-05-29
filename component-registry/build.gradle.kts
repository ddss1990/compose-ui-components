import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidMultiplatformLibrary)
}

kotlin {
    androidLibrary {
        namespace = "com.composelib.catalog"
        compileSdk = 34
        minSdk = 24
    }
    jvm()
    js {
        browser()
    }
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }
    jvmToolchain(17)

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}
