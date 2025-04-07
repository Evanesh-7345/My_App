package com.evanesh.evance.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.evanesh.evance.models.DashboardStat
import com.evanesh.evance.models.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel: ViewModel(){
    private val _stats= MutableStateFlow(
        listOf(
            DashboardStat("Revenue","12000", Icons.Default.Phone, Color.Magenta),
            DashboardStat("User","1456",Icons.Default.Person, Color.Cyan)
        )
    )
//    val stats: StateFlow<List<DashboardStat>>=_stats
    private val quickAction=MutableStateFlow(
        listOf(
            QuickAction("Add a new user", Icons.Default.Person),
            QuickAction("Generate report", Icons.Default.AccountCircle),
            QuickAction("Setting",Icons.Default.Settings),
        )
    )
    val quickAction: StateFlow<List<QuickAction>>get()=_quickAction


}