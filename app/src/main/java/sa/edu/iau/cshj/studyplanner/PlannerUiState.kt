package sa.edu.iau.cshj.studyplanner


import androidx.compose.runtime.Immutable

@Immutable
data class PlannerUiState(
    val greeting: String = "Welcome Back",
    val completedTasks: Int = 3,
    val totalTasks: Int = 7
)