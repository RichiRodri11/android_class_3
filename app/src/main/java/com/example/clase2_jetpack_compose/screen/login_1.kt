package com.example.clase2_jetpack_compose.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.clase2_jetpack_compose.R
import com.example.paginacion.screen.customColor

@Composable
fun Waos(page: Int){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = customColor),
    )

}





@Composable
fun Main2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = customColor),
    ) {
        Content2()
    }
}


@Composable
fun Content2(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Fila3(img = R.drawable.country_side_bro, descript = "Este es el icono")
        Text(text = "Sectores de la agricultura",
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp),
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Lorem ipsum dolor sit amet consectetur adipiscing " +
                            "elit pretium quam, non litora lectus augue et cras " +
                            "pulvinar ullamcorper. Euismod sollicitudin eu cum augue" +
                            " massa nulla ullamcorper duis leo imperdiet per, dui habitant" +
                            " maecenas diam penatibus porta vivamus est cursus elementum, " +
                            "nibh magnis varius malesuada ac eros blandit cubilia auctor sem.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 18.sp
                )
            }
        }
    }
}
@Composable
fun Fila2(
    img : Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(350.dp)
                .height(350.dp))
    }
}


