package com.jacrosdevs.navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.jacrosdevs.navigation.Screens

@Composable
fun RightScreen(
    navController: NavController,
    modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
            .background(Color.Magenta)
    ) {
        Text(
            text = "Vuelve",
            modifier = Modifier.clickable {
                navController.popBackStack()
            }
        )

    }
}