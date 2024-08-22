package com.example.hotelloginsystem.screen

import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.hotelloginsystem.nav.Screens
import com.example.hotelloginsystem.presentation.profile.ProfileScreen

@Composable

fun ProfileScreen(navController: NavController){


    Button(onClick = { navController.navigate(Screens.MainScreen.route) }) {

    }



}