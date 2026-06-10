package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.ServiceItemModel

@Composable
fun OtherServiceMenu(){
    val otherServiceList = listOf(
        ServiceItemModel(serviceName = "My Points", serviceImg = R.drawable._39115),
        ServiceItemModel(serviceName ="Toanchet Pay", serviceImg = R.drawable.shop),
        ServiceItemModel(serviceName ="Public Services", serviceImg = R.drawable.museum),
        ServiceItemModel(serviceName ="Exchange Rate", serviceImg = R.drawable.exchange),
        ServiceItemModel(serviceName ="Locator", serviceImg = R.drawable.location),
    )
    LazyRow(
        contentPadding = PaddingValues(
            start = 24.dp, // 👈 more space on left
            end = 8.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
    ){

        items(otherServiceList) { item ->
            Column(
                modifier = Modifier.width(90.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    onClick = {},
//                    modifier = Modifier.fillMaxWidth(),
                    modifier = Modifier.width(85.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    )
                )

                {
                    Column(
                        modifier = Modifier.padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = item.serviceImg),
                            contentDescription = null,
                            modifier = Modifier.size(60.dp).align(Alignment.CenterHorizontally)
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
                )
            }

        }
    }
}