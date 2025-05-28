package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.scrollMarginTop
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Branding() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#1A1423"))
                .id("branding")
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
            Img(
                src = "https://eventide-03.github.io/Icarus/assets/madTesting.png",
                attrs = {
                    attr("alt", "Team Image")
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
                            color(Color("#D20041"))
                            fontSize(36.px)
                            fontWeight(600)
                            marginBottom(15.px)
                        }
                    },
                ) {
                    Text("Branding and Inspiration")
                }
                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            marginBottom(20.px)
                            marginTop(0.px)
                        }
                    },
                ) {
                    Text(
                        "Our team's identity is inspired by the 2012 Hip Hop album \"Good Kid, M.A.A.D City\", by Kendrick Lamar. The album itself represents change and evolution containing themes of spreading positivity in a world that can be negative at times. Our primary colors are Cardinal (#D20041) and navy blue (#132034), colors that the team collectively decided would theme well with our vibe. For accents, we use dark purple (#1A1423), and Champagne (#F5E5CC) for paragraphical text. Our logo uses these colors as well, made specifially to appear well, while maintaining a professional presence. This branding extends across our robot, future merchendise, pit display, and communications, creating a cohesive and memorable identity in competition.",
                    )
                }
                Link(
                    path = "https://coolors.co/palette/1a1423-372549-86bbd8-f5e5cc-d20041",
                    text = "Color Palette",
                    modifier =
                        Modifier
                            .styleModifier {
                                display(DisplayStyle.InlineBlock)
                                backgroundColor(Color("#D20041"))
                                color(Color("#FFFFFF"))
                                padding(12.px, 24.px)
                                borderRadius(8.px)
                                fontSize(16.px)
                                fontWeight(500)
                                textAlign("center")
                                cursor("pointer")
                            }.classNames("top-bar-action"),
                )
            }
        }
    }
}
