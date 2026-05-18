package se.seb.gds.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import se.seb.gds.atoms.checkbox.GdsCheckbox
import se.seb.gds.atoms.checkbox.GdsCheckboxDefaults
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

/**
 * GDS Checkbox Row component, which combines a checkbox with a label and optional error state.
 *
 * @param modifier Modifier to be applied to the checkbox row.
 * @param checked Whether the checkbox is checked or not.
 * @param label The text label to be displayed next to the checkbox.
 * @param enabled Whether the checkbox row is enabled or not.
 * @param isError Whether the checkbox row is in an error state or not.
 * @param onClick Callback to be invoked when the checkbox row is clicked. The callback receives the new checked state as a parameter.
 *
 * Example usage:
 * ```
 * var checked by remember { mutableStateOf(false) }
 * GdsCheckboxRow(
 *     checked = checked,
 *     label = "Accept terms and conditions",
 *     onClick = { checked = it },
 * )
 * ```
 */
@Composable
fun GdsCheckboxRow(
    modifier: Modifier = Modifier,
    checked: Boolean = false,
    label: String,
    enabled: Boolean = true,
    isError: Boolean = false,
    onClick: (Boolean) -> Unit = { },
) {
    GdsCheckboxRow(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isError = isError,
        onClick = onClick,
    ) {
        GdsCheckboxDefaults.DefaultLabel(label)
    }
}

/**
 * GDS Checkbox Row component with a custom label slot, which combines a checkbox with a label and optional error state.
 *
 * @param modifier Modifier to be applied to the checkbox row.
 * @param checked Whether the checkbox is checked or not.
 * @param enabled Whether the checkbox row is enabled or not.
 * @param isError Whether the checkbox row is in an error state or not.
 * @param onClick Callback to be invoked when the checkbox row is clicked. The callback receives the new checked state as a parameter.
 * @param labelSlot A composable lambda that defines the content of the label slot. This allows for more complex label layouts, such as multiple lines of text or additional icons.
 * Example usage:
 * ```
 * var checked by remember { mutableStateOf(false) }
 * GdsCheckboxRow(
 *     checked = checked,
 *     onClick = { checked = it },
 *     labelSlot = {
 *         Text(
 *             text = "Accept terms and conditions",
 *             style = GdsTheme.typography.DetailBookM,
 *             color = GdsTheme.colors.Content.Neutral01,
 *         )
 *         Text(
 *             text = "Sub label",
 *             style = GdsTheme.typography.DetailRegularS,
 *             color = GdsTheme.colors.Content.Neutral02,
 *         )
 *     },
 * )
 * ```
 */
@Composable
fun GdsCheckboxRow(
    modifier: Modifier = Modifier,
    checked: Boolean = false,
    enabled: Boolean = true,
    isError: Boolean = false,
    onClick: (Boolean) -> Unit = { },
    labelSlot: @Composable ColumnScope.() -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .toggleable(
                value = checked,
                enabled = enabled,
                onValueChange = { onClick(!checked) },
                role = Role.Checkbox,
            )
            .semantics(mergeDescendants = true) {
                role = Role.Checkbox
            }
            .padding(vertical = GdsCheckboxDefaults.rowVerticalPadding),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        GdsCheckbox(
            modifier = Modifier.semantics { hideFromAccessibility() },
            checked = checked,
            enabled = enabled,
            isError = isError,
            onCheckedChange = onClick,
        )
        Spacer(Modifier.width(GdsCheckboxDefaults.labelSpacing))
        Column(modifier = Modifier.weight(1f)) {
            labelSlot()
        }
    }
}

@GdsUiPreview
@Composable
private fun GdsCheckboxRowPreview() {
    GdsCheckboxRow(
        label = "Label",
        checked = true,
        onClick = { },
    )
}

@GdsUiPreview
@Composable
private fun GdsCheckboxRowSlotPreview() {
    GdsCheckboxRow(
        checked = true,
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
