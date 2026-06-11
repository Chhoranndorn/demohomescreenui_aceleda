package com.example.demohomescreenui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.fontscaling.MathUtils.lerp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import com.example.demohomescreenui.R
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue
@Composable
fun TourismSlider() {
    val imageList = listOf(
        R.drawable.banner_advance_salary,
        R.drawable.banner_bnpl,
        R.drawable.banner_cross_border_japan_eng,
        R.drawable.banner_salary_loan
    )
    val bannerTitles = listOf(
        "Right now your Row doesn’t guarantee alignment because",
        "Right now your Row doesn’t guarantee alignment because",
        "Right now your Row doesn’t guarantee alignment because",
        "Right now your Row doesn’t guarantee alignment because",
    )

    val startPage =
        (Int.MAX_VALUE / 2) - ((Int.MAX_VALUE / 2) % imageList.size)

    val pagerState = rememberPagerState(
        initialPage = startPage,
        pageCount = { Int.MAX_VALUE }
    )
    LaunchedEffect(pagerState.isScrollInProgress) {
        while (!pagerState.isScrollInProgress) {
            delay(3000)
            pagerState.animateScrollToPage(
                pagerState.currentPage + 1
            )
        }
    }
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        HorizontalPager(
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 60.dp),
            pageSpacing = 2.dp,
            userScrollEnabled = true
        ) { page ->
            val actualPage = page % imageList.size
            val pageOffset = (
                    (pagerState.currentPage - page) +
                            pagerState.currentPageOffsetFraction
                    ).absoluteValue
            val scale = 1f - (pageOffset * 0.15f)
            val alpha = 1f - (pageOffset * 0.25f)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .graphicsLayer {
                        scaleX = scale
                        scaleY = scale
                        this.alpha = alpha
                    }
                    .clip(RoundedCornerShape(18.dp)),
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(imageList[actualPage]),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Black.copy(alpha = 0.3f)
                                    )
                                )
                            )
                    )
                }
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 12.dp, bottom = 6.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box (modifier = Modifier
                            .size(28.dp)
                            .background(
                                color = Color.Black.copy(alpha = 0.5f),
                                shape = CircleShape

                            ),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.location),
                                contentDescription = null,
                                modifier = Modifier.height(16.dp),
                                colorFilter = ColorFilter.tint(Color.White),
                            )
                        }
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = bannerTitles[actualPage],
                            color = Color.White,
                            fontSize = 14.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            val currentIndicator =
                pagerState.currentPage % imageList.size

            repeat(imageList.size) { index ->

                val isSelected =
                    currentIndicator == index

                val width by animateDpAsState(
                    targetValue = if (isSelected) 24.dp else 8.dp,
                    label = ""
                )

                val color by animateColorAsState(
                    targetValue =
                        if (isSelected)
                            Color.White
                        else
                            Color.Gray.copy(alpha = 0.5f),
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