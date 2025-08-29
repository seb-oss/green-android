package se.seb.gds.renderer.mapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import se.seb.gds.theme.GdsTheme

@Composable
fun se.seb.gds.GdsColor?.toColor(): Color =
    when (this) {
        se.seb.gds.GdsColor.CONTENT_CONTENT_01 -> GdsTheme.colors.contentContent01
        se.seb.gds.GdsColor.L1_01 -> GdsTheme.colors.l101
        else -> GdsTheme.colors.l101
    }