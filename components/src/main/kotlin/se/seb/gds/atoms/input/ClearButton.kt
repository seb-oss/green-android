package se.seb.gds.atoms.input

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.tooling.preview.Preview
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

@Composable
fun ClearButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    val clearButtonDescription = stringResource(id = R.string.clear_button_description)
    Icon(
        modifier =
            modifier
                .clearAndSetSemantics {
                    contentDescription = clearButtonDescription
                    role = Role.Button
                }.clickable(enabled = enabled, onClick = onClick),
        painter = painterResource(id = R.drawable.ic_clear_24),
        contentDescription = null,
        tint = GdsTheme.colors.ContentNeutral01,
    )
}

@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(name = "Light Mode", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun ClearButtonPreview() {
    GdsTheme {
        Card(
            modifier = Modifier.background(GdsTheme.colors.ContentNeutral01),
        ) {
            ClearButton {
                // no-op
            }
        }
    }
}
