package com.adoejosld.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column (modifier){
        StatefulCounter(modifier)
        Spacer(modifier = Modifier.height(12.dp))
        WellnessTaskList()
    }
}