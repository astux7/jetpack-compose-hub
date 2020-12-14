package com.example.jetpack.ui.text

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


interface Text

class Title(val text: String): Text {
    @Composable
    fun render() {
        Text(
            text,
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 0.dp,
                    bottom = 8.dp
                )
        )
    }
}

class Body(val text: String): Text {
    @Composable
    fun render() {
        Text(
            text = text,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 0.dp,
                    bottom = 8.dp
                )
                .preferredWidth(200.dp),
            style = MaterialTheme.typography.body1,
            fontSize = TextUnit.Sp(16)
        )
    }
}