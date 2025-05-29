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

// Add mapping of team members to their subteams and quotes
val teamMemberInfo =
    mapOf(
        "Rishi Mishra" to Pair(TeamType.SOFTWARE, "\"And so begins something new.\""),
        "Ridam Bhatia" to Pair(TeamType.SYSTEMS, "\"Me when robor?\""),
        "Eddy Aguilar" to Pair(TeamType.MECHANICAL, "\"If I only live once, then I might as well do things I will remember forever.\""),
        "Sourish Mehta" to Pair(TeamType.SYSTEMS, "\"Everything has a purpose.\""),
        "Ria Mishra" to Pair(TeamType.SOFTWARE, "\"Debugging is annoying.\""),
        "May Huynh" to Pair(TeamType.MECHANICAL, "\"HI :D\""),
        "Sam" to Pair(TeamType.SYSTEMS, "\"I'm Sam.\""),
        "Om Gupta" to Pair(TeamType.SOFTWARE, "\"COMMIT YOUR CODE.\""),
    )

// Add Brandon Chiem to the team info map
val extendedTeamMemberInfo =
    teamMemberInfo +
        mapOf(
            "Brandon Chiem" to Pair(TeamType.MECHANICAL, "\"I learn fast because I have more time to listen.\""),
        )

// Map TeamType to display names
val teamTypeNames =
    mapOf(
        TeamType.SOFTWARE to "Software",
        TeamType.SYSTEMS to "Systems",
        TeamType.MECHANICAL to "Mechanical",
    )

// Special role overrides for specific team members
val specialRoles =
    mapOf(
        "Rishi Mishra" to "Team Captain",
        "Sam" to "Sam",
    )

@Composable
fun Team() {
    // Add state to track which team is currently selected
    var selectedTeam by remember { mutableStateOf(TeamType.NONE) }
    // State for showing more team members
    var showMore by remember { mutableStateOf(false) }

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
                    // SWAPPED: May and Ria positions
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/may.png",
                        "May Huynh",
                        selectedTeam == TeamType.MECHANICAL,
                    )
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/ria.png",
                        "Ria Mishra",
                        selectedTeam == TeamType.SOFTWARE,
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
                    // SWAPPED: Om and Sam positions
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/om.png",
                        "Om Gupta",
                        selectedTeam == TeamType.SOFTWARE,
                    )
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/sam.png",
                        "Sam",
                        selectedTeam == TeamType.SYSTEMS,
                    )
                    TeamMemberCard(
                        "https://eventide-03.github.io/Icarus/assets/brandon.png",
                        "Brandon Chiem",
                        selectedTeam == TeamType.MECHANICAL,
                    )
                }
            }

            // Add sponsors section
            Column(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .id("sponsors") // Add ID for direct linking
                        .styleModifier {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                            alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                            gap(24.px)
                            marginTop(60.px) // Add space between team and sponsors
                            scrollMarginTop(104.px) // Increased from 84px to 104px to go 20px higher
                        },
            ) {
                // Sponsors heading
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
                    Text("Sponsors")
                }

                Div(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(18.px)
                            fontStyle("italic")
                            textAlign("center")
                            marginBottom(20.px)
                        }
                    },
                ) {
                    Text("No current sponsors, contact us at RishiMishraOA@gmail.com for inquiries and information!")
                }

                // Sponsor image placeholders
                Row(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .styleModifier {
                                display(DisplayStyle.Flex)
                                justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                                gap(40.px)
                            },
                ) {
                    // Three sponsor placeholders
                    repeat(3) {
                        Div(
                            attrs = {
                                style {
                                    width(200.px)
                                    height(100.px)
                                    borderRadius(8.px)
                                    backgroundColor(rgba(255, 255, 255, 0.1))
                                    border(1.px, LineStyle.Dashed, rgba(255, 255, 255, 0.3))
                                    display(DisplayStyle.Flex)
                                    justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                                    alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                                }
                            },
                        )
                    }
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
    // Add click/hover state
    var isShowingDetails by remember { mutableStateOf(false) }
    var isHovered by remember { mutableStateOf(false) }

    // Get team info for this member
    val teamInfo = extendedTeamMemberInfo[name]
    val subteam = teamInfo?.first ?: TeamType.NONE
    val quote = teamInfo?.second ?: ""

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
                // Make column a relative container for absolute positioning
                position(Position.Relative)
            },
    ) {
        // Image container - Make it clickable
        Div(
            attrs = {
                style {
                    position(Position.Relative)
                    cursor("pointer") // Add cursor pointer to indicate it's clickable
                    display(DisplayStyle.Block)
                    lineHeight("0") // Remove any line height that might cause spacing
                }
                // Add click handler to toggle details
                onClick { isShowingDetails = !isShowingDetails }
                onMouseOver { isHovered = true }
                onMouseOut { isHovered = false }
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
                        backgroundColor(Color("#1e3a5f"))
                        property("transition", "filter 0.3s ease, transform 0.3s ease")
                        // Only darken the image when details are shown and NOT on hover
                        if (isShowingDetails) {
                            property("filter", "brightness(0.7)")
                        } else if (isHovered) {
                            property("transform", "scale(1.03)")
                        }
                        display(DisplayStyle.Block)
                    }
                },
            )

            // Overlay with subteam and quote that appears when details are shown
            if (isShowingDetails) {
                Div(
                    attrs = {
                        style {
                            position(Position.Absolute)
                            top(0.px)
                            left(0.px)
                            right(0.px)
                            bottom(0.px)
                            borderRadius(8.px)
                            backgroundColor(rgba(0, 0, 0, 0.7))
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                            justifyContent(org.jetbrains.compose.web.css.JustifyContent.Center)
                            alignItems(org.jetbrains.compose.web.css.AlignItems.Center)
                            textAlign("center")
                            property("animation", "fadeIn 0.3s ease-in-out")
                            overflow(Overflow.Hidden)
                        }
                    },
                ) {
                    // Subteam display - Use special role if available, otherwise use team type
                    Div(
                        attrs = {
                            style {
                                color(Color("#D20041"))
                                fontSize(24.px)
                                fontWeight(600)
                                marginBottom(8.px) // <-- Set margin between subteam and quote to 8px
                                padding(0.px, 16.px)
                            }
                        },
                    ) {
                        Text(specialRoles[name] ?: teamTypeNames[subteam] ?: "Team Member")
                    }

                    // Quote display
                    Div(
                        attrs = {
                            style {
                                color(Color("#FFFFFF"))
                                fontSize(18.px)
                                fontStyle("italic")
                                lineHeight("1.5")
                                padding(0.px, 16.px)
                            }
                        },
                    ) {
                        Text(quote)
                    }
                }
            }
        }

        if (name.isNotEmpty()) {
            // Keep the name clickable as well
            Div(
                attrs = {
                    style {
                        color(if (isHighlighted) Color("#FFFFFF") else Color("#86BBD8"))
                        fontSize(28.px)
                        fontWeight(600)
                        textAlign("center")
                        property("transition", "color 0.3s ease")
                        cursor("pointer") // Add cursor pointer to indicate clickable
                    }
                    onClick { isShowingDetails = !isShowingDetails }
                },
            ) {
                Text(name)
            }
        }
    }
}
