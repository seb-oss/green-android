package se.seb.green.views

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView
import se.seb.green.atoms.GreenSwitch
import se.seb.green.atoms.GreenSwitchDefaults

class GreenSwitchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var checked: Boolean = false
    var switchEnabled: Boolean = true
    var onCheckedChanged: ((Boolean) -> Unit)? = null

    @Composable
    override fun Content() {
        GreenSwitch(
            checked = checked,
            enabled = switchEnabled,
            onCheckedChanged = { isChecked ->
                onCheckedChanged?.invoke(isChecked)
            },
            style = GreenSwitchDefaults.defaultStyle(),
        )
    }
}
