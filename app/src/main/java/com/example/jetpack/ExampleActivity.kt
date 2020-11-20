package com.example.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import com.example.jetpack.ui.te

class ExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OverlapText(text = "Ask")
            newStoryWithColumn()
            newsStory()
        }

    }
    // Column function lets you stack elements vertically.
    @Composable
    fun newStoryWithColumn(){
        Column (
            modifier = Modifier.padding(16.dp)
        ){
            Text("A day in Shark Fin Cove")
            Text("Davenport, California")
            Text("December 2018")
        }
    }

    @Preview
    @Composable
    fun previewNewStoryWithColumn() {
        newStoryWithColumn()
    }


    // cannot do preview because it has params in composable function
    @Composable
    fun OverlapText(text: String) {
        Text(text = text)
        Text(text = "Ask" + text)
    }
    /**
     * It's a best practice to create separate preview functions that aren't
     * called by the app; having dedicated preview functions improves performance,
     * and also makes it easier to set up multiple previews later on.
     */
    @Preview
    @Composable
    fun previewContentTile() {
        OverlapText(text = "Cave")
    }

    @Composable
    fun newsStory() {
        val image = imageResource(R.drawable.sky)
        MaterialTheme {
            val typography = MaterialTheme.typography
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                val imageModifier = Modifier
                    .preferredHeight(180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp))

                Image(image, modifier = imageModifier,
                    contentScale = ContentScale.Crop)
                Spacer(Modifier.preferredHeight(16.dp))

                Text(
                    "A day wandering through the sandhills " +
                            "in Shark Fin Cove, and a few of the " +
                            "sights I saw",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis)
                Text("Davenport, California",
                    style = typography.body2)
                Text("December 2018",
                    style = typography.body2)
            }
        }
    }
}