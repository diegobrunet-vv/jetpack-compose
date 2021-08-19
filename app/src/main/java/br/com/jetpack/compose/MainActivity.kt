package br.com.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
                        bitmap = imageFromResource(
                            res = resources,
                            resId = R.drawable.ic_launcher_foreground
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {}) {
                        Text(text = "Click aqui")
                    }
                }

            }
        }
    }
}