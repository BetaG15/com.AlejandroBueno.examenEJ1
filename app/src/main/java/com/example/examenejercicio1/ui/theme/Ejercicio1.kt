package com.example.examenejercicio1.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.examenejercicio1.Videojuego
import coil.compose.AsyncImage


val VideoJuegos = listOf(
    Videojuego("videojuego1", 75.0f, "https://loremflickr.com/400/400/seville?lock=1"),
    Videojuego("videojuego2", 50.0f, "https://loremflickr.com/400/400/seville?lock=2"),
    Videojuego("videojuego3", 100.0f, "https://loremflickr.com/400/400/seville?lock=3"),
    Videojuego("videojuego4", 25.0f, "https://loremflickr.com/400/400/seville?lock=4"),
    Videojuego("videojuego5", 45.99f, "https://loremflickr.com/400/400/seville?lock=5"),
    )

@Composable
fun Ejercicio1() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            items(VideoJuegos) { videojuego ->
                Videojuegos(videojuego = videojuego)
            }
        }
    }
}

@Composable
fun Videojuegos(videojuego: Videojuego) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        AsyncImage(
            model = videojuego.imagenUrl,
            contentDescription = null,
            modifier = Modifier.padding(16.dp)
        )
        Text(text = videojuego.nombre)
        Text(text = videojuego.precio.toString())
    }
}


