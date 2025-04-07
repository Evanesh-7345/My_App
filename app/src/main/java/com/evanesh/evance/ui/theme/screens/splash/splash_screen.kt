package com.evanesh.evance.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.evanesh.evance.navigation.ROUTE_HOME
import kotlinx.coroutines.delay
import com.evanesh.evance.R

@Composable
fun Splash_Screen(navController: NavHostController) {
//    Show splash screen for 3 seconds
    LaunchedEffect(Unit) {
        delay(timeMillis = 3000)//Splash screen duration
        navController.navigate(ROUTE_HOME)//Navigate to home screen after delay
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        //Splash screen content (logo or image)
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = "Splash Logo",
            modifier = Modifier.size(800.dp),
        )
    }

}