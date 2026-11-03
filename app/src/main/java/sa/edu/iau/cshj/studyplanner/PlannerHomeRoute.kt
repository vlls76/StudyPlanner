package sa.edu.iau.cshj.studyplanner


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun PlannerHomeRoute(
    modifier: Modifier = Modifier
) {
    var uiState by remember { mutableStateOf(PlannerUiState()) }

    PlannerHomeScreen(
        uiState = uiState,
        onCompleteNextTask = {
            if (uiState.completedTasks < uiState.totalTasks) {
                uiState = uiState.copy(completedTasks = uiState.completedTasks + 1)
            }
        },
        modifier = modifier
    )
}