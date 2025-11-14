package se.seb.gds.atoms

import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * GDS Bottom Sheet component
 *
 * @param modifier Modifier to be applied to the Bottom Sheet
 * @param style Style configuration for the Bottom Sheet. See [GdsBottomSheetStyle]
 * @param sheetState State of the Bottom Sheet
 * @param showDragHandle Whether to show the drag handle at the top of the Bottom Sheet
 * @param onDismiss Callback invoked when the Bottom Sheet is dismissed
 * @param header Composable content for the header section of the Bottom Sheet
 * @param content Composable content for the main body of the Bottom Sheet
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GdsBottomSheet(
    modifier: Modifier = Modifier,
    style: GdsBottomSheetStyle = GdsBottomSheetDefaults.defaultStyle(),
    sheetState: SheetState,
    showDragHandle: Boolean = false,
    onDismiss: () -> Unit,
    header: @Composable () -> Unit? = {},
    content: @Composable () -> Unit,
) {
    ModalBottomSheet(
        modifier = modifier.safeDrawingPadding(),
        sheetState = sheetState,
        dragHandle = if (showDragHandle) style.dragHandle else null,
        shape = style.shape,
        onDismissRequest = onDismiss,
        tonalElevation = style.elevationDp,
        containerColor = style.containerColor,
    ) {
        header()
        content()
    }
}
