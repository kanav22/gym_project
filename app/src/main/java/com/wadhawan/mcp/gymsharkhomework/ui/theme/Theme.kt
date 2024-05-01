package com.wadhawan.mcp.gymsharkhomework.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = black,
    secondary = grey,
    tertiary = white
)

val LightColorScheme = lightColorScheme(
    surface = white,
    onSurface = black,
    background = white,
    onBackground = black,
    primary = darkGrey,
    onPrimary = black,
    secondary = grey,
    onSecondary = black,
    tertiary = white,
    onTertiary = black
)

@Composable
fun GymsharkHomeworkTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = getColorScheme(darkTheme, dynamicColor)

    val view = LocalView.current
    if (!view.isInEditMode) {
        applyStatusBarColor(colorScheme.primary, darkTheme)
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}

@Composable
private fun getColorScheme(darkTheme: Boolean, dynamicColor: Boolean): ColorScheme {
    return when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
}

@Composable
private fun applyStatusBarColor(primaryColor: Color, darkTheme: Boolean) {
    val window = (LocalView.current.context as? Activity)?.window
    window?.statusBarColor = primaryColor.toArgb()
    WindowCompat.getInsetsController(window!!, LocalView.current)?.isAppearanceLightStatusBars = darkTheme
}