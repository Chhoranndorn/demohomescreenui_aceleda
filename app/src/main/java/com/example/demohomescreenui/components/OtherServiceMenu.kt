package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.ServiceItemModel

@Composable
fun OtherServiceMenu(){
    val otherServiceList = listOf(
        ServiceItemModel(serviceName = "My Points", serviceImg = R.drawable.exchange),
        ServiceItemModel(serviceName ="Toanchet Pay", serviceImg = R.drawable.shop),
        ServiceItemModel(serviceName ="Public Services", serviceImg = R.drawable.museum),
        ServiceItemModel(serviceName ="Exchange Rate", serviceImg = R.drawable.exchange),
        ServiceItemModel(serviceName ="Locator", serviceImg = R.drawable.location),
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp,)
            .clip(RoundedCornerShape(18.dp))
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color.Black.copy(alpha = 0.60f),
                        Color.Black.copy(alpha = 0.30f)
                    )
                )
            )
    ){
        LazyRow(
            modifier = Modifier.padding(vertical = 12.dp),
            contentPadding = PaddingValues(
                start = 4.dp,
                end = 8.dp
            ),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ){
            items(otherServiceList) { item ->
                Column(
                    modifier = Modifier.width(75.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        onClick = {},
                        modifier = Modifier
                            .width(60.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(18.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 6.dp
                        )
                    )

                    {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    brush = Brush.verticalGradient(
                                        listOf(
                                            Color.Black.copy(alpha = 0.60f),
                                            Color.Black.copy(alpha = 0.30f)
                                        )
                                    )
                                )
                                .border(
                                    1.3.dp,
                                    Color(0xFF5d6386).copy(alpha = 0.90f),
                                    shape = RoundedCornerShape(18.dp)
                                )
                                .padding(vertical = 16.dp, horizontal = 8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = item.serviceImg),
                                contentDescription = null,
                                colorFilter = ColorFilter.tint(Color.White),
                                modifier = Modifier.size(28.dp).align(Alignment.CenterHorizontally)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = item.serviceName,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 12.sp,
                    )
                }

            }
        }

    }

}