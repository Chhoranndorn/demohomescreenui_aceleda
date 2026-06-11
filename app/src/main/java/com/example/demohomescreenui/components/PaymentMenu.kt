package com.example.demohomescreenui.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.PaymentItemList

@Composable
fun PaymentMenu(){
    val courseList = listOf(
        PaymentItemList(paymentName = "Payment", paymentImg =  R.drawable.invoice),
        PaymentItemList(paymentName ="Mobile-Top up", paymentImg =  R.drawable.smartphone),
    )
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
    ) {
        courseList.forEach { item ->

            Card(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal =6.dp)
                    .height(55.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
                shape = RoundedCornerShape(18.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(
                                    Color.Black.copy(alpha = 0.60f),
                                    Color.Black.copy(alpha = 0.30f),
                                )
                            )
                        )
                        .border(
                            1.3.dp,
                            Color(0xFF5d6386).copy(alpha = 0.90f),
                            shape = RoundedCornerShape(18.dp)
                        )
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(id = item.paymentImg),
                        contentDescription = null,
                        modifier = Modifier.size(35.dp),
                        colorFilter = ColorFilter.tint(Color.White),
                        )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = item.paymentName,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
