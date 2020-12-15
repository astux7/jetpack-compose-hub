package com.example.jetpack.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.loadImageResource
import androidx.compose.ui.res.loadVectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import jp.wasabeef.composable.coil.CoilImage


class ImageLoader {
    companion object{
        @Composable
        fun fromUrl(
            url: String,
            width: Dp = 100.dp,
            height: Dp = 100.dp
        ) {
            Surface(
                modifier = Modifier
                    .preferredSize(width, height)
                    .padding(8.dp),
                shape = RoundedCornerShape(15, 15, 15, 15),
            ) {
                CoilImage(model = url)
            }
        }

        @Composable
        fun fromDrawable(
            id: Int,
            width: Dp = 100.dp,
            height: Dp = 100.dp,
            failureMessage: String = "Image is missing"
        ) {
            Surface(
                modifier = Modifier
                    .preferredSize(width, height)
                    .padding(8.dp),
                shape = RoundedCornerShape(15, 15, 15, 15),
            ) {
                loadImageResource(id = id).resource.resource?.let {
                    Image(asset = it)
                } ?: loadVectorResource(id = id).resource.resource?.let {
                    Image(asset = it)
                } ?: Text(failureMessage)
            }
        }
    }
}