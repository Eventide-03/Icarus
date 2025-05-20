package io.github.rishthewizard.components

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
                        // Added styleModifier here for consistency
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.SpaceBetween)
                    },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween, // Consider removing this as styleModifer handles this
        ) {
            // Logo and Text
            Row(
                modifier =
                    Modifier.styleModifier {
                        // Added styleModifier to the Row
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.Start) // Aligned items to the start
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.px), // Removed spacedBy as styleModifer handles this
            ) {
                Img(
                    src = "https://rishthewizard.github.io/Icarus/assets/madTesting.png",
                    attrs = {
                        attr("alt", "Logo")
                        classes("top-bar-logo")
                        style {
                            height(40.px)
                            marginLeft(90.px)
                        }
                    },
                )
                P(
                    attrs = {
                        style {
                            color(Color("#D20041"))
                            fontSize(24.px)
                            fontWeight(700)
                            lineHeight(24.px)
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
                        marginLeft(90.px)
                        marginRight(100.px)
                        display(DisplayStyle.Flex)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.Start)
                        gap(50.px)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(40.px), // Removed spacedBy as styleModifer handles this
            ) {
                val navItems = listOf("Home", "RIVAL", "Proposal", "Mission", "Team", "Branding")
                navItems.forEach { item ->
                    Link(
                        path = "#",
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
            }
            // "Contact" Button
            A(href = "#", attrs = {
                classes("top-bar-text", "top-bar-action")
                style {
                    color(Color("#D20041"))
                    marginRight(15.px)
                    fontSize(16.px)
                    fontWeight(500)
                    lineHeight(20.px)
                    padding(10.px, 20.px)
                    borderRadius(6.px)
                    textAlign("center")
                    property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
                    backgroundColor(Color("#132034"))
                }
            }) {
                Text("Contact")
            }

            // "Contribute" Button
            A(href = "#", attrs = {
                classes("top-bar-button", "top-bar-action")
                style {
                    marginRight(90.px)
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    color(Color("#F5E5CC"))
                    fontSize(16.px)
                    fontWeight(500)
                    lineHeight(24.px)
                    padding(10.px, 20.px)
                    borderRadius(6.px)
                    backgroundColor(Color("#D20041"))
                    property("font-feature-settings", "'salt' on, 'liga' off, 'clig' off")
                }
            }) {
                Text("Contribute")
            }
        }
    }
}
// TODO: Make clicking logo take to home page
