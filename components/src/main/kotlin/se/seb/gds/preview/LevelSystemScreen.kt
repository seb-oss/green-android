package se.seb.gds.preview

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsLevelledButton
import se.seb.gds.atoms.GdsText
import se.seb.gds.atoms.cards.CardButton
import se.seb.gds.atoms.cards.GdsCard
import se.seb.gds.atoms.cards.GdsLevelledInformationCard
import se.seb.gds.atoms.input.BasicInputState
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.atoms.input.GdsLevelledInputDefault
import se.seb.gds.components.GdsLevelSurface
import se.seb.gds.theme.ColorScheme
import se.seb.gds.theme.GdsTheme
import se.seb.gds.theme.Level
import se.seb.gds.theme.LocalColorScheme
import se.seb.gds.theme.LocalLevel
import se.seb.gds.theme.getLevelContainerColor

@Composable
fun LevelSystemScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.L1.Neutral02)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        GdsLevelledInformationCard(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
            heading = "Level ${LocalLevel.current} (${LocalColorScheme.current})",
            body = "This is an information card at level ${LocalLevel.current} with color scheme ${LocalColorScheme.current}. It demonstrates how the card adapts to different levels and color schemes",
            button = CardButton(
                title = "Doesn't matter",
                onClick = { },
            ),
        )

        CompositionLocalProvider(
            LocalLevel provides Level.L1,
            LocalColorScheme provides ColorScheme.Neutral01,
        ) {
            CardSection(
                title = "Level ${LocalLevel.current} (${LocalColorScheme.current})",
            )
        }

        CompositionLocalProvider(
            LocalLevel provides Level.L1,
            LocalColorScheme provides ColorScheme.Neutral02,
        ) {
            CardSection(
                title = "Level ${LocalLevel.current} (${LocalColorScheme.current})",
            )
        }
    }
}

@Composable
private fun CardSection(
    title: String,
) {
    GdsLevelSurface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(GdsTheme.dimensions.spacing.SpaceM),
        shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusL),
        border = BorderStroke(1.dp, GdsTheme.colors.Border.Information01),
        color = getLevelContainerColor(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = GdsTheme.dimensions.spacing.SpaceM),
            verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsText(label = title, style = GdsTheme.typography.HeadingXs)
            val cardLabel = "Level ${LocalLevel.current} (${LocalColorScheme.current})"
            GdsCard(containerColor = getLevelContainerColor(), border = null) {
                Column(modifier = Modifier.padding(12.dp)) {
                    GdsText(
                        label = cardLabel,
                        style = GdsTheme.typography.HeadingXs,
                    )

                    Column {
                        Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
                        GdsLevelledButton(
                            title = "Level ${LocalLevel.current} (${LocalColorScheme.current})",
                            sizeProfile = GdsButtonDefaults.TwentyThree.medium(),
                            onClick = { },
                        )
                        Spacer(modifier = Modifier.height(GdsTheme.dimensions.spacing.SpaceM))

                        GdsLevelledInputDefault(
                            modifier = Modifier.padding(vertical = GdsTheme.dimensions.spacing.SpaceS),
                            style = GdsInputDefaults.defaultLevelledStyle(),
                            state = rememberTextFieldState("Level ${LocalLevel.current} (${LocalColorScheme.current})"),
                            label = "Label",
                            supportLabel = "Support Label",
                            inputState = BasicInputState(
                                maxCharacters = 50,
                                errorMessage = "Error message",
                                clearable = false,
                                isError = false,
                                showInfoIcon = false,
                            ),
                        )
                    }
                }
            }

            GdsLevelledInformationCard(
                heading = "Level ${LocalLevel.current} (${LocalColorScheme.current})",
                body = "This is an information card at level ${LocalLevel.current} with color scheme ${LocalColorScheme.current}. It demonstrates how the card adapts to different levels and color schemes",
                button = CardButton(
                    title = "Doesn't matter",
                    onClick = { },
                ),
            )

            GdsLevelledInputDefault(
                modifier = Modifier.padding(vertical = GdsTheme.dimensions.spacing.SpaceS),
                style = GdsInputDefaults.defaultLevelledStyle(),
                state = rememberTextFieldState("Level ${LocalLevel.current} (${LocalColorScheme.current})"),
                label = "Label",
                supportLabel = "Support Label",
                inputState = BasicInputState(
                    maxCharacters = 50,
                    errorMessage = "Error message",
                    clearable = false,
                    isError = false,
                    showInfoIcon = false,
                ),
            )

            GdsLevelledButton(
                title = "Level ${LocalLevel.current} (${LocalColorScheme.current})",
                sizeProfile = GdsButtonDefaults.TwentyThree.medium(),
                onClick = { },
            )
        }
    }
}

@Preview
@Composable
private fun LevelSystemPreview() {
    GdsTheme {
        LevelSystemScreen()
    }
}
