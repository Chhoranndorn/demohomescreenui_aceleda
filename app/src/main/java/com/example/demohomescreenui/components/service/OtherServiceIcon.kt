package com.example.demohomescreenui.components.service

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun OtherServiceIcon(
    drawable: Int,
    showBorder : Boolean = true,
    showBackground: Boolean = false,
    backgroundColor: Color = Color.Transparent
) {
    Box(
        modifier = Modifier
            .aspectRatio(1f)
            .clip(RoundedCornerShape(14.dp))
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(55.dp)
                .clip(RoundedCornerShape(10.dp))
                .then(
                    if (showBackground) {
                        Modifier.background(backgroundColor)
                    } else {
                        Modifier
                    }
                ).then(
                    if(showBorder){
                        Modifier.border(
                            width = 1.dp,
                            color = Color.LightGray,
                            shape = RoundedCornerShape(10.dp)
                        )
                    }else{
                        Modifier
                    }
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(drawable),
                contentDescription = null,
//                modifier = Modifier.size(35.dp)
                modifier = Modifier.size(35.dp).fillMaxSize().clip(RoundedCornerShape(0.dp))
            )
        }
    }
}