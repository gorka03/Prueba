package com.example.ejercicioprueba

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val configuration = LocalConfiguration.current
            when (configuration.orientation) {
                Configuration.ORIENTATION_LANDSCAPE -> {
                    Horizontal()
                }
                else -> {
                    Vertical()
                }
            }
        }
    }
}

@SuppressLint("AutoboxingStateCreation")
@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=411dp,height=891dp,orientation=landscape"
)
@Composable
fun Horizontal() {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Vertical() {

}