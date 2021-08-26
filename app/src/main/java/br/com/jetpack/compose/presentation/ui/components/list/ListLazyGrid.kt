package br.com.jetpack.compose.presentation.ui.components.list

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.jetpack.compose.data.repository.user.user
import br.com.jetpack.compose.presentation.ui.components.card.CardContainer

@ExperimentalFoundationApi
@Preview
@Composable
fun ListLazyGrid() {
    val users = listOf(user, user, user, user, user, user, user, user)

    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(16.dp),
        content = {
            itemsIndexed(
                items = users
            ) { _, item ->
                CardContainer(user = item) {}
            }
        }
    )
}