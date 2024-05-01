package com.wadhawan.mcp.gymsharkhomework.data

import com.google.gson.GsonBuilder
import com.wadhawan.mcp.gymsharkhomework.models.Size


// GsonService class providing a Gson instance with custom TypeAdapters
class GsonService {
    // Companion object containing Gson instance
    companion object {
        // Gson instance with custom TypeAdapters
        val gson = GsonBuilder()
            // Register custom TypeAdapter for Size class
            .registerTypeAdapter(Size::class.java, Deserializer())
            .create()
    }
}