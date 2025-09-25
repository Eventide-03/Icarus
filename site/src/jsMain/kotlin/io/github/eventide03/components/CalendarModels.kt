package io.github.eventide03.components

import androidx.compose.runtime.*

data class CalendarEvent(
    val id: String,
    val title: String,
    val description: String,
    val startTime: String, // Format: "HH:MM"
    val endTime: String,   // Format: "HH:MM"
    val date: String,      // Format: "YYYY-MM-DD"
    val color: String = "#D20041"
)

data class CalendarTask(
    val id: String,
    val title: String,
    val description: String,
    val startTime: String,
    val endTime: String,
    val date: String,
    val color: String = "#86BBD8"
)

enum class Theme(val displayName: String, val primaryColor: String, val backgroundColor: String) {
    LIGHT("Light", "#000000", "#FFFFFF"),
    DARK("Dark", "#FFFFFF", "#132034"),
    MAAD_BOTS("M.A.A.D Bots", "#D20041", "#132034"),
    OCEAN("Ocean", "#2196F3", "#E3F2FD"),
    FOREST("Forest", "#4CAF50", "#E8F5E8")
}

// Calendar state management
object CalendarState {
    var events by mutableStateOf(listOf<CalendarEvent>())
        private set
    
    var tasks by mutableStateOf(listOf<CalendarTask>())
        private set
    
    var currentTheme by mutableStateOf(Theme.MAAD_BOTS)
        private set
    
    fun addEvent(event: CalendarEvent) {
        events = events + event
    }
    
    fun removeEvent(eventId: String) {
        events = events.filter { it.id != eventId }
    }
    
    fun updateEvent(event: CalendarEvent) {
        events = events.map { if (it.id == event.id) event else it }
    }
    
    fun addTask(task: CalendarTask) {
        tasks = tasks + task
    }
    
    fun removeTask(taskId: String) {
        tasks = tasks.filter { it.id != taskId }
    }
    
    fun updateTask(task: CalendarTask) {
        tasks = tasks.map { if (it.id == task.id) task else it }
    }
    
    fun setTheme(theme: Theme) {
        currentTheme = theme
    }
    
    // Initialize with sample data
    init {
        events = listOf(
            CalendarEvent(
                id = "1",
                title = "Team Meeting",
                description = "Weekly team sync to discuss project progress and upcoming milestones",
                startTime = "14:00",
                endTime = "17:00",
                date = "2024-01-15"
            ),
            CalendarEvent(
                id = "2", 
                title = "Robot Testing",
                description = "Test autonomous navigation and manipulation systems",
                startTime = "10:30",
                endTime = "12:00",
                date = "2024-01-15"
            )
        )
        
        tasks = listOf(
            CalendarTask(
                id = "1",
                title = "CAD Review",
                description = "Review and finalize the robot chassis design before manufacturing",
                startTime = "09:00",
                endTime = "10:00",
                date = "2024-01-15"
            ),
            CalendarTask(
                id = "2",
                title = "Parts Ordering",
                description = "Order remaining components from the BOM list",
                startTime = "13:00",
                endTime = "13:30", 
                date = "2024-01-15"
            )
        )
    }
}