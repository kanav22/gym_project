package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import com.wadhawan.mcp.gymsharkhomework.config.testProduct
import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.ui.utils.Spacer16
import com.wadhawan.mcp.gymsharkhomework.ui.utils.Spacer8


@Composable
fun ProductListTile(
    product: Product,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clickable(onClick = onClick)
            .semantics { contentDescription = product.title },
    ) {
        ProductImage(
            product = product,
        )
        Spacer8()
        ProductInfoColumn(product = product)
        Spacer16()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProductListTile() {

    ProductListTile(
        product = testProduct,
        onClick = {},
        modifier = Modifier.fillMaxWidth()
    )
}
