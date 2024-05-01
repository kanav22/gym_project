package com.wadhawan.mcp.gymsharkhomework.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wadhawan.mcp.gymsharkhomework.ui.screens.MainScreen
import com.wadhawan.mcp.gymsharkhomework.ui.screens.ProductDetailScreen
import com.wadhawan.mcp.gymsharkhomework.viewmodels.ProductViewModel


@Composable
fun ProductNavigation(navController: NavHostController) {
    val productViewModel: ProductViewModel = hiltViewModel()


    NavHost(navController = navController, startDestination = "mainScreen") {

        composable("mainScreen") { MainScreen(navController, productViewModel) }

        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId, productViewModel)
        }
    }
}