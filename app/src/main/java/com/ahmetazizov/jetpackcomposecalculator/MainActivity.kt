package com.ahmetazizov.jetpackcomposecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmetazizov.jetpackcomposecalculator.ui.theme.JetpackComposeCalculatorTheme
import kotlinx.coroutines.GlobalScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    calculator()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeCalculatorTheme {
        calculator()
    }
}


@Composable
fun calculator() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                fontSize = 60.sp,
                textAlign = TextAlign.End,
                maxLines = 2,
                text = "123"
            )


            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "1"
                )

                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "2"
                )

                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "3"
                )

                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "4"
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "1"
                )

                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "2"
                )

                calculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    text = "3"
                )

                calculatorButton(
                    modifier = Modifier
                        .aspectRatio(1f).weight(1f)
                    ,
                    text = "4"
                )
            }
        }
    }
}


@Composable
fun calculatorButton(
    modifier: Modifier = Modifier,
    text: String
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(100.dp))
            .background(Color.Gray)
    ) {
        Text(
            text = text
        )
    }
}