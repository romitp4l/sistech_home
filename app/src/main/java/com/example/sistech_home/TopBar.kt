package com.example.sistech_home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sistech_home.ui.theme.Sistech_homeTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TopBar() {

Column (modifier = Modifier.fillMaxWidth()){
    UpperPartOfTopBar()
    Tagline()
    Spacer(modifier = Modifier.width(8.dp))
}


}

@Composable
fun Logo() {

    Image(
        painter = painterResource(id = R.drawable.sistech),
        contentDescription = null,
        modifier = Modifier
            .height(60.dp)
            .width(200.dp)
    )
}
@Composable
fun Tagline() {

    Text(
        text = stringResource(id = R.string.tagline),
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.titleMedium,
        color = Color.Black,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(start = 180.dp)


    )
}

@Preview(showSystemUi = true)
@Composable
fun TopBarPreview() {
   Sistech_homeTheme {
       TopBar()
   }
}

@OptIn(ExperimentalMaterial3Api::class)
@androidx.compose.runtime.Composable
fun UpperPartOfTopBar() {
    val density = LocalDensity.current.density
   // val topAppBarElevation = 4.dp * density
    TopAppBar(

       // elevation = topAppBarElevation,
        modifier = Modifier.height(56.dp),
        title = {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Transparent),
                horizontalArrangement = Arrangement.Center
            ) {
                // Logo and Tagline
                Logo()


            }
        },
//        actions = {
//            // Icons on the right side of the top bar
//            IconButton(onClick = { /* Handle Search */ }) {
//                Icon(imageVector = Icons.Default.Search, contentDescription = null)
//            }
//            IconButton(onClick = { /* Handle Settings */ }) {
//                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
//            }
  //      }
    )
}
