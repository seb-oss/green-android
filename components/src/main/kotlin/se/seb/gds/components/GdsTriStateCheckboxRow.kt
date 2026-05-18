package se.seb.gds.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.state.ToggleableState
import se.seb.gds.atoms.checkbox.GdsCheckboxDefaults
import se.seb.gds.atoms.checkbox.GdsTriStateCheckbox
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

/**
 * GDS TriState Checkbox Row component, which combines a tri-state checkbox with a label and optional error state.
 *
 * @param modifier Modifier to be applied to the checkbox row.
 * @param parentState The tri-state of the checkbox (On, Off, Indeterminate).
 * @param label The text label to be displayed next to the checkbox.
 * @param enabled Whether the checkbox row is enabled or not.
 * @param isError Whether the checkbox row is in an error state or not.
 * @param onClick Callback to be invoked when the checkbox row is clicked.
 *
 * Example usage:
 * ```
 * var parentState by remember { mutableStateOf(ToggleableState.Off) }
 * GdsTriStateCheckboxRow(
 *     parentState = parentState,
 *     label = "Accept terms and conditions",
 *     onClick = { /* Handle click */ },
 * )
 * ```
 */
@Composable
fun GdsTriStateCheckboxRow(
    modifier: Modifier = Modifier,
    parentState: ToggleableState,
    label: String,
    enabled: Boolean = true,
    isError: Boolean = false,
    onClick: () -> Unit,
) {
    GdsTriStateCheckboxRow(
        modifier = modifier,
        parentState = parentState,
        enabled = enabled,
        isError = isError,
        onClick = onClick,
    ) {
        GdsCheckboxDefaults.DefaultLabel(label)
    }
}

/**
 * GDS TriState Checkbox Row component with a custom label slot, which combines a tri-state checkbox with a label and optional error state.
 *
 * @param modifier Modifier to be applied to the checkbox row.
 * @param parentState The tri-state of the checkbox (On, Off, Indeterminate).
 * @param enabled Whether the checkbox row is enabled or not.
 * @param isError Whether the checkbox row is in an error state or not.
 * @param onClick Callback to be invoked when the checkbox row is clicked.
 * @param labelSlot A composable lambda that defines the content of the label slot. This allows for more complex label layouts, such as multiple lines of text or additional UI elements.
 *
 * Example usage:
 * ```
 * var parentState by remember { mutableStateOf(ToggleableState.Off) }
 * GdsTriStateCheckboxRow(
 *     parentState = parentState,
 *     onClick = { /* Handle click */ },
 * ) {
 *     Text("Label")
 *     Text("Sub label")
 * }
 * ```
 */
@Composable
fun GdsTriStateCheckboxRow(
    modifier: Modifier = Modifier,
    parentState: ToggleableState,
    enabled: Boolean = true,
    isError: Boolean = false,
    onClick: () -> Unit,
    labelSlot: @Composable ColumnScope.() -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .triStateToggleable(
                state = parentState,
                onClick = onClick,
                enabled = enabled,
                role = Role.Checkbox,
            )
            .semantics(mergeDescendants = true) {
                role = Role.Checkbox
            }
            .padding(vertical = GdsCheckboxDefaults.rowVerticalPadding),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        GdsTriStateCheckbox(
            modifier = Modifier.semantics { hideFromAccessibility() },
            state = parentState,
            enabled = enabled,
            isError = isError,
            onClick = onClick,
        )
        Spacer(Modifier.width(GdsCheckboxDefaults.labelSpacing))
        Column(modifier = Modifier.weight(1f)) {
            labelSlot()
        }
    }
}

@GdsUiPreview
@Composable
private fun GdsTriStateCheckboxRowPreview() {
    val parentState = ToggleableState.On
    GdsTheme {
        GdsTriStateCheckboxRow(
            parentState = parentState,
            label = "Label",
            onClick = { },
        )
    }
}

@GdsUiPreview
@Composable
private fun GdsTriStateCheckboxRowSlotPreview() {
    val parentState = ToggleableState.On
    GdsTheme {
        GdsTriStateCheckboxRow(
            parentState = parentState,
            onClick = { },
            labelSlot = {
                Text(
                    text = "Label",
                    style = GdsTheme.typography.DetailBookM,
                    color = GdsTheme.colors.Content.Neutral01,
                )
                Text(
                    text = "Sub label",
                    style = GdsTheme.typography.BodyMediumS,
                    color = GdsTheme.colors.Content.Neutral02,
                )
            },
        )
    }
}
