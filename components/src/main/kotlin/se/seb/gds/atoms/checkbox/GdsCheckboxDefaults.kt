package se.seb.gds.atoms.checkbox

import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

/**
 * Object containing default values and styles for GDS Checkbox components.
 */
object GdsCheckboxDefaults {

    val StrokeWidth = 1.5.dp

    val DisabledStateAlpha = 0.38f

    val CheckboxSize = 48.dp

    val rowVerticalPadding
        @Composable
        get() = GdsTheme.dimensions.spacing.SpaceS

    val labelSpacing
        @Composable
        get() = GdsTheme.dimensions.spacing.SpaceXs

    @Composable
    fun errorColors(): CheckboxColors =
        CheckboxDefaults.colors(
            checkedColor = GdsTheme.colors.L3.Negative01,
            uncheckedColor = GdsTheme.colors.L3.Negative01,
            checkmarkColor = GdsTheme.colors.Content.Inversed,
            disabledCheckedColor = GdsTheme.colors.L3.Negative01.copy(alpha = DisabledStateAlpha),
            disabledUncheckedColor = GdsTheme.colors.L3.Negative01.copy(alpha = DisabledStateAlpha),
        )

    @Composable
    fun defaultColors(): CheckboxColors =
        CheckboxDefaults.colors(
            checkedColor = GdsTheme.colors.Content.Neutral01,
            uncheckedColor = GdsTheme.colors.Border.Strong,
            checkmarkColor = GdsTheme.colors.Content.Neutral03,
            disabledCheckedColor = GdsTheme.colors.Content.Neutral01.copy(alpha = DisabledStateAlpha),
            disabledUncheckedColor = GdsTheme.colors.Border.Strong.copy(alpha = DisabledStateAlpha),
        )

    /**
     * Composable function to display the default label for a checkbox, with optional error styling.
     *
     * @param label The text to be displayed as the label.
     */
    @Composable
    fun DefaultLabel(label: String) {
        Text(
            text = label,
            style = GdsTheme.typography.DetailBookM,
            color = GdsTheme.colors.Content.Neutral01,
        )
    }
}
