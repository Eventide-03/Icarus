package xyz.malefic.singlepage.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun MissionSection() {
    Div(attrs = {
        style {
            width(100.percent)
            height(300.px)
            backgroundColor(Color("#252f41"))
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
        }
    }) {
        // Placeholder for Mission section content
        H2(attrs = {
            style {
                color(Color("#F5E5CC"))
                fontSize(32.px)
            }
        }) {
            Text("Mission Section - Coming Soon")
        }
    }
}