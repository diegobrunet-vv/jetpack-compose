package br.com.jetpack.compose.presentation.ui.components.list

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.jetpack.compose.data.repository.user.user
import br.com.jetpack.compose.presentation.ui.components.card.CardContainer

@Preview
@Composable
fun ListLazyRow() {
    val users = listOf(user, user, user, user)

    LazyRow {
        itemsIndexed(
            items = users
        ) { _, item ->
            CardContainer(user = item) {}
        }
    }
}