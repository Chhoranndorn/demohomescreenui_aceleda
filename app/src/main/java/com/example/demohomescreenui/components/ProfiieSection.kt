package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R

@Composable
fun ProfileSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "My imported image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )
        Column(modifier = Modifier.weight(1f).padding(horizontal =12.dp)) {
            Text("Hello, ប៊ូរ ឆរ៉ាន់ដន",color = Color.White)
            Row(verticalAlignment = Alignment.CenterVertically) {   Text("Profile",color= Color.White)
                Icon(
                    painter = painterResource(id= R.drawable.outline_arrow_forward_ios_24) , contentDescription = null,
                    modifier = Modifier.size(15.dp),
                    tint = Color.White
                )}
        }
    }
}