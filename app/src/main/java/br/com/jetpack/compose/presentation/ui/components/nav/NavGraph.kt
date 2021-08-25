package br.com.jetpack.compose.presentation.ui.components.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.home.HomeScreen
import br.com.jetpack.compose.presentation.ui.components.column.ColumnContainer
import br.com.jetpack.compose.presentation.ui.components.row.RowContainer
import br.com.jetpack.compose.utils.MainDestinations

@Composable
fun NavGraph(
    mainViewModel: MainViewModel,
    navController: NavHostController = rememberNavController(),
    startDestination: String = MainDestinations.HOME_ROUTE
) {

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(MainDestinations.HOME_ROUTE) {
            HomeScreen(navController = navController)
        }
        composable(MainDestinations.COLUMN_CONTAINER_ROUTE) {
            ColumnContainer(mainViewModel)
        }
        composable(MainDestinations.ROW_CONTAINER_ROUTE) {
            RowContainer(mainViewModel)
        }
    }
}