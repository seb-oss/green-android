package se.seb.gds.atoms.communicationbanner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import se.seb.gds.atoms.cards.GdsCard
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.components.R
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun GdsCommunicationBanner(
    heading: String,
    body: String,
    modifier: Modifier = Modifier,
    bannerType: GdsCommunicationBannerType = GdsCommunicationBannerDefaults.bannerType,
    elevation: CardElevation = GdsCommunicationBannerDefaults.elevation,
    onDismiss: (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
) {
    GdsCard(
        modifier = modifier,
        onClick = onClick,
        containerColor = GdsCommunicationBannerDefaults.containerColor,
        shape = GdsCommunicationBannerDefaults.shape,
        elevation = elevation,
        border = null,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Min),
        ) {
            Box(
                contentAlignment = TopCenter,
                modifier = Modifier
                    .width(GdsTheme.dimensions.spacing.Space4Xl)
                    .fillMaxHeight()
                    .padding(
                        top = GdsTheme.dimensions.spacing.Space2Xs,
                        start = GdsTheme.dimensions.spacing.Space2Xs,
                        bottom = GdsTheme.dimensions.spacing.Space2Xs,
                    )
                    .background(
                        color = bannerType.bannerColor,
                        shape = RoundedCornerShape(
                            GdsTheme.dimensions.radius.RadiusXs,
                        ),
                    ),
            ) {
                Icon(
                    modifier = Modifier
                        .padding(top = GdsTheme.dimensions.spacing.SpaceS)
                        .size(GdsTheme.dimensions.spacing.SpaceXl),
                    tint = bannerType.iconTint,
                    imageVector = bannerType.icon,
                    contentDescription = stringResource(R.string.common_action_close),
                )
            }

            Column(
                modifier = Modifier
                    .weight(1.0f)
                    .padding(
                        top = GdsTheme.dimensions.spacing.SpaceM,
                        bottom = GdsTheme.dimensions.spacing.SpaceL,
                        start = GdsTheme.dimensions.spacing.SpaceS,
                        end = GdsTheme.dimensions.spacing.SpaceS,
                    ),
                verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.Space2Xs),
            ) {
                Text(
                    text = heading,
                    style = GdsTheme.typography.BodyMediumM,
                    color = GdsCommunicationBannerDefaults.contentColor,
                )
                Text(
                    text = body,
                    style = GdsTheme.typography.BodyRegularS,
                    color = GdsCommunicationBannerDefaults.contentColor,
                )
            }

            if (onDismiss != null) {
                IconButton(
                    onClick = onDismiss,
                    modifier = Modifier
                        .padding(
                            top = GdsTheme.dimensions.spacing.SpaceXs,
                            end = GdsTheme.dimensions.spacing.SpaceXs,
                            start = GdsTheme.dimensions.spacing.Space0,
                            bottom = GdsTheme.dimensions.spacing.Space0,
                        )
                        .size(GdsTheme.dimensions.spacing.SpaceXl),
                ) {
                    Icon(
                        modifier = Modifier,
                        tint = GdsCommunicationBannerDefaults.contentColor,
                        imageVector = GdsIcons.Regular.CrossSmall,
                        contentDescription = stringResource(R.string.common_action_close),
                    )
                }
            } else {
                Spacer(Modifier.size(GdsTheme.dimensions.spacing.SpaceM))
            }
        }
    }
}

@GdsUiPreview
@Composable
private fun GdsCommunicationBannerPreview() {
    GdsTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(GdsTheme.legacyColors.backgroundGrouped)
                .padding(GdsTheme.dimensions.spacing.SpaceM),
            verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCommunicationBanner(
                heading = "Information",
                body = "This information card displays important details and optional actions for the user.",
                bannerType = GdsCommunicationBannerType.Information,
                onDismiss = {},
            )
            GdsCommunicationBanner(
                heading = "Notice",
                body = "This information card displays important details and optional actions for the user.",
                bannerType = GdsCommunicationBannerType.Notice,
                onDismiss = {},
            )
            GdsCommunicationBanner(
                heading = "Warning",
                body = "This information card displays important details and optional actions for the user.",
                bannerType = GdsCommunicationBannerType.Warning,
                onDismiss = {},
            )
            GdsCommunicationBanner(
                heading = "Error",
                body = "This information card displays important details and optional actions for the user.",
                bannerType = GdsCommunicationBannerType.Error,
                onDismiss = {},
            )
        }
    }
}
