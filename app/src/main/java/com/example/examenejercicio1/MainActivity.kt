package com.example.examenejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.examenejercicio1.ui.theme.Ejercicio1
import com.example.examenejercicio1.ui.theme.ExamenEjercicio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEjercicio1Theme(
                darkTheme = false,
            ) {
                Ejercicio1()
            }
        }
    }
}