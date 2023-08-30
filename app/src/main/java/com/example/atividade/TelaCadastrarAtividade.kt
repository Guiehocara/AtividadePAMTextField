package com.example.atividade

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun TelaCadastrarAtividade(){
    var valor by remember {
        mutableStateOf("")
    }
    var valorDescricao by remember{
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Digite o nome da Atividade")
        Spacer(modifier = Modifier.height(10.dp))
        TextField(value = "$valor", onValueChange = {valor = it})
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Descrição da atividade")
        Spacer(modifier = Modifier.height(10.dp))
        TextField(value = "$valorDescricao", onValueChange = {valorDescricao = it})
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Enviar")
        }
    }
}