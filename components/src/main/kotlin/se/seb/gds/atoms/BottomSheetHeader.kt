package se.seb.gds.atoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import se.seb.gds.atoms.topbar.MagnifierText
import se.seb.gds.components.R
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun BottomSheetHeader(
    modifier: Modifier = Modifier,
    titleString: String? = null,
    titleDescription: String? = null,
    closeIconDescription: String = stringResource(R.string.common_action_close),
    titleTextStyle: TextStyle = GdsTheme.typography.HeadingS,
    padding: PaddingValues = PaddingValues(vertical = GdsTheme.dimensions.spacing.SpaceM),
    titleColor: Color = GdsTheme.colors.ContentNeutral01,
    onDismiss: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(padding)
            .semantics { isTraversalGroup = true },
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (!titleString.isNullOrEmpty()) {
            MagnifierText(
                text = titleString,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = GdsTheme.dimensions.spacing.SpaceM)
                    .then(titleDescription?.let { description ->
                        Modifier.clearAndSetSemantics {
                            this.contentDescription = description
                            this.traversalIndex = 0f
                        }
                    } ?: Modifier
                    ),
                style = titleTextStyle,
                color = titleColor,
            )
        } else {
            Spacer(modifier = Modifier.weight(1f))
        }
        CompositionLocalProvider(LocalMinimumInteractiveComponentSize provides Dp.Unspecified) {
            IconButton(
                modifier = Modifier
                    .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM)
                    .clearAndSetSemantics {
                        contentDescription = closeIconDescription
                        traversalIndex = 1f
                    },
                onClick = onDismiss,
            ) {
                Icon(
                    painter = rememberVectorPainter(GdsIcons.Regular.CrossLarge),
                    contentDescription = null,
                    tint = GdsTheme.colors.ContentNeutral01,
                )
            }
        }
    }
}

@Preview
@Composable
private fun BottomSheetHeaderPreview() {
    GdsTheme {
        BottomSheetHeader(titleString = "Test") {}
    }
}
