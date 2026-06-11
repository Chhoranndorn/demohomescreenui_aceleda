package com.example.demohomescreenui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.components.service.ServiceCard

@Composable
fun PublicService() {
val publicIcons = listOf(
    R.drawable.qrcode,
    R.drawable.qrcode,
    R.drawable.qrcode,
    R.drawable.qrcode
)
    val otherServiceIcons = listOf(
        R.drawable.qrcode,
        R.drawable.qrcode,
        R.drawable.qrcode,
        R.drawable.qrcode
    )
    Column(
        modifier = Modifier.padding(horizontal = 14.dp)
    ) {

        SectionTitleRow(

            leftTitle = "Public Service",
            rightTitle = "Other Services",
            onLeftClick = {},
            onRightClick = {}
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            ServiceCard(
                modifier = Modifier.weight(1f),
                topLeft = R.drawable.qrcode,
                topRight = R.drawable.qrcode,
                bottomLeft = R.drawable.qrcode,
                smallIcons = publicIcons
            )

            ServiceCard(
                modifier = Modifier.weight(1f),
                topLeft = R.drawable.qrcode,
                topRight = R.drawable.qrcode,
                bottomLeft = R.drawable.qrcode,
                smallIcons = otherServiceIcons
            )
        }
    }
}