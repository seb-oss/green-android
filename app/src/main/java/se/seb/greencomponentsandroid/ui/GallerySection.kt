package se.seb.greencomponentsandroid.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.green.icons.SebIcons
import se.seb.green.theme.GreenTheme

@Composable
internal fun GallerySection(
    title: String,
    content: @Composable () -> Unit,
) {
    val horizontalModifier = Modifier.padding(horizontal = 16.dp)
    CardColumn(contentPadding = PaddingValues(vertical = 8.dp)) {
        Text(
            modifier = horizontalModifier,
            text = title,
            color = GreenTheme.legacyColors.PrimaryText,
            style = GreenTheme.typography.Title4,
        )
        content()
    }
}

@Composable
internal fun ListItem(
    title: String,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .clickable { onClick() }
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(modifier = Modifier.weight(1f), text = title, color = GreenTheme.legacyColors.PrimaryText)
        Icon(imageVector = SebIcons.RightChevron, contentDescription = null, tint = GreenTheme.colors.contentContent)
    }
}