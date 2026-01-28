package com.freetime.ssmpc.feature.servercmd

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ServerCmdScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Server Commands",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        
        // Basic Commands
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Basic Commands",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("/spawn - Teleport to spawn")
                Text("/tpa <player> - Send teleport request")
                Text("/tpaccept - Accept teleport request")
                Text("/tpdeny - Deny teleport request")
                Text("/home - Teleport to your home")
                Text("/sethome - Set your home location")
                Text("/warp <name> - Teleport to warp")
                Text("/mail read - Read your mail")
            }
        }
        
        // Economy Commands
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Economy Commands",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("/balance - Check your balance")
                Text("/pay <player> <amount> - Pay someone")
                Text("/baltop - Top balances")
                Text("/shop - Open shop GUI")
                Text("/sell - Sell items in hand")
                Text("/worth - Check item worth")
            }
        }
        
        // Land Claim Commands
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Land Claim Commands",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("/claim - Claim current chunk")
                Text("/unclaim - Unclaim current chunk")
                Text("/claims - List your claims")
                Text("/trust <player> - Trust player")
                Text("/untrust <player> - Untrust player")
                Text("/trustlist - List trusted players")
            }
        }
        
        // McMMO Commands
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "McMMO Commands",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("/mcstats - Show your stats")
                Text("/skillname <skill> - Show skill info")
                Text("/party <name> - Party management")
                Text("/inspect - Inspect blocks")
                Text("/repair - Repair items")
            }
        }
    }
}
