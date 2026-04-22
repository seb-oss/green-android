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
            contentDescription: String? = null,
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = icon,
                tint = GdsTheme.colors.Content.Neutral01,
                contentDescription = contentDescription,
            )
        }

        @Composable
        fun EndIcon(
            icon: ImageVector,
            contentDescription: String? = null,
        ) {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = icon,
                tint = GdsTheme.colors.Content.Neutral02,
                contentDescription = contentDescription,
            )
        }

        @Composable
        fun EndLabel(text: String) {
            Text(
                text = text,
                style = GdsTheme.typography.DetailBookM,
                color = GdsTheme.colors.Content.Neutral01,
            )
        }

        @Composable
        fun EndLabelWithIcon(
            text: String,
            icon: ImageVector,
            contentDescription: String? = null,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                EndLabel(text = text)
                Spacer(modifier = Modifier.width(GdsTheme.dimensions.spacing.SpaceS))
                EndIcon(
                    icon = icon,
                    contentDescription = contentDescription,
                )
            }
        }

        @Composable
        fun DefaultContent(
            title: String,
            description: String? = null,
        ) {
            Text(
                text = title,
                style = GdsTheme.typography.DetailBookM,
                color = GdsTheme.colors.Content.Neutral01,
            )
            description?.let {
                Text(
                    text = it,
                    style = GdsTheme.typography.DetailRegularS,
                    color = GdsTheme.colors.Content.Neutral02,
                )
            }
        }
    }

    /**
     * A composable function that represents a row item in a list, with a title and an optional description.
     *
     * @param title The title text to be displayed in the row item.
     * @param modifier The [Modifier] to be applied to the row item.
     * @param description An optional description text to be displayed below the title.
     * @param startSlot An optional composable lambda for content to be displayed at the start of the row.
     * @param endSlot An optional composable lambda for content to be displayed at the end of the row.
     * @param onClick An optional lambda function that will be invoked when the row item is clicked.
     *
     * Example usage:
     * ```
     * ListRowItem(
     *  startSlot = {
     *      StartIcon(
     *          icon = GdsIcons.Regular.Bell,
     *          contentDescription = "Bell icon",
     *      )
     *  },
     *  title = "Konton",
     *  description = "0213-1231412",
     *  endSlot = {
     *      EndIcon(
     *          icon = GdsIcons.Regular.ChevronRight,
     *          contentDescription = "Chevron right icon",
     *      )
     *  },
     * )
     * ```
     */
    @Composable
    operator fun invoke(
        title: String,
        modifier: Modifier = Modifier,
        description: String? = null,
        startSlot: (@Composable RowItemScope.() -> Unit)? = null,
        endSlot: (@Composable RowItemScope.() -> Unit)? = null,
        onClick: (() -> Unit)? = null,
    ) {
        invoke(
            modifier = modifier,
            startSlot = startSlot,
            contentSlot = { DefaultContent(title = title, description = description) },
            endSlot = endSlot,
            onClick = onClick,
        )
    }

    /**
     * A composable function that represents a row item in a list, with customizable content.
     *
     * @param modifier The [Modifier] to be applied to the row item.
     * @param startSlot An optional composable lambda for content to be displayed at the start of the row.
     * @param contentSlot A composable lambda for the main content of the row item.
     * @param endSlot An optional composable lambda for content to be displayed at the end of the row.
     * @param onClick An optional lambda function that will be invoked when the row item is clicked.
     *
     * Example usage:
     * ```
     * ListRowItem(
     *  contentSlot = {
     *      Text(
     *          text = "Title",
     *          style = GdsTheme.typography.DetailBookS,
     *          color = GdsTheme.colors.Content.Neutral02,
     *      )
     *      Text(
     *          text = "Subtitle",
     *          style = GdsTheme.typography.DetailBookXs,
     *          color = GdsTheme.colors.Content.Brand01,
     *      )
     *  },
     *  endSlot = {
     *      EndIcon(
     *          icon = GdsIcons.Regular.ChevronRight,
     *          contentDescription = "Chevron right icon",
     *      )
     *  },
     * )
     * ```
     */
    @Composable
    operator fun invoke(
        modifier: Modifier = Modifier,
        startSlot: (@Composable RowItemScope.() -> Unit)? = null,
        contentSlot: @Composable RowItemScope.() -> Unit,
        endSlot: (@Composable RowItemScope.() -> Unit)? = null,
        onClick: (() -> Unit)? = null,
    ) {
        val itemScope = RowItemScope()
        Row(
            modifier = modifier
                .then(if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier)
                .fillMaxWidth()
                .padding(
                    horizontal = GdsTheme.dimensions.spacing.SpaceL,
                    vertical = GdsTheme.dimensions.spacing.SpaceM,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            startSlot?.let {
                with(itemScope) { it() }
                Spacer(modifier = Modifier.width(GdsTheme.dimensions.spacing.SpaceM))
            }
            Column(modifier = Modifier.weight(1f)) {
                with(itemScope) { contentSlot() }
            }
            endSlot?.let {
                with(itemScope) { it() }
            }
        }
    }
}

@Preview
@Composable
private fun ListRowItemWithTitleAndDescriptionPreview() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1.Neutral01)) {
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

@Preview
@Composable
private fun ListRowItemWithContentSlotPreview() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1.Neutral01)) {
            ListRowItem(
                contentSlot = {
                    Text(
                        text = "Title",
                        style = GdsTheme.typography.DetailBookS,
                        color = GdsTheme.colors.Content.Neutral02,
                    )
                    Text(
                        text = "Subtitle",
                        style = GdsTheme.typography.DetailBookXs,
                        color = GdsTheme.colors.Content.Brand01,
                    )
                },
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
