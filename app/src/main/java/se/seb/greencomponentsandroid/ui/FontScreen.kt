package se.seb.greencomponentsandroid.ui

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
import se.seb.green.theme.GreenTheme

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
            name = "TitleLarge",
            style = GreenTheme.typography.TitleLarge,
        )
        FontText(
            name = "TitleLarge",
            style = GreenTheme.typography.TitleLarge,
        )
        FontText(
            name = "Title1",
            style = GreenTheme.typography.Title1,
        )
        FontText(
            name = "Title2",
            style = GreenTheme.typography.Title2,
        )
        FontText(
            name = "Title3",
            style = GreenTheme.typography.Title3,
        )
        FontText(
            name = "Title4",
            style = GreenTheme.typography.Title4,
        )
        FontText(
            name = "Title5",
            style = GreenTheme.typography.Title5,
        )
        FontText(
            name = "Title6",
            style = GreenTheme.typography.Title6,
        )
        FontText(
            name = "HeadlineBold",
            style = GreenTheme.typography.HeadlineBold,
        )
        FontText(
            name = "Headline",
            style = GreenTheme.typography.Headline,
        )
        FontText(
            name = "Body",
            style = GreenTheme.typography.Body,
        )
        FontText(
            name = "SubHeader1",
            style = GreenTheme.typography.SubHeader1,
        )
        FontText(
            name = "SubHeader2",
            style = GreenTheme.typography.SubHeader2,
        )
        FontText(
            name = "SubHeader3",
            style = GreenTheme.typography.SubHeader3,
        )
        FontText(
            name = "Footnote",
            style = GreenTheme.typography.Footnote,
        )
        FontText(
            name = "Caption",
            style = GreenTheme.typography.Caption,
        )
        FontText(
            name = "Caption2",
            style = GreenTheme.typography.Caption2,
        )
    }
}

@Composable
fun FontText(
    name: String,
    style: TextStyle,
) {
    fun FontWeight.name(): String {
        return when (weight) {
            700 -> " - Bold"
            500 -> " - Medium"
            400 -> " - Normal"
            else -> ""
        }
    }

    val title = with(style) {
        "$name ${fontSize.value}/${lineHeight.value}/(${letterSpacing.value})${fontWeight?.name()}"
    }

    Text(text = title, style = style)
}