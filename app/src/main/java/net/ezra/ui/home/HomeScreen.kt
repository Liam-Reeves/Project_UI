package net.ezra.ui.home

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_INTERACTIVE_UI

@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Box(
                    modifier =Modifier
                ) {
                    Image(painter = painterResource(id = R.drawable.nature),
                        contentDescription ="",
                        modifier = Modifier
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )
                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_HOME) {
                                    popUpTo(ROUTE_EVENING) { inclusive = true }
                                }
                            },
                        text = "Welcome to TravelEazy",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Serif

                    )
                    Icon(painter = painterResource(id = R.drawable.buddha),
                        contentDescription =null,
                        modifier = Modifier
                            .size(500.dp)
                            .align(Alignment.TopCenter)


                    )
                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_INTERACTIVE_UI) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "dashboard screen",
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Serif

                    )








                }

            }


        }
    }


}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

