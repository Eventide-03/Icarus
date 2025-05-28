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
                        "We are a completely student run organization, based in Southern California, and currently lead by our founder, Rishi Mishra (also the one writing this paragraph). Through our experiences, we understand that robotics is difficult, mainly due to lack of accessibility to training, and resources. Our mission is to inspire an interest in innovation to a wide audience of high schoolers, and to show our members the limitless possibilities of robotics, literally anything can be automated, all it takes is the resources and knowledge. Many of our members have taken a part in robotics competitions such as FRC, FTC, and VEX, we aim to take those skills to the next level, training students in the design and creation of completely custom robots, not limited by average competition standards. We build robots as a team. We excessively emphasize teamwork, and learning together, shared knowledge is a necessity in creating a sustainable team.",
                    )
                }
            }

            Img(
                src = "https://eventide-03.github.io/Icarus/assets/selfie.png",
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
