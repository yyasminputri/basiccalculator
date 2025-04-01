package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.background
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var num1 by remember { mutableStateOf(value = "0") }
            var num2 by remember { mutableStateOf(value = "0") }
            var result by remember { mutableStateOf("0") }
            val buttonColor = Color(0xFFFFDDEB) // Baby Pink
            val textFieldColor = Color(0xFFFFF0F5) // Lighter Baby Pink

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Basic Calculator App",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    TextField(value = num1, onValueChange = {
                        num1 = it
                    },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = textFieldColor,
                            unfocusedContainerColor = textFieldColor
                        )
                    )
                    TextField(value = num2, onValueChange = {
                        num2 = it
                    },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = textFieldColor,
                            unfocusedContainerColor = textFieldColor
                        ))
                    Spacer(modifier = Modifier.height(32.dp))
                    Row {
                        Button(
                            onClick = { result = (num1.toInt() + num2.toInt()).toString() },
                            colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
                        ) {
                            Text(text = "Add", color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(
                            onClick = { result = (num1.toInt() - num2.toInt()).toString() },
                            colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
                        ) {
                            Text(text = "Sub", color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(
                            onClick = { result = (num1.toInt() * num2.toInt()).toString() },
                            colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
                        ) {
                            Text(text = "Mul", color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(
                            onClick = { result = (num1.toInt() / num2.toInt()).toString() },
                            colors = ButtonDefaults.buttonColors(containerColor = buttonColor)
                        ) {
                            Text(text = "Div", color = Color.Black)
                        }
                    }
                    Spacer(modifier = Modifier.height(32.dp))

                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .background(Color(0xFFFFDDEB), shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = result,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "By : Yasmin Putri",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
        }
    }
}