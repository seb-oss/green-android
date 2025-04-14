package se.seb.greencomponentsandroid.ui

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.green.atoms.ButtonWidthType
import se.seb.green.atoms.GreenButtonDefaults
import se.seb.green.atoms.GreenButtonPrimary
import se.seb.green.atoms.GreenButtonSize
import se.seb.green.icons.SebIcons
import se.seb.green.theme.GreenTheme

@Composable
fun ButtonsScreen(scrollState: ScrollState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        GreenButtonPrimary(
            title = "2023 Button",
            style = GreenButtonDefaults.defaultStyle(),
        ) { }

        GreenButtonPrimary(
            title = "2016 Button",
            style = GreenButtonDefaults.legacyStyle(),
        ) { }

        GreenButtonPrimary(
            title = "2023 Button with Icon",
            style = GreenButtonDefaults.defaultStyle(),
            icon = SebIcons.Check
        ) { }

        GreenButtonPrimary(
            title = "2023 Dynamic with Icon",
            style = GreenButtonDefaults.defaultStyle().copy(
                size = GreenButtonSize.Default(ButtonWidthType.Dynamic)
            ),
            icon = SebIcons.Check
        ) { }

        GreenButtonPrimary(
            title = "2023 Fixed with Icon",
            style = GreenButtonDefaults.defaultStyle().copy(
                size = GreenButtonSize.Default(ButtonWidthType.Fixed(200.dp))
            ),
            icon = SebIcons.Check
        ) { }

        GreenButtonPrimary(
            style = GreenButtonDefaults.defaultStyle().copy(
                size = GreenButtonSize.Default(ButtonWidthType.Fixed(48.dp))
            ),
            icon = SebIcons.Check
        ) { }
    }
}

@Preview
@Composable
private fun ButtonsScreenPreview() {
    GreenTheme {
        ButtonsScreen(rememberScrollState())
    }
}