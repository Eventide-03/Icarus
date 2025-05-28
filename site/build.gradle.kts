import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
}

group = "io.github.eventide03"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("The official website for MAAD Bots, a robotics team based in the Southern California.")
        }
    }
}

kotlin {
    configAsKobwebApplication("maadbots")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.bundles.compose)
            implementation(libs.bundles.kobweb)
            implementation(libs.bundles.silk.icons)
        }
    }
}
