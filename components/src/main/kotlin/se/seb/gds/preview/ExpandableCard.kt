package se.seb.gds.preview

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import se.seb.gds.atoms.cards.GdsCard
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun ExpandableCard(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable ColumnScope.() -> Unit,
) {
    var expanded by rememberSaveable { mutableStateOf(false) }

    GdsCard(
        containerColor = GdsTheme.colors.L2Neutral02,
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                expanded = !expanded
            },
    ) {
        Column {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(all = GdsTheme.dimensions.spacing.SpaceM),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = title,
                    color = GdsTheme.colors.ContentNeutral01,
                    style = GdsTheme.typography.HeadingXs,
                    modifier = Modifier.weight(1f),
                )
                Icon(
                    imageVector = if (expanded) GdsIcons.Regular.ChevronTopSmall else GdsIcons.Regular.ChevronDownSmall,
                    tint = GdsTheme.colors.ContentNeutral02,
                    contentDescription = null,
                )
            }
            AnimatedVisibility(visible = expanded) {
                Column {
                    content()
                }
            }
        }
    }
}
