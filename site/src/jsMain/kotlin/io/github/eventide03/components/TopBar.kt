package io.github.eventide03.components

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
                .height(84.px)
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
                    .padding(leftRight = 20.px)
                    .styleModifier {
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.Start)
                    },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            // Logo and Text
            Row(
                modifier =
                    Modifier.styleModifier {
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.Start)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.px),
            ) {
                Link(
                    path = "#home",
                    modifier =
                        Modifier.styleModifier {
                            display(DisplayStyle.Flex)
                            alignItems(AlignItems.Center)
                        },
                ) {
                    Img(
                        src = "https://home.maadbots.org/assets/teamlogo.png",
                        attrs = {
                            attr("alt", "Logo")
                            classes("top-bar-logo")
                            style {
                                height(40.px)
                                marginLeft(50.px)
                            }
                        },
                    )
                }
                P(
                    attrs = {
                        style {
                            color(Color("#D20041"))
                            fontSize(24.px)
                            fontWeight(700)
                            lineHeight(24.px)
                            whiteSpace("nowrap")
                            marginRight(100.px)
                        }
                    },
                ) {
                    Text(
                        "M.A.A.D Bots",
                    )
                }
            }
            // Navigation Links
            Row(
                modifier =
                    Modifier.styleModifier {
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.Start)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(50.px), // This controls gap between nav items
            ) {
                val navItems =
                    mapOf(
                        "Home" to "#home",
                        "RIVAL" to "#rival",
                        "Proposal" to "#proposal",
                        "Mission" to "#mission",
                        "Team" to "#team",
                        "Sponsors" to "#sponsors",
                        "Branding" to "#branding",
                    )

                navItems.forEach { (item, anchor) ->
                    Link(
                        path = anchor,
                        text = item,
                        modifier =
                            Modifier.styleModifier {
                                color(Color("#F5E5CC"))
                                fontSize(17.px)
                                fontWeight(500)
                                lineHeight(24.px)
                            },
                    )
                }
                Row(
                    modifier = Modifier.styleModifier { gap(20.px) },
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Link(
                        path = "https://linktr.ee/MAADBots",
                        text = "Contact",
                        modifier =
                            Modifier.styleModifier {
                                color(Color("#D20041"))
                                marginLeft(50.px)
                                fontSize(16.px)
                                fontWeight(500)
                                lineHeight(20.px)
                                padding(10.px, 20.px)
                                borderRadius(6.px)
                                textAlign("center")
                                property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
                                backgroundColor(Color("#132034"))
                            },
                    )
                    Link(
                        path = "https://hcb.hackclub.com/maadbots/donations",
                        text = "Contribute",
                        modifier =
                            Modifier.styleModifier {
                                color(Color("#FFF"))
                                fontSize(16.px)
                                fontWeight(500)
                                lineHeight(24.px)
                                padding(10.px, 25.px)
                                borderRadius(6.px)
                                backgroundColor(Color("#D20041"))
                                property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
                            },
                    )
                }
            }
        }
    }
}
