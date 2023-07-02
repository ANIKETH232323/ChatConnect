package com.example.chatu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatu.view.chat_menu.HomeView
import com.example.chatu.view.login.LoginView
import com.example.chatu.view.register.RegisterView
import com.example.chatu.nav.Action
import com.example.chatu.nav.Destination.Home
import com.example.chatu.nav.Destination.Login
import com.example.chatu.nav.Destination.Register
import com.example.chatu.nav.Destination.Welcome
import com.example.chatu.ui.theme.ChatUTheme
import com.example.chatu.welcome.welcomeView
import com.google.firebase.auth.FirebaseAuth


/**
 * The main Navigation composable which will handle all the navigation stack.
 */

// this ia nav graph

@Composable
fun NavComposeApp() {
    val navController = rememberNavController()
    val actions = remember(navController) { Action(navController) }
    ChatUTheme {
        NavHost(
            navController = navController,
            startDestination =
            if (FirebaseAuth.getInstance().currentUser != null)
                Home
            else
                Welcome
        ) {
            composable(Welcome) {
                welcomeView(
                    register = actions.register,
                    login = actions.login
                )
            }
            composable(Register) {
                RegisterView(
                    home = actions.home,
                    back = actions.navigateBack
                )
            }
            composable(Login) {
                LoginView(
                    home = actions.home,
                    back = actions.navigateBack
                )
            }
            composable(Home) {
                HomeView()
            }
        }
    }
}