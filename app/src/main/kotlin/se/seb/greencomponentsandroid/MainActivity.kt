package se.seb.greencomponentsandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.GdsSwitch
import se.seb.gds.theme.GdsTheme
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.tokens.darkModeColors
import se.seb.gds.tokens.lightModeColors
import se.seb.greencomponentsandroid.ui.ColorMapping
import se.seb.greencomponentsandroid.ui.DesignLibraryScreen
import kotlin.reflect.KProperty
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.typeOf

class MainActivity : ComponentActivity() {

    private lateinit var themeColors: List<Pair<String, ColorMapping>>
    private lateinit var legacyThemeColors: List<Pair<String, ColorMapping>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val lightColors = lightModeColors
        val darkColors = darkModeColors
        val lightThemeColorProperties = extractColorProperties(lightColors)
        val darkThemeColorProperties = extractColorProperties(darkColors)
        themeColors = combineColorLists(lightThemeColorProperties, darkThemeColorProperties)

        val legacyLightColors = LegacyColors.defaultColors(false)
        val legacyDarkColors = LegacyColors.defaultColors(true)
        val legacyLightThemeColorProperties = extractColorProperties(legacyLightColors)
        val legacyDarkThemeColorProperties = extractColorProperties(legacyDarkColors)
        legacyThemeColors = combineColorLists(legacyLightThemeColorProperties, legacyDarkThemeColorProperties)

        setContent {
            GdsTheme {
                DesignLibraryScreen(themeColors, legacyThemeColors)
            }
        }
    }
}

private inline fun <reified T : Any> extractColorProperties(instance: T): List<Pair<String, Color>> {
    val colorProperties = mutableListOf<Pair<String, Color>>()
    val kClass = T::class

    kClass.memberProperties.forEach { property: KProperty<*> ->
        if (property.returnType.isSubtypeOf(typeOf<Color>())) {
            val colorValue = property.getter.call(instance) as Color
            colorProperties.add(Pair(property.name, colorValue))
        }
    }

    return colorProperties
}

private fun combineColorLists(
    lightColors: List<Pair<String, Color>>,
    darkColors: List<Pair<String, Color>>,
): List<Pair<String, ColorMapping>> {
    val lightColorMap = lightColors.toMap()
    val darkColorMap = darkColors.toMap()

    return (lightColorMap.keys + darkColorMap.keys)
        .distinct()
        .map { key ->
            key to ColorMapping(
                lightModeColor = lightColorMap[key] ?: Color.Transparent,
                darkModeColor = darkColorMap[key] ?: Color.Transparent,
            )
        }
}

@Composable
fun Components(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Text(
            text = "SebSwitch"
        )
        var sebSwitchChecked by remember { mutableStateOf(false) }
        GdsSwitch(
            checked = sebSwitchChecked,
            onCheckedChanged = { sebSwitchChecked = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GdsTheme {
        Components()
    }
}