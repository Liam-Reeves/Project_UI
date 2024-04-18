package net.ezra.ui.evening



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME

@Composable
fun EveningScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_EVENING) { inclusive = true }
                    }
                },
            text = "Home Screen",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 30.sp

        )




    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

