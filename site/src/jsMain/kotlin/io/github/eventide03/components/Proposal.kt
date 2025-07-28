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
    // Gallery image sources
    val galleryImages =
        listOf(
            "https://home.maadbots.org/assets/cad.png",
            "https://home.maadbots.org/assets/sketch.png",
            "https://home.maadbots.org/assets/basicsketch.png",
            "https://home.maadbots.org/assets/abigailsketch.png",
            "https://home.maadbots.org/assets/recap.png",
        )

    // State for fullscreen image
    var isFullscreenActive by remember { mutableStateOf(false) }
    var fullscreenImageIndex by remember { mutableStateOf(0) }

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
                    backgroundColor(rgba(0, 0, 0, 0.55)) // Less opaque so you can see the site
                    property("z-index", "1000")
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
            // Left arrow
            if (galleryImages.size > 1) {
                Button(
                    attrs = {
                        style {
                            position(Position.Absolute)
                            left(40.px)
                            top(50.percent)
                            backgroundColor(rgba(0, 0, 0, 0.4))
                            color(Color.white)
                            border(0.px)
                            borderRadius(24.px)
                            padding(12.px)
                            fontSize(32.px)
                            cursor("pointer")
                            opacity(0.7)
                            property("z-index", "1001")
                        }
                        onClick {
                            // Prevent overlay close
                            it.stopPropagation()
                            fullscreenImageIndex = if (fullscreenImageIndex == 0) galleryImages.lastIndex else fullscreenImageIndex - 1
                        }
                    },
                ) { Text("←") }
            }

            Img(
                src = galleryImages[fullscreenImageIndex],
                attrs = {
                    style {
                        maxWidth(1200.px)
                        maxHeight(700.px)
                        width(90.percent)
                        height(90.percent)
                        property("object-fit", "contain")
                        borderRadius(12.px)
                        backgroundColor(Color("#222"))
                        display(DisplayStyle.Block)
                    }
                    // Stop propagation to prevent closing when clicking on the image itself
                    onClick { it.stopPropagation() }
                },
            )

            // Right arrow
            if (galleryImages.size > 1) {
                Button(
                    attrs = {
                        style {
                            position(Position.Absolute)
                            right(40.px)
                            top(50.percent)
                            backgroundColor(rgba(0, 0, 0, 0.4))
                            color(Color.white)
                            border(0.px)
                            borderRadius(24.px)
                            padding(12.px)
                            fontSize(32.px)
                            cursor("pointer")
                            opacity(0.7)
                            property("z-index", "1001")
                        }
                        onClick {
                            it.stopPropagation()
                            fullscreenImageIndex = if (fullscreenImageIndex == galleryImages.lastIndex) 0 else fullscreenImageIndex + 1
                        }
                    },
                ) { Text("→") }
            }
        }
    }

    Column(
        modifier =
            Modifier
                .id("proposal")
                .fillMaxWidth()
                // .maxWidth(900.px) // Remove maxWidth restriction to allow full width
                .backgroundColor(Color("#132034"))
                .styleModifier {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    padding(40.px, 24.px)
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
                src = "https://home.maadbots.org/assets/Engineering_Process.png",
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
                        "Our ideal drone features a pivoting claw mechanism and a specialized roller system guided by a vision system to manipulate game pieces. The claw can pick up and move game pieces from the floor, while the roller mechanism can interact with silos to make game pieces fall onto the floor for collection. A horizontal pivot on the claw allows manipulation from various angles with minimal drone movement. The efficiency of our manipulation mechanisms will allow for a stable quadcopter configuration, permitting resources to be prioritized towards the scoring and vision systems. Control will be split between a Raspberry Pi for general operation and an Orange Pi, dedicated to vision processing. \n This design maximizes scoring potential and adaptability, with the right sponsorship, it positions us to be highly competitive while challenging our engineering skills and strategic ability.",
                    )
                }
            }
        }

        Div(
            attrs = {
                style {
                    height(30.px)
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

                                // Use galleryImages for the gallery
                                galleryImages.forEachIndexed { idx, src ->
                                    Img(
                                        src = src,
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
                                                fullscreenImageIndex = idx
                                                isFullscreenActive = true
                                            }
                                        },
                                    )
                                }

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
                            alignSelf("flex-start")
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
                            marginBottom(10.px)
                        }
                    },
                ) {
                    Text(
                        "Below is the estimated Bill of Materials (BOM) for our drone project. This covers all major flight, control, RC, and vision components. Subtotals and a grand total are provided for transparency.",
                    )
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
                    // Header row
                    Tr {
                        listOf("Description", "Qty", "Unit Cost", "Total").forEach { header ->
                            Th(
                                attrs = {
                                    style {
                                        padding(6.px)
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

                    // --- FLIGHT HARDWARE ---
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(600)
                                    fontSize(15.px)
                                    color(Color("#D20041"))
                                    property("border-bottom", "2px solid #F5E5CC")
                                }
                                attr("colspan", "4")
                            },
                        ) {
                            Text("Flight Hardware")
                        }
                    }
                    listOf(
                        listOf("EMAX ECO II 2207 1700KV motors", "4", "\$12", "\$48"),
                        listOf("4-in-1 ESC (35–45A BLHeli_32)", "1", "\$45", "\$45"),
                        listOf("4S LiPo 2200mAh 30C battery", "1", "\$30", "\$30"),
                        listOf("XT60 power splitter/harness", "1", "\$8", "\$8"),
                        listOf("3-blade 5\" or 6\" propellers", "4", "\$2", "\$8"),
                        listOf("5V 5A BEC/UBEC", "1", "\$12", "\$12"),
                        listOf("Vibration dampening foam/pads", "1", "\$5", "\$5"),
                        listOf("Screw/wire/mounting kit", "1", "\$10", "\$10"),
                    ).forEach { row ->
                        Tr {
                            row.forEachIndexed { idx, cell ->
                                Td(
                                    attrs = {
                                        style {
                                            padding(6.px)
                                            property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                            if (idx == 1) textAlign("center")
                                            if (idx >= 2) textAlign("right")
                                        }
                                    },
                                ) { Text(cell) }
                            }
                        }
                    }
                    // Subtotal row
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    property("border-top", "1px solid #F5E5CC")
                                }
                                attr("colspan", "3")
                            },
                        ) { Text("Flight hardware subtotal") }
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    textAlign("right")
                                    property("border-top", "1px solid #F5E5CC")
                                }
                            },
                        ) { Text("\$166") }
                    }

                    // --- FLIGHT CONTROL & NAVIGATION ---
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(600)
                                    fontSize(15.px)
                                    color(Color("#D20041"))
                                    property("border-bottom", "2px solid #F5E5CC")
                                }
                                attr("colspan", "4")
                            },
                        ) {
                            Text("Flight Control & Navigation")
                        }
                    }
                    listOf(
                        listOf("Navio2 flight controller", "1", "\$250", "\$250"),
                        listOf("MicroSD card (32–64GB)", "1", "\$10", "\$10"),
                        listOf("Heatsink + fan kit for Pi 5", "1", "\$10", "\$10"),
                        listOf("GPS module (Ublox M8N)", "1", "\$20", "\$20"),
                    ).forEach { row ->
                        Tr {
                            row.forEachIndexed { idx, cell ->
                                Td(
                                    attrs = {
                                        style {
                                            padding(6.px)
                                            property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                            if (idx == 1) textAlign("center")
                                            if (idx >= 2) textAlign("right")
                                        }
                                    },
                                ) { Text(cell) }
                            }
                        }
                    }
                    // Subtotal row
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    property("border-top", "1px solid #F5E5CC")
                                }
                                attr("colspan", "3")
                            },
                        ) { Text("Flight control + power subtotal") }
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    textAlign("right")
                                    property("border-top", "1px solid #F5E5CC")
                                }
                            },
                        ) { Text("\$270") }
                    }

                    // --- RC CONTROL SYSTEM ---
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(600)
                                    fontSize(15.px)
                                    color(Color("#D20041"))
                                    property("border-bottom", "2px solid #F5E5CC")
                                }
                                attr("colspan", "4")
                            },
                        ) {
                            Text("RC Control System")
                        }
                    }
                    listOf(
                        listOf("FlySky FS-i6X Transmitter (TX)", "1", "\$55", "\$55"),
                        listOf("FlySky iA6B Receiver (RX)", "1", "\$18", "\$18"),
                        listOf("Servo extension cables", "1", "\$5", "\$5"),
                        listOf("AA Batteries or Li-ion pack for TX", "1", "\$5–10", "\$5–10"),
                    ).forEach { row ->
                        Tr {
                            row.forEachIndexed { idx, cell ->
                                Td(
                                    attrs = {
                                        style {
                                            padding(6.px)
                                            property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                            if (idx == 1) textAlign("center")
                                            if (idx >= 2) textAlign("right")
                                        }
                                    },
                                ) { Text(cell) }
                            }
                        }
                    }
                    // Subtotal row
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    property("border-top", "1px solid #F5E5CC")
                                }
                                attr("colspan", "3")
                            },
                        ) { Text("RC control system subtotal") }
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    textAlign("right")
                                    property("border-top", "1px solid #F5E5CC")
                                }
                            },
                        ) { Text("\$83") }
                    }

                    // --- VISION SYSTEM ---
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(600)
                                    fontSize(15.px)
                                    color(Color("#D20041"))
                                    property("border-bottom", "2px solid #F5E5CC")
                                }
                                attr("colspan", "4")
                            },
                        ) {
                            Text("Vision System")
                        }
                    }
                    listOf(
                        listOf("Raspberry Pi Camera v3 (12MP autofocus)", "1", "\$30", "\$30"),
                        listOf("Camera ribbon cable (30cm)", "1", "\$4", "\$4"),
                        listOf("Mount (3D printed or clamp)", "1", "\$5", "\$5"),
                    ).forEach { row ->
                        Tr {
                            row.forEachIndexed { idx, cell ->
                                Td(
                                    attrs = {
                                        style {
                                            padding(6.px)
                                            property("border-bottom", "1px solid rgba(245, 229, 204, 0.3)")
                                            if (idx == 1) textAlign("center")
                                            if (idx >= 2) textAlign("right")
                                        }
                                    },
                                ) { Text(cell) }
                            }
                        }
                    }
                    // Subtotal row
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    property("border-top", "1px solid #F5E5CC")
                                }
                                attr("colspan", "3")
                            },
                        ) { Text("Vision system subtotal") }
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    fontWeight(700)
                                    textAlign("right")
                                    property("border-top", "1px solid #F5E5CC")
                                }
                            },
                        ) { Text("\$38") }
                    }

                    // --- GRAND TOTAL ---
                    Tr {
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                    fontWeight(700)
                                }
                                attr("colspan", "3")
                            },
                        ) { Text("Grand Total") }
                        Td(
                            attrs = {
                                style {
                                    padding(6.px)
                                    property("border-top", "2px solid #F5E5CC")
                                    property("border-bottom", "2px solid #F5E5CC")
                                    textAlign("right")
                                    fontWeight(700)
                                }
                            },
                        ) { Text("\$557 (approx.)") }
                    }
                }
            }
        }
    }
}
