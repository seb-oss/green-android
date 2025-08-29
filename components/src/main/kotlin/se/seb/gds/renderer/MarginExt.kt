package se.seb.gds.renderer

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import se.seb.components.common.ComponentMargin
import se.seb.components.uitokens.Dimension
import se.seb.gds.renderer.mapper.toDimen

@Composable
fun Modifier.margin(margin: ComponentMargin?): Modifier {
    if (margin == null) {
        return this
    }
    return this.then(
        Modifier.padding(
            start = margin.start?.toDimen() ?: Dimension.ZERO.toDimen(),
            top = margin.top?.toDimen()?: Dimension.ZERO.toDimen(),
            end = margin.end?.toDimen() ?: Dimension.ZERO.toDimen(),
            bottom = margin.bottom?.toDimen() ?: Dimension.ZERO.toDimen(),
        ),
    )
}

@Composable
fun Modifier.gdsBackground(colorToken: Color?): Modifier {
    colorToken ?: return this
    return this.then(
        Modifier.background(colorToken),
    )
}