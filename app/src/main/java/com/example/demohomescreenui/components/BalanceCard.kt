package com.example.demohomescreenui.components
import android.text.Layout
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.model.RingSegment

@Composable
fun BalanceCard(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(contentAlignment = Alignment.Center) {

                    BalanceRing(
                        segments = listOf(
                            RingSegment(Color.Blue, 70f),
                            RingSegment(Color.Yellow, 30f)
                        )
                    )
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.AccountBalanceWallet,
                            contentDescription = null
                        )
                        Text("Accounts")
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                ) {
                    Row() {   Text("Total Balances")
                    Image(painter = painterResource(id = R.drawable.visible), contentDescription = null, modifier = Modifier.size(25.dp))
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {  Text("9999999")
                        Image(
                            painter = painterResource(id = R.drawable.dollar_sign),
                            contentDescription = "My imported image",

                            modifier = Modifier
                                .size(25.dp)
                        )
                     }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {  Text("9999999")
                        Image(
                            painter = painterResource(id = R.drawable.dollar_sign),
                            contentDescription = "My imported image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(25.dp)

                        )
                    }
                }
            }
    }
}