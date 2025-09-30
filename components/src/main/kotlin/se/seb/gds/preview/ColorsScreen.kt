package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

@Composable
internal fun ColorsScreen(allColors: List<Pair<String, ColorMapping>>) {
    var filterText by remember { mutableStateOf("") }
    val listState = rememberLazyListState()

    val filteredColors =
        remember(filterText, allColors) {
            if (filterText.isBlank()) {
                allColors
            } else {
                allColors.filter { (name, color) ->
                    name.contains(filterText, ignoreCase = true) ||
                        color.lightModeValue.contains(filterText, ignoreCase = true) ||
                        color.darkModeValue.contains(filterText, ignoreCase = true)
                }
            }
        }

    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
    ) {
        OutlinedTextField(
            value = filterText,
            onValueChange = { filterText = it },
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
            label = { Text("Filter Colors") },
            keyboardOptions =
                KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done,
                ),
        )

        LazyColumn(
            state = listState,
            contentPadding = PaddingValues(vertical = 16.dp),
            verticalArrangement = spacedBy(16.dp),
        ) {
            items(
                items = filteredColors,
                key = { item -> item.first },
            ) {
                GallerySection(it.first) {
                    ColorRow(it.second)
                }
            }
        }
    }
}

private fun Color.toHexString(): String {
    val argb = this.toArgb()
    return String.format("#%08X", argb)
}

internal data class ColorMapping(
    val lightModeColor: Color,
    val lightModeValue: String = lightModeColor.toHexString(),
    val darkModeColor: Color,
    val darkModeValue: String = darkModeColor.toHexString(),
)

@Composable
private fun ColorRow(colorMapping: ColorMapping) {
    Row(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
        horizontalArrangement = spacedBy(8.dp),
    ) {
        Column(
            modifier =
                Modifier
                    .weight(1f)
                    .background(color = Color.LightGray, shape = RoundedCornerShape(2.dp))
                    .padding(2.dp),
        ) {
            Box(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .background(color = colorMapping.lightModeColor),
            )

            Text(
                text = colorMapping.lightModeValue,
                color = Color.Black,
                style = GdsTheme.legacyTypography.Caption2,
            )
        }

        Column(
            modifier =
                Modifier
                    .weight(1f)
                    .background(color = Color.Black, shape = RoundedCornerShape(2.dp))
                    .padding(2.dp),
        ) {
            Box(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .background(color = colorMapping.darkModeColor),
            )

            Text(
                text = colorMapping.darkModeValue,
                color = Color.White,
                style = GdsTheme.legacyTypography.Caption2,
            )
        }
    }
}
