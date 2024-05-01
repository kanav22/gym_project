package com.wadhawan.mcp.gymsharkhomework.services

import android.content.Context
import java.text.NumberFormat
import java.util.Locale



class CurrencyFormatter {
    // Companion object containing utility function
    companion object {
        // Function to format currency value
        fun formatCurrency(
            context: Context,
            value: Double,
            locale: Locale = LocaleService.getCurrentLocale(context)
        ): String {
            // Get currency formatter instance for the specified locale
            val formatter = NumberFormat.getCurrencyInstance(locale)
            // Format the currency value
            return formatter.format(value)
        }
    }
}