package com.example.compose_l_s

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun login() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),

        ) {
        Text(
            onTextLayout = { result ->
            },
            text = "WorkNgine",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier.padding(30.dp)
        )
        Text(
            text = "Connection",
            onTextLayout = { result ->
            },
            fontSize = 32.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 30.dp)
        )
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fames consequat eros, diam, eu morbi vehicula.",
            onTextLayout = { result ->
            },
            color = Color.White,
            fontSize = 16.5.sp,
            modifier = Modifier.padding(30.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},

            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 40.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},

            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )


        Text(
            onTextLayout = { result ->
            },
            text = "Forgot Passward ?",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .padding(30.dp)
                .align(Alignment.End),
        )

        Button(
            onClick = { /* TODO: Handle login */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 20.dp)
        ) {
            Text(
                onTextLayout = {result ->},
                text = "Login",)
        }

        Text(
            onTextLayout = { result ->
            },
            text = "Don't have account ? Registor",
            color = Color.Yellow,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 25.dp)
                .align(Alignment.Start)
        )
        Text(
            onTextLayout = { result ->
            },
            text = "Powered by xenone search",
            color = Color.White,
            fontSize = 17.sp,
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 80.dp).align(Alignment.CenterHorizontally),
        )
    }
}









