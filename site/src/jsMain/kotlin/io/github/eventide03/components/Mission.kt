package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.scrollMarginTop
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Mission() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#1A1423"))
                .id("mission")
                .styleModifier {
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    padding(40.px, 96.px)
                    scrollMarginTop(84.px)
                },
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .styleModifier {
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.SpaceBetween)
                        gap(40.px)
                    },
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier.weight(1f),
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#D20041"))
                            fontSize(36.px)
                            fontWeight(600)
                            marginBottom(15.px)
                        }
                    },
                ) {
                    Text("Our Mission")
                }
                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            marginTop(0.px)
                            fontSize(16.px)
                            lineHeight(24.px)
                        }
                    },
                ) {
                    Text(
                        "Our mission is to inspire and empower the next generation of innovators through robotics. We strive to create cutting-edge robotic solutions that push the boundaries of what's possible while fostering a collaborative environment where creativity, technical excellence, and strategic thinking flourish. Through dedication, teamwork, and continuous learning, we aim to develop not just competitive robots, but also the skills and character that will prepare team members for future challenges in STEM fields and beyond.",
                    )
                }
            }

            Img(
                src = "https://eventide-03.github.io/Icarus/assets/Selfie.png",
                attrs = {
                    attr("alt", "Mission Image")
                    style {
                        maxWidth(400.px)
                        property("height", "auto")
                        borderRadius(8.px)
                    }
                },
            )
        }
    }
}
