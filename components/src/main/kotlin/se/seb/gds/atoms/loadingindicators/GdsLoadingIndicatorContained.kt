package se.seb.gds.atoms.loadingindicators

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.LoadingIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.graphics.shapes.RoundedPolygon
import se.seb.gds.theme.GdsTheme

/**
 * A contained loading indicator following the GDS design system.
 *
 * This is an indeterminate loading indicator with a container background that shows progress
 * using animated polygons. The container provides better visibility and can be used in
 * pull-to-refresh scenarios or when the indicator needs to stand out against varying backgrounds.
 *
 * For a loading indicator without a container background, use [GdsLoadingIndicator].
 *
 * @param modifier Modifier to be applied to the indicator.
 * @param indicatorColor The color of the loading indicator animation.
 * @param containerColor The color of the container background behind the indicator.
 * @param size The diameter of the indicator including the container.
 * @param polygons List of RoundedPolygon shapes to be used for the indicator animation.
 *
 * Example usage:
 * ```
 * GdsLoadingIndicatorContained(
 *     size = 50.dp
 * )
 * ```
 */
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun GdsLoadingIndicatorContained(
    modifier: Modifier = Modifier,
    indicatorColor: Color = GdsLoadingIndicatorDefaults.indicatorColor(),
    containerColor: Color = GdsLoadingIndicatorDefaults.containerColor(),
    size: Dp = GdsLoadingIndicatorDefaults.size,
    polygons: List<RoundedPolygon> = LoadingIndicatorDefaults.IndeterminateIndicatorPolygons,
) {
    ContainedLoadingIndicator(
        modifier = modifier.size(size),
        indicatorColor = indicatorColor,
        containerColor = containerColor,
        polygons = polygons,
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Preview(
    name = "Light Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0x000000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun GdsContainedLoadingIndicatorPreview() {
    GdsTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            GdsLoadingIndicatorContained()
        }
    }
}
