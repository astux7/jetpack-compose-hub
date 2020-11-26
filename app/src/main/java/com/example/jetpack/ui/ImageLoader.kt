package com.example.jetpack.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import jp.wasabeef.composable.coil.CoilImage


class ImageLoader {
    companion object{
        @Composable
        fun fromUrl(url: String) {
            Surface(
                modifier = Modifier
                    .preferredSize(150.dp, 150.dp)
                    .padding(
                        start = 0.dp,
                        top = 8.dp,
                        end = 16.dp,
                        bottom = 0.dp
                    ),
                shape = RoundedCornerShape(15, 15, 15, 15),
            ) {
                CoilImage(model = url)
            }
        }
    }
}