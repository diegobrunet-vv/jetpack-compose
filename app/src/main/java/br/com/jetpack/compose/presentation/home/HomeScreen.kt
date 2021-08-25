package br.com.jetpack.compose.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.jetpack.compose.utils.MainDestinations

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Column(modifier = Modifier.padding(16.dp)) {

        Button(onClick = { navController.navigate(MainDestinations.COLUMN_CONTAINER_ROUTE) }) {
            Text(text = "Column sample")
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Button(onClick = { navController.navigate(MainDestinations.ROW_CONTAINER_ROUTE) }) {
            Text(text = "Row sample")
        }
    }
}