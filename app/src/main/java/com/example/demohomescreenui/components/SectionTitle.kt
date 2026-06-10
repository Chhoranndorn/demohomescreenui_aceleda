package com.example.demohomescreenui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SectionTitle(
    title: String,
    modifier: Modifier = Modifier
){
    Text(
        text = title,
        modifier = modifier.fillMaxWidth().padding(horizontal = 8.dp),
        color = Color.White,
        textAlign = TextAlign.Start,
        maxLines = 1,
        fontSize = 24.sp
    )
}
