package com.freetime.ssmp.feature.dashboard

@Composable
fun DashboardScreen(viewModel: DashboardViewModel = hiltViewModel()) {
    val state = viewModel.state
    Column(modifier = Modifier.padding(16.dp)) {
        Text("SuperSMP", style = MaterialTheme.typography.headlineMedium)
        if (state.online) {
            Text("Online with ${state.playersOnline}/${state.playersMax} Players")
            Text("Version: ${state.version}")
        } else {
            Text("Server is offline")
        }
    }
}
