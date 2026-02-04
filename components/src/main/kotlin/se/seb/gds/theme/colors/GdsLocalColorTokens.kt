package se.seb.gds.theme.colors

import androidx.compose.ui.graphics.Color

data class GdsLocalColorTokens(
    val L1: L1Colors,
    val L2: L2Colors,
    val L3: L3Colors,
    val Border: BorderColors,
    val Content: ContentColors,
    val State: StateColors
)

data class L1Colors(
    val Neutral01: Color,
    val Neutral02: Color,
    val Elevated01: Color,
    val Elevated02: Color,
    val Brand01: Color,
    val Inversed: Color
)

data class L2Colors(
    val Neutral01: Color,
    val Neutral02: Color,
    val NeutralLoud: Color,
    val Elevated01: Color,
    val Elevated02: Color,
    val Brand01: Color,
    val Brand02: Color,
    val Positive01: Color,
    val Negative01: Color,
    val Notice01: Color,
    val Warning01: Color,
    val Information01: Color
)

data class L3Colors(
    val Neutral01: Color,
    val Neutral02: Color,
    val Neutral03: Color,
    val Neutral04: Color,
    val Neutral05: Color,
    val NeutralStrong: Color,
    val NeutralTone: Color,
    val Elevated01: Color,
    val Elevated02: Color,
    val Brand01: Color,
    val Brand02: Color,
    val Brand03: Color,
    val Positive01: Color,
    val Positive02: Color,
    val Positive03: Color,
    val Positive04: Color,
    val Negative01: Color,
    val Negative02: Color,
    val Negative03: Color,
    val Notice01: Color,
    val Notice02: Color,
    val Notice03: Color,
    val Warning01: Color,
    val Warning02: Color,
    val Warning03: Color,
    val Information01: Color,
    val Information02: Color,
    val Information03: Color,
    val Overlay: Color,
    val Disabled01: Color,
    val Disabled02: Color,
    val Disabled03: Color
)

data class BorderColors(
    val Positive01: Color,
    val Positive02: Color,
    val Negative01: Color,
    val Negative02: Color,
    val Notice01: Color,
    val Notice02: Color,
    val Warning01: Color,
    val Warning02: Color,
    val Information01: Color,
    val Information02: Color,
    val Interactive: Color,
    val Inverse: Color,
    val Separator01: Color,
    val Strong: Color,
    val Subtle01: Color,
    val Subtle02: Color
)

data class ContentColors(
    val Neutral01: Color,
    val Neutral02: Color,
    val Neutral03: Color,
    val Neutral04: Color,
    val Brand01: Color,
    val Brand02: Color,
    val Positive01: Color,
    val Positive02: Color,
    val Positive03: Color,
    val Negative01: Color,
    val Negative02: Color,
    val Notice01: Color,
    val Notice02: Color,
    val Warning01: Color,
    val Warning02: Color,
    val Disabled01: Color,
    val Disabled02: Color,
    val Inversed: Color
)

data class StateColors(
    val Neutral01: Color,
    val Neutral02: Color,
    val Neutral03: Color,
    val Neutral04: Color,
    val Neutral05: Color,
    val Neutral06: Color,
    val Brand01: Color,
    val Brand02: Color,
    val Brand03: Color,
    val Brand04: Color,
    val Brand05: Color,
    val Brand06: Color,
    val Positive01: Color,
    val Positive02: Color,
    val Positive03: Color,
    val Positive04: Color,
    val Positive05: Color,
    val Positive06: Color,
    val Negative01: Color,
    val Negative02: Color,
    val Negative03: Color,
    val Negative04: Color,
    val Negative05: Color,
    val Negative06: Color,
    val Notice01: Color,
    val Notice02: Color,
    val Notice03: Color,
    val Notice04: Color,
    val Notice05: Color,
    val Notice06: Color,
    val Warning01: Color,
    val Warning02: Color,
    val Warning03: Color,
    val Warning04: Color,
    val Warning05: Color,
    val Warning06: Color,
    val DarkButtons: Color,
    val InversedButtons: Color,
    val LightButtons: Color,
    val OnPress: Color,
    val OnPressInverted: Color
)
