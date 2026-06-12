package com.example.demohomescreenui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demohomescreenui.R

@Composable
fun Appearance(){
    Card(
modifier = Modifier
    .fillMaxWidth()
    .padding(horizontal = 14.dp),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(14.dp))
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color.Black.copy(alpha = 0.60f),
                            Color.Black.copy(alpha = 0.30f)
                        )
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.gemini_generated_image_m4hupvm4hupvm4hu__1_),
                    contentDescription = null,
                    modifier = Modifier.height(height = 100.dp).width(100.dp)
                )
                Spacer(modifier = Modifier.width(38.dp))
                Image(
                    painter = painterResource(R.drawable.gemini_generated_image_c1vu2fc1vu2fc1vu__1_),
                    contentDescription = null,
                    modifier = Modifier.height(height = 50.dp).width(50.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                TextButton(
                    onClick = {},
                    shape = RoundedCornerShape(24.dp),
                            modifier = Modifier.border(
                            1.dp,
                    Color(0xFF5d6386),
                    RoundedCornerShape(24.dp)
                )
                ) {
                    Text("Customize", fontSize = 12.sp, color = Color.White, modifier = Modifier.padding(horizontal = 16.dp))
                }
                Spacer(modifier = Modifier.width(20.dp))

            }
        }
    }
}