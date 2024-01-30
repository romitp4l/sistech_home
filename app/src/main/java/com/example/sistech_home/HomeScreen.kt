package com.example.sistech_home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen() {
    Column {
        TopBar()
        HomeScreenBody()


    }
}


data class Services(
    val title: String,
    val selectedIcon: Int,
   // val unselectedIcon: Int,
    val hasBadge: Boolean,
    val messages: Int
)

@Composable
fun HomeScreenBody() {
    Column (modifier = Modifier.padding(top = 20.dp)){
        val allServices = listOf<Services>(
            Services(
                title = "About Us ",
                selectedIcon =  R.drawable.about_us_filled,
                //   unselectedIcon = R.drawable.about_us_outlined,
                hasBadge = true,
                messages = 23
            ),
            Services(
                title = "Training",
                selectedIcon = R.drawable.training,
                hasBadge = true,
                messages = 34
            ),
            Services(
                title = "career",
                selectedIcon = R.drawable.career,
                hasBadge = true,
                messages = 5
            ),
            Services(
                title = "Higher Education",
                selectedIcon = R.drawable.higher_education,
                hasBadge = false,
                messages = 7
            ),
            Services(
                title = "Workshops",
                selectedIcon = R.drawable.workshop,
                hasBadge = false,
                messages = 45
            ),
            Services(
                title = "Certificates",
                selectedIcon = R.drawable.certificate,
                hasBadge = true,
                messages = 78
            )
        )

        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(allServices) { service ->
                ServiceCard(service)
            }
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceCard(service: Services) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(150.dp), // Adjusted card size
        onClick = { /* Handle click here */ }
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp,top = 16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = service.selectedIcon),
                contentDescription = service.title, // Added content description
                modifier = Modifier.size(48.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = service.title,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewServiceCard() {
    val allServices2 = listOf<Services>(
        Services(
            title = "About Us ",
            selectedIcon =  R.drawable.about_us_filled,

            hasBadge = true,
            messages = 23
        )
    )
    val demoService : Services = allServices2[0]
    ServiceCard(demoService)

}
