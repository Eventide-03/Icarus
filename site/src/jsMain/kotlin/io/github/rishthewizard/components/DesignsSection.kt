package io.github.rishthewizard.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun DesignsSection() {
    Div(attrs = {
        style {
            width(100.percent)
            height(300.px)
            backgroundColor(Color("#132034"))
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
        }
    }) {
        // Placeholder for Designs section content
        H2(attrs = {
            style {
                color(Color("#F5E5CC"))
                fontSize(32.px)
            }
        }) {
            Text("Designs Section - Coming Soon")
        }
    }
}
