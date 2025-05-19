package io.github.rishthewizard.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun RIVAL() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#1A1423"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    padding(40.px, 96.px)
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
                            marginBottom(20.px)
                        }
                    },
                ) {
                    Text("What is RIVAL?")
                }
                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            marginBottom(4.px)
                        }
                    },
                ) {
                    Text(
                        "RIVAL is a relatively new robotics competition similar to FRC and FTC. The competition focuses on the design and construction of a robot that can compete in a yearly challenge, this year, the theme is \"DOOMSDAY\". The competition allows the construction of robotics with minimal design contraints, allowing participation from beginners to advanced robotics enthusiasts.",
                    )
                }
                Span(
                    attrs = {
                        style {
                            display(DisplayStyle.Block)
                            marginTop(0.px)
                        }
                    },
                ) {
                    A(
                        attrs = {
                            attr("href", "https://rivalrobotics.co/")
                            style {
                                color(Color("#F5E5CC"))
                                fontSize(16.px)
                                lineHeight(24.px)
                                textDecoration("underline")
                            }
                        },
                    ) {
                        Text("https://rivalrobotics.co/")
                    }
                }
            }

            Div({
                style {
                    width(1750.px)
                    height(270.px)
                    borderRadius(8.px)
                    overflow("hidden") // Ensure the video respects the border radius
                }
            }) {
                Iframe({
                    attr("src", "https://www.youtube.com/embed/5qHXHqN3Qpw")
                    attr("title", "RIVAL Robotics DOOMSDAY YouTube video")
                    attr("frameborder", "0")
                    attr("allow", "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share")
                    attr("allowfullscreen", "true")
                    style {
                        width(100.percent)
                        height(100.percent)
                    }
                })
            }
        }
    }
}
