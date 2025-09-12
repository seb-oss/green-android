package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.topbar.GdsTopBarAction
import se.seb.gds.atoms.topbar.GdsTopBarComponent
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

@Composable
fun TopBarScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.L1Neutral01),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        GdsTopBarComponent(
            title = "Top Bar Component",
            leftAction = {
                GdsTopBarAction(
                    icon = R.drawable.ic_back,
                    onClick = { },
                )
            },
            rightActions = {
                GdsTopBarAction(
                    icon = R.drawable.ic_clear_24,
                    onClick = { }
                )
            },
            elevation = 4.dp
        )
        LazyColumn(
            modifier = Modifier.padding()
        ) {

            items(100) {
                Text("Item $it", Modifier.fillMaxWidth())
            }
        }
    }

}
