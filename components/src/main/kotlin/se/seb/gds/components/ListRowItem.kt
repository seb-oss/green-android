package se.seb.gds.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
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
import se.seb.gds.icons.SebIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun ListRowItem(
    title: String,
    modifier: Modifier = Modifier,
    size: ListRowItemSize = ListRowItemSize.BIG,
    startIcon: ImageVector? = null,
    endIcon: ImageVector? = null,
    onClick: () -> Unit = { },
) {
    val height = when (size) {
        ListRowItemSize.BIG -> 64.dp
        ListRowItemSize.SMALL -> 48.dp
    }
    Row(
        modifier = modifier
            .clickable(onClick = onClick)
            .heightIn(min = height)
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        startIcon?.let {
            Icon(modifier = Modifier.size(24.dp), imageVector = startIcon, contentDescription = null)
            Spacer(modifier = Modifier.width(16.dp))
        }
        Text(
            modifier = Modifier.weight(1f),
            text = title,
            style = GdsTheme.typography.DetailBookLarge,
            color = GdsTheme.colors.ContentNeutral01,
        )
        endIcon?.let {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = endIcon,
                tint = GdsTheme.colors.ContentNeutral02,
                contentDescription = null,
            )
        }
    }
}

@Preview
@Composable
private fun ListRowItemPreview() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1Neutral01)) {
            ListRowItem(
                startIcon = SebIcons.Check,
                title = "Konton",
                endIcon = SebIcons.RightChevron,
            )
        }

    }
}