package com.freetime.ssmpc.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.freetime.ssmpc.feature.home.HomeScreen
import com.freetime.ssmpc.feature.servercmd.ServerCmdScreen
import com.freetime.ssmpc.feature.links.LinksScreen
import com.freetime.ssmpc.feature.map.MapScreen
import com.freetime.ssmpc.feature.shop.ShopScreen

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) { 
            HomeScreen()
        }
        composable(BottomNavItem.ServerCmd.route) { 
            ServerCmdScreen()
        }
        composable(BottomNavItem.Links.route) { 
            LinksScreen(navController = navController)
        }
        composable(BottomNavItem.Map.route) { 
            MapScreen()
        }
        composable(BottomNavItem.Shop.route) { 
            ShopScreen()
        }
        
        // Voting screens
        composable("vote1") { VotingWebViewScreen("Planet Minecraft", "https://www.planetminecraft.com/server/supersmp-fun/vote/") }
        composable("vote2") { VotingWebViewScreen("Minecraft Servers", "https://minecraftservers.org/vote/647630") }
        composable("vote3") { VotingWebViewScreen("Top Minecraft Servers", "https://topminecraftservers.org/vote/34919") }
        composable("vote4") { VotingWebViewScreen("Minecraft-MP", "https://minecraft-mp.com/server-s338350/vote/") }
    }
}

@Composable
fun VotingWebViewScreen(siteName: String, siteUrl: String) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Top bar with back button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Navigate back */ }) {
                Text("←")
            }
            Text(
                text = siteName,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        }
        
        // WebView
        AndroidView(
            factory = { context ->
                android.webkit.WebView(context).apply {
                    webViewClient = android.webkit.WebViewClient()
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    loadUrl(siteUrl)
                }
            },
            modifier = Modifier.fillMaxSize()
        )
    }
}
