package com.example.composequadrantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrantapp.ui.theme.ComposeQuadrantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeCard(composeTitle: String, composeDesc: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        Text(
            text = composeTitle,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = composeDesc,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposeCard(
                composeTitle = stringResource(id = R.string.text_composable_title),
                composeDesc = stringResource(id = R.string.text_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFEADDFF))
            )
            ComposeCard(
                composeTitle = stringResource(id = R.string.image_composable_title),
                composeDesc = stringResource(id = R.string.image_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFD0BCFF))
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposeCard(
                composeTitle = stringResource(id = R.string.row_composable_title),
                composeDesc = stringResource(id = R.string.row_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFB69DF8))
            )
            ComposeCard(
                composeTitle = stringResource(id = R.string.column_composable_title),
                composeDesc = stringResource(id = R.string.column_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFF6EDFF))
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantAppTheme {
        ComposeQuadrant()
    }
}