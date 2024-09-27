package com.example.core.presentation.run_overview

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.SessionStorage
import com.example.core.domain.run.RunRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class RunOverviewViewModel(
    private val runRepository: RunRepository,
//    private val syncRunScheduler: SyncRunScheduler,
    private val applicationScope: CoroutineScope,
    private val sessionStorage: SessionStorage
): ViewModel() {

    var state by mutableStateOf(RunOverviewState())
        private set

    init {
//        viewModelScope.launch {
//            syncRunScheduler.scheduleSync(
//                type = SyncRunScheduler.SyncType.FetchRuns(30.minutes)
//            )
//        }
//        runRepository.getRuns().onEach { runs ->
//            val runsUi = runs.map { it.toRunUi() }
//            state = state.copy(runs = runsUi)
//        }.launchIn(viewModelScope)

        viewModelScope.launch {
            runRepository.syncPendingRuns()
            runRepository.fetchRuns()
        }
    }

    fun onAction(action: RunOverviewAction) {
        when (action) {
//            RunOverviewAction.OnLogoutClick -> logout()
            RunOverviewAction.OnStartClick -> Unit
            is RunOverviewAction.DeleteRun -> {
                viewModelScope.launch {
                    runRepository.deleteRun(action.runUi.id)
                }
            }
            else -> Unit
        }
    }
}