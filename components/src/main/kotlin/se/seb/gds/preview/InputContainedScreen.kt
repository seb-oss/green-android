package se.seb.gds.preview

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
import androidx.compose.foundation.text.input.TextFieldLineLimits
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
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsBottomSheet
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.input.BasicInputState
import se.seb.gds.atoms.input.CharacterLimit
import se.seb.gds.atoms.input.CharacterLimitType
import se.seb.gds.atoms.input.GdsInputContained
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.atoms.switch.GdsSwitch
import se.seb.gds.atoms.switch.GdsSwitchDefaults
import se.seb.gds.atoms.switch.GdsSwitchStyle
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputContainedScreen(scrollState: ScrollState) {
    var whiteBackground by rememberSaveable { mutableStateOf(false) }
    var error by rememberSaveable { mutableStateOf(false) }
    var clearable by rememberSaveable { mutableStateOf(true) }
    var maxChar by rememberSaveable { mutableStateOf(true) }
    var limitType by rememberSaveable { mutableStateOf(CharacterLimitType.SOFT) }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by rememberSaveable { mutableStateOf(false) }

    val background = if (whiteBackground) {
        GdsTheme.colors.L1.Neutral01
    } else {
        GdsTheme.colors.L1.Neutral02
    }

    val containedStyle = if (whiteBackground) {
        GdsInputDefaults.containedStyle()
    } else {
        GdsInputDefaults.containedOnGreyStyle()
    }

    val errorMessage = if (error) "Error message." else null

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
            GdsInputContained(
                style = containedStyle,
                state = rememberTextFieldState("Prefilled value"),
                label = "Label",
                inputState = BasicInputState(
                    errorMessage = errorMessage,
                    clearable = clearable,
                    isError = error,
                    characterLimit = CharacterLimit(20, limitType).takeIf { maxChar },
                ),
            )
            GdsInputContained(
                style = containedStyle,
                state = rememberTextFieldState(),
                label = "Label",
                inputState = BasicInputState(
                    errorMessage = errorMessage,
                    clearable = clearable,
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                    isError = error,
                    characterLimit = CharacterLimit(50, limitType).takeIf { maxChar },
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
                InputSwitchRow("Error", checked = error) {
                    error = it
                }
                InputSwitchRow("Max characters", checked = maxChar) {
                    maxChar = it
                }

                if (maxChar) {
                    SelectRow(
                        selectedText = limitType.name,
                        onItemSelected = { newValue ->
                            limitType = CharacterLimitType.valueOf(newValue)
                        },
                        items = CharacterLimitType.entries.map { it.name },
                        label = "Character limit: ",
                    )
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
