package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.wadhawan.mcp.gymsharkhomework.utils.testProduct
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(instrumentedPackages = ["androidx.loader.content"],sdk = [34], manifest= Config.NONE)
@RunWith(RobolectricTestRunner::class)
class ProductListTileTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    @Config(qualifiers="en-rGB")
    fun productListTile_showsProductData() {

        composeTestRule.setContent {
            ProductListTile(
                product = testProduct,
                onClick = { },
            )
        }

        composeTestRule.onNodeWithText(testProduct.title).assertIsDisplayed()
        composeTestRule.onNodeWithText("Price: $${testProduct.price}").assertIsDisplayed()
    }
}