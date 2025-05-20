package io.github.eventide03.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import io.github.eventide03.components.Branding
import io.github.eventide03.components.Footer
import io.github.eventide03.components.Home
import io.github.eventide03.components.Mission
import io.github.eventide03.components.Proposal
import io.github.eventide03.components.RIVAL
import io.github.eventide03.components.Team
import io.github.eventide03.components.TopBar

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
