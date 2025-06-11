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
                    paddingTop(20.px)
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
                        justifyContent(JustifyContent.SpaceBetween)
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
                            paddingRight(0.px)
                            width(500.px)
                            flexShrink(0)
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
                                whiteSpace("nowrap")
                            },
                ) {
                    Text("RIVAL Team:")
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
                                whiteSpace("nowrap")
                            },
                ) {
                    Text("M.A.A.D Bots")
                }

                Box(
                    modifier =
                        Modifier
                            .styleModifier {
                                color(Color("#F5E5CC"))
                                fontSize(17.px)
                                fontStyle("normal")
                                fontWeight(400)
                                lineHeight(24.px)
                                marginTop(16.px)
                                whiteSpace("nowrap")
                                width(500.px)
                            },
                ) {
                    Text("A team of high school robotics students striving to pursue their interests.")
                }

                Link(
                    path = "https://hcb.hackclub.com/donations/start/maadbots",
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
                                padding(14.px, 26.px)
                                borderRadius(6.px)
                                backgroundColor(Color("#D20041"))
                                marginTop(32.px)
                            }.classNames("top-bar-action"),
                )
            }

            Img(
                src = "https://home.maadbots.org/assets/group-photo.png",
                attrs = {
                    attr("alt", "Team Group Photo")
                    style {
                        justifyContent(JustifyContent.Center)
                        alignSelf("center")
                        marginLeft(0.px)
                        maxWidth(600.px)
                        maxHeight(600.px)
                        property("height", "auto")
                        marginTop(120.px)
                        property("vertical-align", "middle")
                    }
                },
            )
        }
    }
}
