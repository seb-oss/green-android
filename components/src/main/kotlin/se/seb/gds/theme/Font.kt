package se.seb.gds.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import se.seb.gds.components.R

/**
 * GDS Typography styles, based on SEB Sans Serif font.
 */
val GdsSansSerifBook =
    FontFamily(
        Font(R.font.seb_sans_serif_book, FontWeight.Normal),
    )

val GdsSansSerif = FontFamily(
    Font(R.font.seb_sans_serif_light, FontWeight.Light),
    Font(R.font.seb_sans_serif_regular, FontWeight.Normal),
    Font(R.font.seb_sans_serif_book, FontWeight.Medium),
    Font(R.font.seb_sans_serif_medium, FontWeight.SemiBold),
    Font(R.font.seb_sans_serif_bold, FontWeight.Bold),
)
