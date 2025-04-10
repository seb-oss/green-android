package se.seb.green.views

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import se.seb.green.atoms.GreenButtonPrimary
import se.seb.green.atoms.GreenButtonDefaults

/**
 * `GreenButtonPrimaryView` is a custom Android View that wraps a Jetpack Compose `GreenButtonPrimary` composable.
 * It provides a simple way to use a primary green button within traditional Android layouts.
 *
 * This class allows you to set the button's title, enabled/disabled state, click listener, and style.
 *
 * @param context The context in which the view is running.
 * @param attrs The attributes of the XML tag that is inflating the view.
 * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource that supplies default values for the view. Can be 0 to not look for defaults.
 */
class GreenButtonPrimaryView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    private var _title by mutableStateOf("")
    var title: String
        get() = _title
        set(value) {
            _title = value
        }

    private var _isEnabled by mutableStateOf(true)

    override fun isEnabled(): Boolean {
        return _isEnabled
    }

    override fun setEnabled(enabled: Boolean) {
        _isEnabled = enabled
    }

    var onClickListener: (() -> Unit)? = null

    private var _style by mutableStateOf(ButtonStyle.Default)

    var style: ButtonStyle
        get() = _style
        set(value) {
            _style = value
        }

    @Composable
    override fun Content() {
        val buttonStyle = when (_style) {
            ButtonStyle.Default -> GreenButtonDefaults.defaultStyle()
            ButtonStyle.Legacy -> GreenButtonDefaults.legacyStyle()
        }
        GreenButtonPrimary(
            title = title,
            style = buttonStyle,
            enabled = _isEnabled,
            onClick = { onClickListener?.invoke() }
        )
    }

    enum class ButtonStyle {
        Default,
        Legacy
    }
}