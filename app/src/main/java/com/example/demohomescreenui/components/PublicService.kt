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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.demohomescreenui.R
import com.example.demohomescreenui.components.service.OtherServiceCard
import com.example.demohomescreenui.components.service.PublicServiceCard

@Composable
fun PublicService() {
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
            PublicServiceCard(
                modifier = Modifier.weight(1f),
                topLeft = R.drawable.labor,
                topRight = R.drawable.university,
                bottomLeft = R.drawable.logo_loading,
            )

            OtherServiceCard(
                modifier = Modifier.weight(1f),
                topLeft = R.drawable._272908790_246548520989483_8091093659282453750_n,
                topRight = R.drawable.cropped_logo,
                bottomLeft = R.drawable.unnamed,
            )
        }
    }
}