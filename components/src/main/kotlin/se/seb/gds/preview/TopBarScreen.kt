package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.topbar.GdsTopBarAction
import se.seb.gds.atoms.topbar.GdsTopBarComponent
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun TopBarScreen() {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .background(GdsTheme.colors.L1Neutral01),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        GdsTopBarComponent(
            title = "Top Bar Component",
            leftAction = {
                GdsTopBarAction(
                    icon = GdsIcons.Regular.ArrowLeft,
                    onClick = { },
                )
            },
            rightActions = {
                GdsTopBarAction(
                    icon = GdsIcons.Regular.CircleX,
                    onClick = { },
                )
            },
            elevation = 4.dp,
            applyInsetsPadding = false,
        )

        GdsTopBarComponent(
            title = "Misaligned...Centered Title",
            leftAction = {
                GdsTopBarAction(
                    icon = GdsIcons.Regular.ArrowLeft,
                    onClick = { },
                )
            },
            elevation = 4.dp,
            applyInsetsPadding = false,
            centeredTitle = true
        )
    }
}
