package com.jacrosdevs.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.navigation.screens.DownScreen
import com.jacrosdevs.navigation.screens.InitScreen
import com.jacrosdevs.navigation.screens.LeftScreen
import com.jacrosdevs.navigation.screens.RightScreen
import com.jacrosdevs.navigation.screens.UpScreen

@Composable
fun NavigatorHostController(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "init"

    ) {
        //////////////////////////////////////
        composable(
            route = Screens.InitScreen.name
        ) { InitScreen(navController) }

        //////////////////////////////////////////
        composable(
            route = Screens.UpScreen.name,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(700)

                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(700)

                )
            }

        ) { UpScreen(navController) }

        ///////////////////////////////////////////////////////////////
        composable(
            route = Screens.LeftScreen.name,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)

                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            }
        ) { LeftScreen(navController) }
        ////////////////////////////////////////////////////////////////
        composable(
            route = Screens.DownScreen.name,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(700)

                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(700)
                )
            }
        ) { DownScreen(navController) }
        ///////////////////////////////////////////////////////////////////////
        composable(
            route = Screens.RightScreen.name,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)

                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            }
        ) { RightScreen(navController) }

    }

}
