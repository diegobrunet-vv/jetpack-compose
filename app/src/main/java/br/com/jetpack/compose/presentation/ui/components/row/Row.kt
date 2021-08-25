package br.com.jetpack.compose.presentation.ui.components.row

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.jetpack.compose.data.model.User
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.ui.theme.Purple200
import br.com.jetpack.compose.presentation.ui.theme.Purple500

private lateinit var user: User

@Composable
fun RowContainer(mainViewModel: MainViewModel) {
    mainViewModel.user.value?.let { user = it }
    RowContainerView()
}

@Preview
@Composable
fun RowContainerView() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = user.name,
                color = Purple500,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.padding(end = 5.dp))
            Text(
                text = user.username,
                color = Purple200,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.padding(end = 5.dp))
            Text(
                text = user.job,
                color = Purple500,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body1
            )
        }

    }
}