package com.adoejosld.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter(counter: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(10.dp)) {

        if (counter > 0) {
            Text(text = "You've had $counter glasses.")
        }
        Button(
            onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = counter < 10
        )
        {
            Text(text = "Add One")
        }
    }
}

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var waterCount by rememberSaveable { mutableIntStateOf(0) }
    Column {
        StatelessCounter(waterCount, onIncrement = { waterCount++ }, modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    StatefulCounter()
}