package com.wadhawan.mcp.gymsharkhomework.data.log

import android.util.Log
import timber.log.Timber


// CrashReportingTree class extending Timber.Tree
class CrashReportingTree : Timber.Tree() {

    // Override log method to handle log messages
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        // Check if the priority is ERROR or WARN
        if (priority == Log.ERROR || priority == Log.WARN) {
            // Send non-fatal errors to crash reporting tool
            // For example, FirebaseCrashlytics.getInstance().log(message)
        }
    }
}
