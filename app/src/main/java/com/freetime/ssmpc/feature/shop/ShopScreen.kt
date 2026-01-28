package com.freetime.ssmpc.feature.shop

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ShopScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        AndroidView(
            factory = { context ->
                android.webkit.WebView(context).apply {
                    webViewClient = android.webkit.WebViewClient()
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    loadUrl("https://store.supersmp.fun")
                }
            },
            modifier = Modifier.fillMaxSize()
        )
    }
}
