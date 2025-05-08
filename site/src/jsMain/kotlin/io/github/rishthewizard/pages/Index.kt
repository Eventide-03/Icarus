package io.github.rishthewizard.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import io.github.rishthewizard.components.Branding
import io.github.rishthewizard.components.Footer
import io.github.rishthewizard.components.Home
import io.github.rishthewizard.components.Mission
import io.github.rishthewizard.components.Proposal
import io.github.rishthewizard.components.RIVAL
import io.github.rishthewizard.components.Team
import io.github.rishthewizard.components.TopBar

@Page
@Composable
fun HomePage() {
    Column(Modifier.fillMaxSize()) {
        TopBar()
        Home()
        RIVAL()
        Proposal()
        Mission()
        Team()
        Branding()
        Footer()
    }
}
