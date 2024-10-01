package br.senai.sp.jandira.transportaweb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.transportaweb.screens.HistoricoViagens
import br.senai.sp.jandira.transportaweb.screens.Login
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TransportaWebTheme {
                val ControleDeNavegacao = rememberNavController()
                NavHost(
                    navController = ControleDeNavegacao,
                    startDestination = "login"
                ){
                    composable(route = "login"){ Login(ControleDeNavegacao) }
                    composable(route = "historicoViagens"){ HistoricoViagens(ControleDeNavegacao) }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TransportaWebTheme {
        Greeting("Android")
    }
}