    package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaycardapp.ui.theme.BirthdayCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAppTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Hello Android")
                            },
                            navigationIcon = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(Icons.Filled.Menu, contentDescription = "menu")
                                }
                            },
                            actions = {
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(Icons.Filled.Notifications, contentDescription = "notific")
                                }
                                IconButton(onClick = { /*TODO*/ }) {
                                    Icon(Icons.Filled.Search, contentDescription = "search")
                                }
                            }
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { /*TODO*/ }) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Add, contentDescription = "Add")
                            }
                        }
                    }
                ) {
                    BirthdayCardGreetingWithText(message = "Happy Birthday Pratik", from = "Kiki")
                }

            }
        }
    }
}



@Composable
fun BirthdayCardGreetingWithText(message: String, from:String) {
    Column {
        Text(text = message, fontSize = 36.sp)
        Text(text = "-from $from", fontSize = 24.sp)
    }
}

@Preview(showBackground = true, name = "card")
@Composable
fun BirthdayCardGreetingWithTextPreview() {
    BirthdayCardAppTheme {
        BirthdayCardGreetingWithText(message = "Happy Birthday Kiki", from = "Pratik")
    }
}