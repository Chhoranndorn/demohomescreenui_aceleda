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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
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
    val startPage =
        (Int.MAX_VALUE / 2) - ((Int.MAX_VALUE / 2) % imageList.size)

    val pagerState = rememberPagerState(
        initialPage = startPage,
        pageCount = { Int.MAX_VALUE }
    )
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth(),
            pageSpacing = 18.dp,
            contentPadding = PaddingValues(horizontal = 0.dp)
        ) { page ->

            val actualPage = page % imageList.size

            Image(
                painter = painterResource(id = imageList[actualPage]),
                contentDescription = null,
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

                val currentIndicator =
                    pagerState.currentPage % imageList.size

                val isSelected =
                    currentIndicator == index

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