package se.seb.gds.atoms.topbar

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsTopBarAction(
    icon: ImageVector,
    tint: Color = GdsTheme.colors.ContentNeutral01,
    contentDescription: String? = null,
    onClick: () -> Unit,
) = IconButton(onClick = onClick) {
    Icon(
        imageVector = icon,
        tint = tint,
        contentDescription = contentDescription,
    )
}
