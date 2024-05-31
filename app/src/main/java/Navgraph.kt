package com.example.compose_l_s

import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class Navgraph : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           com.example.compose_l_s.NavGraph()
        }
    }
}

@Composable
fun NavGraph() {
    val newController= rememberNavController()

    NavHost(navController = newController, startDestination = "") {
        composable(route="main") {
            MainActivity()
        }
        composable(route="login") {
            login()
        }
        composable(route="sign") {
            sign()
        }
    }
}


