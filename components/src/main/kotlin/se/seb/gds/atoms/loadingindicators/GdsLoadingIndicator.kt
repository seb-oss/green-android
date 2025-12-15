package se.seb.gds.atoms.loadingindicators

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.LoadingIndicator
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
 * A loading indicator following the GDS design system.
 *
 * This is an indeterminate loading indicator that shows progress using animated polygons.
 * This variant has no container background, making it suitable for use on solid backgrounds
 * or when a more subtle appearance is desired.
 *
 * For a loading indicator with a container background use [GdsLoadingIndicatorContained].
 *
 * @param modifier Modifier to be applied to the indicator.
 * @param color The color of the loading indicator animation.
 * @param size The diameter of the indicator.
 * @param polygons List of RoundedPolygon shapes to be used for the indicator animation.
 */
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun GdsLoadingIndicator(
    modifier: Modifier = Modifier,
    color: Color = GdsLoadingIndicatorDefaults.indicatorColor(),
    size: Dp = GdsLoadingIndicatorDefaults.size,
    polygons: List<RoundedPolygon> = LoadingIndicatorDefaults.IndeterminateIndicatorPolygons,
) {
    LoadingIndicator(
        modifier = modifier.size(size),
        color = color,
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
private fun GdsLoadingIndicatorPreview() {
    GdsTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            GdsLoadingIndicator()
        }
    }
}
