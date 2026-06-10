package com.example.demohomescreenui.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.example.demohomescreenui.R
import com.example.demohomescreenui.components.BalanceCard
import com.example.demohomescreenui.components.HeaderSection
import com.example.demohomescreenui.components.OtherServiceMenu
import com.example.demohomescreenui.components.PaymentMenu
import com.example.demohomescreenui.components.ProfileSection
import com.example.demohomescreenui.components.SectionTitle
import com.example.demohomescreenui.components.ServiceMenu
import com.example.demohomescreenui.components.SliderMenu

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()

    ){
        Image(
            painter = painterResource(id = R.drawable.bg_hv4_main_gradient_blue),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
            HeaderSection()
            Spacer(modifier = Modifier.height(0.dp))
            ProfileSection()
            Spacer(modifier = Modifier.height(4.dp))
            BalanceCard()
            Spacer(modifier = Modifier.height(10.dp))
            PaymentMenu()
            Spacer(modifier = Modifier.height(10.dp))
            ServiceMenu()
            Spacer(modifier = Modifier.height(10.dp))
            OtherServiceMenu()
            Spacer(modifier = Modifier.height(10.dp))
            SectionTitle("Recommended")
            Spacer(modifier = Modifier.height(10.dp))
            SliderMenu()
        }
    }
}

