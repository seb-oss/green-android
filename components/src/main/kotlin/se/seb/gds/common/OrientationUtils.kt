package se.seb.gds.common

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

/**
 * Returns true if the current device orientation is landscape.
 *
 * @return True if landscape, false otherwise.
 */
@Composable
internal fun isLandscape(): Boolean {
    return LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE
}
