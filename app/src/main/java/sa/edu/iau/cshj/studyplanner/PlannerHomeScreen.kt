package sa.edu.iau.cshj.studyplanner


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sa.edu.iau.cshj.studyplanner.ui.theme.StudyPlannerTheme

@Composable
fun PlannerHomeScreen(
    uiState: PlannerUiState,
    onCompleteNextTask: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = uiState.greeting,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "${uiState.completedTasks} of ${uiState.totalTasks} done",
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = onCompleteNextTask) {
            Text("Complete Next Task")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PlannerHomeScreenNothingDonePreview() {
    StudyPlannerTheme {
        PlannerHomeScreen(
            uiState = PlannerUiState(completedTasks = 0, totalTasks = 7),
            onCompleteNextTask = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PlannerHomeScreenAllDonePreview() {
    StudyPlannerTheme {
        PlannerHomeScreen(
            uiState = PlannerUiState(completedTasks = 7, totalTasks = 7),
            onCompleteNextTask = {}
        )
    }
}