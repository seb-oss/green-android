package se.seb.gds.renderer.mapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.components.uitokens.Dimension

@Composable
fun Dimension.toDimen(): Dp =
    when (this) {
        Dimension.ZERO -> 0.dp
        Dimension.S -> 8.dp
        Dimension.M -> 16.dp
        Dimension.L -> 36.dp
    }