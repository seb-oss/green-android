package se.seb.gds.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

/**
 * A circular progress indicator following the GDS design system.
 *
 * @param modifier Modifier to be applied to the indicator.
 * @param color The color of the progress indicator.
 * @param trackColor The color of the track (background circle).
 * @param size The diameter of the indicator.
 * @param strokeWidth The thickness of the indicator's line.
 * @param strokeCap The shape of the ends of the progress indicator's stroke.
 *
 * Example usage:
 * ```
 * GdsCircularProgressIndicator(
 *     size = 50.dp,
 *     strokeWidth = 5.dp
 * )
 * ```
 */
@Composable
fun GdsCircularProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = GdsCircularProgressIndicatorDefaults.color(),
    trackColor: Color = GdsCircularProgressIndicatorDefaults.trackColor(),
    size: Dp = GdsCircularProgressIndicatorDefaults.Size,
    strokeWidth: Dp = GdsCircularProgressIndicatorDefaults.StrokeWidth,
    strokeCap: StrokeCap = GdsCircularProgressIndicatorDefaults.strokeCap(),
) {
    CircularProgressIndicator(
        modifier = modifier.size(size),
        color = color,
        trackColor = trackColor,
        strokeWidth = strokeWidth,
        strokeCap = strokeCap,
    )
}

object GdsCircularProgressIndicatorDefaults {
    val Size = 40.dp
    val StrokeWidth = 4.dp

    @Composable
    fun strokeCap(): StrokeCap = StrokeCap.Round

    @Composable
    fun color(): Color = GdsTheme.colors.BorderStrong

    @Composable
    fun trackColor(): Color = GdsTheme.colors.BorderSubtle01
}

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
private fun GdsCircularProgressIndicatorPreview() {
    GdsTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = androidx.compose.ui.Alignment.Center,
        ) {
            GdsCircularProgressIndicator()
        }
    }
}
