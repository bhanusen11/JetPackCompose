package com.helloword

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello Welcome jetpack compose")
            Text("I am Exciting  Welcome jetpack compose")
        }
    }
}


/*Jetpack Compose is built around composable functions.
These functions let you define your app's UI programmatically
 by describing how it should look and providing
  data dependencies, rather than focusing on the process
  of the UI's construction (initializing an element,
   attaching it to a parent, etc.). To create a composable function,
just add the @Composable annotation to the function name.*/





