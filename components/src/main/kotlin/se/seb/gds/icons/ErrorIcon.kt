package se.seb.gds.icons

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import se.seb.gds.theme.GdsTheme

@Composable
fun ErrorIcon(modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier,
        imageVector = GdsIcons.Solid.TriangleExclamation,
        contentDescription = null,
        tint = GdsTheme.colors.ContentNegative01,
    )
}

@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(name = "Light Mode", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun ErrorIconPreview() {
    GdsTheme {
        Card(
            modifier =
            Modifier
                .background(GdsTheme.colors.ContentNeutral01)
                .fillMaxWidth(),
        ) {
            ErrorIcon()
        }
    }
}
