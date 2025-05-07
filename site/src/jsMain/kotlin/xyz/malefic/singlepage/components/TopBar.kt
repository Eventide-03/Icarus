package xyz.malefic.singlepage.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun TopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(9.33.percent)
            .backgroundColor(Color("#252f41"))
            .boxShadow(offsetX = 0.px, offsetY = 4.px, blurRadius = 3.px, spreadRadius = 1.px, color = rgba(0, 0, 0, 0.10))
            .position(Position.Fixed)
            .zIndex(1000)
            .top(0.px)
            .left(0.px)
            .right(0.px)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .gap(40.px)
                .padding(leftRight = 20.px),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Img(src = "/assets/madTesting.png", attrs = {
                attr("alt", "Logo")
                classes("top-bar-logo")
                style {
                    height(50.px)
                    width(75.px)
                }
            })

            listOf("Home", "RIVAL", "Team", "Mission", "Designs").forEach { item ->
                A(href = "#", attrs = {
                    classes("top-bar-item")
                }) {
                    Text(item)
                }
            }

            Div(attrs = {
                classes("spacer")
            })

            Div(attrs = {
                classes("spacer")
            })

            A(href = "#", attrs = {
                classes("top-bar-text")
            }) {
                Text("Contact")
            }

            A(href = "#", attrs = {
                classes("top-bar-button")
            }) {
                Text("Contribute")
            }
        }
    }
}
