package xyz.malefic.singlepage.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun TopBar() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .height(9.33.percent)
                .backgroundColor(Color("#252f41"))
                .boxShadow(offsetX = 0.px, offsetY = 4.px, blurRadius = 3.px, spreadRadius = 1.px, color = rgba(0, 0, 0, 0.10))
                .position(Position.Fixed)
                .zIndex(1000)
                .top(0.px)
                .left(0.px)
                .right(0.px),
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .gap(40.px)
                    .padding(leftRight = 20.px),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Img(src = "https://rishthewizard.github.io/Icarus/assets/madTesting.png", attrs = {
                attr("alt", "Logo")
                classes("top-bar-logo")
                style {
                    height(60.px)
                    backgroundColor(Color("#2a0505"))
                }
            })

            listOf("Home", "RIVAL", "Team", "Mission", "Designs").forEach { item ->
                Box(
                    modifier =
                        Modifier.styleModifier {
                            padding(10.px, 20.px)
                            borderRadius(10.px)
                        },
                ) {
                    // TODO: MOVE TEXT HERE
                }
                Link(
                    "#",
                    item,
                    modifier =
                        Modifier.styleModifier {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            fontWeight("400")
                            lineHeight(24.px)
                        },
                )
            }
        }

        A(href = "#", attrs = {
            classes("top-bar-text")
            style {
                color(Color("#D20041"))
                fontSize(16.px)
                fontWeight("500")
                lineHeight(20.px)
                padding(10.px, 20.px)
                borderRadius(6.px)
                textAlign("center")
                property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
            }
        }) {
            Text("Contact")
        }

        A(href = "#", attrs = {
            classes("top-bar-button")
            style {
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)
                color(Color("#F5E5CC"))
                fontSize(16.px)
                fontWeight("500")
                lineHeight(24.px)
                padding(10.px, 20.px)
                borderRadius(6.px)
                backgroundColor(Color("#D20041"))
                property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
            }
        }) {
            Text("IN PROGRESS")
        }
    }
}
