package com.kennedy.aspire.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kennedy.aspire.data.UserDatabase
import com.kennedy.aspire.repository.UserRepository
import com.kennedy.aspire.ui.screens.about.AboutScreen
import com.kennedy.aspire.ui.screens.auth.LoginScreen
import com.kennedy.aspire.ui.screens.auth.RegisterScreen
import com.kennedy.aspire.ui.screens.contact.ContactScreen
import com.kennedy.aspire.ui.screens.dashboard.DashBoardScreen
import com.kennedy.aspire.ui.screens.form.FormScreen
import com.kennedy.aspire.ui.screens.home.HomeScreen
import com.kennedy.aspire.ui.screens.intent.IntentScreen
import com.kennedy.aspire.ui.screens.item.ItemScreen
import com.kennedy.aspire.ui.screens.products.AddProductScreen
import com.kennedy.aspire.ui.screens.products.EditProductScreen
import com.kennedy.aspire.ui.screens.products.ProductListScreen
import com.kennedy.aspire.ui.screens.scafold.ScafoldScreen
import com.kennedy.aspire.ui.screens.splash.SplashScreen
import com.kennedy.aspire.viewmodel.AuthViewModel
import com.kennedy.aspire.viewmodel.ProductViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {

    val context = LocalContext.current
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

        composable(ROUTE_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUTE_DASHBOARD) {
            DashBoardScreen(navController)
        }
        composable(ROUTE_FORM) {
            FormScreen(navController)
        }


        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUTE_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_LOGIN) { inclusive = true }
                }
            }
        }


    //End  of Authentication

        //Products
        composable(ROUTE_ADD_PRODUCT) {
            AddProductScreen(navController, ProductViewModel)
        }

        composable(ROUTE_PRODUCT_LIST) {
            ProductListScreen(navController, ProductViewModel)
        }

        composable(
            route = ROUTE_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, ProductViewModel)
            }
        }



    }
}