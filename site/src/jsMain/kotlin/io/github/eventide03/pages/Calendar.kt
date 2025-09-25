package io.github.eventide03.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import io.github.eventide03.components.CalendarView
import io.github.eventide03.components.TopBar

@Page("/calendar")
@Composable
fun CalendarPage() {
    Column(Modifier.fillMaxSize()) {
        TopBar()
        CalendarView()
    }
}