package com.example.jetpack.ui.appbar

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
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
                ImageLoader.fromUrl("https://image.flaticon.com/icons/png/512/69/69524.png")
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ){
                Column {
                    ImageLoader.fromUrl("https://www.favicon.cc/logo3d/805857.png")
                    Text("TV")
                }
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ){
                Column {
                    ImageLoader.fromUrl("https://img.icons8.com/plasticine/2x/wifi-router.png")
                    Text("Broadband")
                }
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
            ){
                Column {
                    ImageLoader.fromUrl("https://icons-for-free.com/iconfiles/png/512/contact+mobile+phone+telephone+icon-1320186209312314268.png")
                    Text("Mobile")
                }
            }
            Surface(
                color = Color.Transparent,
                modifier = Modifier.weight(1f)
             ){
                Column {
                    ImageLoader.fromUrl("https://image.flaticon.com/icons/png/128/879/879200.png")
                    Text("VIP")
                }
            }
        }
    }
}