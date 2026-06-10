package com.example.demohomescreenui.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.lazy.items
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
        ServiceItemModel(serviceName = "Cards", serviceImg = R.drawable.credit_card),
        ServiceItemModel(serviceName ="Scan QR", serviceImg = R.drawable.qr_code_scan),
        ServiceItemModel(serviceName ="Transfers", serviceImg = R.drawable.transfer_data),
        ServiceItemModel(serviceName ="Deposits", serviceImg = R.drawable.time),
        ServiceItemModel(serviceName ="Loans", serviceImg = R.drawable.loan),
        ServiceItemModel(serviceName ="Quick Cash", serviceImg = R.drawable.money),

        )
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        courseList.chunked(3).forEach { rowItems ->
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
                            Text(item.serviceName, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                        }
                    }
                }
            }
        }
    }
}