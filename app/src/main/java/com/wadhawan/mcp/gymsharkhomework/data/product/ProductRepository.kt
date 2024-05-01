package com.wadhawan.mcp.gymsharkhomework.data.product

import android.content.Context
import com.wadhawan.mcp.gymsharkhomework.models.Product

// ProductRepository interface defining a method for fetching products
interface ProductRepository {

    // Method to fetch products asynchronously
    suspend fun fetchProducts(context: Context): Map<String, Product>
}