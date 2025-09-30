package se.seb.gds.icons.solid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ChainLinkBroken: ImageVector
    get() {
        val current = _chainLinkBroken
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChainLinkBroken",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 5.66809f, y = 1.02233f)
                    curveTo(x1 = 6.06994f, y1 = 0.921865f, x2 = 6.47714f, y2 = 1.16619f, x3 = 6.5776f, y3 = 1.56803f)
                    lineTo(x = 7.0901f, y = 3.61803f)
                    curveTo(x1 = 7.19056f, y1 = 4.01988f, x2 = 6.94624f, y2 = 4.42708f, x3 = 6.5444f, y3 = 4.52754f)
                    curveTo(x1 = 6.14255f, y1 = 4.628f, x2 = 5.73535f, y2 = 4.38368f, x3 = 5.63489f, y3 = 3.98183f)
                    lineTo(x = 5.12239f, y = 1.93183f)
                    curveTo(x1 = 5.02193f, y1 = 1.52999f, x2 = 5.26625f, y2 = 1.12279f, x3 = 5.66809f, y3 = 1.02233f)
                    close()
                    moveTo(x = 18.9124f, y = 5.08748f)
                    curveTo(x1 = 16.7957f, y1 = 2.97075f, x2 = 13.3638f, y2 = 2.97075f, x3 = 11.2471f, y3 = 5.08748f)
                    lineTo(x = 10.2806f, y = 6.05397f)
                    curveTo(x1 = 9.9877f, y1 = 6.34687f, x2 = 9.51283f, y2 = 6.34687f, x3 = 9.21994f, y3 = 6.05397f)
                    curveTo(x1 = 8.92704f, y1 = 5.76108f, x2 = 8.92704f, y2 = 5.28621f, x3 = 9.21994f, y3 = 4.99331f)
                    lineTo(x = 10.1864f, y = 4.02682f)
                    curveTo(x1 = 12.8889f, y1 = 1.3243f, x2 = 17.2706f, y2 = 1.3243f, x3 = 19.9731f, y3 = 4.02682f)
                    curveTo(x1 = 22.6756f, y1 = 6.72934f, x2 = 22.6756f, y2 = 11.111f, x3 = 19.9731f, y3 = 13.8135f)
                    lineTo(x = 19.0045f, y = 14.7821f)
                    curveTo(x1 = 18.7116f, y1 = 15.075f, x2 = 18.2367f, y2 = 15.075f, x3 = 17.9438f, y3 = 14.7821f)
                    curveTo(x1 = 17.6509f, y1 = 14.4892f, x2 = 17.6509f, y2 = 14.0144f, x3 = 17.9438f, y3 = 13.7215f)
                    lineTo(x = 18.9124f, y = 12.7528f)
                    curveTo(x1 = 21.0292f, y1 = 10.6361f, x2 = 21.0292f, y2 = 7.20421f, x3 = 18.9124f, y3 = 5.08748f)
                    close()
                    moveTo(x = 1.02239f, y = 5.66803f)
                    curveTo(x1 = 1.12285f, y1 = 5.26619f, x2 = 1.53005f, y2 = 5.02186f, x3 = 1.9319f, y3 = 5.12233f)
                    lineTo(x = 3.9819f, y = 5.63483f)
                    curveTo(x1 = 4.38374f, y1 = 5.73529f, x2 = 4.62806f, y2 = 6.14249f, x3 = 4.5276f, y3 = 6.54433f)
                    curveTo(x1 = 4.42714f, y1 = 6.94618f, x2 = 4.01994f, y2 = 7.1905f, x3 = 3.61809f, y3 = 7.09004f)
                    lineTo(x = 1.56809f, y = 6.57754f)
                    curveTo(x1 = 1.16625f, y1 = 6.47708f, x2 = 0.921926f, y2 = 6.06988f, x3 = 1.02239f, y3 = 5.66803f)
                    close()
                    moveTo(x = 6.05918f, y = 9.21473f)
                    curveTo(x1 = 6.35207f, y1 = 9.50762f, x2 = 6.35207f, y2 = 9.9825f, x3 = 6.05918f, y3 = 10.2754f)
                    lineTo(x = 5.08754f, y = 11.247f)
                    curveTo(x1 = 2.97081f, y1 = 13.3638f, x2 = 2.97081f, y2 = 16.7957f, x3 = 5.08754f, y3 = 18.9124f)
                    curveTo(x1 = 7.20427f, y1 = 21.0291f, x2 = 10.6362f, y2 = 21.0291f, x3 = 12.7529f, y3 = 18.9124f)
                    lineTo(x = 13.7174f, y = 17.9478f)
                    curveTo(x1 = 14.0103f, y1 = 17.655f, x2 = 14.4852f, y2 = 17.655f, x3 = 14.7781f, y3 = 17.9478f)
                    curveTo(x1 = 15.071f, y1 = 18.2407f, x2 = 15.071f, y2 = 18.7156f, x3 = 14.7781f, y3 = 19.0085f)
                    lineTo(x = 13.8136f, y = 19.973f)
                    curveTo(x1 = 11.111f, y1 = 22.6756f, x2 = 6.7294f, y2 = 22.6756f, x3 = 4.02688f, y3 = 19.973f)
                    curveTo(x1 = 1.32437f, y1 = 17.2705f, x2 = 1.32436f, y2 = 12.8889f, x3 = 4.02688f, y3 = 10.1864f)
                    lineTo(x = 4.99852f, y = 9.21473f)
                    curveTo(x1 = 5.29141f, y1 = 8.92184f, x2 = 5.76629f, y2 = 8.92183f, x3 = 6.05918f, y3 = 9.21473f)
                    close()
                    moveTo(x = 19.4724f, y = 17.4555f)
                    curveTo(x1 = 19.5728f, y1 = 17.0537f, x2 = 19.98f, y2 = 16.8094f, x3 = 20.3819f, y3 = 16.9098f)
                    lineTo(x = 22.4319f, y = 17.4223f)
                    curveTo(x1 = 22.8337f, y1 = 17.5228f, x2 = 23.0781f, y2 = 17.93f, x3 = 22.9776f, y3 = 18.3318f)
                    curveTo(x1 = 22.8771f, y1 = 18.7337f, x2 = 22.4699f, y2 = 18.978f, x3 = 22.0681f, y3 = 18.8775f)
                    lineTo(x = 20.0181f, y = 18.365f)
                    curveTo(x1 = 19.6162f, y1 = 18.2646f, x2 = 19.3719f, y2 = 17.8574f, x3 = 19.4724f, y3 = 17.4555f)
                    close()
                    moveTo(x = 17.4556f, y = 19.4723f)
                    curveTo(x1 = 17.8574f, y1 = 19.3719f, x2 = 18.2646f, y2 = 19.6162f, x3 = 18.3651f, y3 = 20.018f)
                    lineTo(x = 18.8776f, y = 22.068f)
                    curveTo(x1 = 18.9781f, y1 = 22.4699f, x2 = 18.7337f, y2 = 22.8771f, x3 = 18.3319f, y3 = 22.9775f)
                    curveTo(x1 = 17.93f, y1 = 23.078f, x2 = 17.5229f, y2 = 22.8337f, x3 = 17.4224f, y3 = 22.4318f)
                    lineTo(x = 16.9099f, y = 20.3818f)
                    curveTo(x1 = 16.8094f, y1 = 19.98f, x2 = 17.0537f, y2 = 19.5728f, x3 = 17.4556f, y3 = 19.4723f)
                    close()
                }
            }.build()
            .also { _chainLinkBroken = it }
    }

@Preview
@Composable
private fun IconPreview() {
    se.seb.gds.theme.GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = ChainLinkBroken,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chainLinkBroken: ImageVector? = null
