package com.wadhawan.mcp.gymsharkhomework.config


// Import statements for necessary models
import com.wadhawan.mcp.gymsharkhomework.models.AvailableSize
import com.wadhawan.mcp.gymsharkhomework.models.Media
import com.wadhawan.mcp.gymsharkhomework.models.Product
import com.wadhawan.mcp.gymsharkhomework.models.Size

// Define a test product with sample data
val testProduct = Product(
    "6732609257571", // Product ID
    "B3A3E", // Variant ID
    true, // Available
    listOf( // Available sizes
        Size.XS,
        Size.S,
        Size.M,
    ),
    listOf( // Available size details
        AvailableSize(
            "39814344835171", // Size ID
            true, // Available
            1, // Stock level
            1000, // Price (in cents)
            Size.XS, // Size
            "B3A3E-UBCY-XS" // SKU
        ),
        AvailableSize(
            "39814344867939",
            false,
            0,
            1000,
            Size.S,
            "B3A3E-UBCY-S"
        ),
        AvailableSize(
            "39814344900707",
            false,
            0,
            1000,
            Size.M,
            "B3A3E-UBCY-M"
        ),
    ),
    "Cora Border Terrier", // Product name
    "gymshark-speed-leggings-navy-ss22", // Handle
    "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>", // Description
    "Doggo", // Type
    listOf("f"), // Tags
    "", // Collection
    listOf("wire-haired", "limited-edition"), // Product tags
    "Tan", // Color
    1000.toDouble(), // Price (in cents)
    null, // Compare at price
    null, // Selected variant
    Media( // Product media
        "gid://shopify/ProductImage/29035954831459", // ID
        null, // Alt text
        "2022-04-06T15:19:54+01:00", // Created at
        2018, // Position
        "29035954831459", // Admin graphQL ID
        1, // Product ID
        "6732609257571", // Variant ID
        "https://picsum.photos/id/237/200/300",
        "2022-04-06T15:19:54+01:00", // Updated at
        listOf(), // Image variants
        1692 // Image width
    ),
    listOf( // Additional media
        Media(
            "gid://shopify/ProductImage/29035954831459",
            null,
            "2022-04-06T15:19:54+01:00",
            2018,
            "29035954831459",
            1,
            "6732609257571",
            "https://picsum.photos/200/300",
            "2022-04-06T15:19:54+01:00",
            listOf(),
            1692
        ),
        Media(
            "gid://shopify/ProductImage/29035954569315",
            null,
            "2022-04-06T15:19:53+01:00",
            2017,
            "29035954569315",
            2,
            "6732609257571",
            "https://picsum.photos/id/237/200/300",
            "2022-04-06T15:19:54+01:00",
            listOf(),
            1692
        ),
    ),
    "6732609257571" // Admin graphQL ID
)
