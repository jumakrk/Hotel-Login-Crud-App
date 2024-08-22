package com.example.hotelloginsystem.screen


import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.*
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.hotelloginsystem.R
import com.example.hotelloginsystem.nav.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController)
{
Scaffold(
    topBar = {
        TopAppBar(
            title = { Text("Sarova Hotel Dashboard" )},
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Menu, contentDescription = "Hamburger Menu")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White
            )
        )
    }
) {paddingValues ->
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
//        hotel logo

     Image(
         modifier = Modifier
             .size(100.dp)
             .clip(CircleShape),
         painter = painterResource(R.drawable.sarova_icon_scaled), contentDescription ="Hotel Logo"
     )
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = "Today's Bookings",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                    )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "25 Rooms Booked",
                    style = MaterialTheme.typography.bodyMedium
                    )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = "Recent Activity",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Check-in completed for Room 102",
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "Room service requested for room 210",
                    style = MaterialTheme.typography.bodyMedium
                )

                Spacer(modifier = Modifier.height(30.dp))
                
//                navigate back to main screen
                Button(onClick = {navController.navigate(Screens.MainScreen.route)}) {
                    Text(text = "Go Back")
                }
            }
        }

    }

}


}