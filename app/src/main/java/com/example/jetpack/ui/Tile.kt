package com.example.jetpack.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.jetpack.ui.button.Secondary
import com.example.jetpack.ui.text.Body
import com.example.jetpack.ui.text.Title

interface Tile


class Primary(val title: String, val body: String, val imageUrl: String? = null, val actionArea: ActionArea? = null): Tile {

    @Composable
    fun render() {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    top = 16.dp,
                    end = 24.dp,
                    bottom = 16.dp
                ),
            color = Color.White
        ) {
            Column {
                Row {
                    Column {
                        Title(title).render()
                        Body(body).render()
                    }
                    imageUrl?.let {url ->
                        ImageLoader.fromUrl(url)
                    }
                }
                actionArea?.render()
            }
        }
    }
}