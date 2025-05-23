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
                .id("team")
                .styleModifier {
                    display(DisplayStyle.Flex)
                    justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                    alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                    padding(80.px, 96.px)
                    scrollMarginTop(84.px)
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
                            gap(1.px) // Set gap between children to 1px
                        },
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(36.px)
                            fontWeight(600)
                            margin(0.px) // Remove default margin
                        }
                    },
                ) {
                    Text("Meet The Team")
                }
                // Added subtitle below the heading
                Div(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(18.px)
                            textAlign("center")
                            marginTop(15.px) // Remove default margin
                        }
                    },
                ) {
                    Text("Divided into three unique subteams based on expertise and experience")
                }
                Row(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .styleModifier {
                                display(DisplayStyle.Flex)
                                justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                                gap(50.px)
                                marginTop(20.px)
                            },
                ) {
                    Link(
                        // TODO: add function to these buttons
                        path = "#",
                        text = "Mechanical",
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
                    Link(
                        path = "#",
                        text = "Systems",
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
                    Link(
                        path = "#",
                        text = "Software",
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
                Row(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .styleModifier {
                                display(DisplayStyle.Flex)
                                justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                                gap(24.px)
                                marginTop(24.px)
                            },
                ) {
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/madTesting.png", "placeholder")
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/madTesting.png", "placeholder")
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/madTesting.png", "placeholder")
                }
                Row(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .styleModifier {
                                display(DisplayStyle.Flex)
                                justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                                gap(24.px)
                                marginTop(24.px)
                            },
                ) {
                    TeamMemberCard("https://eventide-03.github.io/Icarus/assets/madTesting.png", "placeholder")
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
                    Text("Meet the rest of the team →")
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
                    height(300.px)
                    borderRadius(8.px)
                    objectFit(ObjectFit.Cover)
                }
            },
        )
        if (name.isNotEmpty()) {
            Div(
                attrs = {
                    style {
                        // TODO: Add hover effect that shows quote
                        color(Color("#86BBD8"))
                        fontSize(28.px)
                        fontWeight(600)
                        textAlign("center")
                    }
                },
            ) {
                Text(name)
            }
        }
    }
}
