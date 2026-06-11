package com.example.demohomescreenui.components
import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.RingSegment

@Composable
fun BalanceCard(){
    var isBalanceVisible by remember {
        mutableStateOf(false)
    }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(horizontal = 14.dp),
        shape = RoundedCornerShape(18.dp),
        color = Color.Transparent
    ) {
Box(
    modifier = Modifier
        .fillMaxWidth()
        .background(
            brush = Brush.verticalGradient(
                listOf(
                    Color.Black.copy(alpha = 0.60f),
                    Color.Black.copy(alpha = 0.30f),
                )
            ),
            shape = RoundedCornerShape(18.dp)
        )
        .border(
            BorderStroke(
                1.3.dp,
                Color(0xFF5d6386).copy(alpha = 0.90f)
            ),
            shape = RoundedCornerShape(18.dp)
        )
        .padding(12.dp)
)
{
    Row(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(contentAlignment = Alignment.Center) {
            BalanceRing(
                segments = listOf(
                    RingSegment(
                        color = Color(0xFF24B7FF),
                        value = 70f
                    ),
                    RingSegment(
                        color = Color(0xFFD8A62A),
                        value = 30f
                    )
                )
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.wallet),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .size(28.dp),

                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Accounts",
                    textAlign = TextAlign.Start,
                    maxLines = 1,
                    fontSize = 14.sp,
                    color = Color.White
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {   Text("Total Balances", color = Color.White.copy(alpha = 0.9f),
                fontSize = 14.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(
                            Color(0xFF89A6FF).copy(alpha = 0.6f)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = if (isBalanceVisible)
                            Icons.Default.Visibility
                        else
                            Icons.Default.VisibilityOff,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .size(12.dp)
                            .clickable {
                                isBalanceVisible = !isBalanceVisible
                            }
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                verticalAlignment = Alignment.Bottom
            ) {  Text("999,999.00",   color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold, modifier = Modifier.blur(
                    if (isBalanceVisible) 0.dp else 12.dp
                ))
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "៛",
                    color = Color(0xFFD8A62A),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "999,999.00",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                            modifier = Modifier.blur(
                            if (isBalanceVisible) 0.dp else 12.dp
                            )
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "$",
                    color = Color(0xFF24B7FF),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
    }
}