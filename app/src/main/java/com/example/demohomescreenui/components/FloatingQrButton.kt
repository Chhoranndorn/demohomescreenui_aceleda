package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R

@Composable
fun FloatingQrButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .size(90.dp)
            .clickable{onClick()}
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(0xFF7EA9FF),
                        Color(0xFF3656C8)
                    )
                ),
                shape = CircleShape
            )
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(0xFF5C7AFF),
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.scan),
                contentDescription = "Scan QR",
                modifier = Modifier.size(34.dp)
            )
        }
    }
}