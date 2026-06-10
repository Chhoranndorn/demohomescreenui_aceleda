package com.example.demohomescreenui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
@Composable
fun HeaderSection(
    modifier: Modifier = Modifier,
    showBackground: Boolean = false
) {

    val backgroundColor by animateColorAsState(
        targetValue =
            if (showBackground)
                Color.Black.copy(alpha = 0.15f)
            else
                Color.Transparent,
        label = "HeaderBackground"
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.aceleda_logo__1_),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(start = 30.dp)
                    .scale(1.8f)
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_notifications_24),
                    contentDescription = null,
                    tint = Color.White
                )
            }

            Image(
                painter = painterResource(id = R.drawable.qrcode),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}