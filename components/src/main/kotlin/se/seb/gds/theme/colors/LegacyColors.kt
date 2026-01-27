package se.seb.gds.theme.colors

import androidx.compose.ui.graphics.Color

data class LegacyColors(
    val isDark: Boolean,
    val primary: Color,
    val onPrimary: Color,
    val primaryVariant: Color,
    val onPrimaryVariant: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryVariant: Color = secondary,
    val onSecondaryVariant: Color = onSecondary,
    val background: Color,
    val dialogBackground: Color,
    val background_1dp: Color,
    val background_4dp: Color,
    val background_8dp: Color,
    val background_24dp: Color,
    val backgroundGrouped: Color,
    val backgroundGrouped_1dp: Color,
    val backgroundGrouped_4dp: Color,
    val elevatedBackground: Color,
    val elevatedSecondaryBackgroundGrouped: Color,
    val onBackground: Color,
    val onBackgroundOption2: Color,
    val lineOnBackground: Color = onBackground,
    val surface: Color,
    val onSurface: Color,
    val onSurfaceOption2: Color,
    val lineOnSurface: Color = onSurface,
    val error: Color,
    val onError: Color,
    val DarkBlue1: Color,
    val DarkBlue2: Color,
    val LightBlue2: Color,
    val Blue1: Color,
    val Blue2: Color,
    val Blue3: Color,
    val Green1: Color,
    val Green2: Color,
    val Purple1: Color,
    val Purple2: Color,
    val Yellow1: Color,
    val Yellow2: Color,
    val Red1: Color,
    val Red2: Color,
    val Red3: Color,
    val Gray1: Color,
    val Gray2: Color,
    val Gray3: Color,
    val Gray4: Color,
    val Gray5: Color,
    val PrimaryText: Color,
    val SecondaryText: Color,
    val TertiaryText: Color,
    val QuaternaryText: Color,
    val PrimaryButtonTop: Color,
    val PrimaryButtonBottom: Color,
    val SecondaryButtonTop: Color,
    val SecondaryButtonBottom: Color,
    val TertiaryButtonBackground: Color,
    val DisabledButton: Color,
    val SellButtonTop: Color,
    val SellButtonBottom: Color,
    val Separator: Color,
    val InfoCard: Color,
    val InfoBorder: Color,
    val ErrorMessage: Color,
    val ErrorCard: Color,
    val ErrorBorder: Color,
    val InputFieldGray: Color,
    val InputFieldWhite: Color,
    val dialogTop: Color,
    val dialogBottom: Color,
    val utilityColors: UtilityColors = UtilityColors.defaultColors(isDark),
    val signingCardDarkModeSeparator: Color,
    val graphDividerColor: Color,
    val graphLabelColor: Color,
    val graphDottedLinesColor: Color,
    val graphBackgroundGradientBottom: Color,
    val graphBackgroundGradientTop: Color,
    val selectorLineGradientStartColor: Color,
    val selectorLineGradientEndColor: Color,
    val transparentBlackOverlay: Color,
    val logInSheetIconBg: Color,
    val smallGalleryLinkIconColor: Color,
    val coachMarkTextColor: Color,
    val coachMarkBackgroundColor: Color,
    val statusBackgroundAction: Color,
    val statusBackgroundError: Color,
    val statusBackgroundWarning: Color,
    val rippleEffect: Color,
    val iconBackground: Color,
    val iconTint: Color,
    val CloseIconColor: Color,
    val CloseIconBG: Color,
    val magnifyingContainerColor: Color,
    val permissionErrorDescriptionColor: Color,
    val switchUncheckedTrackColor: Color,
    val modalScrimColor: Color,
    val swipeRefreshContentColor: Color,
    val swipeRefreshBackgroundColor: Color,
    val backgroundStatusWarning: Color,
    val secondaryGroupedBackgroundColor: Color,
    val shimmerColor: Color,
) {
    companion object {
        private val defaultLightColors =
            LegacyColors(
                isDark = false,
                primary = ColorPalette.Green2,
                onPrimary = Color.White,
                primaryVariant = ColorPalette.Green1,
                onPrimaryVariant = Color.White,
                secondary = ColorPalette.DarkBlue1,
                onSecondary = Color.White,
                surface = Color.White,
                onSurface = ColorPalette.Black_90,
                onSurfaceOption2 = ColorPalette.Black_60,
                background = Color.White,
                dialogBackground = Color.White,
                background_1dp = Color.White,
                background_4dp = Color.White,
                background_8dp = Color.White,
                background_24dp = Color.White,
                elevatedBackground = ColorPalette.ElevatedBackground,
                elevatedSecondaryBackgroundGrouped = Color.White,
                backgroundGrouped = ColorPalette.BackgroundGrouped,
                backgroundGrouped_1dp = ColorPalette.BackgroundGrouped,
                backgroundGrouped_4dp = ColorPalette.BackgroundGrouped,
                onBackground = ColorPalette.Gray2,
                onBackgroundOption2 = Color.Black,
                error = ColorPalette.Red1,
                onError = Color.White,
                DarkBlue1 = ColorPalette.DarkBlue1,
                DarkBlue2 = ColorPalette.DarkBlue2,
                LightBlue2 = ColorPalette.LightBlue2,
                Blue1 = ColorPalette.Blue1,
                Blue2 = ColorPalette.Blue2,
                Blue3 = ColorPalette.Blue3,
                Green1 = ColorPalette.Green1,
                Green2 = ColorPalette.Green2,
                Purple1 = ColorPalette.Purple1,
                Purple2 = ColorPalette.Purple2,
                Yellow1 = ColorPalette.Yellow1,
                Yellow2 = ColorPalette.Yellow2,
                Red1 = ColorPalette.Red1,
                Red2 = ColorPalette.Red2,
                Red3 = ColorPalette.Red3,
                Gray1 = ColorPalette.Gray1,
                Gray2 = ColorPalette.Gray2,
                Gray3 = ColorPalette.Gray3,
                Gray4 = ColorPalette.Gray4,
                Gray5 = ColorPalette.Gray5,
                PrimaryText = ColorPalette.Black_90,
                SecondaryText = ColorPalette.Black_60,
                TertiaryText = ColorPalette.Black_35,
                QuaternaryText = ColorPalette.Black_15,
                PrimaryButtonTop = ColorPalette.PrimaryButtonTop,
                PrimaryButtonBottom = ColorPalette.PrimaryButtonBottom,
                SecondaryButtonTop = ColorPalette.SecondaryButtonTop,
                SecondaryButtonBottom = ColorPalette.SecondaryButtonBottom,
                TertiaryButtonBackground = ColorPalette.TertiaryButtonBackground,
                DisabledButton = ColorPalette.DisabledButton,
                SellButtonTop = ColorPalette.SellButtonTop,
                SellButtonBottom = ColorPalette.SellButtonBottom,
                Separator = ColorPalette.Separator,
                InfoCard = ColorPalette.InfoCard,
                InfoBorder = ColorPalette.InfoBorder,
                ErrorMessage = ColorPalette.ErrorMessage,
                ErrorCard = ColorPalette.ErrorCard,
                ErrorBorder = ColorPalette.ErrorBorder,
                InputFieldGray = ColorPalette.InputFieldGray,
                InputFieldWhite = ColorPalette.InputFieldWhite,
                dialogTop = ColorPalette.BackgroundGrouped,
                dialogBottom = Color.White,
                signingCardDarkModeSeparator = Color.Transparent,
                graphDividerColor = ColorPalette.GraphDividerColor,
                graphLabelColor = ColorPalette.Black_60,
                graphDottedLinesColor = ColorPalette.Black_90,
                transparentBlackOverlay = ColorPalette.transparentBlackOverlay,
                logInSheetIconBg = ColorPalette.LogInSheetIconBg,
                smallGalleryLinkIconColor = ColorPalette.Black_35,
                graphBackgroundGradientBottom = ColorPalette.Purple2.copy(alpha = 0.2f),
                graphBackgroundGradientTop = ColorPalette.Purple2.copy(alpha = 0.5f),
                selectorLineGradientStartColor = ColorPalette.Black_60,
                selectorLineGradientEndColor = ColorPalette.Black_0,
                coachMarkTextColor = ColorPalette.White_90,
                coachMarkBackgroundColor = ColorPalette.DarkGray,
                statusBackgroundAction = ColorPalette.statusBackgroundActionLightMode,
                statusBackgroundError = ColorPalette.statusBackgroundErrorLightMode,
                statusBackgroundWarning = ColorPalette.statusBackgroundWarningLightMode,
                rippleEffect = ColorPalette.InfoCard,
                iconBackground = ColorPalette.iconBackgroundLight,
                iconTint = ColorPalette.Black_90,
                CloseIconColor = ColorPalette.CloseIconColor,
                CloseIconBG = ColorPalette.CloseIconBG,
                permissionErrorDescriptionColor = ColorPalette.White_60,
                magnifyingContainerColor = ColorPalette.Black_90,
                switchUncheckedTrackColor = ColorPalette.SwitchUncheckedTrackColor,
                modalScrimColor = Color.Black.copy(alpha = 0.3f),
                swipeRefreshContentColor = ColorPalette.SwipeRefreshContentColorLight,
                swipeRefreshBackgroundColor = ColorPalette.SwipeRefreshBackgroundColorLight,
                backgroundStatusWarning = ColorPalette.backgroundStatusWarningColorLight,
                secondaryGroupedBackgroundColor = ColorPalette.secondaryGroupedBackgroundColorLight,
                shimmerColor = ColorPalette.Gray6,
            )

        private val defaultDarkColors =
            LegacyColors(
                isDark = true,
                primary = ColorPalette.Green2Dark,
                onPrimary = Color.Black,
                primaryVariant = ColorPalette.Green1Dark,
                onPrimaryVariant = Color.Black,
                secondary = ColorPalette.DarkBlue1Dark,
                onSecondary = Color.Black,
                surface = ColorPalette.Background_1dp,
                onSurface = ColorPalette.White_90,
                onSurfaceOption2 = ColorPalette.White_60,
                background = Color.Black,
                dialogBackground = ColorPalette.Gray3,
                background_1dp = ColorPalette.Background_1dp,
                background_4dp = ColorPalette.Background_4dp,
                background_8dp = ColorPalette.Background_8dp,
                background_24dp = ColorPalette.Background_24dp,
                elevatedBackground = ColorPalette.ElevatedBackgroundDark,
                elevatedSecondaryBackgroundGrouped = ColorPalette.Gray2Dark,
                backgroundGrouped = Color.Black,
                backgroundGrouped_1dp = ColorPalette.ElevatedBackgroundDark,
                backgroundGrouped_4dp = ColorPalette.Background_4dp,
                onBackground = ColorPalette.Gray2Dark,
                onBackgroundOption2 = Color.White,
                error = ColorPalette.Red1Dark,
                onError = Color.White,
                DarkBlue1 = ColorPalette.DarkBlue1Dark,
                DarkBlue2 = ColorPalette.DarkBlue2Dark,
                LightBlue2 = ColorPalette.LightBlue2Dark,
                Blue1 = ColorPalette.Blue1Dark,
                Blue2 = ColorPalette.Blue2Dark,
                Blue3 = ColorPalette.Blue3Dark,
                Green1 = ColorPalette.Green1Dark,
                Green2 = ColorPalette.Green2Dark,
                Purple1 = ColorPalette.Purple1Dark,
                Purple2 = ColorPalette.Purple2Dark,
                Yellow1 = ColorPalette.Yellow1Dark,
                Yellow2 = ColorPalette.Yellow2Dark,
                Red1 = ColorPalette.Red1Dark,
                Red2 = ColorPalette.Red2Dark,
                Red3 = ColorPalette.Red3Dark,
                Gray1 = ColorPalette.Gray1Dark,
                Gray2 = ColorPalette.Gray2Dark,
                Gray3 = ColorPalette.Gray3Dark,
                Gray4 = ColorPalette.Gray4Dark,
                Gray5 = ColorPalette.Gray5Dark,
                PrimaryText = ColorPalette.White_90,
                SecondaryText = ColorPalette.White_60,
                TertiaryText = ColorPalette.White_35,
                QuaternaryText = ColorPalette.White_15,
                PrimaryButtonTop = ColorPalette.PrimaryButtonTopDark,
                PrimaryButtonBottom = ColorPalette.PrimaryButtonBottomDark,
                SecondaryButtonTop = ColorPalette.SecondaryButtonTopDark,
                SecondaryButtonBottom = ColorPalette.SecondaryButtonBottomDark,
                TertiaryButtonBackground = ColorPalette.TertiaryButtonBackgroundDark,
                DisabledButton = ColorPalette.DisabledButtonDark,
                SellButtonTop = ColorPalette.SellButtonTopDark,
                SellButtonBottom = ColorPalette.SellButtonBottomDark,
                Separator = ColorPalette.SeparatorDark,
                InfoCard = ColorPalette.InfoCardDark,
                InfoBorder = ColorPalette.InfoBorderDark,
                ErrorMessage = ColorPalette.ErrorMessageDark,
                ErrorCard = ColorPalette.ErrorCardDark,
                ErrorBorder = ColorPalette.ErrorCardBorderDark,
                InputFieldGray = ColorPalette.InputFieldGrayDark,
                InputFieldWhite = ColorPalette.InputFieldWhiteDark,
                dialogTop = ColorPalette.Background_1dp,
                dialogBottom = ColorPalette.Background_8dp,
                signingCardDarkModeSeparator = ColorPalette.SigningCardDarkModeSeparator,
                graphDividerColor = ColorPalette.White_15,
                graphLabelColor = ColorPalette.White_60,
                graphDottedLinesColor = ColorPalette.White_90.copy(alpha = 0.4f),
                transparentBlackOverlay = ColorPalette.transparentBlackOverlayDark,
                logInSheetIconBg = ColorPalette.LogInSheetIconBgDark,
                smallGalleryLinkIconColor = ColorPalette.White_35,
                graphBackgroundGradientBottom = ColorPalette.Purple2Dark.copy(alpha = 0.25f),
                graphBackgroundGradientTop = ColorPalette.Purple2Dark.copy(alpha = 0.5f),
                selectorLineGradientStartColor = ColorPalette.White_60,
                selectorLineGradientEndColor = ColorPalette.White_0,
                coachMarkTextColor = ColorPalette.Black_90,
                coachMarkBackgroundColor = Color.White,
                statusBackgroundAction = ColorPalette.statusBackgroundActionDarkMode,
                statusBackgroundError = ColorPalette.statusBackgroundErrorDarkMode,
                statusBackgroundWarning = ColorPalette.statusBackgroundWarningDarkMode,
                rippleEffect = ColorPalette.Blue3Dark,
                iconBackground = ColorPalette.iconBackgroundDark,
                iconTint = ColorPalette.DarkGray,
                CloseIconColor = ColorPalette.CloseIconColorDark,
                CloseIconBG = ColorPalette.CloseIconBGDark,
                permissionErrorDescriptionColor = ColorPalette.White_60,
                magnifyingContainerColor = ColorPalette.White_90,
                switchUncheckedTrackColor = ColorPalette.SwitchUncheckedTrackColorDark,
                modalScrimColor = Color.Black.copy(alpha = 0.6f),
                swipeRefreshContentColor = ColorPalette.SwipeRefreshContentColorDark,
                swipeRefreshBackgroundColor = ColorPalette.SwipeRefreshBackgroundColorDark,
                backgroundStatusWarning = ColorPalette.backgroundStatusWarningColorDark,
                secondaryGroupedBackgroundColor = ColorPalette.secondaryGroupedBackgroundColorDark,
                shimmerColor = ColorPalette.Gray2Dark,
            )

        fun defaultColors(isSystemDarkMode: Boolean): LegacyColors =
            if (isSystemDarkMode) {
                defaultDarkColors
            } else {
                defaultLightColors
            }
    }
}

data class UtilityColors(val UtilityTestColor: Color) {
    companion object {
        private val lightColors =
            UtilityColors(
                UtilityTestColor = Color.Black,
            )

        private val darkColors =
            UtilityColors(
                UtilityTestColor = Color.White,
            )

        fun defaultColors(darkTheme: Boolean): UtilityColors = if (darkTheme) darkColors else lightColors
    }
}

internal object ColorPalette {
    // colors
    val DarkBlue1 = Color(0xFF007AC7)
    val DarkBlue2 = Color(0xFF054F96)
    val LightBlue2 = Color(0xFFE6F4FC)
    val DarkBlue1Dark = Color(0xFF2C9CD9)
    val DarkBlue2Dark = Color(0xFF58B8EE)
    val LightBlue2Dark = Color(0xFF11435E)

    val Blue1 = Color(0xFF007AC7)
    val Blue2 = Color(0xFF0092E1)
    val Blue3 = Color(0xFF41B0EE)
    val Blue1Dark = Color(0xFF2378AD)
    val Blue2Dark = Color(0xFF2697D4)
    val Blue3Dark = Color(0xFF363739)

    val Green1 = Color(0xFF246600)
    val Green2 = Color(0xFF45b400)
    val Green1Dark = Color(0xFF497031)
    val Green2Dark = Color(0xFF8BDB59)

    val Purple1 = Color(0xFF3f2587)
    val Purple2 = Color(0xFF673AB6)

    val Purple1Dark = Color(0xFF4A328F)
    val Purple2Dark = Color(0xFF7E52CC)

    val Yellow1 = Color(0xFFF8A000)
    val Yellow2 = Color(0xFFFFB400)
    val Yellow1Dark = Color(0xFFEBAB39)
    val Yellow2Dark = Color(0xFFF0BE47)

    val Red1 = Color(0xFFd81a1a)
    val Red1Dark = Color(0xFFFF6B6B)
    val Red2 = Color(0XFFFDF1F1)
    val Red2Dark = Color(0x33D81A1A)
    val Red3 = Color(0xFFD81A1A)
    val Red3Dark = Color(0xFFFF453B)

    val Gray1 = Color(0xFFF1F1F2)
    val Gray2 = Color(0xFFB3B3B3)
    val Gray3 = Color(0xFF323232)
    val Gray4 = Color(0xFF949494)
    val Gray5 = Color(0xFFDADADA)
    val Gray6 = Color(0xFFECECEC)
    val Gray1Dark = Color(0xFF1B1B1C)
    val Gray2Dark = Color(0xFF2A2B2D)
    val Gray3Dark = Color(0xFF292929)
    val Gray4Dark = Color(0xFF999999)
    val Gray5Dark = Color(0xFF3E3E40)

    val Black_0 = Color(0x00000000)
    val Black_15 = Color(0x26000000)
    val Black_35 = Color(0x59000000)
    val Black_60 = Color(0x99000000)
    val Black_90 = Color(0xE6000000)
    val White_0 = Color(0x00FFFFFF)
    val White_10 = Color(0x1AFFFFFF)
    val White_15 = Color(0x26FFFFFF)
    val White_35 = Color(0x59FFFFFF)
    val White_60 = Color(0x99FFFFFF)
    val White_90 = Color(0xE6FFFFFF)

    // Buttons - primary
    val PrimaryButtonTop = Color(0xFF248DCF)
    val PrimaryButtonBottom = Color(0xFF007AC7)
    val PrimaryButtonTopDark = Color(0xFF3786B2)
    val PrimaryButtonBottomDark = Color(0xFF1E79AA)

    // Buttons - secondary
    val SecondaryButtonTop = Color(0xFFE9ECEE)
    val SecondaryButtonBottom = Color(0xFFE1E2E3)
    val SecondaryButtonTopDark = Color(0x7A707070)
    val SecondaryButtonBottomDark = Color(0x7A5C5C5C)

    // Buttons - tertiary
    val TertiaryButtonBackground: Color = Color(0xFFF3F3F3)
    val TertiaryButtonBackgroundDark: Color = White_10

    // Buttons - disabled
    val DisabledButton = Color(0x0D000000)
    val DisabledButtonDark = Color(0x4D45474A)

    // Buttons - Sell
    val SellButtonTop = Color(0xFFDE4747)
    val SellButtonBottom = Color(0xFFD33434)
    val SellButtonTopDark = Color(0xFFCD5C5C)
    val SellButtonBottomDark = Color(0xFFC44545)

    val Separator = Color(0xFFE8E8E8)
    val SeparatorDark = Color(0x26F8F8FE)

    val ErrorMessage = Color(0xFFFDF1F1)
    val ErrorMessageDark = Color(0x33D81A1A)

    val Background_1dp = Color(0xFF1B1B1B)
    val Background_4dp = Color(0xFF232323)
    val Background_8dp = Color(0xFF292929)
    val Background_24dp = Color(0xFF323232)
    val BackgroundGrouped = Color(0xFFF5F5F6)

    // special colors
    val ErrorCard: Color = Color(0xFFFFFCF5)
    val ErrorBorder: Color = Color(0xFFF0BE47)
    val ErrorCardDark: Color = Color(0x1AF0BE47)
    val ErrorCardBorderDark: Color = Color(0x59F0BE47)

    val InfoCard: Color = Color(0xFFEFF5F9)
    val InfoBorder: Color = Color(0xFF0092E1)
    val InfoCardDark: Color = Color(0x262697D4)
    val InfoBorderDark: Color = Color(0xB32697D4)

    val InputFieldGray: Color = Color(0xFFF3F3F3)
    val InputFieldGrayDark: Color = White_10

    val InputFieldWhite: Color = Color.White
    val InputFieldWhiteDark: Color = White_10

    val SigningCardDarkModeSeparator: Color = Color(0x26F8F8FE)

    val GraphDividerColor: Color = Color(0x33000000)

    val transparentBlackOverlay: Color = Color(0x801A1A1A)
    val transparentBlackOverlayDark: Color = Black_60
    val DarkGray: Color = Color(0xFF1A1A1A)

    val ElevatedBackground = Color.White
    val ElevatedBackgroundDark = Color(0xFF1B1C1E)

    val LogInSheetIconBg: Color = Color(0xFFF0F0F0)
    val LogInSheetIconBgDark: Color = Gray5Dark

    val statusBackgroundActionLightMode = LightBlue2
    val statusBackgroundErrorLightMode = Color(0xFFFDF1F1)
    val statusBackgroundWarningLightMode = BackgroundGrouped
    val statusBackgroundActionDarkMode = LightBlue2Dark
    val statusBackgroundErrorDarkMode = Color(0xFF421C1D)
    val statusBackgroundWarningDarkMode = Gray3Dark

    val iconBackgroundLight = Color(0xFFF3F3F3)
    val iconBackgroundDark = Color(0xFFA4A4A5)

    val CloseIconBG = Color(0x1A000000)
    val CloseIconBGDark = Color(0x0FFFFFFF)

    val CloseIconColor = Black_90
    val CloseIconColorDark = White_90

    val SwitchUncheckedTrackColor = Color(0xFF949494)
    val SwitchUncheckedTrackColorDark = Color(0xFF999999)

    val SwipeRefreshContentColorLight = Color.Black
    val SwipeRefreshContentColorDark = Color.White

    val SwipeRefreshBackgroundColorLight = Color.White
    val SwipeRefreshBackgroundColorDark = Color(0xFF5B5B60)

    val backgroundStatusWarningColorLight = Color(0xFFFDF7E9)
    val backgroundStatusWarningColorDark = Color(0x40EBAB39)

    val secondaryGroupedBackgroundColorLight = Color.White
    val secondaryGroupedBackgroundColorDark = Color(0xFF1C1C1E)
}
