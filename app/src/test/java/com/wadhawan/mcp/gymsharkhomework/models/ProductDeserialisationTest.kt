package com.wadhawan.mcp.gymsharkhomework.models

import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import com.wadhawan.mcp.gymsharkhomework.data.GsonService
import com.wadhawan.mcp.gymsharkhomework.utils.listJson
import com.wadhawan.mcp.gymsharkhomework.utils.testJson
import com.wadhawan.mcp.gymsharkhomework.utils.trueEmptyJson
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test


class ProductDeserializationTest {

    private val gson = GsonService.gson

    @Test
    fun deserialization_is_correct() {
        val product = gson.fromJson(testJson, Product::class.java)
        assertTrue(product is Product)
        assertNotNull(product)
        assertEquals("6732609257571", product.id)
        assertEquals("B3A3E", product.sku)
        assertTrue(product.inStock)
        assertNotNull(product.sizeInStock)
        assertEquals(4, product.sizeInStock.size)
        assertTrue(product.sizeInStock.contains(Size.XL))
        assertEquals("gymshark-speed-leggings-navy-ss22", product.handle)
        assertEquals("Cora Border Terrier", product.title)
        assertNotNull(product.description)
        assertTrue(product.description.contains("Border Terrier"))
        assertEquals("Doggo", product.type)
        assertNotNull(product.gender)
        assertTrue(product.gender.contains("f"))
        assertNull(product.fit)
        assertNotNull(product.labels)
        assertTrue(product.labels.contains("wire-haired"))
        assertEquals("Tan", product.colour)
        assertEquals(1000, product.price.toInt())
        assertNull(product.compareAtPrice)
        assertNull(product.discountPercentage)
        assertNotNull(product.featuredMedia)
        assertEquals("29035954831459", product.featuredMedia.id)
        assertEquals(
            "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
            product.featuredMedia.src
        )
        assertEquals("6732609257571", product.objectID)

        // Test AvailableSizes

        // Test AvailableSizes
        assertFalse(product.availableSizes.isEmpty())
        val (id, inStock, inventoryQuantity, price, size, sku) = product.availableSizes[0]
        assertEquals("39814344835171", id)
        assertTrue(inStock)
        assertEquals(1, inventoryQuantity)
        assertEquals(1000, price.toInt())
        assertEquals(Size.XS, size)
        assertEquals("B3A3E-UBCY-XS", sku)
    }

    @Test
    fun list_deserialization_is_correct() {
        val type = object : TypeToken<List<Product>>() {}.type
        val products = gson.fromJson<List<Product>>(listJson, type)
        assertTrue(products is List<Product>)
        assertTrue(products.size == 7)
    }

    @Test
    fun true_empty_deserialization_does_not_error() {
        var exceptionThrown = false
        try {
            gson.fromJson(trueEmptyJson, Product::class.java)
        } catch (e: JsonSyntaxException) {
            exceptionThrown = true
        }

        Assert.assertFalse(exceptionThrown)
    }
}