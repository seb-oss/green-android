package se.seb.greencomponentsandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.GdsSwitch
import se.seb.gds.theme.GdsTheme
import se.seb.greencomponentsandroid.ui.DesignLibraryScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GdsTheme {
                DesignLibraryScreen()
            }
        }
    }
}

@Composable
fun Components(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(horizontal = 16.dp)) {
        Text(
            text = "SebSwitch"
        )
        var sebSwitchChecked by remember { mutableStateOf(false) }
        GdsSwitch(
            checked = sebSwitchChecked,
            onCheckedChanged = { sebSwitchChecked = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GdsTheme {
        Components()
    }
}