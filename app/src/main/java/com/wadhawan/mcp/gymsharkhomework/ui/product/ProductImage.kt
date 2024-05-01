package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.wadhawan.mcp.gymsharkhomework.config.gridImageHeight
import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.ui.NetworkImage
import com.wadhawan.mcp.gymsharkhomework.ui.theme.grey
import com.wadhawan.mcp.gymsharkhomework.ui.utils.Spacer16

@Composable
fun ProductImage(
    product: Product,
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.tertiary,
            disabledContentColor = MaterialTheme.colorScheme.onPrimary,
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(gridImageHeight.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize() // Fill the entire available space
                    .background(grey), // Set the background color to grey
                contentAlignment = Alignment.Center
            ) {
                NetworkImage(product.featuredMedia)

                // Check if product has labels
                if (!product.labels.isNullOrEmpty()) {
                    // Display labels indicating product states
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp, bottom = 8.dp)
                            .align(Alignment.BottomStart)
                    ) {
                        product.labels?.forEach { label ->
                            Box(
                                modifier = Modifier
                                    .background(
                                        color = Color.DarkGray,
                                        shape = RoundedCornerShape(12.dp),
                                    )
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = label,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.White,
                                )
                            }
                            Spacer16()
                        }
                    }
                }
            }
        }
    }
}