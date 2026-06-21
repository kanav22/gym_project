package com.wadhawan.mcp.gymsharkhomework.ui.screens

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import com.wadhawan.mcp.gymsharkhomework.utils.navControllerMock
import com.wadhawan.mcp.gymsharkhomework.utils.productViewModelMock
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(instrumentedPackages = ["androidx.loader.content"],sdk = [34], manifest=Config.NONE)
@RunWith(RobolectricTestRunner::class)
class ProductDetailScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun productDetailScreen_loading_showsProgressIndicator() {
        val testProductId = "123"
        val mockNavController = navControllerMock
        val mockViewModel = productViewModelMock

        // Assume getProduct initially returns null
        Mockito.`when`(mockViewModel.getProduct(testProductId)).thenReturn(null)

        composeTestRule.setContent {
            ProductDetailScreen(
                navController = mockNavController,
                productId = testProductId,
                productViewModel = mockViewModel
            )
        }

        // Use Compose testing APIs to assert that the CircularProgressIndicator is displayed
        composeTestRule.onNodeWithContentDescription("Loading").assertExists()
    }
}