package com.wadhawan.mcp.gymsharkhomework.models

import android.content.Context
import com.wadhawan.mcp.gymsharkhomework.R


enum class Size(val label: String, val resId: Int) {
    XXS("xxs", R.string.size_xxs),
    XS("xs", R.string.size_xs),
    S("s", R.string.size_s),
    M("m", R.string.size_m),
    L("l", R.string.size_l),
    XL("xl", R.string.size_xl),
    XXL("xxl", R.string.size_xxl);

    companion object {
        fun from(value: String): Size? = values().find { it.name.equals(value, ignoreCase = true) }
    }

    fun toString(context: Context): String {
        return context.getString(resId)
    }
}
