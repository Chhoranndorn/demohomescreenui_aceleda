package com.example.demohomescreenui.components.service

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.model.SmallIconItem

@Composable
fun SmallGrid(
    items: List<SmallIconItem>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SmallServiceIcon(
                drawable = items[0].drawable,
                modifier = Modifier.weight(1f),
                backgroundColor =items[0].backgroundColor,
                showBorder = items[0].showBorder
            )

            SmallServiceIcon(
                drawable = items[1].drawable,
                modifier = Modifier.weight(1f),
                backgroundColor =items[1].backgroundColor,
                showBorder = items[1].showBorder
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SmallServiceIcon(
                drawable = items[2].drawable,
                modifier = Modifier.weight(1f),
                backgroundColor =items[2].backgroundColor,
                showBorder = items[2].showBorder
            )

            SmallServiceIcon(
                drawable = items[3].drawable,
                modifier = Modifier.weight(1f),
                backgroundColor =items[3].backgroundColor,
                showBorder = items[3].showBorder
            )
        }
    }
}