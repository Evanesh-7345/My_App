package com.evanesh.evance.ui.theme.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.evanesh.evance.data.DashboardViewModel

@Composable
fun Dashboard_Screen(viewModel: DashboardViewModel=viewModel()) {
    val stats by viewModel.stats.collectAsState()
    val action by viewModel.quickAction.collectAsState()


    Surface(modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp))
    }

}


