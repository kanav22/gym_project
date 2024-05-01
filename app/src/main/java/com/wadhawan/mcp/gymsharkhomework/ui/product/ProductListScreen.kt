package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.services.calculateGridColumns



@Composable
fun ProductList(
    products: Map<String, Product>,
    navController: NavController,
) {
    val configuration = LocalConfiguration.current
    val gridColumns = calculateGridColumns(configuration)

    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(2.dp)) {
            //
            LazyVerticalGrid(
                columns = GridCells.Fixed(gridColumns),
                contentPadding = PaddingValues(4.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(
                    products.size,
                    key = { index -> products.values.elementAt(index).id }
                ) { index ->
                    val product = products.values.elementAt(index)
                    val context = LocalContext.current

                    ProductListTile(
                        product = product,
                        onClick = {
                            navController.navigate(
                                "productDetail/${product.id}"
                            )
                        },
                    )
                }
            }
        }

    }
}

