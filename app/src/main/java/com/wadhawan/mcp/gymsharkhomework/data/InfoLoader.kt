package com.wadhawan.mcp.gymsharkhomework.data

import android.content.Context
import com.google.gson.reflect.TypeToken
import com.wadhawan.mcp.gymsharkhomework.data.log.LogUtil.debug
import com.wadhawan.mcp.gymsharkhomework.models.Product
import java.io.IOException

// InfoLoader class providing utility functions for loading and parsing JSON data
class InfoLoader {

    // Companion object containing utility functions
    companion object {

        // Function to load JSON data from an asset file
        fun loadJSONFromAsset(context: Context, fileName: String = "Mockdata.json"): String? {
            return try {
                // Open the asset file
                val file = context.assets.open(fileName)
                file.use { inputStream ->
                    // Read data from the file
                    val size = inputStream.available()
                    val buffer = ByteArray(size)
                    inputStream.read(buffer)
                    // Convert byte array to string using UTF-8 encoding
                    String(buffer, Charsets.UTF_8)
                }
            } catch (e: IOException) {
                // Log error message and stack trace if an exception occurs
                debug(message = "Error fetching data ${e.message}")
                debug(message = "Trace: ${e.stackTraceToString()}")
                null
            }
        }

        // Function to parse JSON string into a map of products
        fun parseProductList(jsonString: String): Map<String, Product> {
            // Get Gson instance from GsonService
            val gson = GsonService.gson
            // Define type for the list of products
            val productListType = object : TypeToken<List<Product>>() {}.type
            // Parse JSON string into list of products
            val products = gson.fromJson<List<Product>>(jsonString, productListType)
            // Convert list of products into map with product ID as key
            return products.associateBy { it.id }
        }
    }
}