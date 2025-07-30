package com.kennedy.aspire.ui.screens.category


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kennedy.aspire.R
import com.kennedy.aspire.ui.theme.newYellow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Other Categories") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newYellow,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "cart"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "info"
                    )
                }

            }
        )
        //end of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome to Swaggy ! ",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp),

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Discover unique styles across categories. Find something for every vibe ",
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp),

            )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Shop by category ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp),

            )
        Spacer(modifier = Modifier.height(10.dp))

        //Card
        Card(
            onClick ={},
            modifier = Modifier.fillMaxWidth().height(180.dp).padding(start = 20.dp , end = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "car",
                    modifier = Modifier.fillMaxSize().height(250.dp),
                    contentScale = ContentScale.FillBounds
                )

                Text(
                    text = "Jewellery ",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.White

                )

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favourite",
                    modifier = Modifier.align(alignment =Alignment.TopStart).padding(10.dp),
                    tint = Color.White
                )

            }

        }
        //end of card
        Spacer(modifier = Modifier.height(10.dp))

        //Card
        Card(
            onClick ={},
            modifier = Modifier.fillMaxWidth().height(180.dp).padding(start = 20.dp , end = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.img),
                    contentDescription = "sneaker",
                    modifier = Modifier.fillMaxSize().height(250.dp),
                    contentScale = ContentScale.FillBounds
                )

                Text(
                    text = "Sneaker ",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.White

                )

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favourite",
                    modifier = Modifier.align(alignment =Alignment.TopStart).padding(10.dp),
                    tint = Color.White
                )

            }

        }
        //end of card
        Text(
            text = "More categories coming soon... ",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 100.dp, end = 80.dp),

            )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick ={},
            colors = ButtonDefaults.buttonColors(newYellow),
            shape = CircleShape,
            modifier = Modifier.padding(start = 100.dp, end = 40.dp),




            ) {
            Text(text = "Explore All Products")
        }


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Follow us on Instagram @swagggy_ke ",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 70.dp, end = 50.dp),



            )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Need help ? Contact us at support@swaggy.co.ke",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 30.dp, end = 20.dp),



            )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = " Wear the vibe. Live the vibe. ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 60.dp, end = 50.dp),


            )















    }

}
@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    CategoryScreen(rememberNavController())
}