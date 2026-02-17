package se.seb.gds.atoms.switch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.theme.GdsTheme

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsSwitchUncheckedScreenshot() {
    GdsTheme {
        var checked by remember { mutableStateOf(false) }
        GdsSwitch(
            checked = checked,
            onCheckedChanged = { },
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsSwitchCheckedScreenshot() {
    GdsTheme {
        var checked by remember { mutableStateOf(true) }
        GdsSwitch(
            checked = checked,
            onCheckedChanged = { },
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsSwitchDisabledUncheckedScreenshot() {
    GdsTheme {
        var checked by remember { mutableStateOf(false) }
        GdsSwitch(
            checked = checked,
            onCheckedChanged = { },
            enabled = false,
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsSwitchDisabledCheckedScreenshot() {
    GdsTheme {
        var checked by remember { mutableStateOf(true) }
        GdsSwitch(
            checked = checked,
            onCheckedChanged = { },
            enabled = false,
        )
    }
}
