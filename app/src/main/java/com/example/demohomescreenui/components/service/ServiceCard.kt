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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.SmallIconItem


@Composable
fun PublicServiceCard(
    modifier: Modifier = Modifier,
    topLeft: Int,
    topRight: Int,
    bottomLeft: Int,
) {
    val publicServiceSmallIcon = listOf(
        SmallIconItem(R.drawable.logo_loading),
        SmallIconItem(R.drawable.unnamed),
        SmallIconItem(R.drawable.cropped_logo),
        SmallIconItem(R.drawable._272908790_246548520989483_8091093659282453750_n)
    )
    BaseServiceCard(
        modifier = modifier,
        containerColor = Color(0xFF4e5158),
        topLeft = {
            PublicServiceIcon(topLeft)
        },
        topRight = {
            PublicServiceIcon(topRight)
        },
        bottomLeft = {
            PublicServiceIcon(bottomLeft,showBorder = false)
        },
        smallIcons = publicServiceSmallIcon
    )
}

@Composable
fun OtherServiceCard(
    modifier: Modifier = Modifier,
    topLeft: Int,
    topRight: Int,
    bottomLeft: Int,
) {
    val baseServiceCardSmallIcon = listOf(
        SmallIconItem(R.drawable.emblem_of_the_ministry_of_national_defense__cambodia__svg, showBorder = true),
        SmallIconItem(R.drawable.image_97),
        SmallIconItem(R.drawable._2),
        SmallIconItem(R.drawable._272908790_246548520989483_8091093659282453750_n)
    )
    BaseServiceCard(
        modifier = modifier,
        containerColor = Color(0xFF4e5158),
        topLeft = {
            OtherServiceIcon(topLeft)
        },
        topRight = {
            OtherServiceIcon(topRight,showBorder = false, showBackground = true, backgroundColor = Color(0xFFdeeaf6))
        },
        bottomLeft = {
            OtherServiceIcon(bottomLeft,showBorder = false,showBackground = true, backgroundColor = Color.Black)
        },
        smallIcons = baseServiceCardSmallIcon
    )
}