package com.example.hotelloginsystem.nav


sealed class Screens(val route: String) {
    data object LoginScreen:Screens(route = "login" )
    data object ProfileScreen:Screens(route = "profile" )
    data object HotelLoginScreen:Screens(route = "login_screen")
    data object DashboardScreen:Screens(route = "dashboard_screen")
    data object MainScreen:Screens(route = "main_screen")
    data object AddDataScreen:Screens(route = "add_data_screen")
    data object GetDataScreen:Screens(route = "get_data_screen")
    data object ForgotPasswordScreen:Screens(route = "forgot_password_screen")
    data object ResetPasswordSuccessScreen:Screens(route = "reset_password_success_screen")
}
