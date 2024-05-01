package com.wadhawan.mcp.gymsharkhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.wadhawan.mcp.gymsharkhomework.ui.ProductNavigation
import com.wadhawan.mcp.gymsharkhomework.ui.theme.GymsharkHomeworkTheme
import com.wadhawan.mcp.gymsharkhomework.viewmodels.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint




// MainActivity class
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Install splash screen
        installSplashScreen()

        // Get view model instance
        val viewModel: ProductViewModel by viewModels()
        // Fetch products
        viewModel.fetchProducts(this)

        // Set content
        setContent {
            // Remember nav controller
            val navController = rememberNavController()
            // Surface for displaying content
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                // Product navigation composable
                ProductNavigation(navController)
            }
        }
    }
}
