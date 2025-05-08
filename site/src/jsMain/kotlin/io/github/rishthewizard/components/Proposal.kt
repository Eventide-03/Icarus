package io.github.rishthewizard.components

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
                src = "https://rishthewizard.github.io/Icarus/assets/madTesting.png",
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
                        "[Insert how our robot's features/how it will fulfill the game tasks] Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                    )
                }
            }
        }
    }
}
