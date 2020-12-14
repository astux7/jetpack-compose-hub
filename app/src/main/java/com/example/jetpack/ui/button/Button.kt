package com.example.jetpack.ui.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonConstants
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

interface Button;

class Primary(val text: String, var modifier: Modifier = Modifier, val action: (() -> Unit) = {}): Button {

    @Composable
    fun render() {
        Button(
            onClick = action,
            colors = ButtonConstants.defaultButtonColors(
                backgroundColor = Color(0, 115, 197)
            ),
            modifier = modifier
        ) {
            Text(
                text = text,
                color = Color.White
            )
        }
    }
}


class Secondary(val text: String, var modifier: Modifier = Modifier, val action: (() -> Unit) = {}): Button {

    @Composable
    fun render() {
        Button(
            onClick = action,
            colors = ButtonConstants.defaultButtonColors(
                backgroundColor = Color.Transparent,
            ),
            border = BorderStroke(1.dp, Color(0, 115, 197)),
            modifier = modifier
        ) {
            Text(
                text = text,
                color = Color(0, 115, 197)
            )
        }
    }
}