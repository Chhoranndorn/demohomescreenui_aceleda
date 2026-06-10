package com.example.demohomescreenui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.components.ChatBotButton
import com.example.demohomescreenui.components.CustomBottomBar
@Composable
fun MainScreen() {

    var selectedTab by remember { mutableIntStateOf(0) }

    Box(modifier = Modifier.fillMaxSize()) {
        when (selectedTab) {
            0 -> HomeScreen()
            1 -> FavoriteScreen()
            2 -> ChatScreen()
            3 -> MenuScreen()
        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 12.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    CustomBottomBar(
                        selectedIndex = selectedTab,
                        onItemSelected = { selectedTab = it },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                ChatBotButton(
                    onClick = {}
                )
                Spacer(modifier = Modifier.width(14.dp))
            }
        }
    }
}