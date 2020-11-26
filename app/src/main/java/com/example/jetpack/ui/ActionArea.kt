package com.example.jetpack.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpack.ui.button.Primary
import com.example.jetpack.ui.button.Secondary

class ActionArea(val primary: Primary?, val secondary: Secondary?) {

    var primarySetup = false
    var secondarySetup = false

    @Composable
    fun render() {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            primary?.let {
                if(!primarySetup) {
                    it.modifier = it.modifier
                        .weight(1f)
                        .padding(end = 4.dp)

                    primarySetup = true
                }
                it.render()
            }

            secondary?.let {
                if(!secondarySetup) {
                    it.modifier = it.modifier
                        .weight(1f)
                        .padding(start = 4.dp)

                    secondarySetup = true
                }
                it.render()
            }

        }
    }
}

