
package io.github.eventide03

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.document
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        // Include the IcarusTonic styles
        // IcarusTonicStyleSheet()

        Surface(SmoothColorStyle.toModifier().minHeight(100.vh).fontFamily("Trebuchet MS", "sans-serif")) {
            content()
        }
    }
}

@InitSilk
fun initSilk(ctx: InitSilkContext) {
    // Add a script that will run after the page loads to add the favicon
    val script = document.createElement("script")
    script.textContent =
        """
        (function() {
            var link = document.createElement('link');
            link.rel = 'icon';
            link.href = '/favicon.ico';
            link.type = 'image/x-icon';
            document.head.appendChild(link);
        })();
        """.trimIndent()
    document.head?.appendChild(script)
}

/*
package io.github.eventide03

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        // Include the IcarusTonic styles
        // IcarusTonicStyleSheet()

        Surface(SmoothColorStyle.toModifier().minHeight(100.vh).fontFamily("Trebuchet MS", "sans-serif")) {
            content()
        }
    }
}
*/
