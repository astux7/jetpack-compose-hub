package com.example.jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.core.content.res.ResourcesCompat
import androidx.ui.tooling.preview.Preview
//import com.luca992.compose.image.CoilImage
import java.security.AccessController.getContext


class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            drawImage()
//            MaterialTheme {
//                Column {
//                    ItemCell(item = Item("cat 1", "https://thumbs-prod.si-cdn.com/s-rtW1rEAQTIGcmUVNFSSPC4s3I=/800x600/filters:no_upscale()/https://public-media.si-cdn.com/filer/56/4a/564a542d-5c37-4be7-8892-98201ab13180/cat-2083492_1280.jpg"))
//                    ItemCell(item = Item("cat 2", "https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"))
//                }
//            }
        }
    }

@Composable
fun drawImage() {
  //  CoilImage("https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg")
}

@Preview
@Composable
fun prevImage() {
    drawImage()
}
}

