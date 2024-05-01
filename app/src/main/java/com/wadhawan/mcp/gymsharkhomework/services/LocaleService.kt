package com.wadhawan.mcp.gymsharkhomework.services

import android.content.Context
import java.util.Locale

// LocaleService class providing utility functions for managing locales
class LocaleService {
    // Companion object containing utility function
    companion object {
        // Function to get the current locale from the context
        fun getCurrentLocale(context: Context): Locale {
            // Get the current locale from the context's configuration
            return context.resources.configuration.locales.get(0)
        }
    }
}