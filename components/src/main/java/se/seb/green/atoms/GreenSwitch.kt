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
import androidx.compose.ui.unit.dp
import se.seb.green.icons.SebIcons
import se.seb.green.theme.GreenTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreenSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    colors: SwitchColors = GreenSwitchDefaults.sebColors(),
    enabled: Boolean = true,
    rippleColor: Color = colors.checkedTrackColor,
    checkedIcon: ImageVector = SebIcons.Check,
    onCheckedChanged: (Boolean) -> Unit
) {
    CompositionLocalProvider(LocalRippleConfiguration provides RippleConfiguration(
        color = rippleColor,
        rippleAlpha = RippleAlpha(0.4f, 0.4f, 0.4f, 0.4f)
    )) {
        Switch(
            modifier = modifier,
            checked = checked,
            enabled = enabled,
            onCheckedChange = onCheckedChanged,
            colors = colors,
            thumbContent = {
                if (checked) {
                    Icon(imageVector = checkedIcon, contentDescription = null)
                }
            },
        )
    }
}

object GreenSwitchDefaults {
    @Composable
    fun sebColors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = GreenTheme.colors.level3Colors.levelL3BackgroundPositive,
            uncheckedThumbColor = GreenTheme.colors.level3Colors.levelL3BorderSecondary,
            uncheckedTrackColor = GreenTheme.colors.level3Colors.levelL3BackgroundQuarternary,
            checkedIconColor = GreenTheme.colors.level3Colors.levelL3BackgroundPositive
        )
    }

    @Composable
    fun seb2016Colors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = GreenTheme.legacyColors.DarkBlue1,
            uncheckedThumbColor = GreenTheme.legacyColors.switchUncheckedTrackColor,
            uncheckedTrackColor = Color.Transparent,
            uncheckedBorderColor = GreenTheme.legacyColors.switchUncheckedTrackColor,
            checkedIconColor = GreenTheme.legacyColors.DarkBlue1
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
            colors = GreenSwitchDefaults.sebColors()
        )
    }
}
