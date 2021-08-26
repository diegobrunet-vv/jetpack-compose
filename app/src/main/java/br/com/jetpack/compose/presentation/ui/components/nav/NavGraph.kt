package br.com.jetpack.compose.presentation.ui.components.nav

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.home.HomeScreen
import br.com.jetpack.compose.presentation.ui.components.column.ColumnContainer
import br.com.jetpack.compose.presentation.ui.components.list.ListLazyColumn
import br.com.jetpack.compose.presentation.ui.components.list.ListLazyGrid
import br.com.jetpack.compose.presentation.ui.components.list.ListLazyRow
import br.com.jetpack.compose.presentation.ui.components.row.RowContainer
import br.com.jetpack.compose.utils.ComponentsDestinations

@ExperimentalFoundationApi
@Composable
fun NavGraph(
    mainViewModel: MainViewModel,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ComponentsDestinations.HOME_ROUTE
) {

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ComponentsDestinations.HOME_ROUTE) {
            HomeScreen(navController = navController)
        }
        composable(ComponentsDestinations.COLUMN_CONTAINER_ROUTE) {
            ColumnContainer(mainViewModel)
        }
        composable(ComponentsDestinations.ROW_CONTAINER_ROUTE) {
            RowContainer(mainViewModel)
        }
        composable(ComponentsDestinations.LAZY_LIST_VERTICAL_CONTAINER_ROUTE) {
            ListLazyColumn()
        }
        composable(ComponentsDestinations.LAZY_LIST_HORIZONTAL_CONTAINER_ROUTE) {
            ListLazyRow()
        }
        composable(ComponentsDestinations.LAZY_GRID_CONTAINER_ROUTE) {
            ListLazyGrid()
        }
    }
}