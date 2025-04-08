package com.evanesh.evance.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.evanesh.evance.R
import com.evanesh.evance.navigation.ROUTE_DASHBOARD
import com.evanesh.evance.navigation.ROUTE_LOGIN
import com.evanesh.evance.navigation.ROUTE_REGISTER

@Composable
fun Home_Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {Spacer(modifier = Modifier.height(40.dp))
        Text(

            text = "Welcome to Evance's app",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
            fontStyle = FontStyle.Normal
        )

        Spacer(modifier = Modifier.height(1.dp).width(1.dp))
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Coding",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Text(text = "Welcome to coding and programming",
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black,
            fontStyle = FontStyle.Normal)

        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            Text(
                text = "Login",
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            Text(
                text = "Register",
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {navController.navigate(ROUTE_DASHBOARD)},
            modifier = Modifier.fillMaxWidth(0.5f)
        ){Text(
            text = "Dashboard",
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.White)}
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePrev() {
    Home_Screen(rememberNavController())
}