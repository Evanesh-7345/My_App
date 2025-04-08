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
    val _stats= MutableStateFlow(
        listOf(
            DashboardStat(tittle = "Revenue", value = "12000", Icons.Default.Phone, Color.Cyan),
            DashboardStat(tittle = "Revenue", value = "1456", Icons.Default.Person ,Color.Cyan),
        )
    )
    val stats: StateFlow<List<DashboardStat>>get() = _stats
    private val _quickAction= MutableStateFlow(
        listOf(
            QuickAction(tittle = "Add new user", Icons.Default.Person),
            QuickAction(tittle = "Generate Report", Icons.Default.AccountCircle),
            QuickAction(tittle = "Settings", Icons.Default.Settings)
        )
    )
    val quickAction: StateFlow<List<QuickAction>>get() = _quickAction
}