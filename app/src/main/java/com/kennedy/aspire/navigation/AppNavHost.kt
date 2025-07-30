package com.kennedy.aspire.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kennedy.aspire.ui.screens.about.AboutScreen
import com.kennedy.aspire.ui.screens.contact.ContactScreen
import com.kennedy.aspire.ui.screens.home.HomeScreen
import com.kennedy.aspire.ui.screens.item.ItemScreen
import com.kennedy.aspire.ui.screens.scafold.ScafoldScreen
import com.kennedy.aspire.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUTE_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_SCAFOLD) {
            ScafoldScreen(navController)
        }




    }
}