package com.wadhawan.mcp.gymsharkhomework.goldens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.MutableLiveData
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.google.gson.reflect.TypeToken
import com.wadhawan.mcp.gymsharkhomework.data.GsonService
import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.ui.screens.MainScreenContent
import com.wadhawan.mcp.gymsharkhomework.utils.TestTheme
import com.wadhawan.mcp.gymsharkhomework.utils.listJson
import com.wadhawan.mcp.gymsharkhomework.utils.navControllerMock
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito


class MainScreenContentGoldenTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        theme = "Theme.GymsharkHomework"
    )

    @Test
    fun launchComposable() {
        val type = object : TypeToken<List<Product>>() {}.type
        val products = GsonService.gson.fromJson<List<Product>>(listJson, type)


        paparazzi.snapshot {
            TestTheme {
                Scaffold(containerColor = Color.White) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        MainScreenContent(
                            navControllerMock,
                            products.associateBy { it.id }
                        )
                    }
                }
            }
        }
    }
}