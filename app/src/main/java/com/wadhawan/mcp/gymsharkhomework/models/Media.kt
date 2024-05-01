package com.wadhawan.mcp.gymsharkhomework.models

data class Media (
    val admin_graphql_api_id: String,
    val alt: String?,
    val created_at: String,
    val height: Int,
    val id: String,
    val position: Int,
    val product_id: String,
    val src: String,
    val updated_at: String,
    val variant_ids: List<String>,
    val width: Int
)
