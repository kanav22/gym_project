package com.wadhawan.mcp.gymsharkhomework.utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.wadhawan.mcp.gymsharkhomework.ui.theme.LightColorScheme
import com.wadhawan.mcp.gymsharkhomework.ui.theme.typography

@Composable
fun TestTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = typography,
        content = content
    )
}