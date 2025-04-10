package se.seb.green.views

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import se.seb.green.atoms.GreenSwitch
import se.seb.green.atoms.GreenSwitchDefaults

/**
 * A custom switch view that provides a visually distinct green-themed switch using Jetpack Compose.
 *
 * This view extends `AbstractComposeView` and leverages composables to render the switch. It allows
 * customization of the switch's appearance through different styles and provides mechanisms for
 * controlling the checked state and enabling/disabling the switch.
 *
 * @param context The application context.
 * @param attrs The attribute set containing XML attributes, if any.
 * @param defStyleAttr The default style attribute, if any.
 */
class GreenSwitchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    private var _checked by mutableStateOf(false)
    var checked: Boolean
        get() = _checked
        set(value) {
            if (_checked != value) {
                _checked = value
                onCheckedChangedListener?.invoke(value)
            }
        }

    private var _isEnabled by mutableStateOf(true)
    var isEnabled: Boolean
        get() = _isEnabled
        set(value) {
            _isEnabled = value
        }

    var onCheckedChangedListener: ((Boolean) -> Unit)? = null

    private var _style by mutableStateOf(SwitchStyle.Default)
    var style: SwitchStyle
        get() = _style
        set(value) {
            _style = value
        }

    @Composable
    override fun Content() {
        val style = when (_style) {
            SwitchStyle.Default -> GreenSwitchDefaults.defaultStyle()
            SwitchStyle.Legacy -> GreenSwitchDefaults.legacyStyle()
            SwitchStyle.Neo -> GreenSwitchDefaults.neoStyle()
        }
        GreenSwitch(
            checked = checked,
            enabled = isEnabled,
            onCheckedChanged = { isChecked ->
                onCheckedChangedListener?.invoke(isChecked)
            },
            style = style,
        )
    }

    enum class SwitchStyle {
        Default,
        Legacy,
        Neo
    }
}
