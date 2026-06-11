package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import com.example.demohomescreenui.model.RecentTransactionItem
import com.example.demohomescreenui.model.ServiceItemModel
import kotlin.random.Random

@Composable
fun RecentTransaction () {
    val recentTransactionList = listOf(
        RecentTransactionItem(recentTransactionName = "BO CHHORANNDORN", recentTransactionUser =   "BC"),
        RecentTransactionItem(recentTransactionName = "SOK PISEY", recentTransactionUser =  "SP"),
        RecentTransactionItem(recentTransactionName = "JOHN RONALDO", recentTransactionUser =  "JR"),
        RecentTransactionItem(recentTransactionName = "LEO MESSI", recentTransactionUser =  "LM"),
        RecentTransactionItem(recentTransactionName = "CHAN VATANAKA", recentTransactionUser =  "CV"),
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
    ) {
        LazyRow(
            modifier = Modifier.padding(vertical = 12.dp),
            contentPadding = PaddingValues(
                start = 4.dp,
                end = 8.dp
            ),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(recentTransactionList) { item ->
                val randomColor = remember(item.recentTransactionName) {
                    Color(
                        red = Random.nextFloat(),
                        green = Random.nextFloat(),
                        blue = Random.nextFloat(),
                        alpha = 1f
                    )
                }
                Column(
                    modifier = Modifier.width(75.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        onClick = {},
                        modifier = Modifier.size(60.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        shape = CircleShape,
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 6.dp
                        )
                    )

                    {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(randomColor.copy(alpha = 0.8f))
                                .border(
                                    1.3.dp,
                                    Color(0xFF5d6386).copy(alpha = 0.90f),
                                    shape = CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = item.recentTransactionUser,
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = item.recentTransactionName,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 12.sp,
                    )
                }
            }
        }
    }
}