package com.wadhawan.mcp.gymsharkhomework.utils

import java.util.Locale

fun String.kebabToTitleCase(): String {
    return this.split('-')
        .joinToString(" ") { str ->
            str.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString()
            }
        }
}