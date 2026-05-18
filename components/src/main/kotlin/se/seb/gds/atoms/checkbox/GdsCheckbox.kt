package se.seb.gds.atoms.checkbox

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

/**
 * GDS Checkbox component.
 *
 * @param modifier Modifier to be applied to the checkbox.
 * @param checked Whether the checkbox is checked or not.
 * @param enabled Whether the checkbox is enabled or not.
 * @param isError Whether the checkbox is in an error state or not.
 * @param onCheckedChange Callback to be invoked when the checked state changes. If null, the checkbox will be read-only.
 *
 * Example usage:
 * ```
 * var checked by remember { mutableStateOf(true) }
 * GdsCheckbox(
 *     checked = checked,
 *     onCheckedChange = { /* Handle checked state change */ },
 * )
 * ```
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GdsCheckbox(
    modifier: Modifier = Modifier,
    checked: Boolean = false,
    enabled: Boolean = true,
    isError: Boolean = false,
    onCheckedChange: ((Boolean) -> Unit)? = null,
) {
    GdsTriStateCheckbox(
        modifier = modifier,
        state = ToggleableState(checked),
        onClick =
        if (onCheckedChange != null) {
            { onCheckedChange(!checked) }
        } else {
            null
        },
        enabled = enabled,
        isError = isError,
    )
}

@GdsUiPreview
@Composable
private fun CheckboxCheckedPreview() {
    GdsTheme {
        GdsCheckbox(
            checked = true,
            onCheckedChange = {},
        )
    }
}

@GdsUiPreview
@Composable
private fun CheckboxUncheckedPreview() {
    GdsTheme {
        GdsCheckbox(
            checked = false,
            onCheckedChange = {},
        )
    }
}

@GdsUiPreview
@Composable
private fun CheckboxErrorPreview() {
    GdsTheme {
        GdsCheckbox(
            checked = true,
            isError = true,
            onCheckedChange = {},
        )
    }
}
