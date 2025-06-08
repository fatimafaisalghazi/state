package com.example.state

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun start(modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        var inputtext by rememberSaveable {
            mutableStateOf("")
        }
        TextField(value = inputtext, onValueChange = {
            // لمن تضغط على حرف بالكيبورد راح يصير call  على ال on value change  وال on value change بيها ال ات اللي هو الحرف الجديد اللي انت دخلته ف الانبت تيكست هسة صارت تحتوي شكو حرف انت تدخله
            inputtext = it //every change on the text it is it ,,
        })
    }
}