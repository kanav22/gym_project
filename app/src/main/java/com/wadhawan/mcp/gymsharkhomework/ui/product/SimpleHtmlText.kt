package com.wadhawan.mcp.gymsharkhomework.ui.product

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.core.text.HtmlCompat

@Composable
fun SimpleHtmlText(
    htmlString: String,
    modifier: Modifier = Modifier,
) {
    val annotatedString = buildAnnotatedString {
        append(HtmlCompat.fromHtml(htmlString, HtmlCompat.FROM_HTML_MODE_LEGACY))
    }

    Text(text = annotatedString, modifier = modifier)
}
