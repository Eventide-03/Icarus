package io.github.eventide03.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.dom.Style

object AppStyles : StyleSheet()

@Composable
fun IcarusTonicStyleSheet() {
    // Create a style element with the content of IcarusTonic.css
    Style {
        """
        /* Top Bar styles */
        .top-bar-action {
            text-decoration: none;
            transition: opacity 0.2s, text-decoration 0.2s;
        }
        .top-bar-action:hover {
            opacity: 0.5;
            text-decoration: underline;
        }
        """
    }
}
