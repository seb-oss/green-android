package se.seb.gds.preview

import android.widget.Toast
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsBottomSheet
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.input.GdsInputContained
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.atoms.input.GdsInputDefaults.inputColors
import se.seb.gds.components.SwitchRow
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
        GdsInputDefaults.containedStyle().copy(
            colors = inputColors().copy(containerColor = GdsTheme.colors.L2Neutral02),
        )
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
                .padding(horizontal = 16.dp),
            title = "Settings",
            style = GdsButtonDefaults.TwentyThree.outlineStyle(),
            sizeProfile = GdsButtonDefaults.TwentyThree.small()
                .copy(widthType = ButtonWidthType.Dynamic),
            icon = GdsIcons.Solid.SettingsGear,
            onClick = { showBottomSheet = true },
        )
        Spacer(Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .background(background)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            val text = rememberTextFieldState("Prefilled value")
            GdsInputContained(
                style = containedStyle,
                state = text,
                label = "Label",
                maxCharacters = if (maxChar) 50 else null,
                errorMessage = errorMessage,
                clearable = clearable,
                isError = isError,
                showInfoIcon = infoIcon,
                onInfoIconClick = {
                    Toast.makeText(context, "Info icon clicked", Toast.LENGTH_SHORT).show()
                },
            )
            GdsInputContained(
                style = containedStyle,
                state = rememberTextFieldState(),
                label = "Label",
                maxCharacters = if (maxChar) 50 else null,
                errorMessage = errorMessage,
                clearable = clearable,
                isError = isError,
                showInfoIcon = infoIcon,
                onInfoIconClick = {
                    Toast.makeText(context, "Info icon clicked", Toast.LENGTH_SHORT).show()
                },
            )
        }
    }

    if (showBottomSheet) {
        GdsBottomSheet(
            onDismiss = { showBottomSheet = false },
            sheetState = sheetState,
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                SwitchRow("White Background", checked = whiteBackground) {
                    whiteBackground = it
                }
                SwitchRow("Info icon", checked = infoIcon) {
                    infoIcon = it
                }
                SwitchRow("Error outside", checked = errorOutside) {
                    errorOutside = it
                    if (errorOutside) {
                        errorInside = false
                    }
                }
                SwitchRow("Error inside", checked = errorInside) {
                    errorInside = it
                    if (errorInside) {
                        errorOutside = false
                    }
                }
                SwitchRow("Max characters", checked = maxChar) {
                    maxChar = it
                }
                SwitchRow("Clearable", checked = clearable) {
                    clearable = it
                }
            }
        }
    }
}
