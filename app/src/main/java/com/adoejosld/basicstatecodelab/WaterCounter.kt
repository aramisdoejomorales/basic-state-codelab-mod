package com.adoejosld.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(16.dp)) {
        val counter: MutableState<Int> = remember { mutableIntStateOf(0) }
        Text(text = "You've had ${counter.value} glasses.")
        Button(onClick = { counter.value++ }, modifier = modifier.padding(top = 8.dp)) {
            Text(text = "Add One")
        }
        Button(onClick = { counter.value = 0 }, modifier = modifier.padding(top = 8.dp)) {
            Text(text = "Clear")
        }
    }
}

@Preview
@Composable
fun WaterCounterPreview() {
    WaterCounter()
}