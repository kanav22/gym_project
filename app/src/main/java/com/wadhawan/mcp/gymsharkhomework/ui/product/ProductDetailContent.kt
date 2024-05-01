package com.wadhawan.mcp.gymsharkhomework.ui.product


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.ui.utils.Spacer8
import kotlinx.coroutines.launch


// ProductDetailContent composable displaying product details
@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailContent(
    product: Product
) {
    // Remember scroll state for vertical scrolling
    val scrollState = rememberScrollState()
    // Remember coroutine scope for launching coroutines
    val coroutineScope = rememberCoroutineScope()
    // Remember modal bottom sheet state for handling bottom sheet interactions
    val modalBottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden
    )

    // Modal bottom sheet layout for displaying size picker bottom sheet
    ModalBottomSheetLayout(
        sheetState = modalBottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        sheetContent = {
            //SizePickerBottomSheet(product)
        }
    ) {
        // Main content column
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            // Product featured image column
            ProductFeaturedImageColumn(product)

            // Product information column
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Spacer8()
                ProductInfoColumn(product = product)
            }

            // Description section
            if (product.description.isNotEmpty()) {
                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp), thickness = 1.dp)
                SimpleHtmlText(
                    product.description,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
                Spacer8()
            }

            // Additional space at the bottom
            Spacer8()
        }
    }
}