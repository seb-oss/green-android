package se.seb.gds.renderer.mapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import se.seb.components.uitokens.Style
import se.seb.gds.theme.GdsTypography

@Composable
fun Style.toTextStyle(): TextStyle? =
    when (this) {
        Style.TITLE_2 -> GdsTypography.Title1
        else -> null
    }