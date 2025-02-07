package com.jacrosdevs.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.navigation.Screens

@Composable
fun InitScreen(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(

            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = {
                        navController.navigate(Screens.UpScreen.name)
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowUp,
                            contentDescription = "Up",
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                ) {

                    IconButton(onClick = {
                        navController.navigate(Screens.LeftScreen.name)
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Left",
                            modifier = Modifier.size(50.dp)
                        )
                    }

                    IconButton(onClick = {
                        navController.navigate(Screens.RightScreen.name)
                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "Right",
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    IconButton(onClick = {
                        navController.navigate(Screens.DownScreen.name)

                    }) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Down",
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview()
@Composable
fun PreviewInit(modifier: Modifier = Modifier) {
    InitScreen(navController = rememberNavController())
}