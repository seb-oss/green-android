package se.seb.gds.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * GDS Typography styles, based on SEB Sans Serif font.
 */
object GdsTypography {
    val DetailMediumLarge =
        TextStyle(
            fontFamily = GdsSansSerif,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
        )

    val DetailBookLarge =
        TextStyle(
            fontFamily = GdsSansSerifBook,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
        )

    val DetailBookMedium =
        TextStyle(
            fontFamily = GdsSansSerifBook,
            fontSize = 14.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
        )

    val DetailBookSmall =
        TextStyle(
            fontFamily = GdsSansSerifBook,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
        )

    val DetailRegularSmall =
        TextStyle(
            fontFamily = GdsSansSerif,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
        )
}
