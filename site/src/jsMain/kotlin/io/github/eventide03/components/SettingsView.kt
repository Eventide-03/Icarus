package io.github.eventide03.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun SettingsView() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Color(CalendarState.currentTheme.backgroundColor))
            .styleModifier {
                paddingTop(84.px) // Account for TopBar
                padding(40.px)
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .styleModifier {
                    maxWidth(800.px)
                    property("margin", "0 auto")
                }
        ) {
            // Settings Header
            H1(
                attrs = {
                    style {
                        color(Color(CalendarState.currentTheme.primaryColor))
                        fontSize(32.px)
                        fontWeight(600)
                        marginBottom(40.px)
                        textAlign("center")
                    }
                }
            ) {
                Text("Settings")
            }
            
            // Theme Selection Section
            Div(
                attrs = {
                    style {
                        backgroundColor(Color("#FFFFFF"))
                        borderRadius(12.px)
                        padding(24.px)
                        marginBottom(24.px)
                        property("box-shadow", "0 2px 8px rgba(0, 0, 0, 0.1)")
                    }
                }
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#333"))
                            fontSize(24.px)
                            fontWeight(500)
                            marginBottom(20.px)
                        }
                    }
                ) {
                    Text("Theme Selection")
                }
                
                P(
                    attrs = {
                        style {
                            color(Color("#666"))
                            fontSize(16.px)
                            marginBottom(20.px)
                        }
                    }
                ) {
                    Text("Choose your preferred theme for the calendar interface:")
                }
                
                // Theme options grid
                Div(
                    attrs = {
                        style {
                            display(DisplayStyle.Grid)
                            property("grid-template-columns", "repeat(auto-fit, minmax(200px, 1fr))")
                            gap(16.px)
                        }
                    }
                ) {
                    Theme.values().forEach { theme ->
                        ThemeOption(
                            theme = theme,
                            isSelected = CalendarState.currentTheme == theme,
                            onSelect = { CalendarState.setTheme(theme) }
                        )
                    }
                }
            }
            
            // Current Theme Preview
            Div(
                attrs = {
                    style {
                        backgroundColor(Color("#FFFFFF"))
                        borderRadius(12.px)
                        padding(24.px)
                        property("box-shadow", "0 2px 8px rgba(0, 0, 0, 0.1)")
                    }
                }
            ) {
                H2(
                    attrs = {
                        style {
                            color(Color("#333"))
                            fontSize(24.px)
                            fontWeight(500)
                            marginBottom(20.px)
                        }
                    }
                ) {
                    Text("Current Theme Preview")
                }
                
                Div(
                    attrs = {
                        style {
                            backgroundColor(Color(CalendarState.currentTheme.backgroundColor))
                            borderRadius(8.px)
                            padding(20.px)
                            border(1.px, LineStyle.Solid, Color("#ddd"))
                        }
                    }
                ) {
                    Div(
                        attrs = {
                            style {
                                color(Color(CalendarState.currentTheme.primaryColor))
                                fontSize(18.px)
                                fontWeight(600)
                                marginBottom(12.px)
                            }
                        }
                    ) {
                        Text("Sample Event")
                    }
                    
                    Div(
                        attrs = {
                            style {
                                backgroundColor(Color("#D20041"))
                                color(Color.white)
                                padding(12.px)
                                borderRadius(6.px)
                                marginBottom(8.px)
                                display(DisplayStyle.InlineBlock)
                            }
                        }
                    ) {
                        Text("Team Meeting • 2:00 PM - 5:00 PM")
                    }
                    
                    Div(
                        attrs = {
                            style {
                                backgroundColor(Color("#86BBD8"))
                                color(Color.white)
                                padding(12.px)
                                borderRadius(6.px)
                                display(DisplayStyle.InlineBlock)
                                marginLeft(8.px)
                            }
                        }
                    ) {
                        Text("CAD Review • 9:00 AM - 10:00 AM")
                    }
                }
            }
        }
    }
}

@Composable
fun ThemeOption(
    theme: Theme,
    isSelected: Boolean,
    onSelect: () -> Unit
) {
    Div(
        attrs = {
            style {
                backgroundColor(Color(theme.backgroundColor))
                border(
                    if (isSelected) 3.px else 1.px,
                    LineStyle.Solid,
                    Color(if (isSelected) theme.primaryColor else "#ddd")
                )
                borderRadius(8.px)
                padding(16.px)
                cursor("pointer")
                property("transition", "all 0.2s ease")
            }
            onClick { onSelect() }
        }
    ) {
        Div(
            attrs = {
                style {
                    color(Color(theme.primaryColor))
                    fontSize(16.px)
                    fontWeight(600)
                    marginBottom(8.px)
                }
            }
        ) {
            Text(theme.displayName)
        }
        
        Div(
            attrs = {
                style {
                    display(DisplayStyle.Flex)
                    gap(8.px)
                    marginBottom(12.px)
                }
            }
        ) {
            Div(
                attrs = {
                    style {
                        width(20.px)
                        height(20.px)
                        backgroundColor(Color(theme.primaryColor))
                        borderRadius(4.px)
                    }
                }
            )
            Div(
                attrs = {
                    style {
                        width(20.px)
                        height(20.px)
                        backgroundColor(Color(theme.backgroundColor))
                        border(1.px, LineStyle.Solid, Color("#ccc"))
                        borderRadius(4.px)
                    }
                }
            )
        }
        
        if (isSelected) {
            Div(
                attrs = {
                    style {
                        color(Color(theme.primaryColor))
                        fontSize(14.px)
                        fontWeight(500)
                    }
                }
            ) {
                Text("✓ Selected")
            }
        } else {
            Div(
                attrs = {
                    style {
                        color(Color("#999"))
                        fontSize(14.px)
                    }
                }
            ) {
                Text("Click to select")
            }
        }
    }
}
