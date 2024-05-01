package com.wadhawan.mcp.gymsharkhomework.data

import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonParseException
import com.wadhawan.mcp.gymsharkhomework.models.Size
import java.lang.reflect.Type

// SizeDeserializer class implementing JsonDeserializer for Size
class Deserializer : JsonDeserializer<Size> {
    // Deserialize JSON element to Size object
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Size {
        // Get size string from JSON element
        val sizeStr = json.asString
        // Convert size string to Size enum value or throw exception if invalid
        return Size.from(sizeStr) ?: throw JsonParseException("Unexpected size value: $sizeStr")
    }
}