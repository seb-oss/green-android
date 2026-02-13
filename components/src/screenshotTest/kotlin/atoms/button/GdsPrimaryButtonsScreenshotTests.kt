package atoms.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsButtonSizeProfile
import se.seb.gds.atoms.GdsButtonStyle
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

val sizeProfile: Map<String, GdsButtonSizeProfile>
    @Composable
    get() = mapOf(
        "xLarge" to GdsButtonDefaults.TwentyThree.xLarge(),
        "large" to GdsButtonDefaults.TwentyThree.large(),
        "medium" to GdsButtonDefaults.TwentyThree.medium(),
        "small" to GdsButtonDefaults.TwentyThree.small(),
    )

val widthType: Map<String, ButtonWidthType>
    @Composable
    get() = mapOf(
        "Full" to ButtonWidthType.Full,
        "Dynamic" to ButtonWidthType.Dynamic,
        "Fixed" to ButtonWidthType.Fixed(200.dp),
    )

@Composable
private fun ButtonScreenshot(gdsButtonStyle: GdsButtonStyle) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        sizeProfile.forEach { size ->
            GdsButton(
                title = size.key,
                style = gdsButtonStyle,
                sizeProfile = size.value,
                trailingIcon = GdsIcons.Regular.Checkmark,
                leadingIcon = GdsIcons.Regular.CloudySun,
                onClick = {},
            )
        }
        widthType.forEach { width ->
            GdsButton(
                title = width.key,
                style = gdsButtonStyle,
                sizeProfile = GdsButtonDefaults.TwentyThree.large()
                    .copy(widthType = width.value),
                trailingIcon = GdsIcons.Regular.Checkmark,
                leadingIcon = GdsIcons.Regular.CloudySun,
                onClick = {},
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
fun GdsButtonPrimaryScreenshot() {
    GdsTheme {
        ButtonScreenshot(GdsButtonDefaults.TwentyThree.primary())
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
fun GdsButtonSecondaryScreenshot() {
    GdsTheme {
        ButtonScreenshot(GdsButtonDefaults.TwentyThree.secondaryOnWhite())
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
fun GdsButtonTertiaryScreenshot() {
    GdsTheme {
        ButtonScreenshot(GdsButtonDefaults.TwentyThree.tertiary())
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
fun GdsButtonOutlineScreenshot() {
    GdsTheme {
        ButtonScreenshot(GdsButtonDefaults.TwentyThree.outline())
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
fun GdsButtonNegativeScreenshot() {
    GdsTheme {
        ButtonScreenshot(GdsButtonDefaults.TwentyThree.negative())
    }
}
