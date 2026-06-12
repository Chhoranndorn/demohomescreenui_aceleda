package com.example.demohomescreenui.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.OtherNewsItemList

@Composable
fun OtherNews(){
    val otherNewsList = listOf(
        OtherNewsItemList(otherNewsBanner = R.drawable.banner_salary_loan, otherNewsLogo = R.drawable._1e1e4fd1781340c967271d431919fc01787ce76e, otherNewsDes = "hellloooo"),
        OtherNewsItemList(otherNewsBanner = R.drawable.banner_cross_border_japan_eng, otherNewsLogo = R.drawable._1e1e4fd1781340c967271d431919fc01787ce76e, otherNewsDes = "hellloooo"),
        OtherNewsItemList(otherNewsBanner = R.drawable.banner_advance_salary, otherNewsLogo = R.drawable._1e1e4fd1781340c967271d431919fc01787ce76e, otherNewsDes = "hellloooo"),
    )

    LazyRow(
        modifier = Modifier.padding(vertical = 4.dp),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
items(otherNewsList){ item ->
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
        Card(
            onClick = {},
            modifier = Modifier
                .width(275.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            ),
        ) {
            Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)) {
                Image(
                    painter = painterResource(item.otherNewsBanner),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp).clip(
                            RoundedCornerShape(
                                topStart = 12.dp,
                                topEnd = 12.dp,
                            )
                        )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(item.otherNewsLogo),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("ស្វែងរកមេរៀនបច្ចេកទេស និងជំនាញផ្សេងៗ", fontSize = 14.sp, color = Color.White, maxLines = 2)
                }
            }
        }
    }
}
    }
}