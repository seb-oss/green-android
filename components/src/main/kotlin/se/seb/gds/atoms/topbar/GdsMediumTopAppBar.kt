package se.seb.gds.atoms.topbar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MediumFlexibleTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * A medium top app bar that displays a title, subtitle, navigation icon, and actions.
 *
 * @param modifier The modifier to be applied to the top app bar.
 * @param title The title to be displayed in the top app bar.
 * @param scrollBehavior The scroll behavior for the top app bar.
 * @param subtitle The subtitle to be displayed in the top app bar.
 * @param style The style to be applied to the top app bar.
 * @param navigationIcon The navigation icon to be displayed at the start of the top app bar.
 * @param rightActions The actions to be displayed at the end of the top app bar.
 *
 * Example usage:
 * ```
 * val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
 * GdsMediumTopAppBar(
 *     title = "Title",
 *     scrollBehavior = scrollBehavior,
 *     navigationIcon = {
 *         IconButton(onClick = { /* doSomething() */ }) {
 *             Icon(
 *                 imageVector = Icons.AutoMirrored.Filled.ArrowBack,
 *                 contentDescription = "Localized description"
 *             )
 *         }
 *     }
 * )
 * ```
 */
@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalMaterial3ExpressiveApi::class,
)
@Composable
fun GdsMediumTopAppBar(
    modifier: Modifier = Modifier,
    title: String,
    scrollBehavior: TopAppBarScrollBehavior,
    subtitle: String? = null,
    style: TopAppBarStyle = TopAppBarDefaults.medium(),
    navigationIcon: @Composable (() -> Unit)? = null,
    rightActions: @Composable (RowScope.() -> Unit)? = null,
) {
    val textStyle = style.getTitleStyle(scrollBehavior)
    val subtitleStyle = style.getSubtitleStyle(scrollBehavior)

    MediumFlexibleTopAppBar(
        modifier = modifier,
        colors = style.colors,
        title = { Text(text = title, style = textStyle) },
        subtitle = subtitle?.let { { Text(text = it, style = subtitleStyle) } },
        navigationIcon = { navigationIcon?.invoke() },
        actions = { rightActions?.invoke(this) },
        scrollBehavior = scrollBehavior,
    )
}
