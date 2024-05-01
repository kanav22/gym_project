package com.wadhawan.mcp.gymsharkhomework

import android.app.Application
import com.wadhawan.mcp.gymsharkhomework.data.log.CrashReportingTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class GymSharkApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            // For release mode to integrate with crash reporting
            Timber.plant(CrashReportingTree())
        }
    }
}
