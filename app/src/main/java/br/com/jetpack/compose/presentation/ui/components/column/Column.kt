package br.com.jetpack.compose.presentation.ui.components.column

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.jetpack.compose.R
import br.com.jetpack.compose.data.model.User
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.ui.theme.Purple500
import br.com.jetpack.compose.utils.NO_CONTENT

private var userData: User? = null


@Composable
fun ColumnContainer(
    mainViewModel: MainViewModel
) {
    val user = mainViewModel.user.value
    user?.let { userData = it }
    ColumnView()
}

@Preview
@Composable
fun ColumnView(
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Card(
                modifier = Modifier.size(48.dp),
                shape = CircleShape,
                elevation = 2.dp,
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Image(
                    painterResource(R.drawable.ic_android),
                    contentDescription = "icon android",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.padding(top = 5.dp))
            Text(
                text = userData?.name ?: NO_CONTENT,
                color = Purple500,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body1,
            )
            Spacer(modifier = Modifier.padding(top = 3.dp))
            Text(
                text = userData?.job ?: NO_CONTENT,
                color = Purple500,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body2
            )
        }
    }
}

