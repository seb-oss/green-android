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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.GdsButtonDefaults.seb2016Shape
import se.seb.gds.icons.GdsIcons
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
    sizeProfile: GdsButtonSizeProfile = GdsButtonDefaults.TwentyThree.large(),
    onClick: () -> Unit,
) {
    val widthModifier =
        when (sizeProfile.widthType) {
            ButtonWidthType.Dynamic -> modifier
            is ButtonWidthType.Fixed -> modifier.width(sizeProfile.widthType.width)
            ButtonWidthType.Full -> modifier.fillMaxWidth()
        }

    val paddingValues =
        when {
            title == null && sizeProfile.widthType is ButtonWidthType.Fixed -> PaddingValues(
                horizontal = 0.dp,
            )

            else -> PaddingValues(horizontal = sizeProfile.horizontalPadding, vertical = 8.dp)
        }

    GdsTheme {
        val buttonContent: @Composable () -> Unit = {
            ButtonContent(
                style,
                modifier,
                widthModifier,
                sizeProfile,
                enabled,
                paddingValues,
                onClick,
                icon,
                title,
            )
        }

        if (style.legacyRipple) {
            val rippleColor =
                when {
                    style.colors.containerColor != Color.Transparent ->
                        if (style.colors.containerColor.luminance() >
                            0.5f
                        ) {
                            Color.Black
                        } else {
                            Color.White
                        }

                    else -> GdsTheme.colors.StateNeutral05
                }

            CompositionLocalProvider(
                LocalRippleConfiguration provides
                    RippleConfiguration(
                        color = rippleColor,
                        rippleAlpha =
                        RippleAlpha(
                            draggedAlpha = 0.16f,
                            focusedAlpha = 0.12f,
                            hoveredAlpha = 0.08f,
                            pressedAlpha = 0.1f,
                        ),
                    ),
            ) {
                buttonContent()
            }
        } else {
            buttonContent()
        }
    }
}

@Composable
private fun ButtonContent(
    style: GdsButtonStyle,
    modifier: Modifier,
    widthModifier: Modifier,
    sizeProfile: GdsButtonSizeProfile,
    enabled: Boolean,
    paddingValues: PaddingValues,
    onClick: () -> Unit,
    icon: ImageVector?,
    title: String?,
) {
    if (style.textButton) {
        TextButton(
            modifier =
            modifier
                .then(widthModifier)
                .heightIn(min = sizeProfile.height),
            colors = style.colors,
            shape = sizeProfile.shape,
            enabled = enabled,
            contentPadding = paddingValues,
            onClick = onClick,
        ) {
            ButtonContent(
                icon = icon,
                title = title,
                textStyle = sizeProfile.textStyle,
                iconSize = sizeProfile.iconSize,
                iconSpacing = sizeProfile.iconSpacing,
                iconPosition = style.iconPosition,
            )
        }
    } else {
        Button(
            modifier =
            modifier
                .then(widthModifier)
                .heightIn(min = sizeProfile.height),
            colors = style.colors,
            shape = sizeProfile.shape,
            enabled = enabled,
            border = style.border,
            contentPadding = paddingValues,
            onClick = onClick,
        ) {
            ButtonContent(
                icon = icon,
                title = title,
                textStyle = sizeProfile.textStyle,
                iconSize = sizeProfile.iconSize,
                iconSpacing = sizeProfile.iconSpacing,
                iconPosition = style.iconPosition,
            )
        }
    }
}

@Composable
private fun ButtonContent(
    icon: ImageVector?,
    iconPosition: IconPosition,
    title: String?,
    iconSpacing: Dp,
    textStyle: TextStyle,
    iconSize: Dp,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        if (icon != null && iconPosition == IconPosition.Left) {
            Icon(
                modifier = Modifier.size(iconSize),
                imageVector = icon,
                contentDescription = null,
            )
            if (title != null) {
                Spacer(modifier = Modifier.width(iconSpacing))
            }
        }
        if (title != null) {
            Text(
                text = title,
                style = textStyle,
                maxLines = 2,
                modifier = Modifier.weight(1f, fill = false),
            )
        }
        if (icon != null && iconPosition == IconPosition.Right) {
            if (title != null) {
                Spacer(modifier = Modifier.width(iconSpacing))
            }
            Icon(
                modifier = Modifier.size(iconSize),
                imageVector = icon,
                contentDescription = null,
            )
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
            icon = GdsIcons.Solid.Checkmark,
            style = GdsButtonDefaults.TwentyThree.secondaryStyle(),
            onClick = {},
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
            icon = GdsIcons.Solid.Checkmark,
            onClick = {},
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
            icon = GdsIcons.Solid.Checkmark,
            style = GdsButtonDefaults.TwentyThree.primaryStyle(),
            sizeProfile = GdsButtonDefaults.TwentyThree.large(),
            onClick = {},
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
            style = GdsButtonDefaults.primary(),
            sizeProfile = GdsButtonSizeProfile(
                widthType = ButtonWidthType.Full,
                height = 50.dp,
                shape = seb2016Shape(LegacyButtonSize.LARGE),
                horizontalPadding = 16.dp,
                textStyle = GdsTheme.legacyTypography.Title6,
                iconSize = 24.dp,
            ),
            title = "Button",
            onClick = {},
        )
    }
}
