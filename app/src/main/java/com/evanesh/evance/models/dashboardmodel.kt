package com.evanesh.evance.models

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class DashboardStat(
    val tittle: String,
    val value: String,
    val icon: ImageVector,
    val background:Color
)
data class QuickAction(
    val tittle: String,
    val icon: ImageVector
)