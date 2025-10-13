package se.seb.gds.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import se.seb.gds.components.ListRowItem
import se.seb.gds.components.ListRowItemSize
import se.seb.gds.icons.SebIcons

@Preview
@Composable
fun ListItemScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        ListRowItem(title = "ListRowItem Big")
        HorizontalDivider()
        ListRowItem(title = "ListRowItem Big", startIcon = null, endIcon = SebIcons.RightChevron)
        HorizontalDivider()
        ListRowItem(title = "ListRowItem Big", startIcon = SebIcons.Check, endIcon = SebIcons.RightChevron)
        HorizontalDivider()
        ListRowItem(title = "ListRowItem Small", size = ListRowItemSize.SMALL)
        HorizontalDivider()
        ListRowItem(title = "ListRowItem Small", size = ListRowItemSize.SMALL, startIcon = null, endIcon = SebIcons.RightChevron)
        HorizontalDivider()
        ListRowItem(title = "ListRowItem Small", size = ListRowItemSize.SMALL, startIcon = SebIcons.Check, endIcon = SebIcons.RightChevron)
        HorizontalDivider()
    }
}