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
fun CalendarView() {
    var hoveredEvent by remember { mutableStateOf<String?>(null) }
    var hoveredTask by remember { mutableStateOf<String?>(null) }
    var draggedItem by remember { mutableStateOf<String?>(null) }
    var tooltipPosition by remember { mutableStateOf(Pair(0, 0)) }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Color(CalendarState.currentTheme.backgroundColor))
            .styleModifier {
                paddingTop(84.px) // Account for TopBar
                padding(20.px)
            }
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Calendar Header
            H1(
                attrs = {
                    style {
                        color(Color(CalendarState.currentTheme.primaryColor))
                        fontSize(32.px)
                        fontWeight(600)
                        marginBottom(20.px)
                        textAlign("center")
                    }
                }
            ) {
                Text("Calendar - January 15, 2024")
            }
            
            // Time grid container
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .styleModifier {
                        position(Position.Relative)
                        height(1440.px) // 24 hours * 60px per hour
                        border(1.px, LineStyle.Solid, Color("#ccc"))
                        borderRadius(8.px)
                        backgroundColor(Color("#FFFFFF"))
                    }
            ) {
                // Time labels and grid lines
                repeat(48) { halfHourIndex -> // 48 half-hour blocks in 24 hours
                    val hour = halfHourIndex / 2
                    val minute = if (halfHourIndex % 2 == 0) "00" else "30"
                    val timeLabel = "${hour.toString().padStart(2, '0')}:$minute"
                    val topPosition = halfHourIndex * 30 // 30px per half hour
                    
                    // Time label
                    Div(
                        attrs = {
                            style {
                                position(Position.Absolute)
                                top(topPosition.px)
                                left(0.px)
                                width(60.px)
                                height(30.px)
                                display(DisplayStyle.Flex)
                                alignItems(AlignItems.Center)
                                justifyContent(JustifyContent.Center)
                                fontSize(12.px)
                                color(Color("#666"))
                                property("border-right", "1px solid #eee")
                                backgroundColor(Color("#f9f9f9"))
                            }
                        }
                    ) {
                        Text(timeLabel)
                    }
                    
                    // Grid line
                    Div(
                        attrs = {
                            style {
                                position(Position.Absolute)
                                top(topPosition.px)
                                left(60.px)
                                right(0.px)
                                height(1.px)
                                backgroundColor(Color(if (halfHourIndex % 2 == 0) "#ddd" else "#eee"))
                            }
                        }
                    )
                }
                
                // Events
                CalendarState.events.forEach { event ->
                    CalendarEventBlock(
                        event = event,
                        isHovered = hoveredEvent == event.id,
                        onHover = { isHovered, x, y ->
                            hoveredEvent = if (isHovered) event.id else null
                            if (isHovered) {
                                tooltipPosition = Pair(x, y)
                            }
                        }
                    )
                }
                
                // Tasks
                CalendarState.tasks.forEach { task ->
                    CalendarTaskBlock(
                        task = task,
                        isHovered = hoveredTask == task.id,
                        onHover = { isHovered, x, y ->
                            hoveredTask = if (isHovered) task.id else null
                            if (isHovered) {
                                tooltipPosition = Pair(x, y)
                            }
                        }
                    )
                }
            }
        }
        
        // Tooltip for hovered events/tasks
        hoveredEvent?.let { eventId ->
            val event = CalendarState.events.find { it.id == eventId }
            event?.let {
                EventTooltip(
                    title = it.title,
                    description = it.description,
                    time = "${it.startTime} - ${it.endTime}",
                    x = tooltipPosition.first + 20, // Offset to avoid overlap
                    y = tooltipPosition.second - 10
                )
            }
        }
        
        hoveredTask?.let { taskId ->
            val task = CalendarState.tasks.find { it.id == taskId }
            task?.let {
                EventTooltip(
                    title = it.title,
                    description = it.description,
                    time = "${it.startTime} - ${it.endTime}",
                    x = tooltipPosition.first + 20,
                    y = tooltipPosition.second - 10
                )
            }
        }
    }
}

@Composable
fun CalendarEventBlock(
    event: CalendarEvent,
    isHovered: Boolean,
    onHover: (Boolean, Int, Int) -> Unit
) {
    val startMinutes = timeToMinutes(event.startTime)
    val endMinutes = timeToMinutes(event.endTime)
    val duration = endMinutes - startMinutes
    val topPosition = (startMinutes / 30.0 * 30).toInt() // 30px per half-hour
    val height = (duration / 30.0 * 30).toInt()
    
    Div(
        attrs = {
            style {
                position(Position.Absolute)
                top(topPosition.px)
                left(80.px) // Offset for time labels
                width(200.px)
                height(height.px)
                backgroundColor(Color(event.color))
                color(Color.white)
                borderRadius(4.px)
                padding(8.px)
                cursor("pointer")
                if (isHovered) {
                    property("box-shadow", "0 4px 8px rgba(0, 0, 0, 0.3)")
                    property("transform", "scale(1.02)")
                }
                property("transition", "all 0.2s ease")
                property("z-index", "10")
            }
            onMouseEnter { event ->
                onHover(true, event.clientX.toInt(), event.clientY.toInt())
            }
            onMouseLeave { 
                onHover(false, 0, 0)
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    fontSize(14.px)
                    fontWeight(600)
                    marginBottom(4.px)
                }
            }
        ) {
            Text(event.title)
        }
        Div(
            attrs = {
                style {
                    fontSize(12.px)
                    opacity(0.9)
                }
            }
        ) {
            Text("${event.startTime} - ${event.endTime}")
        }
    }
}

@Composable
fun CalendarTaskBlock(
    task: CalendarTask,
    isHovered: Boolean,
    onHover: (Boolean, Int, Int) -> Unit
) {
    val startMinutes = timeToMinutes(task.startTime)
    val endMinutes = timeToMinutes(task.endTime)
    val duration = endMinutes - startMinutes
    val topPosition = (startMinutes / 30.0 * 30).toInt()
    val height = (duration / 30.0 * 30).toInt()
    
    Div(
        attrs = {
            style {
                position(Position.Absolute)
                top(topPosition.px)
                left(300.px) // Offset to not overlap with events
                width(200.px)
                height(height.px)  
                backgroundColor(Color(task.color))
                color(Color.white)
                borderRadius(4.px)
                padding(8.px)
                cursor("pointer")
                if (isHovered) {
                    property("box-shadow", "0 4px 8px rgba(0, 0, 0, 0.3)")
                    property("transform", "scale(1.02)")
                }
                property("transition", "all 0.2s ease")
                property("z-index", "10")
            }
            onMouseEnter { event ->
                onHover(true, event.clientX.toInt(), event.clientY.toInt())
            }
            onMouseLeave {
                onHover(false, 0, 0)
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    fontSize(14.px)
                    fontWeight(600)
                    marginBottom(4.px)
                }
            }
        ) {
            Text(task.title)
        }
        Div(
            attrs = {
                style {
                    fontSize(12.px)
                    opacity(0.9)
                }
            }
        ) {
            Text("${task.startTime} - ${task.endTime}")
        }
    }
}

@Composable
fun EventTooltip(
    title: String,
    description: String,
    time: String,
    x: Int,
    y: Int
) {
    Div(
        attrs = {
            style {
                position(Position.Fixed)
                left(x.px)
                top(y.px)
                backgroundColor(Color("#333"))
                color(Color.white)
                padding(12.px)
                borderRadius(8.px)
                property("box-shadow", "0 4px 12px rgba(0, 0, 0, 0.3)")
                maxWidth(300.px)
                property("z-index", "1000")
                fontSize(14.px)
                property("pointer-events", "none") // Prevent tooltip from interfering with mouse events
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    fontWeight(600)
                    marginBottom(8.px)
                }
            }
        ) {
            Text(title)
        }
        Div(
            attrs = {
                style {
                    marginBottom(8.px)
                    opacity(0.9)
                }
            }
        ) {
            Text(time)
        }
        Div(
            attrs = {
                style {
                    opacity(0.8)
                    property("line-height", "1.4")
                }
            }
        ) {
            Text(description)
        }
    }
}

// Helper function to convert time string to minutes
private fun timeToMinutes(time: String): Int {
    val parts = time.split(":")
    return parts[0].toInt() * 60 + parts[1].toInt()
}
