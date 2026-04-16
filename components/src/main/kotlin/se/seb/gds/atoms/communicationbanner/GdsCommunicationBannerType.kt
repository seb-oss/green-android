package se.seb.gds.atoms.communicationbanner

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

/**
 * Represents the visual style for a [GdsCommunicationBanner].
 *
 * Each style provides a specific icon, icon tint color, and banner background color
 * to convey different types of messages (e.g., error, warning, success, info).
 */
enum class GdsCommunicationBannerType {
    /**
     * Error style - Used for critical messages or errors.
     */
    Error,

    /**
     * Warning style - Used for warning messages.
     */
    Warning,

    /**
     * Notice style - Used for success or confirmation messages.
     */
    Notice,

    /**
     * Information style - Used for informational messages.
     */
    Information,

    ;

    /**
     * The icon to display in the banner.
     */
    val icon: ImageVector
        @Composable get() = when (this) {
            Error -> GdsIcons.Regular.TriangleExclamation
            else -> GdsIcons.Regular.CircleInfo
        }

    /**
     * The tint color for the icon.
     */
    val iconTint: Color
        @Composable get() = when (this) {
            Error -> GdsTheme.legacyColors.Red1
            Warning -> GdsTheme.legacyColors.Yellow1
            Notice -> GdsTheme.legacyColors.DarkBlue1
            Information -> GdsTheme.legacyColors.PrimaryText
        }

    /**
     * The background color for the banner indicator.
     */
    val bannerColor: Color
        @Composable get() = when (this) {
            Error -> GdsTheme.legacyColors.Red2
            Warning -> GdsTheme.legacyColors.ErrorCard
            Notice -> GdsTheme.legacyColors.LightBlue2
            Information -> GdsTheme.legacyColors.TertiaryButtonBackground
        }
}
