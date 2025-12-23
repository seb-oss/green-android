package se.seb.gds.atoms.topbar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MediumFlexibleTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalMaterial3ExpressiveApi::class,
)
@Composable
fun MediumTopAppBar(
    modifier: Modifier,
    title: String,
    subtitle: String? = null,
    style: TopAppBarStyle = AppBarDefaults.mediumTopAppBarStyle(),
    scrollBehavior: TopAppBarScrollBehavior,
    navigationIcon: @Composable (() -> Unit)? = null,
    rightActions: @Composable (RowScope.() -> Unit)? = null,
) {
    val textStyle = style.getTitleStyle(scrollBehavior)
    val subtitleStyle = style.getSubtitleStyle(scrollBehavior)

    val subtitle: (@Composable () -> Unit)? = if (subtitle != null) {
        { Text(text = subtitle, style = subtitleStyle) }
    } else {
        null
    }

    MediumFlexibleTopAppBar(
        modifier = modifier,
        colors = style.colors,
        title = { Text(text = title, style = textStyle) },
        subtitle = subtitle,
        navigationIcon = { navigationIcon?.invoke() },
        actions = { rightActions?.invoke(this) },
        scrollBehavior = scrollBehavior,
    )
}
