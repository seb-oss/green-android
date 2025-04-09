package se.seb.greencomponentsandroid.ui

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.green.atoms.GreenButtonDefaults
import se.seb.green.atoms.GreenButtonPrimary

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
    }
}