package io.github.rishthewizard.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import io.github.rishthewizard.components.DesignsSection
import io.github.rishthewizard.components.HeroSection
import io.github.rishthewizard.components.MissionSection
import io.github.rishthewizard.components.RIVALSection
import io.github.rishthewizard.components.TeamSection
import io.github.rishthewizard.components.TopBar

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
