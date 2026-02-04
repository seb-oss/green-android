package se.seb.gds.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import se.seb.gds.theme.GdsTheme

/**
 * A customizable switch component that can be toggled on and off,
 * with support for different styles, states, and behaviors.
 *
 * @param modifier The [Modifier] to be applied to this switch.
 * @param checked Whether the switch is checked or not.
 * @param style The style of the switch. See [GdsSwitchDefaults] for default styles.
 * @param enabled Whether the switch is enabled or not.
 * @param onCheckedChanged Callback invoked when the checked state changes.
 *
 * Example usage:
 * ```
 * var isChecked by remember { mutableStateOf(false) }
 * GdsSwitch(
 *     checked = isChecked,
 *     onCheckedChanged = { isChecked = it }
 * )
 * ```
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GdsSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    style: GdsSwitchStyle = GdsSwitchDefaults.defaultStyle(),
    enabled: Boolean = true,
    onCheckedChanged: (Boolean) -> Unit,
) {
    GdsTheme {
        CompositionLocalProvider(
            LocalRippleConfiguration provides RippleConfiguration(
                color = GdsTheme.colors.State.Positive03,
                rippleAlpha = RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f),
            ),
        ) {
            Switch(
                modifier = modifier,
                checked = checked,
                enabled = enabled,
                onCheckedChange = onCheckedChanged,
                colors = style.colors,
                thumbContent = {
                    if (checked || style.alwaysShowThumb) {
                        if (style.checkedIcon != null) {
                            Icon(
                                modifier = Modifier.size(SwitchDefaults.IconSize),
                                imageVector = style.checkedIcon,
                                contentDescription = null,
                            )
                        } else if (style.alwaysShowThumb) {
                            Box(modifier = Modifier.size(SwitchDefaults.IconSize))
                        }
                    }
                },
            )
        }
    }
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
private fun GreenSwitchPreview() {
    GdsTheme {
        var checked by remember { mutableStateOf(true) }
        GdsSwitch(
            checked = checked,
            onCheckedChanged = { checked = it },
            style = GdsSwitchDefaults.defaultStyle(),
        )
    }
}
