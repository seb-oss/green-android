package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import se.seb.gds.atoms.GdsText
import se.seb.gds.theme.GdsTheme


@Composable
internal fun ComponentHeaderSection(
    modifier: Modifier = Modifier,
    title: String? = null,
    body: String? = null,
    code: String? = null,
) {
    Column(
        modifier = modifier,
        verticalArrangement = spacedBy(GdsTheme.dimensions.spacing.SpaceXs),
    ) {
        title?.let {
            GdsText(
                label = it,
                style = GdsTheme.typography.HeadingS,
            )
        }
        body?.let {
            GdsText(
                label = it,
                style = GdsTheme.typography.BodyRegularS,
            )
        }
        code?.let { CodeBlock(it) }
    }
}

@Composable
internal fun CodeBlock(
    code: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(GdsTheme.dimensions.radius.RadiusXs))
            .border(
                width = 1.dp,
                color = GdsTheme.colors.BorderInformation02,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusXs),
            )
            .background(GdsTheme.colors.L2Elevated02)
            .padding(GdsTheme.dimensions.spacing.SpaceXs),
    ) {
        Text(
            text = code,
            fontFamily = FontFamily.Monospace,
            style = GdsTheme.typography.BodyRegularS.copy(fontSize = 12.sp),
            color = GdsTheme.colors.ContentNeutral01,
        )
    }
}
