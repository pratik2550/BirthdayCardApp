package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    val painter = painterResource(id = R.drawable.jonny)
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .padding(16.dp)
                    ) {
                        ImageCard(painter, contentDescription = "My Image", title = "Pratik")
                    }
//                    ShowSwitch()
//                    BirthdayCardGreetingWithText(message = "Happy Birthday Pratik", from = "Kiki")
                }

            }
        }
    }
}


@Composable
fun BirthdayCardGreetingWithText(message: String, from: String) {
    Column {
        Text(text = message, fontSize = 36.sp)
        Text(text = "-from $from", fontSize = 24.sp)
    }
}

@Preview(showBackground = true, name = "card")
@Composable
fun BirthdayCardGreetingWithTextPreview() {
    BirthdayCardAppTheme {
//        ShowSwitch()
        val painter = painterResource(id = R.drawable.jonny)
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)
        ) {
            ImageCard(
                painter,
                contentDescription = "My Image",
                title = "Jonny is playing with snow"
            )
        }
//        BirthdayCardGreetingWithText(message = "Happy Birthday Kiki", from = "Pratik")
    }
}

@Composable
fun ShowSwitch() {
    val isCheck = remember {
        mutableStateOf(true)
    }
    Switch(
        checked = isCheck.value,
        onCheckedChange = {
            isCheck.value = it
        },
        modifier = Modifier.run {
            size(40.dp)
            padding(100.dp)
        }
    )
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(Color.White, fontSize = 16.sp))
            }
        }
    }
}