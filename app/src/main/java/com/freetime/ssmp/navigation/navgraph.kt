package com.freetime.ssmp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = "dashboard") {
        composable("dashboard") { DashboardScreen() }
        composable("shop") { ShopScreen() }
        composable("events") { EventsScreen() }
        composable("auth") { AuthScreen() }
    }
}
