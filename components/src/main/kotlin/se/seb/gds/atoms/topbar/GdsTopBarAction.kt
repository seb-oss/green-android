package se.seb.gds.atoms.topbar

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import se.seb.gds.theme.GdsTheme

/**
 * A composable for creating an action item in a top app bar.
 *
 * @param icon The icon to be displayed.
 * @param tint The tint to be applied to the icon.
 * @param contentDescription The content description for the icon.
 * @param onClick The callback to be invoked when the action is clicked.
 *
 * Example usage:
 * ```
 * GdsTopBarAction(
 *     icon = GdsIcons.Regular.Search,
 *     contentDescription = "Search",
 *     onClick = { /* doSomething() */ }
 * )
 * ```
 */
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
