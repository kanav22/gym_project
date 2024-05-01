package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import com.wadhawan.mcp.gymsharkhomework.ui.theme.darkGrey

// HorizontalPagerIndicator composable providing a horizontal pager indicator
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerIndicator(
    pagerState: PagerState,
    modifier: Modifier = Modifier,
    activeColor: Color = darkGrey,
    inactiveColor: Color = Color.Transparent,
    indicatorHeight: Dp = 5.dp,
    spacing: Dp = 2.dp
) {
    // Get the current configuration
    val configuration = LocalConfiguration.current
    // Calculate the width of each indicator
    val indicatorWidth = remember {
        (configuration.screenWidthDp.dp - (spacing * (pagerState.pageCount - 1))) / pagerState.pageCount
    }

    // Draw horizontal row of indicators
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        // Draw each indicator
        for (i in 0 until pagerState.pageCount) {
            // Determine the color of the indicator
            val color = if (i == pagerState.currentPage) activeColor else inactiveColor
            // Draw the indicator
            Box(
                modifier = Modifier
                    .padding(end = spacing)
                    .size(indicatorWidth, indicatorHeight)
                    .clip(RectangleShape)
                    .background(color)
            )
        }
    }
}