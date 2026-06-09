package com.example.demohomescreenui.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
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
import com.example.demohomescreenui.model.PaymentItemList
import com.example.demohomescreenui.model.ServiceItemModel

@Composable
fun ServiceMenu(){
    val courseList = listOf(
        ServiceItemModel(serviceName = "Payment", serviceImg = R.drawable.qrcode),
        ServiceItemModel(serviceName ="Mobile-Top up", serviceImg = R.drawable.qrcode),
        ServiceItemModel(serviceName ="Mobile-Top up", serviceImg = R.drawable.qrcode),
        ServiceItemModel(serviceName ="Mobile-Top up", serviceImg = R.drawable.qrcode),
        )
    Column {
        courseList.chunked(2).forEach { rowItems ->
            Row {
                rowItems.forEach { item ->
                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(item.serviceImg),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp)
                            )
                            Text(item.serviceName)
                        }
                    }
                }
            }
        }
    }
    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ){
        itemsIndexed(courseList) { index, item ->
            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    onClick = {},
                    modifier = Modifier
                        .padding(8.dp)
                        .width(80.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    )
                )

                {
                    Row(
                        modifier = Modifier
                            .padding(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.height(5.dp))
                        Image(
                            painter = painterResource(id = courseList[index].serviceImg),
                            contentDescription = null,
                            modifier = Modifier.size(60.dp)
                        )

                    }

                }
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = courseList[index].serviceName,
                    modifier = Modifier.padding(all =4.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }

        }
    }
}