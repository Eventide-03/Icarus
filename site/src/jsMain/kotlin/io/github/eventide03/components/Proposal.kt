package io.github.eventide03.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.scrollMarginTop
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Proposal() {
    // State for fullscreen image
    var isFullscreenActive by remember { mutableStateOf(false) }
    var fullscreenImageSrc by remember { mutableStateOf("") }

    // Fullscreen overlay component
    if (isFullscreenActive) {
        Div(
            attrs = {
                style {
                    position(Position.Fixed)
                    top(0.px)
                    left(0.px)
                    width(100.percent)
                    height(100.percent)
                    backgroundColor(rgba(0, 0, 0, 0.9))
                    property("z-index", "1000") // Fixed: replaced zIndex(1000) with property
                    display(DisplayStyle.Flex)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    cursor("pointer")
                }
                onClick {
                    isFullscreenActive = false
                }
            },
        ) {
            Img(
                src = fullscreenImageSrc,
                attrs = {
                    style {
                        maxWidth(90.percent)
                        maxHeight(90.percent)
                        property("object-fit", "contain")
                    }
                    // Stop propagation to prevent closing when clicking on the image itself
                    onClick { it.stopPropagation() }
                },
            )
        }
    }

    Column(
        modifier =
            Modifier
                .id("proposal")
                .fillMaxWidth()
                .backgroundColor(Color("#132034"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    padding(40.px, 96.px)
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
                        gap(40.px)
                    },
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Img(
                src = "https://eventide-03.github.io/Icarus/assets/Engineering_Process.png",
                attrs = {
                    attr("alt", "Robot CAD Design")
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
                            color(Color("#FFFFFF"))
                            fontSize(36.px)
                            fontWeight(600)
                            marginBottom(15.px)
                        }
                    },
                ) {
                    Text("Our Proposal")
                }

                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(24.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(7.px)
                        }
                    },
                ) {
                    Text("Summary")
                }

                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            whiteSpace("pre-line")
                            marginTop(0.px)
                        }
                    },
                ) {
                    Text(
                        "Our ideal robot features a pivoting roller intake and a turret-mounted flywheel shooter guided by a vision system to aim at the targets. The intake can collect game pieces from both the floor and silo, feeding directly into the shooter for quick cycles. A horizontal pivot on the shooter allows shots from various angles with minimal movement. The efficiency of our shooting mechanism will allow for the drivetrain to be a simple four-wheel chassis, permitting resources to be prioritized towards the scoring and vision systems. Control will be split between a Raspberry Pi for general operation and an Orange Pi, dedicated to vision processing. \n This design maximizes scoring potential and adaptability, with the right sponsorship, it positions us to be highly competitive while challenging our engineering skills and strategic ability.",
                    )
                }
            }
        }

        Div(
            attrs = {
                style {
                    height(30.px) // Add space between rows
                }
            },
        )

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
            Column(
                modifier =
                    Modifier.weight(1f).styleModifier {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                        alignItems(AlignItems.Center) // Center children horizontally
                    },
            ) {
                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(24.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(7.px)
                            alignSelf("flex-start") // Keep the heading left-aligned
                        }
                    },
                ) {
                    Text("CAD and Progress")
                }
                Div(
                    attrs = {
                        style {
                            display(DisplayStyle.Flex)
                            flexDirection(FlexDirection.Column)
                            marginTop(0.px)
                            marginBottom(20.px)
                            maxWidth(100.percent) // Ensure it doesn't go off page
                            alignSelf("stretch") // Take full width of parent
                        }
                    },
                ) {
                    // Gallery title
                    P(
                        attrs = {
                            style {
                                color(Color("#F5E5CC"))
                                fontSize(16.px)
                                lineHeight(24.px)
                                marginTop(0.px)
                                alignSelf("flex-start") // Keep the title left-aligned
                            }
                        },
                    ) {
                        Text(
                            "The following are images displaying our progress in the construcion of our robot, we have a design and sketch ready, and are beginning the stages of CAD and prototyping.",
                        )
                    }

                    A(
                        attrs = {
                            attr(
                                "href",
                                "https://cad.onshape.com/documents/738b0ef599ad6d1b3f9144dc/w/9de922e16be162971d5a6925/e/a80f18b0354e97110a607147?renderMode=0&uiState=6836e87ae4f832298a9fc2dd",
                            )
                            attr("target", "_blank")
                            style {
                                color(Color("#F5E5CC"))
                                fontSize(17.px)
                                fontWeight(700)
                                textDecoration("none")
                                marginTop(0.px)
                                marginBottom(32.px)
                                alignSelf("flex-start") // Keep the link left-aligned
                                display(DisplayStyle.Block)
                            }
                            // Add hover effect
                            attr("onmouseover", "this.style.textDecoration='underline';")
                            attr("onmouseout", "this.style.textDecoration='none';")
                        },
                    ) {
                        Text("CAD Link")
                    }

                    // Gallery with navigation buttons
                    Div(
                        attrs = {
                            style {
                                display(DisplayStyle.Flex)
                                flexDirection(FlexDirection.Row)
                                alignItems(AlignItems.Center)
                                justifyContent(JustifyContent.Center) // Center the gallery
                                gap(8.px)
                                width(100.percent)
                                property("margin", "0 auto") // Center the container horizontally
                                property("text-align", "center") // Center inline elements
                            }
                        },
                    ) {
                        // Left scroll button
                        Button(
                            attrs = {
                                id("gallery-left-btn")
                                onClick {
                                    // Use JavaScript to scroll the gallery left
                                    js("document.getElementById('gallery-scroll-container').scrollBy({left: -366, behavior: 'smooth'})")
                                }
                                style {
                                    backgroundColor(rgba(0, 0, 0, 0.5))
                                    color(Color.white)
                                    border(0.px)
                                    borderRadius(4.px)
                                    padding(8.px)
                                    cursor("pointer")
                                    minWidth(40.px)
                                    height(40.px)
                                    display(DisplayStyle.Flex)
                                    alignItems(AlignItems.Center)
                                    justifyContent(JustifyContent.Center)
                                    opacity(0.5) // Start with left button faded since we're at the beginning
                                }
                            },
                        ) {
                            Text("←")
                        }

                        // Fixed border container - does not scroll
                        Div(
                            attrs = {
                                id("gallery-container")
                                style {
                                    width(1000.px) // Fixed width
                                    maxWidth(100.percent) // Ensure it doesn't exceed parent width
                                    height(320.px) // Fixed height
                                    backgroundColor(rgba(0, 0, 0, 0.2)) // Border background
                                    borderRadius(8.px) // Rounded corners
                                    property("position", "relative") // For absolute positioning of child
                                    property("overflow", "hidden") // Hide overflow
                                    property("padding", "0") // Remove padding to prevent overlap
                                    border(1.px, LineStyle.Solid, rgba(255, 255, 255, 0.1)) // Add visible border
                                }
                            },
                        ) {
                            // Inner scrollable container - holds the images and scrolls
                            Div(
                                attrs = {
                                    id("gallery-scroll-container")
                                    style {
                                        display(DisplayStyle.Flex)
                                        // Position absolutely within parent container
                                        property("position", "absolute")
                                        property("top", "8px")
                                        property("left", "8px")
                                        property("right", "8px")
                                        property("bottom", "8px")
                                        // Scrolling settings
                                        overflowX("scroll")
                                        property("scroll-behavior", "smooth")
                                        // Add scroll snap for better control
                                        property("scroll-snap-type", "x mandatory")
                                        // Hide scrollbar but keep functionality
                                        property("scrollbar-width", "none") // Firefox
                                        property("-ms-overflow-style", "none") // IE/Edge
                                        property("::-webkit-scrollbar", "{ display: none; }") // Chrome/Safari
                                        // Ensure content doesn't wrap
                                        property("flex-wrap", "nowrap")
                                        property("align-items", "center")
                                    }
                                    // Update button states based on scroll position
                                    attr(
                                        "onscroll",
                                        """
                                        var container = this;
                                        var scrollLeft = container.scrollLeft;
                                        var scrollWidth = container.scrollWidth;
                                        var clientWidth = container.clientWidth;
                                        
                                        // Hide left arrows when at start
                                        if (scrollLeft <= 10) {
                                            document.getElementById('gallery-left-btn').style.opacity = '0.5';
                                        } else {
                                            document.getElementById('gallery-left-btn').style.opacity = '1';
                                        }
                                        
                                        // Hide right arrows when at end
                                        if (scrollLeft + clientWidth >= scrollWidth - 10) {
                                            document.getElementById('gallery-right-btn').style.opacity = '0.5';
                                        } else {
                                            document.getElementById('gallery-right-btn').style.opacity = '1';
                                        }
                                        """,
                                    )
                                },
                            ) {
                                // Non-scrollable spacer at the beginning
                                Div(
                                    attrs = {
                                        style {
                                            minWidth(8.px)
                                            height(300.px)
                                            property("flex-shrink", "0")
                                        }
                                    },
                                )

                                Img(
                                    src = "https://eventide-03.github.io/Icarus/assets/cad.png",
                                    attrs = {
                                        style {
                                            height(300.px)
                                            width(350.px)
                                            minWidth(350.px)
                                            property("object-fit", "cover")
                                            borderRadius(8.px)
                                            // Ensure image doesn't expand outside container
                                            property("flex-shrink", "0")
                                            marginBottom(0.px)
                                            marginRight(16.px)
                                            // Add scroll snap align
                                            property("scroll-snap-align", "center")
                                            // Add cursor pointer to indicate clickability
                                            cursor("pointer")
                                        }
                                        // Add onClick handler to show fullscreen
                                        onClick {
                                            fullscreenImageSrc = "https://eventide-03.github.io/Icarus/assets/cad.png"
                                            isFullscreenActive = true
                                        }
                                    },
                                )
                                Img(
                                    src = "https://eventide-03.github.io/Icarus/assets/sketch.png",
                                    attrs = {
                                        style {
                                            height(300.px)
                                            width(350.px)
                                            minWidth(350.px)
                                            property("object-fit", "cover")
                                            borderRadius(8.px)
                                            // Ensure image doesn't expand outside container
                                            property("flex-shrink", "0")
                                            marginBottom(0.px)
                                            marginRight(16.px)
                                            // Add scroll snap align
                                            property("scroll-snap-align", "center")
                                            cursor("pointer")
                                        }
                                        onClick {
                                            fullscreenImageSrc = "https://eventide-03.github.io/Icarus/assets/sketch.png"
                                            isFullscreenActive = true
                                        }
                                    },
                                )
                                Img(
                                    src = "https://eventide-03.github.io/Icarus/assets/basicsketch.png",
                                    attrs = {
                                        style {
                                            height(300.px)
                                            width(350.px)
                                            minWidth(350.px)
                                            property("object-fit", "cover")
                                            borderRadius(8.px)
                                            // Ensure image doesn't expand outside container
                                            property("flex-shrink", "0")
                                            marginBottom(0.px)
                                            marginRight(16.px)
                                            // Add scroll snap align
                                            property("scroll-snap-align", "center")
                                            cursor("pointer")
                                        }
                                        onClick {
                                            fullscreenImageSrc = "https://eventide-03.github.io/Icarus/assets/basicsketch.png"
                                            isFullscreenActive = true
                                        }
                                    },
                                )
                                Img(
                                    src = "https://eventide-03.github.io/Icarus/assets/abigailsketch.png",
                                    attrs = {
                                        style {
                                            height(300.px)
                                            width(350.px)
                                            minWidth(350.px)
                                            property("object-fit", "cover")
                                            borderRadius(8.px)
                                            // Ensure image doesn't expand outside container
                                            property("flex-shrink", "0")
                                            marginBottom(0.px)
                                            marginRight(16.px)
                                            // Add scroll snap align
                                            property("scroll-snap-align", "center")
                                            cursor("pointer")
                                        }
                                        onClick {
                                            fullscreenImageSrc = "https://eventide-03.github.io/Icarus/assets/abigailsketch.png"
                                            isFullscreenActive = true
                                        }
                                    },
                                )
                                Img(
                                    src = "https://eventide-03.github.io/Icarus/assets/recap.png",
                                    attrs = {
                                        style {
                                            height(300.px)
                                            width(350.px)
                                            minWidth(350.px)
                                            property("object-fit", "cover")
                                            borderRadius(8.px)
                                            // Ensure image doesn't expand outside container
                                            property("flex-shrink", "0")
                                            marginBottom(0.px)
                                            // Add scroll snap align
                                            property("scroll-snap-align", "center")
                                            cursor("pointer")
                                        }
                                        onClick {
                                            fullscreenImageSrc = "https://eventide-03.github.io/Icarus/assets/recap.png"
                                            isFullscreenActive = true
                                        }
                                    },
                                )

                                // Non-scrollable spacer at the end
                                Div(
                                    attrs = {
                                        style {
                                            minWidth(8.px)
                                            height(300.px)
                                            property("flex-shrink", "0")
                                        }
                                    },
                                )
                            }
                        }

                        // Right scroll button
                        Button(
                            attrs = {
                                id("gallery-right-btn")
                                onClick {
                                    // Scroll by exactly one image width plus gap
                                    js(
                                        """
                                        var container = document.getElementById('gallery-scroll-container');
                                        var imageWidth = 350; // Width of each image
                                        var gap = 16; // Gap between images
                                        container.scrollBy({left: imageWidth + gap, behavior: 'smooth'});
                                    """,
                                    )
                                }
                                style {
                                    backgroundColor(rgba(0, 0, 0, 0.5))
                                    color(Color.white)
                                    border(0.px)
                                    borderRadius(4.px)
                                    padding(8.px)
                                    cursor("pointer")
                                    minWidth(40.px)
                                    height(40.px)
                                    display(DisplayStyle.Flex)
                                    alignItems(AlignItems.Center)
                                    justifyContent(JustifyContent.Center)
                                }
                            },
                        ) {
                            Text("→")
                        }
                    }
                }
                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(24.px)
                            fontWeight(500)
                            marginTop(20.px)
                            marginBottom(7.px)
                            alignSelf("flex-start") // Add this to left-align the heading
                        }
                    },
                ) {
                    Text("Estimated BOM")
                }

                P(
                    attrs = {
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(16.px)
                            lineHeight(24.px)
                            whiteSpace("pre-line")
                            marginTop(0.px)
                            marginBottom(10.px) // Reduced from 20px to make room for the link
                        }
                    },
                ) {
                    Text(
                        "Our core needs require a budget of around $2500 to cover the costs of materials and components needed for the robot's construction and testing. The addition of amenities and parts that are convinient in creating a robust system increases the budget to around $5000. Any and all donations will be greatly appreciated, and will be used to cover the costs of the robot's construction. Financials and monetary spending information can be found on our HCB (Hack Club Bank) Homepage.",
                    )
                }

                // Add link to HCB homepage
                A(
                    attrs = {
                        attr(
                            "href",
                            "https://hcb.hackclub.com/m-a-a-d-bots-rival-team/transactions?action=ledger&controller=events&event_id=m-a-a-d-bots-rival-team",
                        )
                        attr("target", "_blank")
                        style {
                            color(Color("#F5E5CC"))
                            fontSize(17.px)
                            fontWeight(700)
                            textDecoration("none")
                            marginBottom(20.px)
                            alignSelf("flex-start") // Keep the link left-aligned
                            display(DisplayStyle.Block)
                        }
                        // Add hover effect
                        attr("onmouseover", "this.style.textDecoration='underline';")
                        attr("onmouseout", "this.style.textDecoration='none';")
                    },
                ) {
                    Text("HCB Homepage")
                }

                Table(
                    attrs = {
                        style {
                            width(100.percent)
                            property("border-collapse", "collapse")
                            marginBottom(20.px)
                            color(Color("#F5E5CC"))
                            fontSize(14.px)
                        }
                    },
                ) {
                    Tr {
                        listOf("Description", "Quantity", "Unit Cost", "Total Cost", "Estimated Total").forEach { header ->
                            Th(
                                attrs = {
                                    style {
                                        padding(8.px)
                                        textAlign("left")
                                        property("border-bottom", "1px solid #F5E5CC")
                                        fontWeight(600)
                                    }
                                },
                            ) {
                                Text(header)
                            }
                        }
                    }

                    // Field Perimeter and Tiles
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.andymark.com/products/first-tech-challenge-perimeter-kit-b")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("12x12' perimeter - FIRST Tech Challenge Perimeter Kit (AndyMark)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("1")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$659.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$659.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr(
                                        "href",
                                        "https://www.andymark.com/products/soft-tiles-for-first-tech-challenge-field-options?via=Z2lkOi8vYW5keW1hcmsvV29ya2FyZWE6Ok5hdmlnYXRpb246OlNlYXJjaFJlc3VsdHMvJTdCJTIyYnV0dG9uJTIyJTNBJTIyc2VhcmNoJTIyJTJDJTIycSUyMiUzQSUyMnRpbGVzJTIyJTJDJTIydXRmOCUyMiUzQSUyMiVFMiU5QyU5MyUyMiU3RA&Amount=36%20(am-2499-36)&quantity=1",
                                    )
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("12x12' foam tiles - FIRST Tech Challenge Field Soft Tiles (AndyMark)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("1")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$259.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$259.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$918.00")
                        }
                    }

                    // McMaster and WCP Parts
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.mcmaster.com/8475T8/")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("L1 tray - Food Industry Plastic Pans (Mcmaster 8475T8)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$8.06")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$32.24")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.mcmaster.com/8585K39/")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Silo tube - Impact-Resistant Polycarbonate Round Tube (Mcmaster 8585K39)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$25.52")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$102.08")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.mcmaster.com/42185T605-42185T629/")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("L2 container - Plastic Bin Box (Mcmaster 42185T605)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$3.94")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$15.76")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://wcproducts.com/collections/systems-structure/products/punched-tubing")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text(
                                    "Infrastructure square tube - 2\" x 2\" x 0.09375\" Aluminum Tube Stock with Hole Pattern (47\") (WCP-1587)",
                                )
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$49.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$199.96")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    // More parts
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://wcproducts.com/products/tube-plugs")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Tube plugs - Aluminum Tube Plug (2\"x2\"x.125\", #10-32 Tapped) (WCP-0373)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$7.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$31.96")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://wcproducts.com/products/tube-plugs")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text(
                                    "Plug sleeves - Plastic Tube Plug Sleeve (2\"x2\"x.06\", 1/4\" Clearance) (2-Pack) (WCP-0377)",
                                )
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("2")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$5.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$11.98")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.fabworks.com/share/5Hm6WPxrYnI9")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text(
                                    "Infrastructure mounting plate - tower mounting plate (fabworks)",
                                )
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$33.82")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$135.28")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.vexrobotics.com/276-9091.html")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Infrastructure baseplate - tower baseplate (Vex)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$7.75")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$30.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.fabworks.com/share/5Hm6WPxrYnI9")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Feeder mount - feeder mount (fabworks)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("8")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$8.68")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$69.44")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("L1 mount 3DP version")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.fabworks.com/share/5Hm6WPxrYnI9")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("April tag plate - april tag plate (fabworks)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("16")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$4.35")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$69.60")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("April tag mount 3dp")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("L3 3dp insert")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("Feeder plug 3dp")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("8")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("L2 spacer 3dp")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$699.29")
                        }
                    }

                    // Bump parts
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.fabworks.com/share/5Hm6WPxrYnI9")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Bump - bump (fabworks)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("3")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$110.42")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$331.26")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.fabworks.com/share/5Hm6WPxrYnI9")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Bump connector - bump connector (fabworks)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$8.34")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$33.36")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            A(
                                attrs = {
                                    attr("href", "https://www.fabworks.com/share/5Hm6WPxrYnI9")
                                    attr("target", "_blank")
                                    style {
                                        color(Color("#F5E5CC"))
                                        textDecoration("underline")
                                    }
                                },
                            ) {
                                Text("Bump baseplate - bump baseplate (fabworks)")
                            }
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("3")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$11.21")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$33.63")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$398.25")
                        }
                    }

                    // Drivetrain components
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    fontWeight(600)
                                }
                            },
                        ) {
                            Text("Drivetrain Components")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                    fontWeight(600)
                                }
                            },
                        ) {
                            Text("Qty")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                    fontWeight(600)
                                }
                            },
                        ) {
                            Text("Unit Cost")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                    fontWeight(600)
                                }
                            },
                        ) {
                            Text("Total Cost")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                    fontWeight(600)
                                }
                            },
                        ) {
                            Text("Total")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("Flipsky 5065")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("2")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$41.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$82.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("15T pulley")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("2")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$3.90")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$7.80")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("Anti Spark Switch")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("1")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$24.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$24.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("Flipsky FESC 6.7 Pro Mini 70A")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("2")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$62.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$124.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text(
                                "3\" OD x 1\" Wide Straight Flex Wheel (1-1/4\" Round Stretch, 30A) (WCP-1358)",
                            )
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$7.49")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$29.96")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("159\" ID x .375\" OD Rounded Hex Stock (36\") (WCP-0911)")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("8")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.56")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$4.44")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text(
                                "10.25mm (3/8\" Rounded Hex) ID x 0.875\" OD x 0.280\" WD (Flanged Bearing) (WCP-0784)",
                            )
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("8")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$1.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$15.92")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("0.375\" ID x 0.875\" OD x 0.281\" WD (Radial Bearing) (WCP-0776)")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$1.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$7.96")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text(
                                "Aluminum Spacers (.196\" ID x 3/8\" OD x 3/4\" WD) (5-Pack) (WCP-0217)",
                            )
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("2")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$0.70")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$1.40")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("6\" Aluminum Nutstrip (#10-32, .500\" Spacing) (WCP-0336)")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("4")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$9.99")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$39.96")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("")
                        }
                    }

                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                }
                            },
                        ) {
                            Text("Fabworks sheet metal")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("center")
                                }
                            },
                        ) {
                            Text("1")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$144.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$144.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                    textAlign("right")
                                }
                            },
                        ) {
                            Text("$481.44")
                        }
                    }

                    // Total row
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                    fontWeight(700)
                                }
                            },
                        ) {
                            Text("TOTAL")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                }
                            },
                        ) {
                            Text("")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                }
                            },
                        ) {
                            Text("")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                    textAlign("right")
                                    fontWeight(700)
                                }
                            },
                        ) {
                            Text("$5,000.00")
                        }
                        Td(
                            attrs = {
                                style {
                                    padding(8.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                    textAlign("right")
                                    fontWeight(700)
                                }
                            },
                        ) {
                            Text("$5,000.00")
                        }
                    }
                }
            }
        }
    }
}
