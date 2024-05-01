package com.wadhawan.mcp.gymsharkhomework.data.product

import android.content.Context
import com.google.gson.JsonParser
import com.wadhawan.mcp.gymsharkhomework.data.InfoLoader
import com.wadhawan.mcp.gymsharkhomework.models.Product


// MockProductRepository class implementing ProductRepository interface
class MockRepository : ProductRepository {

    // Function to fetch products (mock data) from context
    override suspend fun fetchProducts(context: Context): Map<String, Product> {
        // Load mock data from JSON file
        return loadMockData(context)
    }

    // Function to load mock data from JSON file
    private fun loadMockData(context: Context): Map<String, Product> {
        // Path to mock JSON file
        val jsonFilePath = "Mockdata.json"
        // Load JSON data from asset file
        val jsonString = InfoLoader.loadJSONFromAsset(context, fileName = jsonFilePath)

        // Parse JSON data to get hits
        val element = JsonParser.parseString(jsonString)
        val hitsJson = element.asJsonObject.get("hits").toString()

        // Parse hits JSON to get product list
        return InfoLoader.parseProductList(hitsJson)
    }
}
