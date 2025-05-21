package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Footer() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#1C293E")) // Dark purple footer background matching team's branding
                .styleModifier {
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    padding(60.px, 96.px)
                },
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .styleModifier {
                        display(DisplayStyle.Flex)
                        justifyContent(JustifyContent.SpaceBetween)
                        gap(40.px)
                    },
        ) {
            // Left Section - M.A.A.D Bots Info
            Column {
                Div(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(24.px)
                            fontWeight(600)
                            marginBottom(16.px)
                        }
                    },
                ) {
                    Text("M.A.A.D Bots")
                }
                Div(
                    attrs = {
                        style {
                            color(Color("#8C97A7"))
                            fontSize(14.px)
                            marginBottom(8.px)
                        }
                    },
                ) {
                    Text("Nonprofit 501(c)(3) legal entity under Hack Club Bank")
                }
                Div(
                    attrs = {
                        style {
                            color(Color("#8C97A7"))
                            fontSize(14.px)
                        }
                    },
                ) {
                    Text("Website created by Rishi Mishra")
                }
                Row(
                    modifier =
                        Modifier.styleModifier {
                            gap(16.px)
                            marginTop(20.px)
                        },
                ) {
                    // HCB Logo
                    A(
                        attrs = {
                            attr("href", "#")
                            attr("title", "HCB")
                            style {
                                display(DisplayStyle.Flex)
                                justifyContent(JustifyContent.Center)
                                alignItems(AlignItems.Center)
                                width(32.px)
                                height(32.px)
                                backgroundColor(Color.transparent)
                                borderRadius(10.px)
                                padding(0.px)
                            }
                        },
                    ) {
                        Img(
                            src = "https://assets.hackclub.com/hcb-dark.svg",
                            attrs = {
                                attr("alt", "Hack Club Bank")
                                style {
                                    width(28.px)
                                    height(28.px)
                                    display(DisplayStyle.Block)
                                }
                            },
                        )
                    }

                    // Instagram Logo
                    A(
                        attrs = {
                            attr("href", "#")
                            attr("title", "Instagram")
                            style {
                                display(DisplayStyle.Flex)
                                justifyContent(JustifyContent.Center)
                                alignItems(AlignItems.Center)
                                width(32.px)
                                height(32.px)
                                backgroundColor(Color("#132034"))
                                borderRadius(10.px)
                                color(Color("#FFFFFF"))
                                fontSize(14.px)
                                fontWeight(700)
                                textDecoration("none")
                            }
                        },
                    ) {
                        Img(
                            src = "https://icons.hackclub.com/api/icons/red/instagram",
                            attrs = {
                                attr("alt", "Instagram")
                                style {
                                    width(28.px)
                                    height(28.px)
                                    display(DisplayStyle.Block)
                                }
                            },
                        )
                    }
                    A(
                        attrs = {
                            attr("href", "#")
                            attr("title", "GitHub")
                            style {
                                display(DisplayStyle.Flex)
                                justifyContent(JustifyContent.Center)
                                alignItems(AlignItems.Center)
                                width(30.px)
                                height(30.px)
                                backgroundColor(Color("#1A1423"))
                                borderRadius(10.px)
                                color(Color("#6e7681")) // GitHub grey
                                fontSize(14.px)
                                fontWeight(700)
                                textDecoration("none")
                            }
                        },
                    ) {
                        Img(
                            src = "https://icons.hackclub.com/api/icons/grey/github",
                            attrs = {
                                attr("alt", "GitHub")
                                style {
                                    width(30.px)
                                    height(30.px)
                                    display(DisplayStyle.Block)
                                }
                            },
                        )
                    }
                }
            }

            // Middle Sections - Team & Competition
            Row(
                modifier =
                    Modifier.styleModifier {
                        gap(80.px)
                    },
            ) {
                FooterColumn(title = "Team", items = listOf("About us", "Members", "Mentors", "Join us", "Sponsors"))
                FooterColumn(title = "Competition", items = listOf("RIVAL Robotics", "Events", "Resources", "Rules", "YouTube"))
            }

            // Right Section - Join our robotics newsletter
            Column {
                Div(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(16.px)
                            fontWeight(600)
                            marginBottom(0.px)
                        }
                    },
                ) {
                    Text("Join our robotics newsletter")
                }
                P(
                    attrs = {
                        style {
                            color(Color("#8C97A7"))
                            fontSize(14.px)
                            marginBottom(12.px)
                        }
                    },
                ) {
                    Text("Get updates on team events, competitions, and our progress.")
                }
                Row(
                    modifier =
                        Modifier.styleModifier {
                            gap(8.px)
                            alignItems(AlignItems.Center)
                        },
                ) {
                    // Replace Input with Div + TextInput
                    Div(
                        attrs = {
                            style {
                                position(Position.Relative)
                            }
                        },
                    ) {
                        TextInput(
                            attrs = {
                                attr("placeholder", "Your email address")
                                style {
                                    padding(10.px, 16.px)
                                    borderRadius(8.px)
                                    border(1.px, LineStyle.Solid, Color("#8C97A7"))
                                    backgroundColor(Color.transparent)
                                    color(Color("#FFFFFF"))
                                    fontSize(14.px)
                                }
                            },
                        )
                    }
                    Link(
                        path = "#",
                        text = "Subscribe",
                        modifier =
                            Modifier
                                .styleModifier {
                                    display(DisplayStyle.InlineBlock)
                                    backgroundColor(Color("#D20041"))
                                    color(Color("#FFFFFF"))
                                    padding(10.px, 16.px)
                                    borderRadius(8.px)
                                    fontSize(14.px)
                                    border(0.px)
                                    cursor("pointer")
                                }.classNames("top-bar-action"),
                    )
                }
            }
        }
    }
}

@Composable
fun FooterColumn(
    title: String,
    items: List<String>,
) {
    Column {
        Div(
            attrs = {
                style {
                    color(Color("#FFFFFF"))
                    fontSize(16.px)
                    fontWeight(600)
                    marginBottom(12.px)
                }
            },
        ) {
            Text(title)
        }
        items.forEach { item ->
            Div(
                attrs = {
                    style {
                        color(Color("#8C97A7"))
                        fontSize(14.px)
                        marginBottom(8.px)
                    }
                },
            ) {
                Text(item)
            }
        }
    }
}
