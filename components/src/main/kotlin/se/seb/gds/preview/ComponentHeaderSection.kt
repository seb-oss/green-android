package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import se.seb.gds.atoms.GdsText
import se.seb.gds.theme.GdsTheme

@Composable
internal fun ComponentHeaderSection(
    modifier: Modifier = Modifier,
    title: String,
    body: String? = null,
    code: String? = null,
) {
    ExpandableCard(
        modifier = modifier,
        title = title,
    ) {
        Column(
            modifier = Modifier.padding(all = GdsTheme.dimensions.spacing.SpaceXs),
        ) {
            body?.let {
                GdsText(
                    label = it,
                    style = GdsTheme.typography.BodyRegularS,
                )
            }
            Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceXs))
            code?.let {
                CodeBlock(
                    code = it,
                )
            }
        }
    }
}

@Composable
internal fun CodeBlock(
    code: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(GdsTheme.dimensions.radius.RadiusXs))
            .background(GdsTheme.colors.L2.Elevated01)
            .padding(GdsTheme.dimensions.spacing.SpaceXs),
    ) {
        Text(
            text = code,
            fontFamily = FontFamily.Monospace,
            style = GdsTheme.typography.BodyRegularS.copy(fontSize = 12.sp),
            color = GdsTheme.colors.Content.Neutral01,
        )
    }
}
