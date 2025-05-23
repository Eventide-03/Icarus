package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.scrollMarginTop
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Home() {
    Box(
        modifier =
            Modifier
                .id("home")
                .fillMaxWidth()
                .minHeight(700.px)
                .backgroundColor(Color("#132034"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    justifyContent(JustifyContent.FlexStart)
                    alignItems(AlignItems.FlexStart)
                    boxSizing("border-box")
                    flexShrink(0)
                    paddingTop(84.px)
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
                        justifyContent(JustifyContent.FlexStart)
                        boxSizing("border-box")
                        paddingLeft(96.px)
                        paddingRight(96.px)
                    },
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                modifier =
                    Modifier
                        .styleModifier {
                            paddingTop(190.px)
                            paddingLeft(0.px)
                            paddingRight(104.px)
                        },
            ) {
                Box(
                    modifier =
                        Modifier
                            .styleModifier {
                                color(Color("#86BBD8"))
                                fontSize(64.px)
                                fontStyle("normal")
                                fontWeight(600)
                                lineHeight(76.px)
                            },
                ) {
                    Text("Introducing Team:")
                }

                Box(
                    modifier =
                        Modifier
                            .styleModifier {
                                color(Color("#D20041"))
                                fontSize(64.px)
                                fontStyle("normal")
                                fontWeight(600)
                                lineHeight(76.px)
                            },
                ) {
                    Text("M.A.A.D Bots")
                }

                Box(
                    modifier =
                        Modifier
                            .styleModifier {
                                color(Color("#F5E5CC"))
                                fontSize(16.px)
                                fontStyle("normal")
                                fontWeight(400)
                                lineHeight(24.px)
                                marginTop(16.px)
                            },
                ) {
                    Text("A team of high school robotics students striving to pursue their interests.")
                }

                Link(
                    path = "https://hcb.hackclub.com/m-a-a-d-bots-rival-team/donations",
                    text = "Donate",
                    modifier =
                        Modifier
                            .styleModifier {
                                display(DisplayStyle.InlineBlock)
                                justifyContent(JustifyContent.Center)
                                alignItems(AlignItems.Center)
                                color(Color("#FFF"))
                                fontSize(18.px)
                                fontStyle("normal")
                                fontWeight(500)
                                lineHeight(24.px)
                                padding(14.px, 32.px)
                                borderRadius(6.px)
                                backgroundColor(Color("#D20041"))
                                marginTop(32.px)
                            }.classNames("top-bar-action"),
                )
            }

            Img(
                src = "https://eventide-03.github.io/Icarus/assets/madTesting.png",
                attrs = {
                    attr("alt", "Logo")
                    style {
                        paddingTop(210.px)
                        paddingLeft(200.px)
                        maxWidth(20.percent)
                        property("height", "auto")
                    }
                },
            )
        }
    }
}
