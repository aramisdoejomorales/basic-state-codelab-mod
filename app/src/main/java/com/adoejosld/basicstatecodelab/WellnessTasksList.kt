package com.adoejosld.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    list: List<WellnessTask>, onCloseTask: (WellnessTask) -> Unit, modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { task -> task.id })
        { task ->
            WellnessTaskItem(
                taskName = task.label,
                onClose = { onCloseTask(task) }
            )
        }
    }
}