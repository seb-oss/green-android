package se.seb.gds.preview

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import se.seb.gds.atoms.input.GdsInputContained
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun IconsScreen() {
    var filterText by remember { mutableStateOf("") }

    val iconList = GdsIcons.All.toList().sortedBy { it.first.split(".").last() }

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

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
    ) {
        ComponentHeaderSection(
            title = "GDS Icons",
            body = "Include icons from the provided ImageVectors in Solid or Regular style. Example usage:",
            code = """
                GdsIcons.Solid.Checkmark
                GdsIcons.Regular.Checkmark
            """.trimIndent()
        )
        Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
        GdsInputContained(
            state = rememberTextFieldState(filterText),
            style = GdsInputDefaults.containedOnGreyStyle(),
            onValueChange = { filterText = it },
            modifier = Modifier
                .fillMaxWidth()
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
                horizontal = GdsTheme.dimensions.spacing.Space0,
                vertical = GdsTheme.dimensions.spacing.SpaceXs,
            ),
        ) {
            items(filteredIconList) { (name, imageVector) ->
                IconPreviewCard(name, imageVector)
            }
        }
    }
}

@Composable
fun IconPreviewCard(
    fullName: String,
    imageVector: ImageVector,
) {
    CardColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(GdsTheme.dimensions.spacing.Space3Xs)
            .aspectRatio(1f),
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
                tint = GdsTheme.colors.ContentNeutral01,
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
