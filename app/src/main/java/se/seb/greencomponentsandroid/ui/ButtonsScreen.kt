package se.seb.greencomponentsandroid.ui

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonSize
import se.seb.gds.atoms.LegacyButtonSize
import se.seb.gds.components.SwitchRow
import se.seb.gds.icons.SebIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun ButtonsScreen(scrollState: ScrollState) {

    var showLegacyButtons by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SwitchRow("Show 2016 Buttons", checked = showLegacyButtons) {
            showLegacyButtons = it
        }

        if (showLegacyButtons.not()) {
            GdsButton(
                title = "Primary Button",
                style = GdsButtonDefaults.primaryStyle(),
            ) { }

            GdsButton(
                title = "Secondary Button",
                style = GdsButtonDefaults.secondaryStyle(),
            ) { }

            GdsButton(
                title = "Tertiary Button",
                style = GdsButtonDefaults.tertiaryStyle(),
            ) { }

            GdsButton(
                title = "Primary Button with Icon",
                style = GdsButtonDefaults.primaryStyle(),
                icon = SebIcons.Check
            ) { }

            GdsButton(
                title = "Primary Dynamic with Icon",
                style = GdsButtonDefaults.primaryStyle().copy(
                    size = GdsButtonSize.Default(ButtonWidthType.Dynamic)
                ),
                icon = SebIcons.Check
            ) { }

            GdsButton(
                title = "Primary Fixed with Icon",
                style = GdsButtonDefaults.primaryStyle().copy(
                    size = GdsButtonSize.Default(ButtonWidthType.Fixed(200.dp))
                ),
                icon = SebIcons.Check
            ) { }

            GdsButton(
                style = GdsButtonDefaults.primaryStyle().copy(
                    size = GdsButtonSize.Default(ButtonWidthType.Fixed(48.dp))
                ),
                icon = SebIcons.Check
            ) { }
        } else {
            GdsButton(
                title = "Primary Large Button",
                style = GdsButtonDefaults.legacyPrimaryStyle(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Primary Medium Button",
                style = GdsButtonDefaults.legacyPrimaryStyle(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Primary Small Button",
                style = GdsButtonDefaults.legacyPrimaryStyle(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Secondary Large Button",
                style = GdsButtonDefaults.legacySecondaryStyle(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Secondary Medium Button",
                style = GdsButtonDefaults.legacySecondaryStyle(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Secondary Small Button",
                style = GdsButtonDefaults.legacySecondaryStyle(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Tertiary Large Button",
                style = GdsButtonDefaults.legacyTertiaryStyle(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Tertiary Medium Button",
                style = GdsButtonDefaults.legacyTertiaryStyle(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Tertiary Small Button",
                style = GdsButtonDefaults.legacyTertiaryStyle(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Destructive Large Button",
                style = GdsButtonDefaults.legacyPrimaryDestructiveStyle(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Destructive Medium Button",
                style = GdsButtonDefaults.legacyPrimaryDestructiveStyle(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Destructive Small Button",
                style = GdsButtonDefaults.legacyPrimaryDestructiveStyle(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Destructive Secondary Button",
                style = GdsButtonDefaults.legacySecondaryDestructiveStyle(),
            ) { }

            GdsButton(
                title = "Destructive Tertiary Button",
                style = GdsButtonDefaults.legacyTertiaryDestructiveStyle(),
            ) { }

            GdsButton(
                title = "Tertiary Emphasis Button",
                style = GdsButtonDefaults.legacyTertiaryEmphasisStyle(),
            ) { }
        }
    }
}

@Preview
@Composable
private fun ButtonsScreenPreview() {
    GdsTheme {
        ButtonsScreen(rememberScrollState())
    }
}