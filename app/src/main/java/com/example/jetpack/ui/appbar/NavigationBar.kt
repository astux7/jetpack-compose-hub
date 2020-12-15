package com.example.jetpack.ui.appbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.FabPosition
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import com.example.jetpack.R
import com.example.jetpack.ui.ImageLoader

class NavigationBar {

    @Preview
    @Composable
    fun render() {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ) {
                ImageLoader.fromDrawable(R.drawable.ic_launcher_background)
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ){
                ImageLoader.fromDrawable(R.drawable.ic_launcher_background)
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ){
                ImageLoader.fromDrawable(R.drawable.ic_launcher_background)
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ){
                ImageLoader.fromDrawable(R.drawable.ic_launcher_background)
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
             ){
                ImageLoader.fromDrawable(R.drawable.ic_launcher_background)
            }
        }
    }
}