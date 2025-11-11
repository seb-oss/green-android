package se.seb.gds.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import se.seb.gds.tokens.GdsSansSerif

private fun createTextStyle(
    fontFamily: FontFamily = GdsSansSerif,
    fontSize: TextUnit,
    lineHeight: TextUnit,
    fontWeight: FontWeight,
    letterSpacing: TextUnit = TextUnit.Unspecified,
): TextStyle =
    TextStyle(
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        fontSize = fontSize,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
    )

object LegacyTypography {
    val TitleLarge =
        createTextStyle(
            fontSize = 34.sp,
            lineHeight = 42.5.sp,
            letterSpacing = (-0.3).sp,
            fontWeight = FontWeight.Bold,
        )
    val Title1 =
        createTextStyle(
            fontSize = 28.sp,
            lineHeight = 35.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Bold,
        )
    val Title2 =
        createTextStyle(
            fontSize = 24.sp,
            lineHeight = 30.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Bold,
        )
    val Title3 =
        createTextStyle(
            fontSize = 22.sp,
            lineHeight = 27.5.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Bold,
        )
    val Title4 =
        createTextStyle(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Bold,
        )
    val Title5 =
        createTextStyle(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Medium,
        )
    val Title6 =
        createTextStyle(
            fontSize = 17.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Medium,
        )
    val HeadlineBold =
        createTextStyle(
            fontSize = 17.sp,
            lineHeight = 21.25.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Bold,
        )
    val Headline =
        createTextStyle(
            fontFamily = GdsSansSerif,
            fontSize = 17.sp,
            lineHeight = 17.sp,
            fontWeight = FontWeight.Normal,
        )
    val Body =
        createTextStyle(
            fontSize = 17.sp,
            lineHeight = 23.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Normal,
        )
    val SubHeader1 =
        createTextStyle(
            fontSize = 14.sp,
            lineHeight = 17.5.sp,
            letterSpacing = 0.1.sp,
            fontWeight = FontWeight.Medium,
        )
    val SubHeader2 =
        createTextStyle(
            fontSize = 14.sp,
            lineHeight = 17.5.sp,
            letterSpacing = 0.1.sp,
            fontWeight = FontWeight.Normal,
        )
    val SubHeader3 =
        createTextStyle(
            fontSize = 13.sp,
            lineHeight = 16.25.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Medium,
        )
    val Footnote =
        createTextStyle(
            fontSize = 13.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Normal,
        )
    val Caption =
        createTextStyle(
            fontSize = 12.sp,
            lineHeight = 15.sp,
            letterSpacing = 0.2.sp,
            fontWeight = FontWeight.Normal,
        )
    val Caption2 =
        createTextStyle(
            fontSize = 11.sp,
            lineHeight = 13.75.sp,
            letterSpacing = 0.3.sp,
            fontWeight = FontWeight.Medium,
        )
}
