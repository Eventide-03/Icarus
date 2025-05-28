package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
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
                    Text("Fiscally sponsored by Hack Club, a 501(c)(3) nonprofit")
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
                            attr("href", "https://hcb.hackclub.com/m-a-a-d-bots-rival-team/donations")
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
                            attr("href", "https://www.instagram.com/m.a.a.dbots/")
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
                            attr("href", "https://github.com/Eventide-03/Icarus")
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
                FooterColumn(
                    title = "Team",
                    items =
                        listOf(
                            "Financials" to
                                "https://hcb.hackclub.com/m-a-a-d-bots-rival-team/transactions?action=ledger&controller=events&event_id=m-a-a-d-bots-rival-team",
                            "Donate" to "https://hcb.hackclub.com/donations/start/m-a-a-d-bots-rival-team",
                            "Join us" to "#", // Placeholder link
                            "Sponsors" to "#sponsors", // Updated to link to sponsors section specifically
                        ),
                )
                FooterColumn(
                    title = "Competition",
                    items =
                        listOf(
                            "RIVAL Robotics" to "https://rivalrobotics.co/",
                            "Events" to "https://lu.ma/RIVAL",
                            "Rules" to "https://rivalrobotics.notion.site/doomsday",
                            "YouTube" to "https://www.youtube.com/@rival_robotics",
                        ),
                )
            }

            // Right Section - Replace with Quote
            Column(
                modifier =
                    Modifier.styleModifier {
                        padding(8.px)
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                        justifyContent(JustifyContent.Center)
                        alignItems(AlignItems.Center)
                        textAlign("center")
                    },
            ) {
                Div(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(24.px)
                            fontWeight(400)
                            fontStyle("italic")
                            marginTop(16.px)
                            marginBottom(8.px)
                            maxWidth(300.px)
                        }
                    },
                ) {
                    Text("\"Even a small lighter can burn a bridge.\"")
                }
                Div(
                    attrs = {
                        style {
                            color(Color("#8C97A7"))
                            fontSize(16.px)
                        }
                    },
                ) {
                    Text("- Kendrick Lamar")
                }
            }
        }
    }
}

@Composable
fun FooterColumn(
    title: String,
    items: List<Pair<String, String>>, // Changed from List<String> to List<Pair<String, String>> for (text, url)
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
        items.forEach { (text, url) ->
            A(
                attrs = {
                    attr("href", url)
                    style {
                        color(Color("#8C97A7"))
                        fontSize(14.px)
                        marginBottom(8.px)
                        display(DisplayStyle.Block)
                        textDecoration("none")
                    }
                    // Add hover styles
                    attr("onmouseover", "this.style.textDecoration='underline';")
                    attr("onmouseout", "this.style.textDecoration='none';")
                },
            ) {
                Text(text)
            }
        }
    }
}
