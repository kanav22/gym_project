package com.wadhawan.mcp.gymsharkhomework.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object TextStyles {
    val bodySmall: TextStyle @Composable get() = MaterialTheme.typography.bodySmall
    val bodyMedium: TextStyle @Composable get() = MaterialTheme.typography.bodyMedium
    val bodyLarge: TextStyle @Composable get() = MaterialTheme.typography.bodyLarge

    val displaySmall: TextStyle @Composable get() = MaterialTheme.typography.displaySmall
    val displayMedium: TextStyle @Composable get() = MaterialTheme.typography.displayMedium
    val displayLarge: TextStyle @Composable get() = MaterialTheme.typography.displayLarge

    val titleSmall: TextStyle @Composable get() = MaterialTheme.typography.titleSmall
    val titleMedium: TextStyle @Composable get() = MaterialTheme.typography.titleMedium
    val titleLarge: TextStyle @Composable get() = MaterialTheme.typography.titleLarge

    // Custom text styles

    val appTitleLarge: TextStyle @Composable get() = MaterialTheme.typography.titleLarge.copy(
        fontWeight = FontWeight.W900,
        fontSize = 18.sp
    )

    val bodySmallOnPrimary: TextStyle
        @Composable get() = MaterialTheme.typography.bodySmall.copy(
            color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.6f)
        )

    val bodyMediumBold: TextStyle
        @Composable get() = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
}