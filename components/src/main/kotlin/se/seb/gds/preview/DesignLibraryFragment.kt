package se.seb.gds.preview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.compose.content
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubtypeOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.typeOf
import se.seb.gds.theme.GdsTheme
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.theme.colors.LocalDarkModeColors
import se.seb.gds.theme.colors.LocalLightModeColors

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
        val lightColors = LocalLightModeColors
        val darkColors = LocalDarkModeColors
        val lightThemeColorProperties = extractColorProperties(lightColors)
        val darkThemeColorProperties = extractColorProperties(darkColors)
        themeColors = combineColorLists(lightThemeColorProperties, darkThemeColorProperties)

        val legacyLightColors = LegacyColors.defaultColors(false)
        val legacyDarkColors = LegacyColors.defaultColors(true)
        val legacyLightThemeColorProperties = extractColorProperties(legacyLightColors)
        val legacyDarkThemeColorProperties = extractColorProperties(legacyDarkColors)
        legacyThemeColors =
            combineColorLists(legacyLightThemeColorProperties, legacyDarkThemeColorProperties)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? =
        content {
            GdsTheme {
                DesignLibraryScreen(themeColors, legacyThemeColors)
            }
        }

    private fun extractColorProperties(
        instance: Any,
        prefix: String = "",
    ): List<Pair<String, Color>> {
        val colorProperties = mutableListOf<Pair<String, Color>>()
        val kClass = instance::class

        kClass.memberProperties.forEach { property ->
            val propertyName = property.name
            val propertyValue = property.getter.call(instance)

            if (property.returnType.isSubtypeOf(typeOf<Color>())) {
                colorProperties.add(Pair(prefix + propertyName, propertyValue as Color))
            } else if (propertyValue != null && property.returnType.classifier?.let { it as? KClass<*> }?.isData == true) {
                colorProperties.addAll(extractColorProperties(propertyValue, prefix + propertyName))
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
                key to
                    ColorMapping(
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
