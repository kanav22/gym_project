package com.wadhawan.mcp.gymsharkhomework.services

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import java.util.Locale


class CurrencyServiceTest {
    private lateinit var mockContext: Context

    @Before
    fun setUp() {
        mockContext = mock(Context::class.java)
    }

    @Test
    fun testFormatCurrency_US() {
        val testValue = 1234.56
        val formatted = CurrencyFormatter.formatCurrency(mockContext, testValue, Locale.US)
        assertEquals("$1,234.56", formatted)
    }

    @Test
    fun testFormatCurrency_France() {
        val testValue = 1234.56
        val formatted = CurrencyFormatter.formatCurrency(mockContext, testValue, Locale.FRANCE)
        // In France, the format should follow French currency formatting
        assertEquals("1\u202F234,56\u00A0€", formatted)
    }

    @Test
    fun testFormatCurrency_UK() {
        val testValue = 1234.56
        val formatted = CurrencyFormatter.formatCurrency(mockContext, testValue, Locale.UK)
        assertEquals("£1,234.56", formatted)
    }
}