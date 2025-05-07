import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    kotlin("plugin.serialization") version libs.versions.kotlin.get()
    id("org.jetbrains.kotlin.plugin.compose") version libs.versions.kotlin.get()
}

group = "xyz.malefic.singlepage"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")
        }
    }
}

kotlin {
    configAsKobwebApplication("singlepage")

    // Force consistent kotlinx-serialization version
    configurations.all {
        resolutionStrategy {
            force("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
            force("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
        }
    }

    sourceSets {
        jsMain.dependencies {
            implementation(libs.bundles.compose)
            implementation(libs.bundles.kobweb)
            implementation(libs.bundles.silk.icons)
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
        }
    }
}
