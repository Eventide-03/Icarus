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
fun Proposal() {
    Column(
        modifier =
            Modifier
                .id("proposal")
                .fillMaxWidth()
                .backgroundColor(Color("#132034"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
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
            Img(
                src = "https://eventide-03.github.io/Icarus/assets/madTesting.png",
                attrs = {
                    attr("alt", "Robot CAD Design")
                    style {
                        maxWidth(400.px)
                        property("height", "auto")
                        borderRadius(8.px)
                    }
                },
            )

            Column(
                modifier = Modifier.weight(1f),
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(36.px)
                            fontWeight(600)
                            marginBottom(15.px)
                        }
                    },
                ) {
                    Text("Our Proposal")
                }

                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(20.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(10.px)
                        }
                    },
                ) {
                    Text("Summary")
                }

                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            whiteSpace("pre-line")
                            marginTop(0.px)
                        }
                    },
                ) {
                    Text(
                        "Our ideal robot features a pivoting roller intake and a turret-mounted flywheel shooter guided by a vision system to aim at the targets. The intake can collect game pieces from both the floor and silo, feeding directly into the shooter for quick cycles. A horizontal pivot on the shooter allows shots from various angles with minimal movement. The efficiency of our shooting mechanism will allow for the drivetrain to be a simple four-wheel chassis, permitting resources to be prioritized towards the scoring and vision systems. Control will be split between a Raspberry Pi for general operation and an Orange Pi, dedicated to vision processing. \n This design maximizes scoring potential and adaptability, with the right sponsorship, it positions us to be highly competitive while challenging our engineering skills and strategic ability.",
                    )
                }
            }
        }

        Div(
            attrs = {
                style {
                    height(30.px) // Add space between rows
                }
            },
        )

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
                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(20.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(10.px)
                        }
                    },
                ) {
                    Text("Estimated BOM")
                }

                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            whiteSpace("pre-line")
                            marginTop(0.px)
                        }
                    },
                ) {
                    Text(
                        "We are requesting a budget of $5000 to cover the costs of materials, tools, and components needed for the robot's construction and testing. This budget will allow us to build a competitive robot that meets the requirements of the RIVAL competition.",
                    )
                }
                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(20.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(10.px)
                        }
                    },
                ) {
                    Text("CAD and Progress")
                }

                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            whiteSpace("pre-line")
                            marginTop(0.px)
                        }
                    },
                ) {
                    Text(
                        "We are requesting a budget of $5000 to cover the costs of materials, tools, and components needed for the robot's construction and testing. This budget will allow us to build a competitive robot that meets the requirements of the RIVAL competition.",
                    )
                }
            }
        }
    }
}
