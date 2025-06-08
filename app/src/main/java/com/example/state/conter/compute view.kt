package com.example.state.conter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.state.viewModel.CounterViewModel
import org.koin.androidx.compose.koinViewModel


@Composable
fun CounterScreen(viewModel: CounterViewModel = koinViewModel(), modifier: Modifier=Modifier) {
    val state by viewModel.state.collectAsState()
    computeContent(
        state.toString(),
        onClickPlus = { viewModel::onInceasCounter },
        onClickminus = { viewModel::ondeceasCounter }
    )
}

@Composable
private fun computeContent(
    counter: String,
    modifier: Modifier = Modifier,
    onClickPlus: () -> Unit,
    onClickminus: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = counter,//the text must be a string>>>>>>>>>>>> يتم اعادة استدعاءها لان
                fontSize = 96.sp
            )
            Row {
                Button(onClick = onClickminus) {
                    Text(text = "-", fontSize = 48.sp)
                }
                Spacer(Modifier.width(16.dp))
                Button(onClick = onClickPlus) {
                    Text(text = "+", fontSize = 48.sp)
                }
            }
        }
    }
}




