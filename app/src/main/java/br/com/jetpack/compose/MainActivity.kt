package br.com.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.painterResource
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

    @Preview
    @Composable
    fun Container() {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Image(
                    painterResource(R.mipmap.ic_launcher),
                    contentDescription = "",
                    contentScale = Crop
                )
//                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = getString(R.string.string_test_name),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.Start),
                    color = Color.Blue,
                    fontStyle = FontStyle.Normal,
                    style = MaterialTheme.typography.body2
                )
                Text(
                    text = getString(R.string.string_test_job),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.Start),
                    color = Color.Blue,
                    fontStyle = FontStyle.Normal,
                    style = MaterialTheme.typography.body1
                )
            }

        }
    }
}