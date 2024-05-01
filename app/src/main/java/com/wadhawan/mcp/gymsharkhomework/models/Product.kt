package com.wadhawan.mcp.gymsharkhomework.models

data class Product(
    val id: String,
    val sku: String,
    val inStock: Boolean,
    val sizeInStock: List<Size>,
    val availableSizes: List<AvailableSize>,
    val title: String,
    val handle: String,
    val description: String,
    val type: String,
    val gender: List<String>,
    val fit: String,
    val labels: List<String>,
    val colour: String,
    val price: Double,
    val compareAtPrice: Double?,
    val discountPercentage: Double?,
    val featuredMedia: Media,
    val media: List<Media>,
    val objectID: String
)
