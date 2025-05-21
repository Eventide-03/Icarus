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
fun Branding() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .backgroundColor(Color("#1A1423"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    padding(40.px, 96.px)
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
                        gap(40.px)
                    },
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Img(
                src = "https://eventide-03.github.io/Icarus/assets/madTesting.png",
                attrs = {
                    attr("alt", "Team Image")
                    style {
                        maxWidth(400.px)
                        property("height", "auto")
                        borderRadius(8.px)
                    }
                },
            )

            Column(
                modifier = Modifier.weight(1f),
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#D20041"))
                            fontSize(36.px)
                            fontWeight(600)
                            marginBottom(20.px)
                        }
                    },
                ) {
                    Text("Branding and Inspiration")
                }
                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            marginBottom(20.px)
                        }
                    },
                ) {
                    Text(
                        "Our team's identity is inspired by the Greek myth of Icarus, symbolizing our ambition to soar to new heights while maintaining the wisdom to know our limits. Our primary colors are crimson (#D20041) and navy blue (#132034), representing passion and depth of knowledge respectively. The dark purple accent (#1A1423) adds sophistication to our brand. These colors were chosen not only for their visual impact but also for their psychological associations: red for energy and determination, blue for trust and intelligence, and purple for creativity and wisdom. Our logo features stylized wings that form an abstract 'I' shape, embodying our commitment to innovation while honoring our namesake. This branding extends across our robot, team uniforms, pit display, and all communications to create a cohesive and memorable identity in competition.",
                    )
                }
                Link(
                    path = "#",
                    text = "Learn More",
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
    }
}
