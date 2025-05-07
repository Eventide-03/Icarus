package xyz.malefic.singlepage

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Style
import xyz.malefic.singlepage.components.IcarusTonicStyleSheet

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        // Include the IcarusTonic styles
        IcarusTonicStyleSheet()

        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
