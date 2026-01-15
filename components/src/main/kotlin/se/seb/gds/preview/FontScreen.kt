package se.seb.gds.preview

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import se.seb.gds.atoms.GdsText
import se.seb.gds.theme.GdsTheme

@Composable
internal fun FontsScreen(scrollState: ScrollState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = spacedBy(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        FontText(
            name = "HeadingXl",
            style = GdsTheme.typography.HeadingXl,
        )
        FontText(
            name = "HeadingL",
            style = GdsTheme.typography.HeadingL,
        )
        FontText(
            name = "HeadingM",
            style = GdsTheme.typography.HeadingM,
        )
        FontText(
            name = "HeadingS",
            style = GdsTheme.typography.HeadingS,
        )
        FontText(
            name = "DetailBookM",
            style = GdsTheme.typography.DetailBookM,
        )
        FontText(
            name = "DetailRegularM",
            style = GdsTheme.typography.DetailRegularM,
        )
        FontText(
            name = "BodyRegularM",
            style = GdsTheme.typography.BodyRegularM,
        )
        FontText(
            name = "BodyMediumM",
            style = GdsTheme.typography.BodyMediumM,
        )
        FontText(
            name = "DetailRegularS",
            style = GdsTheme.typography.DetailRegularS,
        )
        FontText(
            name = "DetailBookS",
            style = GdsTheme.typography.DetailBookS,
        )
        FontText(
            name = "BodyRegularS",
            style = GdsTheme.typography.BodyRegularS,
        )
        FontText(
            name = "BodyMediumS",
            style = GdsTheme.typography.BodyMediumS,
        )
        FontText(
            name = "DetailRegularXs",
            style = GdsTheme.typography.DetailRegularXs,
        )
        FontText(
            name = "DetailBookXs",
            style = GdsTheme.typography.DetailBookXs,
        )
    }
}

@Composable
fun FontText(
    name: String,
    style: TextStyle,
) {
    fun FontWeight.name(): String =
        when (weight) {
            700 -> " - Bold"
            600 -> " - SemiBold"
            500 -> " - Medium"
            450 -> " - Book"
            400 -> " - Normal"
            else -> ""
        }

    val title = with(style) {
        "$name ${fontSize.value}/${lineHeight.value}${fontWeight?.name()}"
    }

    GdsText(label = title, style = style)
}
