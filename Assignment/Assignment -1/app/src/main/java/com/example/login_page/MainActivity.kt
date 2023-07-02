package com.example.login_page

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Disp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Disp(){
    Column (Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.size(25.dp))
        Image(painter = painterResource(R.drawable.r),
            contentDescription ="Top Logo"
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = "Sign up to see photos and videos \n " +
                "from Your friends.",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        val context = LocalContext.current
        Spacer(modifier = Modifier.size(15.dp))
        Button(
            onClick = { Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()},
            Modifier
                .width(width = 340.dp)
                .height(height = 45.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Blue
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
//            Icon(painter = painterResource(id = R.drawable.facebook),
//                contentDescription ="Facebook logo",
//                modifier = Modifier
//                    .size(ButtonDefaults.IconSize)
//                    .background(Color.Black)
//            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Log in with Facebook",
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp
            )
        }
        Spacer(modifier = Modifier.size(10.dp))


        Text(text = "OR",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }

    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,

        ){
        Divider(thickness = 1.dp,
            color = Color.Black,
            modifier = Modifier
                .width(width = 180.dp)
                .padding(top = 230.dp, start = 28.dp, end = 15.dp)
        )

        Divider(thickness = 1.dp,
            color = Color.Black,
            modifier = Modifier
                .width(width = 180.dp)
                .padding(top = 230.dp, end = 28.dp, start = 15.dp)
        )


    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.size(180.dp))
        val te = remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            modifier = Modifier
                .width(width = 340.dp),
            value =te.value ,
            onValueChange = {
                te.value = it
            },
            label =  {
                Text(text = "Mobile No or E-mail")
            }
        )

        val name = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            modifier = Modifier.width(width = 340.dp),
            value =name.value ,
            onValueChange = {
                name.value = it
            },
            label =  {
                Text(text = "Full Name")
            }
        )

        val user = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            modifier = Modifier.width(width = 340.dp),
            value =user.value ,
            onValueChange = {
                user.value = it
            },
            label =  {
                Text(text = "Username")
            }
        )
        val pass = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            modifier = Modifier.width(width = 340.dp),
            value =pass.value ,
            onValueChange = {
                pass.value = it
            },
            label =  {
                Text(text = "Password")
            }
        )
        Text(text = "People who use our service may have uploaded your contact " +
                "information to Instagram. Learn more\n" +
                "\n" +
                "By signing up, you agree to our Terms, Privacy Policy and Cookies Policy.",
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(22.dp)
        )
        val context1 = LocalContext.current
        Button(
            onClick = {Toast.makeText(context1,"Successful",Toast.LENGTH_SHORT).show()},
            Modifier
                .width(width = 340.dp)
                .height(height = 45.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Blue
            ),
            shape = RoundedCornerShape(10.dp)
        ){
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Sign Up",
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp
            )
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefultPreview(){
    Disp()
}