package xyz.malefic.singlepage.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import xyz.malefic.singlepage.components.*

@Page
@Composable
fun HomePage() {
    Column(Modifier.fillMaxSize()) {
        TopBar()
        HeroSection()
        RIVALSection()
        TeamSection()
        MissionSection()
        DesignsSection()
    }
}
