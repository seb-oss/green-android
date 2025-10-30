package se.seb.gds.atoms

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

/**
 * Style configuration for GDS Bottom Sheet component
 *
 * @param cornerRadiusDp Corner radius of the Bottom Sheet in Dp
 * @param elevationDp Elevation of the Bottom Sheet in Dp
 * @param shape Shape of the Bottom Sheet
 * @param containerColor Background color of the Bottom Sheet
 * @param dragHandle Composable content for the drag handle at the top of the Bottom Sheet
 */
data class GdsBottomSheetStyle(
    val cornerRadiusDp: Dp,
    val elevationDp: Dp,
    val shape: Shape,
    val containerColor: Color,
    val dragHandle: @Composable (() -> Unit)?
)

/**
 * Default styles for GDS Bottom Sheet component
 */
object GdsBottomSheetDefaults {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun defaultStyle(
        containerColor: Color = GdsTheme.colors.L2Neutral02,
        cornerRadiusDp: Dp = GdsTheme.dimensions.radius.RadiusM,
        elevationDp: Dp = 16.dp,
        shape: Shape = RoundedCornerShape(
            topStart = GdsTheme.dimensions.spacing.SpaceM,
            topEnd = GdsTheme.dimensions.spacing.SpaceM,
        ),
        dragHandle: @Composable (() -> Unit)? = { BottomSheetDefaults.DragHandle() },
    ) = GdsBottomSheetStyle(
        containerColor = containerColor,
        cornerRadiusDp = cornerRadiusDp,
        elevationDp = elevationDp,
        shape = shape,
        dragHandle = dragHandle
    )
}