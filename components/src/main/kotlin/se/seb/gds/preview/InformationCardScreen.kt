package se.seb.gds.preview

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsText
import se.seb.gds.atoms.IconPosition
import se.seb.gds.atoms.cards.CardButton
import se.seb.gds.atoms.cards.CardStyle
import se.seb.gds.atoms.cards.GdsCardAnimated
import se.seb.gds.atoms.cards.GdsCardDefaults
import se.seb.gds.atoms.cards.GdsInformationCard
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun InformationCardScreen() {
    var dismissButton by rememberSaveable { mutableStateOf(true) }
    var showActionButton by rememberSaveable { mutableStateOf(true) }
    var showActionCard by rememberSaveable { mutableStateOf(true) }
    var hasIcon by rememberSaveable { mutableStateOf(true) }
    var iconPosition by rememberSaveable { mutableStateOf(IconPosition.Left) }

    var isInfoCardVisible by rememberSaveable { mutableStateOf(true) }
    var isInfoHdCardVisible by rememberSaveable { mutableStateOf(true) }
    var isInfoOnWhiteCardVisible by rememberSaveable { mutableStateOf(true) }

    val context = LocalContext.current

    val onActionButtonClick = remember(context) {
        { Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show() }
    }

    val onCardClick = remember(context) {
        { Toast.makeText(context, "Card clicked", Toast.LENGTH_SHORT).show() }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.L1Neutral02)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ComponentHeaderSection(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
            title = "GdsInformationCard",
            body = "Example usage:",
            code = """
        GdsInformationCard(
          heading = "Heading",
          body = "Body text",
          modifier = modifier,
          style = GdsCardDefaults.information(),
          button = GdsCardButton(,
          title = "Action Button",
              icon = GdsIcons.Regular.Arrow,
              onClick = { /* Action */ },
          ),
          onDismiss = { /* Action */ },
          onClick = { /* Action */ },
        )
            """.trimIndent(),
        )

        Column(
            modifier = Modifier
                .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM)
                .background(
                    color = GdsTheme.colors.L2Neutral02,
                    shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusS),
                )
                .padding(vertical = GdsTheme.dimensions.spacing.SpaceS),
        ) {
            InputSwitchRow("Dismiss Button", checked = dismissButton) {
                dismissButton = it
            }
            InputSwitchRow("Action Button", checked = showActionButton) {
                showActionButton = it
            }
            InputSwitchRow("Action Card", checked = showActionCard) {
                showActionCard = it
            }
            InputSwitchRow("Icon Button", checked = hasIcon) {
                hasIcon = it
            }
            if (hasIcon) {
                SelectRow(
                    selectedText = iconPosition.name,
                    onItemSelected = { newValue ->
                        iconPosition = IconPosition.valueOf(newValue)
                    },
                    items = IconPosition.entries.map { it.name },
                    label = "Icon Position:",
                )
            }
            GdsButton(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
                title = "Reset",
                style = GdsButtonDefaults.TwentyThree.secondaryOnWhiteCard(),
                sizeProfile = GdsButtonDefaults.TwentyThree.small().copy(
                    widthType = ButtonWidthType.Dynamic,
                ),
            ) {
                dismissButton = true
                showActionButton = true
                showActionCard = true
                hasIcon = true
                iconPosition = IconPosition.Left
                isInfoCardVisible = true
                isInfoHdCardVisible = true
                isInfoOnWhiteCardVisible = true
            }
        }

        Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))

        val icon = if (hasIcon) {
            if (iconPosition == IconPosition.Left) GdsIcons.Regular.Euro else GdsIcons.Regular.ArrowRight
        } else {
            null
        }

        val button = if (showActionButton) {
            CardButton(
                title = "Action Button",
                icon = icon,
                onClick = onActionButtonClick,
            )
        } else {
            null
        }

        val onCardClickAction = onCardClick.takeIf { showActionCard }

        CardSection(
            title = "Information Card",
            style = GdsCardDefaults.information(),
            dismissButton = dismissButton,
            iconPosition = iconPosition,
            isVisible = isInfoCardVisible,
            onDismiss = { isInfoCardVisible = false },
            onClick = onCardClickAction,
            button = button,
        )

        CardSection(
            title = "Information Card HD",
            style = GdsCardDefaults.informationHd(),
            dismissButton = dismissButton,
            iconPosition = iconPosition,
            isVisible = isInfoHdCardVisible,
            onDismiss = { isInfoHdCardVisible = false },
            onClick = onCardClickAction,
            button = button,
        )

        Column(modifier = Modifier.background(GdsTheme.colors.L1Neutral01)) {
            CardSection(
                title = "Information Card on White Background",
                style = GdsCardDefaults.informationOnWhite(),
                dismissButton = dismissButton,
                iconPosition = iconPosition,
                isVisible = isInfoOnWhiteCardVisible,
                onDismiss = { isInfoOnWhiteCardVisible = false },
                onClick = onCardClickAction,
                button = button,
            )
        }
    }
}

@Composable
private fun CardSection(
    title: String,
    style: CardStyle,
    dismissButton: Boolean,
    iconPosition: IconPosition,
    isVisible: Boolean,
    onDismiss: () -> Unit,
    onClick: (() -> Unit)?,
    button: CardButton?,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        GdsText(label = title, style = GdsTheme.typography.HeadingM)
        GdsCardAnimated(visible = isVisible) {
            GdsInformationCard(
                style = style.copy(
                    buttonStyle = style.buttonStyle.copy(
                        iconPosition = iconPosition,
                    ),
                ),
                heading = "Information Card Heading",
                body = "This information card displays important details and optional actions for the user.",
                button = button,
                onClick = onClick,
                onDismiss = onDismiss.takeIf { dismissButton },
            )
        }
    }
}
