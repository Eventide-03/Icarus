package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Proposal() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#132034"))
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
                            marginBottom(20.px)
                        }
                    },
                ) {
                    Text("Our Proposal")
                }

                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(24.px)
                            fontWeight(500)
                            marginBottom(16.px)
                            marginTop(16.px)
                        }
                    },
                ) {
                    Text("Robot CAD Design")
                }

                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                        }
                    },
                ) {
                    Text(
                        "Our robot design features a modular chassis with a low center of gravity for enhanced stability during high-speed maneuvers. The primary collection mechanism utilizes a dual-intake system with compliant wheels to efficiently gather and secure game elements. For scoring, we've implemented a telescoping arm with a 270-degree range of motion, capable of precise placement at various heights. The drivetrain employs mecanum wheels for omnidirectional movement, allowing for strategic positioning without complex turning sequences. All systems are powered by high-efficiency brushless motors and controlled by our custom software that includes autonomous pathfinding algorithms and driver-assist features. This design maximizes our scoring potential while maintaining the adaptability needed to respond to changing match conditions and alliance strategies.",
                    )
                }
            }
        }
    }
}
