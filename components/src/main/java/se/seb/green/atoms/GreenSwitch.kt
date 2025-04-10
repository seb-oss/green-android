package se.seb.green.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import se.seb.green.icons.SebIcons
import se.seb.green.theme.GreenTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreenSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    style: GreenSwitchStyle = GreenSwitchDefaults.defaultStyle(),
    enabled: Boolean = true,
    onCheckedChanged: (Boolean) -> Unit
) {
    GreenTheme {
        CompositionLocalProvider(
            LocalRippleConfiguration provides RippleConfiguration(
                color = style.colors.checkedTrackColor,
                rippleAlpha = RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f)
            )
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
                            Icon(imageVector = style.checkedIcon, contentDescription = null)
                        } else if (style.alwaysShowThumb) {
                            Box(modifier = Modifier.size(SwitchDefaults.IconSize))
                        }
                    }
                },
            )
        }
    }
}

data class GreenSwitchStyle(
    val colors: SwitchColors,
    val alwaysShowThumb: Boolean,
    val checkedIcon: ImageVector?
)

object GreenSwitchDefaults {

    @Composable
    fun defaultStyle() = GreenSwitchStyle(
        colors = defaultColors(),
        alwaysShowThumb = false,
        checkedIcon = SebIcons.Check
    )

    @Composable
    fun legacyStyle() = GreenSwitchStyle(
        colors = legacyColors(),
        alwaysShowThumb = false,
        checkedIcon = SebIcons.Check
    )

    @Composable
    fun neoStyle() = GreenSwitchStyle(
        colors = neoColors(),
        alwaysShowThumb = true,
        checkedIcon = null
    )

    @Composable
    fun defaultColors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = GreenTheme.colors.level3Colors.levelL3BackgroundPositive,
            uncheckedThumbColor = GreenTheme.colors.level3Colors.levelL3BorderSecondary,
            uncheckedTrackColor = GreenTheme.colors.level3Colors.levelL3BackgroundQuarternary,
            checkedIconColor = GreenTheme.colors.level3Colors.levelL3BackgroundPositive
        )
    }

    @Composable
    fun legacyColors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = GreenTheme.legacyColors.DarkBlue1,
            uncheckedThumbColor = GreenTheme.legacyColors.switchUncheckedTrackColor,
            uncheckedTrackColor = Color.Transparent,
            uncheckedBorderColor = GreenTheme.legacyColors.switchUncheckedTrackColor,
            checkedIconColor = GreenTheme.legacyColors.DarkBlue1
        )
    }

    @Composable
    fun neoColors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = Color(0xFF26BD3F),
            uncheckedThumbColor = Color.White,
            uncheckedTrackColor = Color(0xFFABABAB),
            checkedIconColor = Color.Transparent,
            checkedBorderColor = Color.Transparent,
            uncheckedBorderColor = Color.Transparent,
        )
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
    GreenTheme {
        var checked by remember { mutableStateOf(true) }
        GreenSwitch(
            checked = checked,
            onCheckedChanged = { checked = it },
            style = GreenSwitchDefaults.defaultStyle()
        )
    }
}
