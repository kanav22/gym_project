package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
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

        composeTestRule
            .onAllNodes(hasText(testProduct.title))
            .assertCountEquals(2)

        composeTestRule
            .onAllNodes(hasText(testProduct.colour))
            .assertCountEquals(2)

        composeTestRule
            .onAllNodes(hasText("£1,000.00"))
            .assertCountEquals(2)
    }
}