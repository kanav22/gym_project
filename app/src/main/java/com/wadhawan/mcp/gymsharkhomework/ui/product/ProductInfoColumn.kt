package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wadhawan.mcp.gymsharkhomework.config.testProduct
import com.wadhawan.mcp.gymsharkhomework.models.Product


@Composable
fun ProductInfoColumn(product: Product) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp) // Add padding for spacing
    ) {
        Text(
            text = product.title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            color = MaterialTheme.colors.onSurface // Use onSurface color for text
        )
        Spacer(modifier = Modifier.height(8.dp)) // Add vertical space

        Spacer(modifier = Modifier.height(8.dp)) // Add vertical space

        Text(
            text = "Price: $${product.price}",
            style = MaterialTheme.typography.body1.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.secondary // Use secondary color for price
            ),
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(8.dp)) // Add vertical space
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProductInfoColumn() {

    ProductInfoColumn(
        product = testProduct,
    )
}