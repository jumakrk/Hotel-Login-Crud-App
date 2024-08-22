package com.example.hotelloginsystem.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hotelloginsystem.screen.AddDataScreen
import com.example.hotelloginsystem.screen.DashboardScreen
import com.example.hotelloginsystem.screen.ForgotPasswordScreen

import com.example.hotelloginsystem.screen.GetDataScreen
import com.example.hotelloginsystem.screen.HotelLoginScreen
import com.example.hotelloginsystem.screen.LoginScreen
import com.example.hotelloginsystem.screen.MainScreen
import com.example.hotelloginsystem.screen.ProfileScreen
import com.example.hotelloginsystem.screen.ResetPasswordSuccessScreen
import com.example.hotelloginsystem.utils.SharedViewModel

@Composable
fun NavGraph(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screens.HotelLoginScreen.route
    ) {

        composable(

            route = Screens.LoginScreen.route
        ){
            LoginScreen(navController = navController)


        }

        composable(
            route = Screens.ForgotPasswordScreen.route
        ){
            ForgotPasswordScreen(navController = navController)
        }

        composable(
            route = Screens.ResetPasswordSuccessScreen.route
        ){
            ResetPasswordSuccessScreen(navController = navController)
        }

        composable(

            route = Screens.ProfileScreen.route
        ){

           ProfileScreen(navController = navController)
        }

        composable(
            route = Screens.HotelLoginScreen.route
        ) {
            HotelLoginScreen(navController = navController)
        }
//        dashboard
        composable(
            route = Screens.DashboardScreen.route
        ){
            DashboardScreen(navController = navController)
        }
        // main screen
        composable(
            route = Screens.MainScreen.route
        ) {
            MainScreen(
                navController = navController,

            )
        }
        // get data screen
        composable(
            route = Screens.GetDataScreen.route
        ) {
            GetDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
        // add data screen
        composable(
            route = Screens.AddDataScreen.route
        ) {
            AddDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
    }
}