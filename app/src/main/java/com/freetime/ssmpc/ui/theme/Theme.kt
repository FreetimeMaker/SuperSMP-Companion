package com.freetime.ssmpc.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = SuperSMPPrimaryDark,
    onPrimary = SuperSMPOnPrimaryDark,
    primaryContainer = SuperSMPPrimaryContainerDark,
    onPrimaryContainer = SuperSMPOnPrimaryContainerDark,
    secondary = SuperSMPSecondaryDark,
    onSecondary = SuperSMPOnSecondaryDark,
    secondaryContainer = SuperSMPSecondaryContainerDark,
    onSecondaryContainer = SuperSMPOnSecondaryContainerDark,
    tertiary = SuperSMPTertiaryDark,
    onTertiary = SuperSMPOnTertiaryDark,
    tertiaryContainer = SuperSMPTertiaryContainerDark,
    onTertiaryContainer = SuperSMPOnTertiaryContainerDark,
    background = SuperSMPBackgroundDark,
    onBackground = SuperSMPOnBackgroundDark,
    surface = SuperSMPSurfaceDark,
    onSurface = SuperSMPOnSurfaceDark
)

private val LightColorScheme = lightColorScheme(
    primary = SuperSMPPrimary,
    onPrimary = SuperSMPOnPrimary,
    primaryContainer = SuperSMPPrimaryContainer,
    onPrimaryContainer = SuperSMPOnPrimaryContainer,
    secondary = SuperSMPSecondary,
    onSecondary = SuperSMPOnSecondary,
    secondaryContainer = SuperSMPSecondaryContainer,
    onSecondaryContainer = SuperSMPOnSecondaryContainer,
    tertiary = SuperSMPTertiary,
    onTertiary = SuperSMPOnTertiary,
    tertiaryContainer = SuperSMPTertiaryContainer,
    onTertiaryContainer = SuperSMPOnTertiaryContainer,
    background = SuperSMPBackground,
    onBackground = SuperSMPOnBackground,
    surface = SuperSMPSurface,
    onSurface = SuperSMPOnSurface
)

@Composable
fun SuperSMPCompanionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Use custom SuperSMP theme instead of dynamic colors
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}