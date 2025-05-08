package io.github.rishthewizard.components

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
                .backgroundColor(Color("#1C293E")) // Dark footer background
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
            // Left Section - Nexcent Info
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
                    Text("Nexcent")
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
                    Text("Copyright © 2020 Nexcent ltd.")
                }
                Div(
                    attrs = {
                        style {
                            color(Color("#8C97A7"))
                            fontSize(14.px)
                        }
                    },
                ) {
                    Text("All rights reserved")
                }
                Row(
                    modifier =
                        Modifier.styleModifier {
                            gap(16.px)
                            marginTop(20.px)
                        },
                ) {
                    // Social Media Icons - Replace with your actual Img/Link Composables
                    Div(
                        attrs = {
                            style {
                                width(24.px)
                                height(24.px)
                                backgroundColor(Color.gray)
                            }
                        },
                    ) {}
                    Div(
                        attrs = {
                            style {
                                width(24.px)
                                height(24.px)
                                backgroundColor(Color.gray)
                            }
                        },
                    ) {}
                    Div(
                        attrs = {
                            style {
                                width(24.px)
                                height(24.px)
                                backgroundColor(Color.gray)
                            }
                        },
                    ) {}
                }
            }

            // Middle Sections - Company & Support
            Row(
                modifier =
                    Modifier.styleModifier {
                        gap(80.px)
                    },
            ) {
                FooterColumn(title = "Company", items = listOf("About us", "Blog", "Contact us", "Pricing", "Testimonials"))
                FooterColumn(title = "Support", items = listOf("Help center", "Terms of service", "Legal", "Privacy policy", "Status"))
            }

            // Right Section - Stay up to date
            Column {
                Div(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(16.px)
                            fontWeight(600)
                            marginBottom(16.px)
                        }
                    },
                ) {
                    Text("Stay up to date")
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
                    A(
                        attrs = {
                            attr("href", "#")
                            style {
                                display(DisplayStyle.InlineBlock)
                                backgroundColor(Color("#D20041"))
                                color(Color("#FFFFFF"))
                                padding(10.px, 16.px)
                                borderRadius(8.px)
                                fontSize(14.px)
                                border(0.px)
                                cursor("pointer")
                                textDecoration("none")
                            }
                            onClick { /* TODO: Handle subscribe */ }
                        },
                    ) {
                        // Send icon (replace with your actual icon)
                        Text("→")
                    }
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
