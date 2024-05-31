package com.example.clase2_jetpack_compose.screen

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
import com.example.clase2_jetpack_compose.R
import com.example.paginacion.screen.customColor

@Composable
fun Main1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = customColor),
    ) {
        Content1()
    }
}


@Composable
fun Content1(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Fila1(img = R.drawable.farmer_bro, descript = "Este es el icono")
        Text(text = "La importancia de la agricultura",
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
                    text = "La agricultura puede ayudar a reducir la pobreza, aumentar " +
                            "los ingresos y mejorar la seguridad alimentaria del 80% de " +
                            "las personas en situación de pobreza, que viven en zonas " +
                            "rurales y se dedican principalmente a la agricultura.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 18.sp
                )
            }
        }
    }
}



@Composable
fun Fila1(
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

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    Main1()
}
