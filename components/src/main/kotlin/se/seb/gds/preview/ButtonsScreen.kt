package se.seb.gds.preview

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.LegacyButtonSize
import se.seb.gds.components.SwitchRow
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
internal fun ButtonsScreen(scrollState: ScrollState) {
    var showLegacyButtons by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .background(GdsTheme.colors.L1.Neutral02)
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (!showLegacyButtons) {
            ComponentHeaderSection(
                title = "GDSButton",
                body = "Example usage:",
                code = """
            GdsButton(
              title = "Title",
              leadingIcon = icon,
              style = GdsButtonDefaults.primary(),
              onClick = {}
            )
                """.trimIndent(),
            )
        }

        SwitchRow("Show 2016 Buttons", checked = showLegacyButtons) {
            showLegacyButtons = it
        }

        var selectedWidth by rememberSaveable { mutableStateOf("Full") }
        val widthType = when (selectedWidth) {
            "Full" -> ButtonWidthType.Full
            "Dynamic" -> ButtonWidthType.Dynamic
            else -> ButtonWidthType.Fixed(200.dp)
        }
        var hasIcon by rememberSaveable { mutableStateOf(false) }
        var iconPosition by rememberSaveable { mutableStateOf("Left") }
        var selectedHeight by rememberSaveable { mutableStateOf("Large") }
        val buttonSizeProfile = when (selectedHeight) {
            "XLarge" -> GdsButtonDefaults.TwentyThree.xLarge()
            "Large" -> GdsButtonDefaults.TwentyThree.large()
            "Medium" -> GdsButtonDefaults.TwentyThree.medium()
            else -> GdsButtonDefaults.TwentyThree.small()
        }

        if (showLegacyButtons.not()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = GdsTheme.colors.L2.Neutral02,
                        shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusS),
                    ),
            ) {
                SelectRow(
                    selectedText = selectedHeight,
                    onItemSelected = { newValue ->
                        selectedHeight = newValue
                    },
                    items = listOf("XLarge", "Large", "Medium", "Small"),
                    label = "Height Type:",
                )

                SelectRow(
                    selectedText = selectedWidth,
                    onItemSelected = { newValue ->
                        selectedWidth = newValue
                    },
                    items = listOf("Full", "Dynamic", "Fixed (200dp)"),
                    label = "Width Type:",
                )

                InputSwitchRow("Icon", checked = hasIcon) {
                    hasIcon = it
                }

                if (hasIcon) {
                    SelectRow(
                        selectedText = iconPosition,
                        onItemSelected = { newValue ->
                            iconPosition = newValue
                        },
                        items = listOf("Left", "Right"),
                        label = "Icon Position:",
                    )
                }
            }

            val leadingIcon = (GdsIcons.Regular.Euro).takeIf { hasIcon && iconPosition == "Left" }
            val trailingIcon = (GdsIcons.Regular.ArrowRight).takeIf {
                hasIcon && iconPosition == "Right"
            }

            GdsButton(
                title = "Primary",
                style = GdsButtonDefaults.TwentyThree.primary(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Secondary On White",
                style = GdsButtonDefaults.TwentyThree.secondaryOnWhite(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Secondary On Grey",
                style = GdsButtonDefaults.TwentyThree.secondaryOnGrey(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Secondary On White Card",
                style = GdsButtonDefaults.TwentyThree.secondaryOnWhiteCard(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Secondary On Grey Card",
                style = GdsButtonDefaults.TwentyThree.secondaryOnGreyCard(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Tertiary Button",
                style = GdsButtonDefaults.TwentyThree.tertiary(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Outline Button",
                style = GdsButtonDefaults.TwentyThree.outline(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }

            GdsButton(
                title = "Negative Button",
                style = GdsButtonDefaults.TwentyThree.negative(),
                sizeProfile = buttonSizeProfile.copy(widthType = widthType),
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
            ) { }
        } else {
            GdsButton(
                title = "Primary Large Button",
                style = GdsButtonDefaults.primary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Primary Medium Button",
                style = GdsButtonDefaults.primary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Primary Small Button",
                style = GdsButtonDefaults.primary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Secondary Large Button",
                style = GdsButtonDefaults.secondary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Secondary Medium Button",
                style = GdsButtonDefaults.secondary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Secondary Small Button",
                style = GdsButtonDefaults.secondary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Tertiary Large Button",
                style = GdsButtonDefaults.tertiary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Tertiary Medium Button",
                style = GdsButtonDefaults.tertiary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Tertiary Small Button",
                style = GdsButtonDefaults.tertiary(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Destructive Large Button",
                style = GdsButtonDefaults.primaryDestructive(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.LARGE),
            ) { }

            GdsButton(
                title = "Destructive Medium Button",
                style = GdsButtonDefaults.primaryDestructive(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.MEDIUM),
            ) { }

            GdsButton(
                title = "Destructive Small Button",
                style = GdsButtonDefaults.primaryDestructive(),
                sizeProfile = GdsButtonDefaults.legacySizeProfile(LegacyButtonSize.SMALL),
            ) { }

            GdsButton(
                title = "Destructive Secondary Button",
                style = GdsButtonDefaults.secondaryDestructive(),
                sizeProfile = GdsButtonDefaults.legacyFullSmallProfile(),
            ) { }

            GdsButton(
                title = "Destructive Tertiary Button",
                style = GdsButtonDefaults.tertiaryDestructive(),
                sizeProfile = GdsButtonDefaults.legacyFullSmallProfile(),
            ) { }

            GdsButton(
                title = "Tertiary Emphasis Button",
                style = GdsButtonDefaults.tertiaryEmphasis(),
                sizeProfile = GdsButtonDefaults.legacyFullSmallProfile(),
            ) { }
        }
    }
}

@Composable
fun SelectRow(
    selectedText: String,
    onItemSelected: (String) -> Unit,
    items: List<String>,
    label: String,
) {
    Row(
        modifier = Modifier
            .padding(
                horizontal = GdsTheme.dimensions.spacing.SpaceM,
                vertical = GdsTheme.dimensions.spacing.SpaceS,
            )
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var expanded by remember { mutableStateOf(false) }

        Text(
            modifier = Modifier.weight(1f),
            style = GdsTheme.typography.DetailBookM,
            text = label,
        )

        Box(modifier = Modifier.wrapContentSize()) {
            Text(
                modifier = Modifier.clickable(onClick = { expanded = true }),
                style = GdsTheme.typography.DetailBookM,
                text = selectedText,
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
            ) {
                items.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(item) },
                        onClick = {
                            onItemSelected(item)
                            expanded = false
                        },
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun ButtonsScreenPreview() {
    GdsTheme {
        ButtonsScreen(rememberScrollState())
    }
}
