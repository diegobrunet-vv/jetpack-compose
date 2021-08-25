package br.com.jetpack.compose.presentation.ui.components.row

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.jetpack.compose.data.model.User
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.ui.theme.Purple200
import br.com.jetpack.compose.presentation.ui.theme.Purple500
import br.com.jetpack.compose.utils.NO_CONTENT
import com.google.accompanist.insets.imePadding

private var user: User? = null

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
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = user?.name ?: NO_CONTENT,
                color = Purple500,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .fillMaxWidth(0.3F)
                    .align(Alignment.CenterVertically)
                    .background(Color(0XFFE2E2E2))
            )
            Text(
                text = user?.username ?: NO_CONTENT,
                color = Purple200,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .fillMaxWidth(0.4F)
                    .align(Alignment.CenterVertically)
                    .background(Color(0XFFE6E6E6))
            )
            Text(
                text = user?.job ?: NO_CONTENT,
                color = Purple500,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .fillMaxWidth(0.7F)
                    .align(Alignment.CenterVertically)
                    .background(Color(0XFFE9E9E9))
            )
        }
    }
}