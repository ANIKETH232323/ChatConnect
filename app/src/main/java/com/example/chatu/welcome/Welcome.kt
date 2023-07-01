package com.example.chatu.welcome

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatu.MainActivity
import com.example.chatu.R
import com.example.chatu.nav.Destination.Register

@Composable
private fun Gradient_Background(
    isVerticalGradient:Boolean,
    colors: List<Color>
): Brush {
    val end_off = if(isVerticalGradient){
        Offset(0f, Float.POSITIVE_INFINITY)
    }
    else{
        Offset(Float.POSITIVE_INFINITY,0f)
    }
    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = end_off
    )
}


@Composable
fun welcomeView(register: () -> Unit, login: () -> Unit){
    val gra = listOf(
        Color(0xFFDF6F56),
        Color(0xFFF2A02A)
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.Top),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Gradient_Background(isVerticalGradient = true, colors = gra))) {
        Spacer(modifier = Modifier.height(70.dp))
        Text(text = "Welcome",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(text ="     to\n⚡️ ChatConnect",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(end = 34.dp)
        )
        Text(text = "A Real-Time Chat And Communication App",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.Black
            )
        Spacer(modifier = Modifier.height(70.dp))
        Image(painter = painterResource(id = R.drawable.r), contentDescription ="Logo" )
        Spacer(modifier = Modifier.height(45.dp))


        Column(verticalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.Top)) {
            val context = LocalContext.current
            Button(onClick = register,
                modifier = Modifier.width(320.dp)
            ) {
                Text(text = "Register", modifier = Modifier.padding(vertical = 8.dp))
            }

            Button(onClick = login,
                modifier = Modifier.width(320.dp)
            ) {
                Text(text = "Login", modifier = Modifier.padding(vertical = 8.dp))
            }

        }


    }

}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun GreetingPreview2() {
//    com.example.chatu.ui.theme.ChatUTheme {
//        Heloo()
//    }
//
//}