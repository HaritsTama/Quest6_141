package com.example.myarsitekturmvvm.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import org.jetbrains.annotations.ApiStatus
import java.lang.reflect.Modifier

@Composable
fun FormSiswa(
    pilihanJK : List<String>,
    onSubmitButtonClicked : (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
){
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by remember{ mutableStateOf("") }
    var txtGender by remember { mutableStateOf("") }
    var listData by MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

}