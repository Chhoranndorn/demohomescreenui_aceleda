package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.SpecialOfferItem

@Composable
fun SpecialOffers(){
    val specialOfferList = listOf(
        SpecialOfferItem(specialOfferImg = R.drawable.banner_advance_salary, specialOfferDes = "Enjoy US$6 Cashback Per Month"),
        SpecialOfferItem(specialOfferImg = R.drawable.banner_advance_salary, specialOfferDes = "Enjoy US$6 Cashback Per Month"),
        SpecialOfferItem(specialOfferImg = R.drawable.banner_advance_salary, specialOfferDes = "Enjoy US$6 Cashback Per Month"),
        SpecialOfferItem(specialOfferImg = R.drawable.banner_advance_salary, specialOfferDes = "Enjoy US$6 Cashback Per Month"),
    )
    Column {
        LazyRow(
            modifier = Modifier.padding(vertical = 4.dp),
            contentPadding = PaddingValues(
                start = 12.dp,
                end = 12.dp
            ),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(specialOfferList) { item ->
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(color = Color.White)
                ) {
                    Card(
                        onClick = {},
                        modifier = Modifier.width(150.dp),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )
                    ) {
                        Column(
                        ) {
                            Image(
                                painter = painterResource(R.drawable.banner_advance_salary),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxWidth().height(height = 160.dp)
                            )
                            Text("Enjoy US$6 Cashback Per Month", color = Color(0xFF2b3a59), modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp), fontSize = 14.sp, fontWeight = FontWeight.Normal)
                        }
                    }
                }
            }
        }
    }
}