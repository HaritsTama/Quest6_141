package com.example.myarsitekturmvvm.view

import androidx.compose.runtime.Composable
import org.jetbrains.annotations.ApiStatus
import java.lang.reflect.Modifier

@Composable
fun FormSiswa(
    pilihanJK : List<String>,
    onSubmitButtonClicked : (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
){}