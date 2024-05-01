package com.wadhawan.mcp.gymsharkhomework.data.log

import timber.log.Timber

// LogUtil object providing utility functions for logging
object LogUtil {

    // Function to log debug messages
    fun debug(message: String) {
        Timber.d(message)
    }

    // Function to log error messages with optional throwable
    fun error(message: String, throwable: Throwable? = null) {
        Timber.e(throwable, message)
    }

}
