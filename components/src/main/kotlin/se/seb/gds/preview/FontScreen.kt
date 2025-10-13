package se.seb.gds.preview

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

@Composable
internal fun FontsScreen(scrollState: ScrollState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = spacedBy(16.dp),
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
            name = "HeadingXs",
            style = GdsTheme.typography.HeadingXs,
        )
        FontText(
            name = "Heading2xs",
            style = GdsTheme.typography.Heading2xs,
        )
        FontText(
            name = "DetailBookM",
            style = GdsTheme.typography.DetailBookM,
        )
        FontText(
            name = "DetailBookS",
            style = GdsTheme.typography.DetailBookS,
        )
        FontText(
            name = "DetailBookXs",
            style = GdsTheme.typography.DetailBookXs,
        )
        FontText(
            name = "DetailRegularM",
            style = GdsTheme.typography.DetailRegularM,
        )
        FontText(
            name = "DetailRegularS",
            style = GdsTheme.typography.DetailRegularS,
        )
        FontText(
            name = "DetailRegularXs",
            style = GdsTheme.typography.DetailRegularXs,
        )
        FontText(
            name = "BodyBookL",
            style = GdsTheme.typography.BodyBookL,
        )
        FontText(
            name = "BodyBookM",
            style = GdsTheme.typography.BodyBookM,
        )
        FontText(
            name = "BodyBookS",
            style = GdsTheme.typography.BodyBookS,
        )
        FontText(
            name = "BodyRegularL",
            style = GdsTheme.typography.BodyRegularL,
        )
        FontText(
            name = "BodyRegularM",
            style = GdsTheme.typography.BodyRegularM,
        )
        FontText(
            name = "BodyRegularS",
            style = GdsTheme.typography.BodyRegularS,
        )
        FontText(
            name = "BodyItalicL",
            style = GdsTheme.typography.BodyItalicL,
        )
        FontText(
            name = "BodyItalicM",
            style = GdsTheme.typography.BodyItalicM,
        )
        FontText(
            name = "BodyItalicS",
            style = GdsTheme.typography.BodyItalicS,
        )
        /*FontText(
            name = "Display2xl",
            style = GdsTheme.typography.Display2xl,
        )
        FontText(
            name = "DisplayXl",
            style = GdsTheme.typography.DisplayXl,
        )
        FontText(
            name = "DisplayL",
            style = GdsTheme.typography.DisplayL,
        )
        FontText(
            name = "DisplayM",
            style = GdsTheme.typography.DisplayM,
        )*/
        FontText(
            name = "DisplayS",
            style = GdsTheme.typography.DisplayS,
        )
        FontText(
            name = "Preamble2xl",
            style = GdsTheme.typography.Preamble2xl,
        )
        FontText(
            name = "PreambleXl",
            style = GdsTheme.typography.PreambleXl,
        )
        FontText(
            name = "PreambleL",
            style = GdsTheme.typography.PreambleL,
        )
        FontText(
            name = "PreambleM",
            style = GdsTheme.typography.PreambleM,
        )
        FontText(
            name = "PreambleS",
            style = GdsTheme.typography.PreambleS,
        )
        FontText(
            name = "PreambleXs",
            style = GdsTheme.typography.PreambleXs,
        )
        FontText(
            name = "DetailMediumLarge",
            style = GdsTheme.typography.DetailMediumLarge,
        )
        FontText(
            name = "DetailBookLarge",
            style = GdsTheme.typography.DetailBookLarge,
        )
        FontText(
            name = "DetailBookMedium",
            style = GdsTheme.typography.DetailBookMedium,
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
            500 -> " - Medium"
            400 -> " - Normal"
            else -> ""
        }

    val title = with(style) {
        "$name ${fontSize.value}/${lineHeight.value}${fontWeight?.name()}"
    }

    Text(text = title, style = style)
}
