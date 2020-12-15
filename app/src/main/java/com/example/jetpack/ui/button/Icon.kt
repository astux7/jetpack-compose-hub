package com.example.jetpack.ui.button

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import com.example.jetpack.ui.ImageLoader

class Icon(val resourceId: Int, val event: () -> Unit = {}) {

    @Composable
    fun render() {
        Button (
            onClick = event
        ){
            ImageLoader.fromDrawable(id = resourceId)
        }

    }
}