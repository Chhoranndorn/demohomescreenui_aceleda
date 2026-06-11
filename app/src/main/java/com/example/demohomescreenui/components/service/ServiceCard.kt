package com.example.demohomescreenui.components.service

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R


@Composable
fun ServiceCard(
    modifier: Modifier = Modifier,
    topLeft: Int,
    topRight: Int,
    bottomLeft: Int,
    smallIcons: List<Int>
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {

            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                LargeServiceIcon(
                    drawable = topLeft,
                    modifier = Modifier.weight(1f)
                )

                LargeServiceIcon(
                    drawable = topRight,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                LargeServiceIcon(
                    drawable = bottomLeft,
                    modifier = Modifier.weight(1f)
                )

                SmallGrid(
                    icons = smallIcons,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}