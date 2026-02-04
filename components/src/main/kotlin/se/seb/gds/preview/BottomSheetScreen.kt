package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.BottomSheetHeader
import se.seb.gds.atoms.GdsBottomSheet
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsText
import se.seb.gds.components.SwitchRow
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetScreen() {
    var showDragHandle by rememberSaveable { mutableStateOf(false) }
    var showHeader by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.L1.Neutral02)
            .padding(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        val bottomSheetState = rememberModalBottomSheetState(
            skipPartiallyExpanded = true,
        )
        var showBottomSheet by remember { mutableStateOf(false) }
        GdsButton(
            title = "Show Bottom Sheet",
            onClick = { showBottomSheet = true },
        )

        Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
        SwitchRow("Drag Handle", checked = showDragHandle) {
            showDragHandle = it
        }
        Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
        SwitchRow("Header", checked = showHeader) {
            showHeader = it
        }

        if (showBottomSheet) {
            GdsBottomSheet(
                showDragHandle = showDragHandle,
                sheetState = bottomSheetState,
                header = {
                    if (showHeader) {
                        BottomSheetHeader(
                            titleString = "Title",
                            onDismiss = { showBottomSheet = false },
                        )
                    }
                },
                onDismiss = { showBottomSheet = false },
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = GdsTheme.dimensions.spacing.SpaceXl),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        modifier = Modifier.size(96.dp),
                        imageVector = GdsIcons.Regular.CircleCheck,
                        contentDescription = null,
                    )
                    Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
                    GdsText(
                        label = "Ditt meddelande har skickats",
                        style = GdsTheme.typography.HeadingM,
                    )
                    Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
                    GdsText(
                        label = "Vi svarar inom 24 timmar på vardagar. " +
                            "Du får en notis när du fått ett svar.",
                        style = GdsTheme.typography.BodyRegularM,
                    )
                    Spacer(Modifier.height(GdsTheme.dimensions.spacing.Space2Xl))
                }
            }
        }
    }
}
