package com.example.birthdaygreetings

import android.hardware.biometrics.BiometricManager.Strings
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaygreetings.ui.theme.BirthdayGreetingsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayGreetingsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.teal_200)
                ) {
                    GreetingText(message = "Happy Birthday Friend", from = "From Bharath,")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message : String, from : String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center
        ) {
        Text(
            text = message,
            fontSize = 70.sp,
            lineHeight = 90.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}

@Preview(showBackground = true, showSystemUi = true, name = "AnDroid")
@Composable
fun BirthdayCardPreview() {
    BirthdayGreetingsTheme {
        GreetingText(message = "Happy Birthday Friend", from = "From Bharath,")
    }
}