package com.example.clase2_jetpack_compose.ControllerNavegation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.clase2_jetpack_compose.screen.Main1
import com.example.clase2_jetpack_compose.screen.Main2
import com.example.clase2_jetpack_compose.screen.Main3
import com.example.paginacion.screen.LazyContent

@Composable

fun NavComponent(){
    val navegationController = rememberNavController()
    NavHost(navController = navegationController, startDestination = "view_1"){
        composable(route = "view_1"){
            Ventanas(navegationController)
        }
        composable(route = "view_2"){
            LazyContent(navegationController)
        }
    }
}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Ventanas(navigation: NavHostController) {
    val pagerState = rememberPagerState (initialPage = 0) {
        3
    }
    Box(modifier = Modifier){
        HorizontalPager(state = pagerState) {
            page -> when(page){
                0 -> Main1()
                1 -> Main2()
                2 -> Main3(navigation)
            }
        }
    }
}