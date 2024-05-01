package com.wadhawan.mcp.gymsharkhomework.ui.screens

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(instrumentedPackages = ["androidx.loader.content"],sdk = [34], manifest= Config.NONE)
@RunWith(RobolectricTestRunner::class)
class MainScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()


}