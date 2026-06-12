package com.example.demohomescreenui.components.service

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.SmallIconItem

@Composable
fun BaseServiceCard(
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    topLeft: @Composable () -> Unit,
    topRight: @Composable () -> Unit,
    bottomLeft: @Composable () -> Unit,
    smallIcons: List<SmallIconItem>
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = containerColor
        )
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {

            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Box(Modifier.weight(1f)) {
                    topLeft()
                }

                Box(Modifier.weight(1f)) {
                    topRight()
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Box(Modifier.weight(1f)) {
                    bottomLeft()
                }
                SmallGrid(
                    items = smallIcons,
                    modifier = Modifier.weight(1f)

                )
            }
        }
    }
}