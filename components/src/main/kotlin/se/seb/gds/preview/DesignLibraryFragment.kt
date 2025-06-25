package se.seb.gds.preview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.compose.content
import se.seb.gds.theme.GdsTheme
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.tokens.darkModeColors
import se.seb.gds.tokens.lightModeColors
import kotlin.reflect.KProperty
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.typeOf

/**
 * A simple [androidx.fragment.app.Fragment] subclass.
 * Use the [DesignLibraryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DesignLibraryFragment : Fragment() {

    private lateinit var themeColors: List<Pair<String, ColorMapping>>
    private lateinit var legacyThemeColors: List<Pair<String, ColorMapping>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = content {
        GdsTheme {
            DesignLibraryScreen(themeColors, legacyThemeColors)
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

    companion object {
        @JvmStatic
        fun newInstance() = DesignLibraryFragment()
    }
}