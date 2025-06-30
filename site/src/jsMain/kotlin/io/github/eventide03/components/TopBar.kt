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
                    .styleModifier {
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.SpaceBetween)
                        property("max-width", "95%")
                        property("padding", "0 2.5% 0 2.5%") // Updated to 2.5%
                        property("margin-left", "auto")
                        property("margin-right", "auto")
                    },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween, // Back to SpaceBetween
        ) {
            // Left: Logo and Nav
            Row(
                modifier =
                    Modifier.styleModifier {
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        property("gap", "7%") // ~3% gap between logo and first nav item
                        property("flex-grow", "1") // Take available space
                    },
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Logo and Text
                Row(
                    modifier =
                        Modifier.styleModifier {
                            display(DisplayStyle.Flex)
                            alignItems(AlignItems.Center)
                            property("flex-basis", "12%") // Logo area is ~12% of width
                        },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.px),
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
                                    marginLeft(0.px)
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
                                marginRight(0.px)
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
                            property("gap", "4%") // 2.5% gap between each nav item
                            property("margin-right", "5%") // 5% gap before the Contact button
                            property("flex-grow", "1") // Take remaining space
                        },
                    verticalAlignment = Alignment.CenterVertically,
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
                                    padding(5.px) // Add some padding to increase click area
                                },
                        )
                    }
                }
            }
            // Right: Contact & Contribute Buttons
            Row(
                modifier =
                    Modifier.styleModifier {
                        property("gap", "5%") // 2% gap between Contact and Contribute
                        property("flex-basis", "13%") // Buttons take ~13% of width
                    },
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Link(
                    path = "https://linktr.ee/MAADBots",
                    text = "Contact",
                    modifier =
                        Modifier.styleModifier {
                            color(Color("#D20041"))
                            fontSize(16.px)
                            fontWeight(500)
                            lineHeight(20.px)
                            property("padding", "8px 18px")
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
                            property("padding", "8px 22px")
                            borderRadius(6.px)
                            backgroundColor(Color("#D20041"))
                            property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
                        },
                )
            }
        }
    }
}
