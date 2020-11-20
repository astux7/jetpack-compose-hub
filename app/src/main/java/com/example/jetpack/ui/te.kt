package com.example.jetpack.ui

import android.content.Context
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.transform.BlurTransformation
import jp.wasabeef.composable.coil.CoilImage


class te {
    companion object{
        @Composable
        fun t(url: String, context: Context) {
            CoilImage(
                model = url,
                modifier = Modifier.preferredWidth(240.dp)
            ) {
//                transformations(
//                    BlurTransformation(context, 25f, 2f)
//                )
            }
        }
    }

//    @Preview
//    @Composable
//    fun test() {
//        loadImageFromUrl(url = "https://images.contentstack.io/v3/assets/blt67d444169971fbeb/bltb16c4318e44128eb/5f29311d48bdc47f3f1e5132/skyq.jpg")
//    }

//    @Composable
//    fun _loadImageFromUrl(url: String) {
//        var bitmap by remember { mutableStateOf<Bitmap?>(null)}
//
//        Glide.with(ContextAmbient.current).asBitmap()
//            .load(url)
//            .into(object : CustomTarget<Bitmap>() {
//                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
//                    bitmap = resource
//                }
//
//                override fun onLoadCleared(placeholder: Drawable?) {}
//            })
//
//        if (bitmap != null )
//            Image(bitmap!!.asImageAsset(), Modifier.fillMaxWidth())
//        else
//            Text("Loading Image...")
//    }

}