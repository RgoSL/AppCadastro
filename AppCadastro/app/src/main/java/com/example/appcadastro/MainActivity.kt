package com.example.appcadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcadastro.ui.theme.AppCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Nome") }
    )

}

@Composable
fun App(){
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "App Cadastro")

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            SimpleOutlinedTextFieldSample()

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            SimpleOutlinedTextFieldSample()

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            SimpleOutlinedTextFieldSample()

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            SimpleOutlinedTextFieldSample()

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            SimpleOutlinedTextFieldSample()

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cadastrar")

            }

        }

    }
}

@Preview
@Composable
fun AppPreview(){
    AppCadastroTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }


}