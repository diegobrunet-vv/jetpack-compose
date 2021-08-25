package br.com.jetpack.compose.presentation.ui.components.main

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jetpack.compose.R
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.home.HomeScreen
import br.com.jetpack.compose.presentation.ui.components.appbar.TopAppBar
import br.com.jetpack.compose.presentation.ui.components.column.ColumnContainer
import br.com.jetpack.compose.presentation.ui.components.row.RowContainer
import br.com.jetpack.compose.presentation.ui.theme.AppTheme
import br.com.jetpack.compose.utils.MainDestinations

@Composable
fun MainContainer(
    mainViewModel: MainViewModel
) {
    AppTheme(darkTheme = false) {

        val navController = rememberNavController()
        val scaffoldState = rememberScaffoldState()

        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                val title = stringResource(id = R.string.app_name)
                TopAppBar(
                    title = { Text(text = title) }
                )
            }
        ) {
            MainNavGraph(
                mainViewModel = mainViewModel,
                navController = navController
            )
        }
    }
}

@Composable
fun MainNavGraph(
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