package se.seb.gds.views

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.LegacyButtonSize

/**
 * `GdsButtonView` is a custom Android View that wraps a Jetpack Compose `GdsButton` composable.
 * It provides a simple way to use a green design system button within traditional Android layouts.
 *
 * This class allows you to set the button's title, enabled/disabled state, click listener, and style.
 *
 * @param context The context in which the view is running.
 * @param attrs The attributes of the XML tag that is inflating the view.
 * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource that supplies default values for the view. Can be 0 to not look for defaults.
 */
class GdsButtonView @JvmOverloads constructor(
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

    private var _style by mutableStateOf(ButtonStyle.PRIMARY)

    var style: ButtonStyle
        get() = _style
        set(value) {
            _style = value
        }

    private var _size by mutableStateOf(ButtonSize.LARGE)

    var buttonSize: ButtonSize
        get() = _size
        set(value) {
            _size = value
        }

    @Composable
    override fun Content() {
        val size = when (_size) {
            ButtonSize.SMALL -> LegacyButtonSize.SMALL
            ButtonSize.MEDIUM -> LegacyButtonSize.MEDIUM
            ButtonSize.LARGE -> LegacyButtonSize.LARGE
        }

        val buttonStyle = when (_style) {
            ButtonStyle.PRIMARY -> GdsButtonDefaults.primaryStyle()
            ButtonStyle.SECONDARY -> GdsButtonDefaults.secondaryStyle()
            ButtonStyle.TERTIARY -> GdsButtonDefaults.tertiaryStyle()
            ButtonStyle.LEGACY_PRIMARY -> GdsButtonDefaults.legacyPrimaryStyle(size)
            ButtonStyle.LEGACY_SECONDARY -> GdsButtonDefaults.legacySecondaryStyle(size)
            ButtonStyle.LEGACY_TERTIARY -> GdsButtonDefaults.legacyTertiaryStyle(size)
            ButtonStyle.LEGACY_PRIMARY_DESTRUCTIVE -> GdsButtonDefaults.legacyPrimaryDestructiveStyle(size)
            ButtonStyle.LEGACY_SECONDARY_DESTRUCTIVE -> GdsButtonDefaults.legacySecondaryDestructiveStyle()
            ButtonStyle.LEGACY_TERTIARY_DESTRUCTIVE -> GdsButtonDefaults.legacyTertiaryDestructiveStyle()
            ButtonStyle.LEGACY_TERTIARY_EMPHASIS -> GdsButtonDefaults.legacyTertiaryEmphasisStyle()
        }

        GdsButton(
            title = title,
            style = buttonStyle,
            enabled = _isEnabled,
            onClick = { onClickListener?.invoke() }
        )
    }

    enum class ButtonStyle {
        PRIMARY,
        SECONDARY,
        TERTIARY,
        LEGACY_PRIMARY,
        LEGACY_SECONDARY,
        LEGACY_TERTIARY,
        LEGACY_PRIMARY_DESTRUCTIVE,
        LEGACY_SECONDARY_DESTRUCTIVE,
        LEGACY_TERTIARY_DESTRUCTIVE,
        LEGACY_TERTIARY_EMPHASIS
    }

    enum class ButtonSize {
        SMALL,
        MEDIUM,
        LARGE
    }
}