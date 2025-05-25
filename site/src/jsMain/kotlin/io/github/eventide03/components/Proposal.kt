package io.github.eventide03.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.scrollMarginTop
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun Proposal() {
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
                            fontSize(20.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(10.px)
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
                modifier = Modifier.weight(1f),
            ) {
                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(20.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(10.px)
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
                            marginBottom(20.px)
                        }
                    },
                ) {
                    Text(
                        "We are requesting a budget of $5000 to cover the costs of materials, tools, and components needed for the robot's construction and testing. This budget will allow us to build a competitive robot that meets the requirements of the RIVAL competition.",
                    )
                }
// TODO: fix the table
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
                                Text("Plug sleeves - Plastic Tube Plug Sleeve (2\"x2\"x.06\", 1/4\" Clearance) (2-Pack) (WCP-0377)")
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
                                Text("Infrastructure mounting plate - tower mounting plate (fabworks)")
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
                            Text("Item")
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
                            Text("3\" OD x 1\" Wide Straight Flex Wheel (1-1/4\" Round Stretch, 30A) (WCP-1358)")
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
                            Text("10.25mm (3/8\" Rounded Hex) ID x 0.875\" OD x 0.280\" WD (Flanged Bearing) (WCP-0784)")
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
                            Text("Aluminum Spacers (.196\" ID x 3/8\" OD x 3/4\" WD) (5-Pack) (WCP-0217)")
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
                }
                H3(
                    attrs = {
                        style {
                            color(Color("#FFFFFF"))
                            fontSize(20.px)
                            fontWeight(500)
                            marginTop(0.px)
                            marginBottom(10.px)
                        }
                    },
                ) {
                    Text("CAD and Progress")
                }
            }
        }
    }
}
