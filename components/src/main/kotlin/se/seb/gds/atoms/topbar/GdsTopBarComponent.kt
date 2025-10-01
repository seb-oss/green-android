package se.seb.gds.atoms.topbar

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsTopBarComponent(
    modifier: Modifier = Modifier,
    leftAction: @Composable (() -> Unit)? = null,
    title: String?,
    titleStyle: TextStyle = GdsTheme.legacyTypography.Title5,
    rightActions: @Composable (RowScope.() -> Unit)? = null,
    color: Color? = GdsTheme.colors.L1Neutral01,
    contentColor: Color? = GdsTheme.colors.ContentNeutral01,
    centeredTitle: Boolean? = false,
    elevation: Dp = 0.dp,
) {
    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }
    Box {
        Surface(
            modifier = modifier
                .then(
                    if (leftAction == null) {
                        Modifier
                            .semantics { traversalIndex = -1f }
                            .focusRequester(focusRequester)
                    } else {
                        Modifier
                    },
                )
                .fillMaxWidth(),
            color = color ?: GdsTheme.colors.L1Neutral01,
            contentColor = contentColor ?: GdsTheme.colors.ContentNeutral01,
            shadowElevation = elevation,
            content = {
                Row(
                    modifier = Modifier
                        .statusBarsPadding()
                        .height(64.dp),
                    content = {
                        if (leftAction == null) {
                            Spacer(Modifier.size(16.dp))
                        } else {
                            Row(
                                Modifier
                                    .fillMaxHeight()
                                    .width(68.dp)
                                    .semantics { traversalIndex = -1f }
                                    .focusRequester(focusRequester),
                                verticalAlignment = Alignment.CenterVertically,
                                content = { leftAction() },
                            )
                        }
                        Row(
                            modifier =
                            Modifier
                                .align(Alignment.CenterVertically)
                                .weight(1f),
                            horizontalArrangement = applyArrangement(
                                centeredTitle,
                            ),
                        ) {
                            title?.let {
                                MagnifierText(
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .align(Alignment.CenterVertically)
                                        .semantics {
                                            heading()
                                        },
                                    text = title,
                                    style = titleStyle,
                                    color = GdsTheme.colors.ContentNeutral01,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            } ?: run {
                                Spacer(Modifier.weight(1f))
                            }
                        }
                        rightActions?.let {
                            Row(
                                Modifier
                                    .fillMaxHeight()
                                    .widthIn(min = 12.dp),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically,
                                content = it,
                            )
                        }
                    },
                )
            },
        )
    }
}

@Composable
fun GdsTopBarAction(
    @DrawableRes icon: Int,
    tint: Color = GdsTheme.colors.ContentNeutral01,
    contentDescription: String? = null,
    onClick: () -> Unit,
) = IconButton(onClick = onClick) {
    Icon(
        painter = painterResource(icon),
        tint = tint,
        contentDescription = contentDescription,
    )
}

private fun applyArrangement(centeredTitle: Boolean?) =
    if (centeredTitle == true) {
        Arrangement.Center
    } else {
        Arrangement.Start
    }

@Preview(name = "Dark Mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(name = "Light Mode", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun PreviewTopBar() {
    GdsTheme {
        Column(Modifier.fillMaxWidth()) {
            GdsTopBarComponent(
                leftAction = {
                    GdsTopBarAction(
                        icon = R.drawable.ic_back,
                        onClick = {},
                    )
                },
                title = "Background activity",
                rightActions = {
                    GdsTopBarAction(
                        icon = R.drawable.ic_clear_24,
                        onClick = {},
                    )
                },
            )
        }
    }
}
