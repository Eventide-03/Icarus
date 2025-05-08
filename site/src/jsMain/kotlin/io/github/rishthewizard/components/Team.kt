package io.github.rishthewizard.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
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
                        }
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
                        }
                    ) {}
                    TeamStat("000", "Mentors")
                }

                A(
                    attrs = {
                        attr("href", "#")
                        style {
                            display(DisplayStyle.InlineBlock)
                            backgroundColor(Color("#D20041"))
                            color(Color("#FFFFFF"))
                            padding(12.px, 24.px)
                            borderRadius(8.px)
                            fontSize(16.px)
                            fontWeight(500)
                            border(0.px)
                            cursor("pointer")
                            textDecoration("none")
                        }
                        onClick { /* TODO: Handle button click */ }
                    },
                ) {
                    Text("See More")
                }
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
                        Modifier.styleModifier {
                            cursor("pointer")
                            display(DisplayStyle.Flex)
                            alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                            gap(8.px)
                        },
                ) {
                    Div(
                        attrs = {
                            style {
                                color(Color("#FFFFFF"))
                                fontSize(20.px)
                                fontWeight(500)
                            }
                        }
                    ) {
                        Text("Meet the rest of the team")
                    }
                    // Right arrow
                    Div(
                        attrs = {
                            style {
                                color(Color("#FFFFFF"))
                                fontSize(20.px)
                            }
                        }
                    ) { Text("→") }
                }

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
                    TeamMemberCard("https://rishthewizard.github.io/Icarus/assets/madTesting.png", "")
                    TeamMemberCard("https://rishthewizard.github.io/Icarus/assets/madTesting.png", "")
                    TeamMemberCard("https://rishthewizard.github.io/Icarus/assets/madTesting.png", "")
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
        modifier = Modifier.styleModifier {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
        }
    ) {
        Div(
            attrs = {
                style {
                    color(Color("#D20041"))
                    fontSize(24.px)
                    fontWeight(600)
                }
            }
        ) {
            Text(value)
        }
        Div(
            attrs = {
                style {
                    color(Color("#FFFFFF"))
                    fontSize(16.px)
                }
            }
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
        }
    )
    // You can add the team member's name below the image if needed
}