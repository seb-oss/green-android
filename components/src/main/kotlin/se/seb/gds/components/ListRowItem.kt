package se.seb.gds.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

object ListRowItem {
    class RowItemScope {
        @Composable
        fun StartIcon(
            icon: ImageVector,
            contentDescription: String? = null
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = icon,
                contentDescription = contentDescription,
            )
        }

        @Composable
        fun EndIcon(
            icon: ImageVector,
            contentDescription: String? = null
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = icon,
                tint = GdsTheme.colors.ContentNeutral04,
                contentDescription = contentDescription,
            )
        }

        @Composable
        fun EndLabel(text: String) {
            Text(
                text = text,
                style = GdsTheme.typography.DetailBookM,
                color = GdsTheme.colors.ContentNeutral01,
            )
        }

        @Composable
        fun EndLabelWithIcon(
            text: String,
            icon: ImageVector,
            contentDescription: String? = null
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                EndLabel(text = text)
                Spacer(modifier = Modifier.width(12.dp))
                EndIcon(
                    icon = icon,
                    contentDescription = contentDescription,
                )
            }
        }
    }

    @Composable
    operator fun invoke(
        title: String,
        modifier: Modifier = Modifier,
        description: String? = null,
        startSlot: (@Composable RowItemScope.() -> Unit)? = null,
        endSlot: (@Composable RowItemScope.() -> Unit)? = null,
        onClick: () -> Unit = { },
    ) {
        val iconScope = RowItemScope()
        Row(
            modifier = modifier
                .clickable(onClick = onClick)
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            startSlot?.let {
                with(iconScope) { it() }
                Spacer(modifier = Modifier.width(16.dp))
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = GdsTheme.typography.DetailBookM,
                    color = GdsTheme.colors.ContentNeutral01,
                )
                description?.let {
                    Text(
                        text = it,
                        style = GdsTheme.typography.DetailRegularS,
                        color = GdsTheme.colors.ContentNeutral02,
                    )
                }
            }
            endSlot?.let {
                with(iconScope) { it() }
            }
        }
    }
}

@Preview
@Composable
private fun ListRowItemPreview() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1Neutral01)) {
            ListRowItem(
                startSlot = {
                    StartIcon(
                        icon = GdsIcons.Regular.Bell,
                        contentDescription = "Bell icon",
                    )
                },
                title = "Konton",
                description = "0213-1231412",
                endSlot = {
                    EndIcon(
                        icon = GdsIcons.Regular.ChevronRight,
                        contentDescription = "Chevron right icon",
                    )
                },
            )
        }

    }
}