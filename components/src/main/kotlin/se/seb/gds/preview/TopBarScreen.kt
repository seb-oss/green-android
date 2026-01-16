package se.seb.gds.preview

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.topbar.AppBarDefaults
import se.seb.gds.atoms.topbar.GdsTopBarAction
import se.seb.gds.atoms.topbar.LargeTopAppBar
import se.seb.gds.atoms.topbar.MediumTopAppBar
import se.seb.gds.atoms.topbar.SmallTopAppBar
import se.seb.gds.components.SwitchRow
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarScreen(onBack: () -> Unit = {}) {
    val radioOptions = listOf("Small", "Medium", "Large")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }

    val scrollBehavior = when (selectedOption) {
        "Medium" -> AppBarDefaults.mediumLargeAppBarScrollBehavior()
        "Large" -> AppBarDefaults.mediumLargeAppBarScrollBehavior()
        else -> AppBarDefaults.smallAppBarScrollBehavior()
    }

    var showSubtitle by rememberSaveable { mutableStateOf(false) }
    val subtitle = if (showSubtitle) {
        "This is a subtitle"
    } else {
        null
    }

    var showRightAction by rememberSaveable { mutableStateOf(false) }
    val rightAction: @Composable (RowScope.() -> Unit) = if (showRightAction) {
        { RightAction() }
    } else {
        {}
    }

    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .fillMaxSize(),
        topBar = {
            when (selectedOption) {
                "Small" -> SmallTopAppBar(
                    modifier = Modifier,
                    title = "Small Top Bar",
                    subtitle = subtitle,
                    scrollBehavior = scrollBehavior,
                    navigationIcon = { BackAction(onBack) },
                    rightActions = rightAction,
                )

                "Medium" -> MediumTopAppBar(
                    modifier = Modifier,
                    title = "Medium Top Bar",
                    subtitle = subtitle,
                    scrollBehavior = scrollBehavior,
                    navigationIcon = { BackAction(onBack) },
                    rightActions = rightAction,
                )

                "Large" -> LargeTopAppBar(
                    modifier = Modifier,
                    title = "Large Top Bar",
                    subtitle = subtitle,
                    scrollBehavior = scrollBehavior,
                    navigationIcon = { BackAction(onBack) },
                    rightActions = rightAction,
                )

                else -> {}
            }
        },
        containerColor = GdsTheme.colors.L1Neutral02,
        contentColor = GdsTheme.colors.ContentNeutral01,
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceXs)
        ) {
            item {
                SwitchRow("Show subtitle", checked = showSubtitle) {
                    showSubtitle = it
                }
            }
            item {
                SwitchRow("Show right action", checked = showRightAction) {
                    showRightAction = it
                }
            }
            item {
                Row(Modifier.selectableGroup()) {
                    radioOptions.forEach { text ->
                        Row(
                            Modifier
                                .height(56.dp)
                                .selectable(
                                    selected = (text == selectedOption),
                                    onClick = { onOptionSelected(text) },
                                    role = Role.RadioButton,
                                )
                                .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            RadioButton(
                                selected = (text == selectedOption),
                                onClick = null,
                            )
                            Text(
                                text = text,
                                modifier = Modifier.padding(start = GdsTheme.dimensions.spacing.SpaceM),
                            )
                        }
                    }
                }
            }
            items(150) {
                Text(
                    "$it",
                    Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = GdsTheme.dimensions.spacing.SpaceM,
                            vertical = GdsTheme.dimensions.spacing.SpaceXs
                        ),
                )
            }
        }
    }
}

@Composable
private fun RightAction() {
    val context = LocalContext.current
    GdsTopBarAction(
        icon = GdsIcons.Regular.MagnifyingGlass,
        onClick = { Toast.makeText(context, "Right action clicked", Toast.LENGTH_SHORT).show() },
    )
}

@Composable
private fun BackAction(onBack: () -> Unit) {
    GdsTopBarAction(
        icon = GdsIcons.Regular.ArrowLeft,
        onClick = onBack,
    )
}
