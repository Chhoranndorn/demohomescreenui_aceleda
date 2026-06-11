package com.example.demohomescreenui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.ImageCarouselList
import com.example.demohomescreenui.model.PaymentItemList


@Composable
fun SliderMenu(
    modifier: Modifier = Modifier
){
    val imageList = listOf(
        R.drawable.banner_advance_salary,
        R.drawable.banner_bnpl,
        R.drawable.banner_cross_border_japan_eng,
        R.drawable.banner_salary_loan
    )
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { imageList.size }
    )

    Column(
        modifier
            .defaultMinSize(minHeight = 300.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth(),
            pageSpacing = 18.dp,
            contentPadding = PaddingValues(horizontal = 0.dp)
        ) { page ->
            Image(
                painter = painterResource(id = imageList[page]),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(18.dp)),
                contentScale = ContentScale.Crop
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(imageList.size) { index ->

                val isSelected = pagerState.currentPage == index

                val color by animateColorAsState(
                    targetValue = if (isSelected) Color.White else Color.Gray.copy(alpha = 0.5f),
                    label = ""
                )
                val width by animateDpAsState(
                    targetValue = if (isSelected) 18.dp else 6.dp,
                    label = ""
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 3.dp)
                        .height(6.dp)
                        .width(width)
                        .background(
                            color = color,
                            shape = RoundedCornerShape(80)
                        )
                )
            }
        }

    }
}