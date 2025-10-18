package com.freetime.ssmp.feature.dashboard

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val api: ServerApi
) : ViewModel() {
    var state by mutableStateOf(DashboardState())
        private set

    init {
        viewModelScope.launch {
            val response = api.getStatus()
            state = DashboardState(
                online = response.online,
                playersOnline = response.players.online,
                playersMax = response.players.max,
                version = response.version
            )
        }
    }
}
