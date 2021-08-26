package br.com.jetpack.compose.presentation.ui.components.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.jetpack.compose.data.repository.user.user
import br.com.jetpack.compose.presentation.ui.components.card.CardContainer

@Preview
@Composable
fun ListLazyColumn() {
    val users = listOf(user, user, user, user)

    LazyColumn {
        itemsIndexed(
            items = users
        ) { _, item ->
            CardContainer(user = item) {}
        }
    }
}