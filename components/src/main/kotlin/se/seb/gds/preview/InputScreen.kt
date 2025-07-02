package se.seb.greencomponentsandroid.ui

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.input.GdsInput
import se.seb.gds.theme.GdsTheme

@Composable
fun InputScreen(scrollState: ScrollState) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.l101)
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        GdsInput(
            state = rememberTextFieldState("input text"),
            label = "Label",
            maxCharacters = 40,
            supportingText = "Supporting text"
        )

        GdsInput(
            state = rememberTextFieldState("input text"),
            label = "Label",
            maxCharacters = 40,
            isError = true,
            errorMessage = "Error message"
        )
    }
}
