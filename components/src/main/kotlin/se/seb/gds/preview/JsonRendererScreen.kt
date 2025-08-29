package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.serialization.json.Json
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.input.GdsInput
import se.seb.gds.renderer.RenderComponent
import se.seb.gds.theme.GdsTheme

@Composable
fun JsonRendererScreen(
) {
    var jsonText by rememberSaveable { mutableStateOf("") }
    var confirmedJson by rememberSaveable { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.l101)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
    ) {
        GdsInput(
            lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 4),
            state = rememberTextFieldState(), onValueChange = {
                jsonText = it
            }, label = "Json String"
        )

        Spacer(Modifier.height(16.dp))

        GdsButton(
            title = "Render",
            onClick = { confirmedJson = jsonText },
        )
        confirmedJson?.takeIf { it.isNotBlank() }?.let { toRender ->
            RenderJson(toRender)
        }
    }


}

@Composable
fun RenderJson(
    jsonStr: String = "",
) {
    val parseResult = remember(jsonStr) {
        runCatching {
            val json = Json {
                ignoreUnknownKeys = true
                isLenient = true
            }
            val element = json.parseToJsonElement(jsonStr)
            json.decodeFromJsonElement(
                se.seb.components.Component.serializer(),
                element
            )
        }
    }

    parseResult.fold(
        onSuccess = { component ->
            runCatching {
                RenderComponent(
                    component = component,
                    actionHandler = {}
                )
            }.onFailure { e ->
                Text("Failed to render component: ${e.message ?:  "unknown error"}")
            }
        },
        onFailure = { e ->
            Text("Invalid JSON: ${e.message ?: "unknown error"}")
        }
    )
}