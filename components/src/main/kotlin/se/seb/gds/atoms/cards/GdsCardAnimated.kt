package se.seb.gds.atoms.cards

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * A composable that animates the appearance and disappearance of its content.
 * The visibility is controlled by the [visible] parameter.
 *
 * This component acts as a wrapper around [AnimatedVisibility], providing default enter and exit
 * animations. The animations can be customized via the [enter] and [exit] parameters.
 *
 * @param visible A boolean that determines whether the content is currently visible.
 * @param modifier The [Modifier] to be applied to the animated content.
 * @param enter The [EnterTransition] to use when the content appears. Defaults to a fade-in and
 * vertical expansion from the top.
 * @param exit The [ExitTransition] to use when the content disappears. Defaults to a fade-out and
 * vertical shrink towards the top.
 * @param content The composable content to be animated.
 *
 * Example usage:
 * ```
 * GdsCardAnimated(visible = isVisible) {
 *     GdsInformationCard(
 *         heading = "Hello",
 *         body = "This is an animated information card."
 *     )
 * }
 * ```
 */
@Composable
fun GdsCardAnimated(
    visible: Boolean,
    modifier: Modifier = Modifier,
    enter: EnterTransition = fadeIn() + expandVertically(expandFrom = Alignment.Top),
    exit: ExitTransition = shrinkVertically(shrinkTowards = Alignment.Top) + fadeOut(),
    content: @Composable () -> Unit,
) {
    AnimatedVisibility(
        visible = visible,
        modifier = modifier,
        enter = enter,
        exit = exit,
    ) {
        content()
    }
}
