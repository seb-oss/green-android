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
            name = "TitleLarge",
            style = GdsTheme.typography.TitleLarge,
        )
        FontText(
            name = "TitleLarge",
            style = GdsTheme.typography.TitleLarge,
        )
        FontText(
            name = "Title1",
            style = GdsTheme.typography.Title1,
        )
        FontText(
            name = "Title2",
            style = GdsTheme.typography.Title2,
        )
        FontText(
            name = "Title3",
            style = GdsTheme.typography.Title3,
        )
        FontText(
            name = "Title4",
            style = GdsTheme.typography.Title4,
        )
        FontText(
            name = "Title5",
            style = GdsTheme.typography.Title5,
        )
        FontText(
            name = "Title6",
            style = GdsTheme.typography.Title6,
        )
        FontText(
            name = "HeadlineBold",
            style = GdsTheme.typography.HeadlineBold,
        )
        FontText(
            name = "Headline",
            style = GdsTheme.typography.Headline,
        )
        FontText(
            name = "Body",
            style = GdsTheme.typography.Body,
        )
        FontText(
            name = "SubHeader1",
            style = GdsTheme.typography.SubHeader1,
        )
        FontText(
            name = "SubHeader2",
            style = GdsTheme.typography.SubHeader2,
        )
        FontText(
            name = "SubHeader3",
            style = GdsTheme.typography.SubHeader3,
        )
        FontText(
            name = "Footnote",
            style = GdsTheme.typography.Footnote,
        )
        FontText(
            name = "Caption",
            style = GdsTheme.typography.Caption,
        )
        FontText(
            name = "Caption2",
            style = GdsTheme.typography.Caption2,
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