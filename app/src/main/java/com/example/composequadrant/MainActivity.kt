package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant(
                        headingOne = stringResource(R.string.text_composable),
                        headingTwo = stringResource(R.string.image_composable),
                        headingThree = stringResource(R.string.row_composable),
                        headingFour = stringResource(R.string.column_composable),
                        quadrantOne = stringResource(R.string.quadrant_one),
                        quadrantTwo = stringResource(R.string.quadrant_two),
                        quadrantThree = stringResource(R.string.quadrant_three),
                        quadrantFour = stringResource(R.string.quadrant_four)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(headingOne: String,
                    headingTwo: String,
                    headingThree: String,
                    headingFour: String,
                    quadrantOne: String,
                    quadrantTwo: String,
                    quadrantThree: String,
                    quadrantFour: String,
                    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f) // Take up 50% of the horizontal space
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)

            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = headingOne,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = quadrantOne
                    )
                }
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f) // Take up 50% of the horizontal space
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = headingTwo,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = quadrantTwo
                    )
                }
            }
        }
        Row(
            modifier = Modifier.weight(1f) // Take up the remaining 50% vertical space
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)

            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = headingThree,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = quadrantThree
                    )
                }
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )  {
                    Text(
                        text = headingFour,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                    )
                    Text(
                        text = quadrantFour
                    )
                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant(
            headingOne = stringResource(R.string.text_composable),
            headingTwo = stringResource(R.string.image_composable),
            headingThree = stringResource(R.string.row_composable),
            headingFour = stringResource(R.string.column_composable),
            quadrantOne = stringResource(R.string.quadrant_one),
            quadrantTwo = stringResource(R.string.quadrant_two),
            quadrantThree = stringResource(R.string.quadrant_three),
            quadrantFour = stringResource(R.string.quadrant_four)
        )
    }
}