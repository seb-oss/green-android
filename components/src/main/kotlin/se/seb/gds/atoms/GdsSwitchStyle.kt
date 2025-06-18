package se.seb.gds.atoms

import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import se.seb.gds.icons.SebIcons
import se.seb.gds.theme.GdsTheme

/**
 * Represents the visual style configuration for a "Green Design System" themed switch.
 *
 * This data class encapsulates the various visual aspects of a switch component,
 * specifically tailored for a green design system theme, including its colors, thumb visibility,
 * and checked icon.
 *
 * @property colors The color scheme for the switch. This includes colors for the track,
 *   thumb, and other elements in different states (checked, unchecked, disabled).
 *   Typically, this will be an instance of [SwitchColors] configured for a green
 *   appearance.
 * @property alwaysShowThumb Specifies whether the thumb should always be shown as expanded,
 *   regardless of the checked state. If `true`, the thumb will always be expanded.
 *   If `false`, the thumb's size may be dependent on the checked state (e.g.,
 *   small when unchecked).
 * @property checkedIcon An optional icon to display inside the thumb when the switch is
 *   in the checked state. If `null`, no icon will be displayed in the checked thumb.
 *   This should be a [ImageVector].
 */
data class GdsSwitchStyle(
    val colors: SwitchColors,
    val alwaysShowThumb: Boolean,
    val checkedIcon: ImageVector?
)

object GdsSwitchDefaults {

    @Composable
    // 2023
    fun defaultStyle() = GdsSwitchStyle(
        colors = defaultColors(),
        alwaysShowThumb = false,
        checkedIcon = SebIcons.Check
    )

    @Composable
    // 2016
    fun legacyStyle() = GdsSwitchStyle(
        colors = legacyColors(),
        alwaysShowThumb = false,
        checkedIcon = SebIcons.Check
    )

    @Composable
    fun neoStyle() = GdsSwitchStyle(
        colors = neoColors(),
        alwaysShowThumb = true,
        checkedIcon = null
    )

    @Composable
    fun defaultColors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = GdsTheme.colors.l3BackgroundPositive,
            uncheckedThumbColor = GdsTheme.colors.l3BorderSecondary,
            uncheckedTrackColor = GdsTheme.colors.l3BackgroundQuarternary,
            checkedIconColor = GdsTheme.colors.l3BackgroundPositive
        )
    }

    @Composable
    fun legacyColors(): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = Color.White,
            checkedTrackColor = GdsTheme.legacyColors.DarkBlue1,
            uncheckedThumbColor = GdsTheme.legacyColors.switchUncheckedTrackColor,
            uncheckedTrackColor = Color.Transparent,
            uncheckedBorderColor = GdsTheme.legacyColors.switchUncheckedTrackColor,
            checkedIconColor = GdsTheme.legacyColors.DarkBlue1
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