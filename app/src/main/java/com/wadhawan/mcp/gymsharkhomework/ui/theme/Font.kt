package com.wadhawan.mcp.gymsharkhomework.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.wadhawan.mcp.gymsharkhomework.R


val AppFont = FontFamily(
    Font(R.font.lato_thin, FontWeight.Thin, FontStyle.Normal),
    Font(R.font.lato_thinitalic, FontWeight.Thin, FontStyle.Italic),
    Font(R.font.lato_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.lato_lightitalic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.lato_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.lato_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.lato_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.lato_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.lato_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.lato_blackitalic, FontWeight.Black, FontStyle.Italic)
)

val typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Black,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Black,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Black,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    displayLarge = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        lineHeight = 38.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.1.sp
    ),
    displaySmall = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = AppFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
)