package se.seb.gds.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import se.seb.gds.components.R

/**
 * GDS Typography styles, based on SEB Sans Serif font.
 */
val GdsSansSerif =
    FontFamily(
        Font(R.font.seb_sans_serif_regular, FontWeight.Normal),
        Font(R.font.seb_sans_serif_medium, FontWeight.Medium),
        Font(R.font.seb_sans_serif_bold, FontWeight.Bold),
    )

val GdsSansSerifBook =
    FontFamily(
        Font(R.font.seb_sans_serif_book, FontWeight.Normal),
    )
