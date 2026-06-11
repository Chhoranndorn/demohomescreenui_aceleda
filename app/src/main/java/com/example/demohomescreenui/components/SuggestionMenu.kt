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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import com.example.demohomescreenui.model.SuggestionItemModel

@Composable
fun SuggestionMenu(){
    val suggestionList = listOf(
        SuggestionItemModel(suggestionName = "My Points", suggestionImg  = R.drawable.exchange, latLong = "15 m"),
        SuggestionItemModel(suggestionName ="Toanchet Pay", suggestionImg = R.drawable.shop,latLong = "15 m"),
        SuggestionItemModel(suggestionName ="Public Services", suggestionImg = R.drawable.museum,latLong = "15 m"),
        SuggestionItemModel(suggestionName ="Exchange Rate", suggestionImg = R.drawable.exchange,latLong = "15 m"),
        SuggestionItemModel(suggestionName ="Locator", suggestionImg = R.drawable.location,latLong = "15 m"),
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ){
        LazyRow(
            modifier = Modifier.padding(vertical = 4.dp),
            contentPadding = PaddingValues(
                start = 16.dp,
                end = 16.dp
            ),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ){
            items(suggestionList) { item ->
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .clip(RoundedCornerShape(18.dp))
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(
                                    Color.Black.copy(alpha = 0.60f),
                                    Color.Black.copy(alpha = 0.30f)
                                )
                            )
                        )
                ) {
                    Column(
                        modifier = Modifier.width(110.dp).padding( vertical = 10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Card(
                            onClick = {},
                            modifier = Modifier
                                .width(60.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            ),
                            shape = CircleShape,
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 6.dp
                            )
                        )

                        {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(
                                        Color(0xFF014691)
                                    )
                                    .border(
                                        1.3.dp,
                                        Color(0xFF5d6386).copy(alpha = 0.90f),
                                        shape = CircleShape
                                    )
                                    .padding(vertical = 16.dp, horizontal = 8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(id = item.suggestionImg),
                                    contentDescription = null,
                                    colorFilter = ColorFilter.tint(Color.White),
                                    modifier = Modifier
                                        .size(28.dp)
                                        .align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp)
                        ) {
                            Text(
                                text = item.suggestionName,
                                color = Color.White,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                fontSize = 12.sp,
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = null,
                                    modifier = Modifier.height(16.dp),
                                    colorFilter = ColorFilter.tint(Color.White),
                                )
                                Text(
                                    text = item.latLong,
                                    color = Color.White,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    fontSize = 11.sp,
                                )
                            }
                        }
                    }
                }

            }
        }

    }
}