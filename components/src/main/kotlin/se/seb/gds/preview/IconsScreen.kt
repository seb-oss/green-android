package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import se.seb.gds.atoms.input.GdsInputContained
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun IconsScreen() {
    var filterText by remember { mutableStateOf("") }
    var selectedIcon by remember { mutableStateOf<Pair<String, ImageVector>?>(null) }

    val iconList = GdsIcons.allIcons.toList().sortedBy { it.first.split(".").last() }

    val filteredIconList =
        remember(filterText) {
            if (filterText.isBlank()) {
                iconList
            } else {
                iconList.filter { (name, _) ->
                    name.contains(filterText, ignoreCase = true)
                }
            }
        }

    Column(modifier = Modifier.fillMaxWidth()) {
        GdsInputContained(
            state = rememberTextFieldState(filterText),
            style = GdsInputDefaults.containedOnGreyStyle(),
            onValueChange = { filterText = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM)
                .padding(bottom = GdsTheme.dimensions.spacing.SpaceM),
            label = "Filter Icons",
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
            ),
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(
                horizontal = GdsTheme.dimensions.spacing.SpaceM,
                vertical = GdsTheme.dimensions.spacing.SpaceXs,
            ),
        ) {
            item(span = { GridItemSpan(3) }) {
                Column {
                    ComponentHeaderSection(
                        title = "GDS Icons",
                        body = "Include icons from the provided ImageVectors in Solid or Regular style, " +
                            "or use the XML drawable resources. Example usage:",
                        code = """
                            // Composable ImageVectors
                            GdsIcons.Solid.Checkmark
                            GdsIcons.Regular.Checkmark
                            
                            // XML Drawable Resources
                            R.drawable.gds_solid_checkmark
                            R.drawable.gds_regular_checkmark
                        """.trimIndent(),
                    )
                    Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
                }
            }

            items(filteredIconList) { (name, imageVectorProvider) ->
                val imageVector = imageVectorProvider()
                IconPreviewCard(
                    fullName = name,
                    imageVector = imageVector,
                    onClick = { selectedIcon = name to imageVector },
                )
            }
        }
    }

    // Show zoom dialog when an icon is selected
    selectedIcon?.let { (name, icon) ->
        IconZoomDialog(
            fullName = name,
            imageVector = icon,
            onDismiss = { selectedIcon = null },
        )
    }
}

@Composable
fun IconPreviewCard(
    fullName: String,
    imageVector: ImageVector,
    onClick: () -> Unit = {},
) {
    CardColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(GdsTheme.dimensions.spacing.Space3Xs)
            .aspectRatio(1f)
            .clickable(onClick = onClick),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(GdsTheme.dimensions.spacing.SpaceXs),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = fullName,
                tint = GdsTheme.colors.Content.Neutral01,
                modifier = Modifier
                    .size(40.dp)
                    .weight(1f)
                    .wrapContentSize(Alignment.Center),
            )

            Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.Space3Xs))

            val text = fullName.split(".").joinToString("\n")
            Text(
                text = text,
                style = MaterialTheme.typography.labelSmall,
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@Preview
@Composable
private fun IconsScreenPreview() {
    GdsTheme {
        IconsScreen()
    }
}

@Composable
fun IconZoomDialog(
    fullName: String,
    imageVector: ImageVector,
    onDismiss: () -> Unit,
) {
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .clickable(onClick = onDismiss),
            shape = RoundedCornerShape(16.dp),
            color = GdsTheme.colors.L1.Elevated01,
        ) {
            Column(
                modifier = Modifier
                    .padding(GdsTheme.dimensions.spacing.SpaceL),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                // Icon title
                Text(
                    text = fullName,
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center,
                    color = GdsTheme.colors.Content.Neutral01,
                )

                Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.SpaceL))

                // Zoomed icon with background
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(
                            color = GdsTheme.colors.L3.Neutral01,
                            shape = RoundedCornerShape(12.dp),
                        )
                        .padding(GdsTheme.dimensions.spacing.SpaceL),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = imageVector,
                        contentDescription = fullName,
                        tint = GdsTheme.colors.Content.Neutral01,
                        modifier = Modifier.size(120.dp),
                    )
                }

                Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.SpaceM))

                // Additional info
                Text(
                    text = "Tap outside to close",
                    style = MaterialTheme.typography.bodySmall,
                    color = GdsTheme.colors.Content.Neutral02,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}
