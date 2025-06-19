package se.seb.gds.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.icons.SebIcons
import se.seb.gds.theme.GdsTheme


/**
 * A primary GDS button composable.
 *
 * This composable creates a button with a GDS theme, customizable size, and styling.
 *
 * @param modifier The modifier to be applied to the button.
 * @param title The text displayed on the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be clickable.
 * @param style The styling to be applied to the button, including colors, shape, and size. Defaults to `GdsButtonDefaults.defaultStyle()`.
 * @param onClick The callback to be invoked when the button is clicked.
 *
 * Example usage:
 * ```
 * GdsButton(
 *     title = "Click Me",
 *     onClick = { println("Button clicked!") }
 * )
 *
 * GdsButton(
 *     title = "Fixed Width Button",
 *     style = GdsButtonDefaults.legacyStyle().copy(
 *         size = GdsButtonSize.legacy(ButtonWidthType.Fixed(200.dp))
 *     )
 * )
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GdsButton(
    modifier: Modifier = Modifier,
    title: String? = null,
    enabled: Boolean = true,
    icon: ImageVector? = null,
    style: GdsButtonStyle = GdsButtonDefaults.TwentyThree.primaryStyle(),
    onClick: () -> Unit,
) {
    val widthModifier = when (style.size.buttonWidth) {
        ButtonWidthType.Dynamic -> modifier
        is ButtonWidthType.Fixed -> modifier.width(style.size.buttonWidth.width)
        ButtonWidthType.Full -> modifier.fillMaxWidth()
    }

    val paddingValues = when {
        title == null && style.size.buttonWidth is ButtonWidthType.Fixed -> PaddingValues(horizontal = 0.dp)
        icon != null -> ButtonDefaults.ContentPadding
        else -> ButtonDefaults.ButtonWithIconContentPadding
    }

    GdsTheme {
        val rippleColor = if (style.colors.containerColor != Color.Transparent) {
            if (style.colors.containerColor.luminance() > 0.5f) {
                Color.Black
            } else {
                Color.White
            }
        } else {
            GdsTheme.colors.stateLightHover
        }

        CompositionLocalProvider(
            LocalRippleConfiguration provides RippleConfiguration(
                color = rippleColor,
                rippleAlpha = RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f)
            )
        ) {
            if (style.textButton) {
                TextButton(
                    modifier = modifier
                        .then(widthModifier)
                        .heightIn(min = style.size.buttonHeight),
                    colors = style.colors,
                    shape = style.shape,
                    enabled = enabled,
                    contentPadding = paddingValues,
                    onClick = onClick,
                ) {
                    ButtonContent(icon = icon, title = title, bookFont = style.bookFont)
                }
            } else {
                Button(
                    modifier = modifier
                        .then(widthModifier)
                        .heightIn(min = style.size.buttonHeight),
                    colors = style.colors,
                    shape = style.shape,
                    enabled = enabled,
                    contentPadding = paddingValues,
                    onClick = onClick
                ) {
                    ButtonContent(icon = icon, title = title, bookFont = style.bookFont)
                }
            }
        }
    }
}

@Composable
private fun ButtonContent(icon: ImageVector?, title: String?, bookFont: Boolean) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        if (icon != null) {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = icon,
                contentDescription = null
            )
            if (title != null) {
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
        if (title != null) {
            val style = if (bookFont) {
                GdsTheme.typography.Headline
            } else {
                GdsTheme.typography.Title6
            }
            Text(title, style = style, maxLines = 2)
        }
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
private fun GdsButtonSecondaryPreview() {
    GdsTheme {
        GdsButton(
            title = "Button",
            icon = SebIcons.Check,
            style = GdsButtonDefaults.TwentyThree.secondaryStyle(),
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
private fun GdsButtonPrimaryPreview() {
    GdsTheme {
        GdsButton(
            title = "Button",
            icon = SebIcons.Check,
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
private fun GdsIconButtonPrimaryPreview() {
    GdsTheme {
        GdsButton(
            icon = SebIcons.Check,
            style = GdsButtonDefaults.TwentyThree.primaryStyle().copy(
                size = GdsButtonSize.Default(ButtonWidthType.Fixed(48.dp))
            ),
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
private fun GdsButton2016PrimaryPreview() {
    GdsTheme {
        GdsButton(
            style = GdsButtonDefaults.primary().copy(
                size = GdsButtonSize.Legacy(LegacyButtonSize.LARGE)
            ),
            title = "Button",
            onClick = {}
        )
    }
}