package com.example.dam2_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dam2_jetpack_compose.ui.theme.DAM2jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  Esto es lo que yo veo en mi app cuando buildee
        setContent {
            MyText(text = "Hola mundo")
            MyText(text = "Estamos desde UCES")
        }
    }

    @Composable
    fun MyTexts(){

        Column {
            MyText(text = "Hola mundo con Jetpack")
            MyText(text = "Desde UCES")
        }
    }

    @Composable
    fun MyImage(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Imagen de prueba")
    }

    //  JPC usa mayúsculas para nombrar funciones
    @Composable //  Elemento visual que voy a querer mostrar en la interfaz para el usuario
    fun MyText(text:String){
        Text(text = text)
    }


    @Preview
    @Composable
    fun PreviewComponents(){

        MyImage()
        MyTexts()
    }
}