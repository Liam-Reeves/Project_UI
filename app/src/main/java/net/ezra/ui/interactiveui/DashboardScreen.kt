package net.ezra.ui.interactiveui

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_INTERACTIVE_UI
import net.ezra.ui.home.HomeScreen

@Composable
fun DashboardScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .background(Color(0xfffaf9f0))
            .fillMaxSize()
    ) {
        LazyColumn {
            item {
                Column {
                    TopBar(name = "DASHBOARD")

                    Card1(name = "Total Unit in Stock",
                        digit ="786" ,
                        digit2 ="$565,430.00" ,
                        name2 ="Total Inventory value", )
                    InventorySection(title = "Inventory",
                        value = "No. of  Tires",
                        value2 = "Reorder level",
                        num1 = "486",
                        num2 ="1",
                        num3 = "/12")
                }

            }
        }

    }
}
@Composable
fun TopBar(
    name :String,
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffF1ED9C))
    ) {
        Text(text = name,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(40.dp)

        )

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color(0xfffaf9f0))
                .padding(10.dp)

        ) {
            Icon(imageVector = Icons.Default.Notifications,
                contentDescription ="Bell",
                tint = Color.Blue,
                modifier = Modifier.size(16.dp)
            )
        }

    }

}
@Composable
fun Card1(
        name: String,
        digit : String,
        digit2 : String,
        name2 : String,

) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Card(
            colors = CardDefaults.cardColors(Color(0xff2589BE)),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier
                .size(200.dp)
                .padding(
                    start = 5.dp,
                    top = 5.dp,
                    bottom = 5.dp
                )


        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color(0xfffaf9f0))
                    .padding(10.dp)

            ) {
                Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription ="null",
                tint = Color.Blue,
                modifier = Modifier.size(16.dp)
            )

            }
            Row {
                Text(
                    text = digit,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier.padding(20.dp)

                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Text(
                    text = name,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.padding(5.dp)
                )
            }


        }
        Spacer(modifier = Modifier.width(40.dp))
        Card(

            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier
                .size(200.dp)
                .padding(
                    start = 15.dp,
                    top = 15.dp,
                    bottom = 15.dp,
                    end = 10.dp
                )

        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color(0xfffaf9f0))
                    .padding(10.dp)
            ) {
                Icon(imageVector = Icons.Default.ShoppingCart,
                    contentDescription ="null",
                    tint = Color.Blue,
                    modifier = Modifier.size(16.dp)
                )
            }
            Row {
                Text(
                    text = digit2,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(5.dp)

                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Text(
                    text = name2,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(5.dp)
                )
            }

        }


    }
}
@Composable
fun InventorySection(
//    InventorySection(title = "Inventory",
//value = "No. of  Tires",
//value2 = "Reorder level",
//num1 = "486",
//num2 ="1",
//num3 = "/12")
    title:String,
    value: String,
    value2 :String,
    num1 : String,
    num2 : String,
    num3 : String,
){
   Row(
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.SpaceBetween,
       modifier = Modifier
           .padding(10.dp)
   ) {
       Text(
           text = title,
           textAlign = TextAlign.Left,
           color = Color.Black,
           fontSize = 20.sp,
           fontWeight = FontWeight.Bold,
           overflow = TextOverflow.Ellipsis,
           modifier = Modifier.padding(start = 20.dp, top = 3.dp, bottom = 5.dp),
           )
   }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ){
        Card(

            colors = CardDefaults.cardColors(Color(0xffd3c5e7 )),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier
                .size(height = 150.dp, width = 400.dp)
                .padding(start = 15.dp)
        ) {
            Column {
                Row {
                    Text(
                        text = value,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(start = 20.dp, top = 20.dp,bottom = 20.dp)
                    )
                    Text(
                        text = value2,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.None,
                        modifier = Modifier.padding(start = 150.dp, top = 20.dp, bottom = 10.dp, end = 20.dp)

                    )

                }

                Row {
                    Text(
                        text = num1,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 20.dp,),
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Spacer(modifier = Modifier.width(150.dp))

                    val increasedAlphaColor = Color(0xfff0a518 )
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(40.dp)
                            .background(increasedAlphaColor)
                    ) {
                        Text(
                            text = num2,
                            fontSize = 10.sp,
                            color = Color.White,



                            )

                }
                }
            }

        }

    }



}





























@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun DashboardScreenPreviewLight() {
    DashboardScreen(rememberNavController())
}

