package com.example.demohomescreenui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SectionTitleRow(
    leftTitle: String,
    rightTitle: String,
    onLeftClick: () -> Unit,
    onRightClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.CenterStart
        ) {
            SectionTitle(
                showArrow = true,
                title = leftTitle,
                onClick = onLeftClick,
            )
        }
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.CenterStart

        ) {
            SectionTitle(
                showArrow = true,
                title = rightTitle,
                onClick = onRightClick,
            )
        }
    }
}