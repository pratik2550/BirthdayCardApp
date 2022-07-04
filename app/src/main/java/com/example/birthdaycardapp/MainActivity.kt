    package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayCardGreetingWithText(message = "Pratik", from = "Kiki")
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