package se.seb.gds.atoms.communicationbanner

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import se.seb.gds.theme.GdsTheme

object GdsCommunicationBannerDefaults {
    val bannerType = GdsCommunicationBannerType.Information

    val shape: Shape
        @Composable get() = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusS)

    val containerColor: Color
        @Composable get() = GdsTheme.legacyColors.secondaryGroupedBackgroundColor

    val contentColor: Color
        @Composable get() = GdsTheme.colors.Content.Neutral01

    val elevation: CardElevation
        @Composable get() = CardDefaults.elevatedCardElevation()
}
