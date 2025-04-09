package se.seb.green.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.green.theme.GreenTheme

@Composable
fun GreenButtonPrimary(
    modifier: Modifier = Modifier,
    title: String,
    style: GreenButtonStyle = GreenButtonDefaults.defaultStyle(),
    onClick: () -> Unit,
) {
    val widthModifier = when (style.size.buttonWidth) {
        ButtonWidthType.Dynamic -> modifier
        is ButtonWidthType.Fixed -> modifier.width(style.size.buttonWidth.width)
        ButtonWidthType.Full -> modifier.fillMaxWidth()
    }

    GreenTheme {
        Button(
            modifier = modifier
                .then(widthModifier)
                .heightIn(min = style.size.buttonHeight),
            colors = style.colors,
            shape = style.shape,
            onClick = onClick
        ) {
            Text(title, style = GreenTheme.typography.Headline)
        }
    }
}

data class GreenButtonStyle(
    val size: GreenButtonSize,
    val shape: Shape,
    val colors: ButtonColors
)

sealed class ButtonWidthType {
    data object Full : ButtonWidthType()
    data object Dynamic : ButtonWidthType()
    data class Fixed(val width: Dp) : ButtonWidthType()
}

sealed class GreenButtonSize(val buttonWidth: ButtonWidthType, val buttonHeight: Dp) {
    data class size2023(val width: ButtonWidthType) : GreenButtonSize(width, 48.dp)
    data class size2016(val width: ButtonWidthType) : GreenButtonSize(width, 50.dp)
}

object GreenButtonDefaults {
    @Composable
    fun defaultStyle() = GreenButtonStyle(
        size = GreenButtonSize.size2023(ButtonWidthType.Full),
        shape = sebShape(),
        colors = defaultColors()
    )

    @Composable
    fun legacyStyle() = GreenButtonStyle(
        size = GreenButtonSize.size2016(ButtonWidthType.Full),
        shape = seb2016Shape(),
        colors = legacyColors()
    )

    @Composable
    fun defaultColors() = ButtonDefaults.buttonColors(
        containerColor = GreenTheme.colors.level3Colors.levelL3BackgroundPrimary,
        contentColor = GreenTheme.colors.level3Colors.levelL3ContentPrimary,
    )

    @Composable
    fun legacyColors() = ButtonDefaults.buttonColors(
        containerColor = GreenTheme.legacyColors.secondary,
        contentColor = Color.White,
    )

    @Composable
    fun sebShape() = CircleShape

    @Composable
    fun seb2016Shape() = RoundedCornerShape(12.dp)
}

@Preview(
    name = "Light Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0x000000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun GreenButtonPrimaryPreview() {
    GreenTheme {
        GreenButtonPrimary(
            title = "Button",
            onClick = {}
        )
    }
}

@Preview(
    name = "Light Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0x000000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun GreenButton2016PrimaryPreview() {
    GreenTheme {
        GreenButtonPrimary(
            style = GreenButtonDefaults.legacyStyle(),
            title = "Button",
            onClick = {}
        )
    }
}