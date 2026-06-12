package com.example.demohomescreenui.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        OtherNewsItemList(otherNewsBanner = R.drawable.banner_salary_loan, otherNewsLogo = R.drawable.banner_salary_loan, otherNewsDes = "hellloooo"),
        OtherNewsItemList(otherNewsBanner = R.drawable.banner_salary_loan, otherNewsLogo = R.drawable.banner_salary_loan, otherNewsDes = "hellloooo"),
        OtherNewsItemList(otherNewsBanner = R.drawable.banner_salary_loan, otherNewsLogo = R.drawable.banner_salary_loan, otherNewsDes = "hellloooo"),
    )

    LazyRow(
    ) {
items(otherNewsList){ item ->
    Column(modifier = Modifier.padding(horizontal = 10.dp)) {
        Image(
            painter = painterResource(item.otherNewsBanner) ,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(150.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(item.otherNewsLogo),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(28.dp),
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text("testtt", fontSize = 12.sp, color = Color.White)
        }
    }
}
    }
}