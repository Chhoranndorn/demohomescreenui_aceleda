package com.example.demohomescreenui.model

import androidx.compose.ui.graphics.Color

data class SmallIconItem(
    val drawable: Int,
    val backgroundColor: Color = Color.Transparent,
    val showBackground: Boolean = false,
    val showBorder: Boolean = false
)