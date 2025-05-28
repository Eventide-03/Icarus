package io.github.eventide03.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

enum class TeamType {
    NONE,
    MECHANICAL,
    SYSTEMS,
    SOFTWARE,
}

@Composable
fun Team() {
    // Add state to track which team is currently selected
    var selectedTeam by remember { mutableStateOf(TeamType.NONE) }

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
                    Div(
                        attrs = {
                            style {
                                display(DisplayStyle.InlineBlock)
                                backgroundColor(if (selectedTeam == TeamType.MECHANICAL) Color("#A7001E") else Color("#D20041"))
                                color(Color("#FFFFFF"))
                                padding(12.px, 24.px)
                                borderRadius(8.px)
                                fontSize(16.px)
                                fontWeight(500)
                                textAlign("center")
                                cursor("pointer")
                            }
                            onClick {
                                selectedTeam = if (selectedTeam == TeamType.MECHANICAL) TeamType.NONE else TeamType.MECHANICAL
                            }
                        },
                    ) {
                        Text("Mechanical")
                    }
                    Div(
                        attrs = {
                            style {
                                display(DisplayStyle.InlineBlock)
                                backgroundColor(if (selectedTeam == TeamType.SYSTEMS) Color("#A7001E") else Color("#D20041"))
                                color(Color("#FFFFFF"))
                                padding(12.px, 24.px)
                                borderRadius(8.px)
                                fontSize(16.px)
                                fontWeight(500)
                                textAlign("center")
                                cursor("pointer")
                            }
                            onClick {
                                selectedTeam = if (selectedTeam == TeamType.SYSTEMS) TeamType.NONE else TeamType.SYSTEMS
                            }
                        },
                    ) {
                        Text("Systems")
                    }
                    Div(
                        attrs = {
                            style {
                                display(DisplayStyle.InlineBlock)
                                backgroundColor(if (selectedTeam == TeamType.SOFTWARE) Color("#A7001E") else Color("#D20041"))
                                color(Color("#FFFFFF"))
                                padding(12.px, 24.px)
                                borderRadius(8.px)
                                fontSize(16.px)
                                fontWeight(500)
                                textAlign("center")
                                cursor("pointer")
                            }
                            onClick {
                                selectedTeam = if (selectedTeam == TeamType.SOFTWARE) TeamType.NONE else TeamType.SOFTWARE
                            }
                        },
                    ) {
                        Text("Software")
                    }
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
                    // Software team: Rishi, Ria, Om
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/RishiDown.png",
                        "Rishi Mishra",
                        selectedTeam == TeamType.SOFTWARE,
                    )
                    // Systems team: Ridam, Sourish, Sam
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/Ridam.png",
                        "Ridam Bhatia",
                        selectedTeam == TeamType.SYSTEMS,
                    )
                    // Mechanical team: Eddy, May
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/eddy.png",
                        "Eddy Aguilar",
                        selectedTeam == TeamType.MECHANICAL,
                    )
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
                    // Systems team: Ridam, Sourish, Sam
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/sourish.png",
                        "Sourish Mehta",
                        selectedTeam == TeamType.SYSTEMS,
                    )
                    // Software team: Rishi, Ria, Om
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/ria.png",
                        "Ria Mishra",
                        selectedTeam == TeamType.SOFTWARE,
                    )
                    // Mechanical team: Eddy, May
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/may.png",
                        "May Hunh",
                        selectedTeam == TeamType.MECHANICAL,
                    )
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
                    // Systems team: Ridam, Sourish, Sam
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/sam.png",
                        "Sam",
                        selectedTeam == TeamType.SYSTEMS,
                    )
                    // Software team: Rishi, Ria, Om
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/om.png",
                        "Om Gupta",
                        selectedTeam == TeamType.SOFTWARE,
                    )
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
    isHighlighted: Boolean = false,
) {
    Column(
        modifier =
            Modifier.styleModifier {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                gap(8.px)
                if (isHighlighted) {
                    padding(8.px)
                    border(3.px, LineStyle.Solid, Color("#D20041"))
                    borderRadius(12.px)
                    property("transform", "scale(1.05)")
                    property("transition", "all 0.3s ease")
                } else {
                    padding(11.px) // Add same padding to prevent layout shift
                    property("transition", "all 0.3s ease")
                }
            },
    ) {
        // Add an onError handler to show a fallback image if the original fails to load
        Img(
            src = imageUrl,
            attrs = {
                attr("alt", name)
                // Print the actual URL to console for debugging
                attr(
                    "onload",
                    "console.log('Successfully loaded: ' + this.src);",
                )
                // Improved error handler for case sensitivity issues
                attr(
                    "onerror",
                    """
                    console.error('Failed to load: ' + this.src);
                    
                    // Try alternative case for Eddy specifically
                    if (this.src.includes('eddy.png')) {
                        this.src = 'https://placehold.co/300x300/1e3a5f/FFFFFF?text=Eddy';
                    } else if (this.src.includes('Eddy.png')) {
                        this.src = 'https://eventide-03.github.io/Icarus/assets/eddy.png';
                    } else if (this.src.includes('May.png')) {
                        this.src = 'https://eventide-03.github.io/Icarus/assets/may.png';
                    } else if (this.src.includes('Sam.png')) {
                        this.src = 'https://eventide-03.github.io/Icarus/assets/sam.png';
                    } else if (this.src.includes('Om.png')) {
                        this.src = 'https://eventide-03.github.io/Icarus/assets/om.png';
                    } else {
                        this.style.backgroundColor = '#D20041';
                    }
                    """.trimIndent(),
                )
                style {
                    width(300.px)
                    height(300.px)
                    borderRadius(8.px)
                    objectFit(ObjectFit.Cover)
                    // Add a background color so we can see the element even if image fails
                    backgroundColor(Color("#1e3a5f"))
                }
            },
        )
        if (name.isNotEmpty()) {
            Div(
                attrs = {
                    style {
                        color(if (isHighlighted) Color("#FFFFFF") else Color("#86BBD8"))
                        fontSize(28.px)
                        fontWeight(600)
                        textAlign("center")
                        property("transition", "color 0.3s ease")
                    }
                },
            ) {
                Text(name)
            }
        }
    }
}
// TODO: people descriptions either below or hover over image
