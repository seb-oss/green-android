package se.seb.gds.renderer.mapper

import androidx.compose.runtime.Composable
import se.seb.components.uitokens.Icon
import se.seb.gds.components.R

@Composable
fun Icon.toIconInt(): Int? =
    when (this) {
        Icon.IC_BACK -> R.drawable.ic_back
        Icon.IC_CLOSE -> R.drawable.ic_clear_24
        else -> null
    }