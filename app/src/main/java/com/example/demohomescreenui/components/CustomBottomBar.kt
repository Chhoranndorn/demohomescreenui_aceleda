package com.example.demohomescreenui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class NavItem(
    val title: String,
    val icon: ImageVector
)

@Composable
fun CustomBottomBar(
    modifier: Modifier = Modifier,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {

    val items = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Favorites", Icons.Default.FavoriteBorder),
        NavItem("LiveChat", Icons.Default.ChatBubbleOutline),
        NavItem("Menu", Icons.Default.Menu)
    )

    Box(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(35.dp))
            .background(Color(0xFF263C5C).copy(alpha = 0.4f))
            .padding(horizontal = 8.dp, vertical = 6.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            items.forEachIndexed { index, item ->

                val selected = selectedIndex == index

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clip(RoundedCornerShape(35.dp))
                        .background(
                            if (selected)
                                Color(0xFF435257)
                            else
                                Color.Transparent
                        )
                        .clickable { onItemSelected(index) }
                        .padding(horizontal = 16.dp, vertical = 4.dp)
                ) {

                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = if (selected)
                            Color(0xFFD4AF37)
                        else
                            Color.White,
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = item.title,
                        color = if (selected)
                            Color(0xFFD4AF37)
                        else
                            Color.White,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}