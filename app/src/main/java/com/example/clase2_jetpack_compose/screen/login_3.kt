package com.example.paginacion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.clase2_jetpack_compose.R
import com.example.clase2_jetpack_compose.screen.Fila1

val customColor = Color(0xF5, 0xF5, 0xDC)
val customColor1 = Color(0xCC, 0xFF, 0xCC)
@Composable
fun LazyContent(navigation: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = customColor)
    ) {
        Column(Modifier.fillMaxSize()) {
            simpleLazyRow1()
            simpleLazyRow2()
            simpleLazyColumn()
        }
        Button(
            onClick = { navigation.navigate("view_1") },
            colors = ButtonDefaults.buttonColors(customColor1),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text(
                text = "Volver",
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun simpleLazyRow1(){
    val items = listOf(
        R.drawable.farm_house_rafiki,
        R.drawable.country_side_bro,
        R.drawable.coffee_farm_bro,
        R.drawable.farmer_bro,
        R.drawable.farm_house_bro,
        R.drawable.farm_tractor_bro,
        R.drawable.farm_house_rafiki,
        R.drawable.country_side_bro,
        R.drawable.coffee_farm_bro,
        R.drawable.farmer_bro,
        R.drawable.farm_house_bro,
        R.drawable.farm_tractor_bro,
        R.drawable.farm_house_rafiki,
        R.drawable.country_side_bro,
        R.drawable.coffee_farm_bro,
        R.drawable.farmer_bro,
        R.drawable.farm_house_bro,
        R.drawable.farm_tractor_bro
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .background(color = customColor)) {
            items(items){ item ->
                Image(
                    painter = painterResource(id = item),
                    contentDescription = null, // Aquí puedes añadir la descripción si es necesario
                    modifier = Modifier
                        .padding(8.dp) // Modificador de margen para la imagen
                        .size(80.dp) // Tamaño deseado para las imágenes
                )
            }
        }
    }
}

@Composable
fun simpleLazyRow2(){
    val items = listOf(
        R.drawable.farmer_bro,
        R.drawable.farm_house_bro,
        R.drawable.farm_house_rafiki,
        R.drawable.country_side_bro,
        R.drawable.coffee_farm_bro
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .background(color = customColor)) {
            items(items){ item ->
                Image(
                    painter = painterResource(id = item),
                    contentDescription = null, // Aquí puedes añadir la descripción si es necesario
                    modifier = Modifier
                        .padding(8.dp) // Modificador de margen para la imagen
                        .size(200.dp) // Tamaño deseado para las imágenes
                )
            }
        }
    }
}
@Composable
fun simpleLazyColumn(){
    val items = listOf("Los cada vez mayores impactos del cambio climático " +
            "podrían disminuir aún más los rendimientos de los cultivos, especialmente " +
            "en las regiones del mundo con mayor inseguridad alimentaria. Al mismo tiempo, " +
            "los sistemas alimentarios son responsables" +
            " de alrededor del 30 % de las emisiones de gases de efecto invernadero (GEI).",
        "Los actuales sistemas alimentarios también amenazan la salud de las personas y del planeta" +
                " y generan niveles insostenibles de contaminación y desechos. Un tercio de los " +
                "alimentos producidos en el mundo se pierde o se desperdicia, y es imperioso abordar" +
                " este problema para mejorar la seguridad alimentaria y nutricional, " +
            "así como para contribuir a alcanzar los objetivos relacionados con el clima y a" +
            " reducir las presiones sobre el medio ambiente.",

        "Los cada vez mayores impactos del cambio climático " +
                "podrían disminuir aún más los rendimientos de los cultivos, especialmente " +
                "en las regiones del mundo con mayor inseguridad alimentaria. Al mismo tiempo, " +
                "los sistemas alimentarios son responsables" +
                " de alrededor del 30 % de las emisiones de gases de efecto invernadero (GEI).",
        "Los actuales sistemas alimentarios también amenazan la salud de las personas y del planeta" +
                " y generan niveles insostenibles de contaminación y desechos. Un tercio de los " +

                "alimentos producidos en el mundo se pierde o se desperdicia, y es imperioso abordar" +
                " este problema para mejorar la seguridad alimentaria y nutricional, " +
                "así como para contribuir a alcanzar los objetivos relacionados con el clima y a" +
                " reducir las presiones sobre el medio ambiente.")

    LazyColumn(modifier = Modifier
        .fillMaxHeight()
        .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        items(items){ item ->
            Text(text = item, modifier = Modifier.padding(17.dp))
            /*FilaV(img = R.drawable.farm_house_bro, descript = "imagen")*/
        }
    }
}
@Composable
fun FilaH1(
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
                .width(60.dp)
                .height(60.dp))
    }
}
@Composable
fun FilaH2(
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
                .width(190.dp)
                .height(190.dp))
    }
}
@Composable
fun FilaV(
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
                .width(200.dp)
                .height(200.dp))
    }
}
