package se.seb.gds.preview

import android.widget.Toast
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsBottomSheet
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsSwitch
import se.seb.gds.atoms.GdsSwitchDefaults
import se.seb.gds.atoms.GdsSwitchStyle
import se.seb.gds.atoms.input.BasicInputState
import se.seb.gds.atoms.input.GdsInputContained
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputContainedScreen(scrollState: ScrollState) {
    var whiteBackground by rememberSaveable { mutableStateOf(false) }
    var errorInside by rememberSaveable { mutableStateOf(false) }
    var errorOutside by rememberSaveable { mutableStateOf(false) }
    var clearable by rememberSaveable { mutableStateOf(true) }
    var maxChar by rememberSaveable { mutableStateOf(true) }
    var infoIcon by rememberSaveable { mutableStateOf(true) }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by rememberSaveable { mutableStateOf(false) }

    val background = if (whiteBackground) {
        GdsTheme.colors.L1Neutral01
    } else {
        GdsTheme.colors.L1Neutral02
    }

    val containedStyle = if (whiteBackground) {
        GdsInputDefaults.containedStyle()
    } else {
        GdsInputDefaults.containedOnGreyStyle()
    }

    val isError = errorInside || errorOutside
    val errorMessage = if (errorOutside && !errorInside) "Error message" else null

    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
            .verticalScroll(scrollState)
            .windowInsetsPadding(WindowInsets.ime),
    ) {
        GdsButton(
            modifier = Modifier
                .align(Alignment.End)
                .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            title = "Settings",
            style = GdsButtonDefaults.TwentyThree.outline(),
            sizeProfile = GdsButtonDefaults.TwentyThree.small()
                .copy(widthType = ButtonWidthType.Dynamic),
            leadingIcon = GdsIcons.Solid.SettingsGear,
            onClick = { showBottomSheet = true },
        )
        Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
        Column(
            modifier = Modifier
                .background(background)
                .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            val text = rememberTextFieldState("Prefilled value")
            GdsInputContained(
                style = containedStyle,
                state = text,
                label = "Label",
                onInfoIconClick = {
                    Toast.makeText(context, "Info icon clicked", Toast.LENGTH_SHORT).show()
                },
                inputState = BasicInputState(
                    maxCharacters = if (maxChar) 50 else null,
                    errorMessage = errorMessage,
                    clearable = clearable,
                    isError = isError,
                    showInfoIcon = infoIcon,
                ),
            )
            GdsInputContained(
                style = containedStyle,
                state = rememberTextFieldState(),
                label = "Label",
                onInfoIconClick = {
                    Toast.makeText(context, "Info icon clicked", Toast.LENGTH_SHORT).show()
                },
                inputState = BasicInputState(
                    maxCharacters = if (maxChar) 50 else null,
                    errorMessage = errorMessage,
                    clearable = clearable,
                    isError = isError,
                    showInfoIcon = infoIcon,
                ),
            )
        }
    }

    if (showBottomSheet) {
        GdsBottomSheet(
            onDismiss = { showBottomSheet = false },
            sheetState = sheetState,
        ) {
            Column(
                modifier = Modifier
                    .padding(GdsTheme.dimensions.spacing.SpaceM)
                    .verticalScroll(rememberScrollState()),
            ) {
                InputSwitchRow("White Background", checked = whiteBackground) {
                    whiteBackground = it
                }
                InputSwitchRow("Info icon", checked = infoIcon) {
                    infoIcon = it
                }
                InputSwitchRow("Error outside", checked = errorOutside) {
                    errorOutside = it
                    if (errorOutside) {
                        errorInside = false
                    }
                }
                InputSwitchRow("Error inside", checked = errorInside) {
                    errorInside = it
                    if (errorInside) {
                        errorOutside = false
                    }
                }
                InputSwitchRow("Max characters", checked = maxChar) {
                    maxChar = it
                }
                InputSwitchRow("Clearable", checked = clearable) {
                    clearable = it
                }
            }
        }
    }
}

@Composable
internal fun InputSwitchRow(
    title: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: GdsSwitchStyle = GdsSwitchDefaults.defaultStyle(),
    enabled: Boolean = true,
    onCheckedChanged: (Boolean) -> Unit = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier.weight(1f),
            style = GdsTheme.typography.DetailBookM,
            text = title,
        )
        GdsSwitch(
            checked = checked,
            onCheckedChanged = onCheckedChanged,
            style = style,
            enabled = enabled,
        )
    }
}
