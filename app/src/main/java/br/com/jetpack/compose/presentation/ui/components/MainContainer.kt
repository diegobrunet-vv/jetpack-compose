package br.com.jetpack.compose.presentation.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import br.com.jetpack.compose.R
import br.com.jetpack.compose.presentation.MainViewModel
import br.com.jetpack.compose.presentation.ui.components.appbar.TopAppBar
import br.com.jetpack.compose.presentation.ui.components.nav.NavGraph
import br.com.jetpack.compose.presentation.ui.theme.AppTheme

@ExperimentalFoundationApi
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
            NavGraph(
                mainViewModel = mainViewModel,
                navController = navController
            )
        }
    }
}

