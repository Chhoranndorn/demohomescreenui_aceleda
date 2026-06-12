package com.example.demohomescreenui.screen
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideOutVertically
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
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
import com.example.demohomescreenui.components.OtherNews
import com.example.demohomescreenui.components.OtherServiceMenu
import com.example.demohomescreenui.components.PaymentMenu
import com.example.demohomescreenui.components.ProfileSection
import com.example.demohomescreenui.components.PublicService
import com.example.demohomescreenui.components.RecentTransaction
import com.example.demohomescreenui.components.SectionTitle
import com.example.demohomescreenui.components.SectionTitleRow
import com.example.demohomescreenui.components.ServiceMenu
import com.example.demohomescreenui.components.SliderMenu
import com.example.demohomescreenui.components.SpecialOffers
import com.example.demohomescreenui.components.SuggestionMenu
import com.example.demohomescreenui.components.TourismSlider

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val listState = rememberLazyListState()

    val profileVisible =
        listState.firstVisibleItemIndex == 0 &&
                listState.firstVisibleItemScrollOffset < 150
    val showHeaderBackground =
        listState.firstVisibleItemIndex > 0 ||
                listState.firstVisibleItemScrollOffset > 50

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize()
        ) {
//            item {
//                Spacer(modifier = Modifier.height(120.dp))
//            }
            item {
                AnimatedVisibility(
                    visible = profileVisible,
                    enter = fadeIn(),
                    exit = fadeOut() + slideOutVertically()
                ) {
//                 Spacer(modifier = Modifier.height(20.dp))
//                    ProfileSection()
                }
            }
            item { Spacer(modifier = Modifier.height(20.dp)) }
//            item { BalanceCard() }
            item { Spacer(modifier = Modifier.height(20.dp)) }
//            item { PaymentMenu() }
            item { Spacer(modifier = Modifier.height(10.dp)) }
//            item { ServiceMenu() }
            item { Spacer(modifier = Modifier.height(10.dp)) }
//            item { OtherServiceMenu() }
            item { Spacer(modifier = Modifier.height(10.dp)) }
//            item { SectionTitle("Recommended", modifier = Modifier.padding(start = 12.dp)
//            ) }
            item { Spacer(modifier = Modifier.height(10.dp)) }
//            item { SliderMenu() }
            item {
                Spacer(modifier = Modifier.height(10.dp))}
            item { SectionTitle("Cambodia Tourism", true, modifier = Modifier.padding(start = 12.dp), onClick = {}) }
            item { Spacer(modifier = Modifier.height(10.dp))}
//            item { TourismSlider() }
            item { Spacer(modifier = Modifier.height(10.dp))}
            item { Spacer(modifier = Modifier.height(10.dp))}
//            item { PublicService() }
            item { Spacer(modifier = Modifier.height(10.dp))}
            item { SectionTitle("Suggestions", showArrow = true, modifier = Modifier.padding(start = 12.dp), onClick = {})}
            item { Spacer(modifier = Modifier.height(10.dp))}
//            item { SuggestionMenu() }
            item { Spacer(modifier = Modifier.height(10.dp))}
            item { SectionTitle("Recent Transactions", modifier = Modifier.padding(start = 12.dp))}
            item { Spacer(modifier = Modifier.height(10.dp))}
//            item { RecentTransaction() }
            item { Spacer(modifier = Modifier.height(10.dp))}
            item { SectionTitle("Other News", showArrow = true, modifier = Modifier.padding(start = 12.dp), onClick = {})}
            item { Spacer(modifier = Modifier.height(10.dp))}
            item { OtherNews() }
            item { Spacer(modifier = modifier.height(10.dp)) }
            item { SectionTitle("Special Offers", showArrow = true, modifier = Modifier.padding(start = 12.dp), onClick = {})}
            item {Spacer(modifier= modifier.height(10.dp))}
            item { SpecialOffers() }
            item { Spacer(modifier = Modifier.height(10.dp))}
            item { Spacer(modifier = Modifier.height(200.dp))}

        }
        HeaderSection(
            modifier = Modifier.align(Alignment.TopCenter),
                    showBackground = showHeaderBackground
        )
    }
}

