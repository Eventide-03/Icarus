package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Team() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#132034"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                    alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                    padding(80.px, 96.px)
                },
    ) {
        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .styleModifier {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                        alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                        gap(40.px)
                    },
        ) {
            // Meet the m.a.a.d Lads Section
            Column(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .styleModifier {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                            alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                            gap(24.px)
                        },
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(36.px)
                            fontWeight(600)
                        }
                    },
                ) {
                    Text("Meet the m.a.a.d Lads")
                }

                Row(
                    modifier =
                        Modifier.styleModifier {
                            gap(60.px)
                        },
                ) {
                    TeamStat("000", "Members")
                    // Placeholder for Members Icon
                    Div(
                        attrs = {
                            style {
                                width(32.px)
                                height(32.px)
                                backgroundColor(Color("#D20041"))
                                borderRadius(50.percent)
                            }
                        },
                    ) {}
                    // Placeholder for Mentors Icon
                    Div(
                        attrs = {
                            style {
                                width(32.px)
                                height(32.px)
                                backgroundColor(Color("#D20041"))
                                borderRadius(50.percent)
                            }
                        },
                    ) {}
                    TeamStat("000", "Mentors")
                }

                Link(
                    path = "#",
                    text = "See More",
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

            // Meet the rest of the team Grid Section
            Column(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .styleModifier {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                            alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                            gap(32.px)
                        },
            ) {
                Row(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .styleModifier {
                                display(DisplayStyle.Flex)
                                justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                                gap(24.px)
                            },
                ) {
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/RishiDown.png", "Rishi Mishra")
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/sourish.png", "Sourish Mehta")
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/madTesting.png", "placeholder")
                }
                Link(
                    path = "#",
                    modifier =
                        Modifier
                            .styleModifier {
                                display(DisplayStyle.Flex)
                                alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                                gap(8.px)
                                color(Color("#FFFFFF"))
                                fontSize(20.px)
                                fontWeight(500)
                                cursor("pointer")
                            }.classNames("top-bar-action"),
                ) {
                    Text("Meet the rest of the team")
                    Div(
                        attrs = {
                            style {
                                color(Color("#FFFFFF"))
                                fontSize(20.px)
                                marginLeft(4.px)
                            }
                        },
                    ) { Text("→") }
                }
            }
        }
    }
}

@Composable
fun TeamStat(
    value: String,
    label: String,
) {
    Column(
        modifier =
            Modifier.styleModifier {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
            },
    ) {
        Div(
            attrs = {
                style {
                    color(Color("#D20041"))
                    fontSize(24.px)
                    fontWeight(600)
                }
            },
        ) {
            Text(value)
        }
        Div(
            attrs = {
                style {
                    color(Color("#FFFFFF"))
                    fontSize(16.px)
                }
            },
        ) {
            Text(label)
        }
    }
}

@Composable
fun TeamMemberCard(
    imageUrl: String,
    name: String,
) {
    Column(
        modifier =
            Modifier.styleModifier {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                gap(8.px)
            },
    ) {
        Img(
            src = imageUrl,
            attrs = {
                attr("alt", "Team Member")
                style {
                    width(300.px)
                    height(200.px)
                    borderRadius(8.px)
                    objectFit(ObjectFit.Cover)
                }
            },
        )
        if (name.isNotEmpty()) {
            Div(
                attrs = {
                    style {
                        color(Color("#D20041"))
                        fontSize(18.px)
                        fontWeight(500)
                        textAlign("center")
                    }
                },
            ) {
                Text(name)
            }
        }
    }
}
