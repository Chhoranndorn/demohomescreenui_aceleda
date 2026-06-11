package com.example.demohomescreenui.components.service

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SmallGrid(
    icons: List<Int>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SmallServiceIcon(
                drawable = icons[0],
                modifier = Modifier.weight(1f)
            )

            SmallServiceIcon(
                drawable = icons[1],
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SmallServiceIcon(
                drawable = icons[2],
                modifier = Modifier.weight(1f)
            )

            SmallServiceIcon(
                drawable = icons[3],
                modifier = Modifier.weight(1f)
            )
        }
    }
}