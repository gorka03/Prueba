package com.example.ejercicioprueba

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
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
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,orientation=landscape"
)
@Composable
fun Horizontal() {
    Column {
        Row {
            Text("Hola")
            Text("Adios")
        }
        Image(
            painter = painterResource(android.R.drawable.btn_star_big_on),
            contentDescription = null
        )
        Text("Lorem ipsum dolor sit amet, conse...")

        Row {
            Image(
                painter = painterResource(android.R.drawable.btn_star_big_on),
                contentDescription = null
            )
            Column {
                Text("Hola")
                Text("Adios")
            }

        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Vertical() {
    Column {
        Column {
            Text("title")
            Text("subtitle")
        }
        Image(
            painter = painterResource(android.R.drawable.btn_star_big_on),
            contentDescription = null
        )
        Text("Lorem ipsum dolor sit amet, conse...")
        Row {
            Image(
                painter = painterResource(android.R.drawable.btn_star_big_on),
                contentDescription = null
            )
            Column {
                Text("Author")
                Text("2024-09-01")
            }

        }
    }
}


/*
 Row{
        Column {
            Row {
                Text("Hola")
                Text("Adios")
            }
            Column {
                Image(
                    painter = painterResource(android.R.drawable.btn_star_big_on),
                    contentDescription = null
                )
            }
        }
    }

 */

/*
Column {
        Row {
            Column {
                Text("Hola")
            }
            Column {
                Text("Hola")
            }
        }
        Row {
            Image(
                painter = painterResource(android.R.drawable.btn_star_big_on),
                contentDescription = null
            )

        }
    }
 */