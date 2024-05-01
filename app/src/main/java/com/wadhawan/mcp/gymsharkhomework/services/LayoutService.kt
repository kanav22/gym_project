package com.wadhawan.mcp.gymsharkhomework.services

import android.content.res.Configuration
import androidx.compose.ui.unit.dp

// Function to calculate the number of grid columns based on screen configuration
fun calculateGridColumns(configuration: Configuration): Int {
    // Convert screen width and height from dp to pixels
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    // Check if screen is in landscape orientation
    if (screenWidth > screenHeight) {
        return 3 // Return 3 columns for landscape orientation
    }

    // Determine the number of columns based on screen width
    return when {
        screenWidth >= 800.dp -> 4 // Return 4 columns for large screens
        screenWidth >= 600.dp -> 3 // Return 3 columns for medium screens
        else -> 2 // Return 2 columns for small screens
    }
}
