package br.com.jetpack.compose

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Container()
        }
    }

    @Preview(showBackground = true, backgroundColor = 0xFF00FF00)
    @Composable
    fun Container() {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Gray)
            ) {
                Text(
                    color = Color.Blue,
                    fontStyle = FontStyle.Normal,
                    style = TextStyle.Default,
                    text = "Primeiro teste jetpack compose"
                )
                Image(
                    painterResource(R.mipmap.sym_def_app_icon),
                    contentDescription = "",
                    contentScale = Crop
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Button(onClick = {}) {
                    Text(text = "Click aqui")
                }
            }

        }
    }
}