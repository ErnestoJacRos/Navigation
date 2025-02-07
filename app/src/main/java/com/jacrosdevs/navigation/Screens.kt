package com.jacrosdevs.navigation

sealed class Screens(val name: String) {
    object InitScreen: Screens(name ="init")
    object UpScreen: Screens(name = "up")
    object DownScreen: Screens(name = "down")
    object LeftScreen: Screens(name ="left")
    object RightScreen: Screens(name  ="right")

}