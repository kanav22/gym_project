package com.wadhawan.mcp.gymsharkhomework.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.wadhawan.mcp.gymsharkhomework.R
import com.wadhawan.mcp.gymsharkhomework.models.Media

@Composable
fun NetworkImage(
    media: Media,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.FillHeight,
    placeholder: Int = R.drawable.gymshark_logo, // Placeholder resource id
    error: Int = R.drawable.gymshark_logo, // Error image resource id
) {
    val imageUrl = media.src ?: "" // Handle potential null src

    AsyncImage(
        model = imageUrl,
        contentDescription = media.alt,
        modifier = modifier,
        contentScale = contentScale,
        placeholder = painterResource(id = placeholder),
        error = painterResource(id = error),
    )
}