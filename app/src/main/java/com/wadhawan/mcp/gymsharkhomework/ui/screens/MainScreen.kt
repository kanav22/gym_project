package com.wadhawan.mcp.gymsharkhomework.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.wadhawan.mcp.gymsharkhomework.R

import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.ui.TopAppBarScaffold
import com.wadhawan.mcp.gymsharkhomework.ui.product.ProductList
import com.wadhawan.mcp.gymsharkhomework.viewmodels.ProductViewModel

@Composable
fun MainScreen(
    navController: NavController,
    productViewModel: ProductViewModel,
) {

    if(productViewModel.products.value == null) {
        productViewModel.fetchProducts(navController.context)
    }

    val products = productViewModel.products.observeAsState(initial = mapOf()).value

    TopAppBarScaffold(
        title = stringResource(id = R.string.home_screen_title),
        navController = navController,
        content = {
            MainScreenContent(navController, products, )
        }
    )
}

@Composable
fun MainScreenContent(
    navController: NavController,
    products: Map<String, Product>,
) {
    ProductList(
        products,
        navController,
    )
}