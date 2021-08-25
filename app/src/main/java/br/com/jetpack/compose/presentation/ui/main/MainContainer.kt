package br.com.jetpack.compose.presentation.ui.main

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
import br.com.jetpack.compose.presentation.home.HomeScreen
import br.com.jetpack.compose.presentation.home.HomeViewModel
import br.com.jetpack.compose.presentation.ui.components.appbar.InsetAwareTopAppBar
import br.com.jetpack.compose.presentation.ui.components.column.ColumnContainer
import br.com.jetpack.compose.presentation.ui.components.row.RowContainer
import br.com.jetpack.compose.presentation.ui.theme.AppTheme
import br.com.jetpack.compose.utils.MainDestinations

@Composable
fun MainContainer(
    homeViewModel: HomeViewModel
) {
    AppTheme(darkTheme = false) {

        val navController = rememberNavController()
        val scaffoldState = rememberScaffoldState()

        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                val title = stringResource(id = R.string.app_name)
                InsetAwareTopAppBar(
                    title = { Text(text = title) }
                )
            }
        ) {
            MainNavGraph(
                homeViewModel = homeViewModel,
                navController = navController
            )
        }
    }
}

@Composable
fun MainNavGraph(
    homeViewModel: HomeViewModel,
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
            ColumnContainer(homeViewModel)
        }
        composable(MainDestinations.ROW_CONTAINER_ROUTE) {
            RowContainer(homeViewModel)
        }
    }
}