package se.seb.gds.common

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Light Mode",
    group = "Themes",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Small Font",
    group = "Font Scales",
    fontScale = 0.5f,
)
@Preview(
    name = "Large Font",
    group = "Font Scales",
    fontScale = 2.0f,
)
annotation class GdsUiPreview

@Preview(
    name = "Light",
    group = "Themes",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xffffffff,
)
@Preview(
    name = "Dark",
    group = "Themes",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    backgroundColor = 0xff0a0b0b,
)
annotation class GdsUiTestsPreview
