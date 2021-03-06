package com.example.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.example.jetpack.ui.ActionArea
import com.example.jetpack.ui.ImageLoader
import com.example.jetpack.ui.Primary
import com.example.jetpack.ui.appbar.NavigationBar
import com.example.jetpack.ui.button.Secondary

//https://developer.android.com/jetpack/compose/layout
class MainActivity : AppCompatActivity() {
    val url = "https://images.contentstack.io/v3/assets/blt67d444169971fbeb/bltb16c4318e44128eb/5f29311d48bdc47f3f1e5132/skyq.jpg"
    val aa = ActionArea(com.example.jetpack.ui.button.Primary("Primary"), Secondary("Secondary"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            homeHub()
        }
    }

    @Preview
    @Composable
    fun homeHub() {
        Scaffold(
            topBar = {
                TopAppBar(title = {
                    Text("TopAppBar")
                })
            },
            floatingActionButtonPosition = FabPosition.End,
            floatingActionButton = {
                FloatingActionButton(onClick = {})
                {
                    Text("X")
                }
            },
            drawerContent = {
                Text(text = "drawerContent")
            },
            bodyContent = {
                ScrollableColumn {
                    Primary("Your *Bill*", "See a break _down_ of your `bill here`", "https://image.flaticon.com/icons/png/512/972/972601.png", aa).render()
                    Primary(
                        "Your *Order*",
                        "See when your *order* will arrive `here`",
                        url,
                        aa
                    ).render()
                    Primary("Your *TV*", "View your TV packaged", "https://i.pinimg.com/originals/9e/d8/61/9ed86194c90b60ad5ce0e14fdb1b97d5.png", aa).render()
                    Primary("Your *Bill*", "See a break _down_ of your `bill here`", "https://image.flaticon.com/icons/png/512/972/972601.png", aa).render()
                    Primary(
                        "Your *Order*",
                        "See when your *order* will arrive `here`",
                        url,
                        aa
                    ).render()
                    Primary("Your *TV*", "View your TV packaged", "https://i.pinimg.com/originals/9e/d8/61/9ed86194c90b60ad5ce0e14fdb1b97d5.png", aa).render()
                }
            },
            bottomBar = {
                BottomAppBar {
                    NavigationBar().render()
                }
            }
        )
    }

    @Composable
    fun hh() {
        ScrollableColumn {
            Primary("Your Bill", "See a **break down** of your bill here", url, aa).render()
            Primary("Your Bill", "See a break down of your bill here", url, aa).render()
            Primary("Your Bill", "See a break down of your bill here", url, aa).render()
            Primary("Your Bill", "See a break down of your bill here", url, aa).render()
        }
    }

    @Composable
    fun NewsStory() {
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