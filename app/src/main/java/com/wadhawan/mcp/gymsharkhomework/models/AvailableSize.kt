package com.wadhawan.mcp.gymsharkhomework.models

data class AvailableSize (
    val id: String,
    val inStock: Boolean,
    val inventoryQuantity: Int,
    val price: Int,
    val size: Size,
    val sku: String
) {
    fun isAvailable(): Boolean {
        return inStock && inventoryQuantity > 0
    }
}
