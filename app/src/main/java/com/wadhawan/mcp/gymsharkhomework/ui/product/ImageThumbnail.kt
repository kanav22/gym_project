package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.wadhawan.mcp.gymsharkhomework.config.defaultAspectRatio
import com.wadhawan.mcp.gymsharkhomework.config.thumbnailHeight
import com.wadhawan.mcp.gymsharkhomework.models.Media
import com.wadhawan.mcp.gymsharkhomework.ui.NetworkImage
import com.wadhawan.mcp.gymsharkhomework.ui.theme.grey


// ImageThumbnail composable for displaying image thumbnails
@Composable
fun ImageThumbnail(
    media: Media,
    isSelected: Boolean,
    onSelectedImage: (Media) -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clickable { onSelectedImage(media) }
            .padding(2.dp)
    ) {
        // Placeholder box with grey background
        Box(
            modifier = Modifier
                .height(thumbnailHeight.dp)
                .width((thumbnailHeight / defaultAspectRatio).dp)
                .background(grey) // Set the background color to grey
        )

        // NetworkImage component for loading actual image
        NetworkImage(
            media,
            modifier = Modifier
                .height(thumbnailHeight.dp)
                .width((thumbnailHeight / defaultAspectRatio).dp)
                .then(
                    if (isSelected) Modifier.border(2.dp, Color.Black)
                    else Modifier
                ),
        )
    }
}