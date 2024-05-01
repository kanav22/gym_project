package com.wadhawan.mcp.gymsharkhomework.services

import androidx.compose.ui.unit.Dp
import com.wadhawan.mcp.gymsharkhomework.config.defaultAspectRatio


fun calculateMediaHeight(screenWidthDp: Dp) : Int {
    val imageHeight = screenWidthDp.value * defaultAspectRatio
    return imageHeight.toInt()
}
