package se.seb.gds.preview

import android.content.res.Configuration
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.reflect.full.declaredMemberProperties
import se.seb.gds.atoms.GdsText
import se.seb.gds.theme.GdsTheme
import se.seb.gds.tokens.GdsTypographyTokens

@Composable
internal fun FontsScreen(scrollState: ScrollState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = spacedBy(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        ComponentHeaderSection(
            title = "GDS Typography",
            body = "The following text styles are available in GDS Theme typography. " +
                "Example usage:",
            code = """
                GdsTheme.typography.HeadingM
                GdsTheme.typography.HeadingXl
            """.trimIndent(),
        )

        Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceL))

        GdsTypographyTokens::class.declaredMemberProperties.map { property ->
            FontText(
                name = property.name,
                style = property.get(GdsTypographyTokens) as TextStyle,
            )
        }
    }
}

@Composable
fun FontText(
    name: String,
    style: TextStyle,
) {
    fun FontWeight.name(): String =
        when (weight) {
            700 -> " Bold"
            600 -> " SemiBold"
            500 -> " Medium"
            450 -> " Book"
            400 -> " Normal"
            else -> ""
        }

    val properties = with(style) {
        "Font size: ${fontSize.value}  Line height: ${lineHeight.value}  Weight: ${fontWeight?.name()}"
    }
    GdsText(label = name, style = style)
    GdsText(label = properties, style = GdsTheme.typography.BodyRegularS)
    HorizontalDivider(thickness = 1.dp)
}
