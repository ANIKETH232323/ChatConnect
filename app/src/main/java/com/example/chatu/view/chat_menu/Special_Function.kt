package com.example.chatu.view.chat_menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.chatu.R
import com.example.chatu.view.chat_menu.ui.theme.Pink140
import com.example.chatu.view.chat_menu.ui.theme.Pink80
import com.example.chatu.view.chat_menu.ui.theme.Purple40

/**
 * Set of widgets/views which will be used throughout the application.
 * This is used to increase the code usability.
 */

@Composable
fun Title(title: String) {
    Text(
        text = title,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxHeight(0.5f)
    )
}

// Different set of buttons in this page
@Composable
fun Buttons(title: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = White
        ),
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(0),
    ) {
        Text(
            text = title
        )
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Appbar(title: String, action: () -> Unit,homeViewModel: HomeViewModel = viewModel()) {
//    val message: String by homeViewModel.message.observeAsState(initial = "")
//    val messages: List<Map<String, Any>> by homeViewModel.messages.observeAsState(
//        initial = emptyList<Map<String, Any>>().toMutableList()
//    )
//    Scaffold(
//        topBar = {
//
//            TopAppBar(
//                title = {
//                    Text(text = title)
//
//                },
//
//                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Pink140),
//                actions = {
//                    IconButton(onClick = {
//                        homeViewModel.yesClick()
//
//                    }) {
//                        Icon(Icons.Rounded.Info, contentDescription = "")
//                    }
//
//                }
//            )
//            if (homeViewModel.isDialoge){
//                Dialog(onDismissRequest = { homeViewModel.noClick()},
//                    properties = DialogProperties(
//                        usePlatformDefaultWidth = false
//                    )
//                ) {
////                    val dialogWindowProvider = LocalView.current.parent as DialogWindowProvider
////                    dialogWindowProvider.window.setGravity(Gravity.BOTTOM)
//
//                    Column(verticalArrangement = Arrangement.SpaceBetween) {
//                        Spacer(modifier = Modifier.height(250.dp))
//                        Card(
//                            elevation = CardDefaults.cardElevation(5.dp),
//                            shape = RoundedCornerShape(15.dp),
//
//                            modifier = Modifier
//                                .fillMaxWidth(0.95f)
//                                .border(
//                                    1.dp,
//                                    color = Color.Yellow,
//                                    shape = RoundedCornerShape(15.dp)
//                                ),
//                        ) {
//                            Column(
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .padding(18.dp),
//                                verticalArrangement = Arrangement.spacedBy(25.dp),
//                                horizontalAlignment = Alignment.CenterHorizontally
//                            ) {
//
//                                Text(
//                                    text = "Are You Sure",
//                                    textAlign = TextAlign.Center,
//                                    fontWeight = FontWeight.Bold
//                                )
//                                Divider()
//                            }
//                            Column(modifier = Modifier.padding(5.dp)) {
//                                Row(
//                                    horizontalArrangement = Arrangement.Center,
//                                    modifier = Modifier.fillMaxWidth()
//
//                                ) {
//                                    Button(
//                                        onClick = { homeViewModel.noClick()},
//                                    ) {
//                                        Text(text = "Cancel")
//                                    }
//                                    Spacer(modifier = Modifier.size(35.dp))
//                                    Button(
//                                        onClick = action,
//
//                                        modifier = Modifier.fillMaxWidth(.39f)
//                                    ) {
//                                        Text(text = "Yes")
//
//                                    }
//
//
//                                }
//                            }
//
//
//                        }
//                    }
//
//                }
//            }
//
//
//        },
//
//        ) {
//        Surface(modifier = Modifier.padding(it)) {
//
//    }
//}

//@Composable
//fun TextFormField(value: String, onValueChange: (String) -> Unit, label: String, keyboardType: KeyboardType, visualTransformation: VisualTransformation) {
//    OutlinedTextField(
//        value = value,
//        onValueChange = onValueChange,
//        label = {
//            Text(
//                label
//            )
//        },
//        maxLines = 1,
//        modifier = Modifier
//            .padding(horizontal = 20.dp, vertical = 5.dp)
//            .fillMaxWidth(),
//        keyboardOptions = KeyboardOptions(
//            keyboardType = keyboardType
//        ),
//        singleLine = true,
//        visualTransformation = visualTransformation
//    )
//}

@Composable
fun SingleMessage(message: String, isCurrentUser: Boolean) {

    if (isCurrentUser){
        Column(horizontalAlignment = Alignment.End,
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                shape = RoundedCornerShape(topStart = 30.dp, bottomStart = 30.dp, bottomEnd = 25.dp),
                colors = CardDefaults.cardColors(
                    containerColor =  Purple40
                ),
                elevation = CardDefaults.cardElevation(5.dp)

                ) {
                Text(
                    text = message,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .padding(16.dp),
                    color =  White
                )
            }
        }
    }

    else{
        Box{
            Column(horizontalAlignment = Alignment.Start,
                modifier = Modifier.wrapContentSize()
            ) {
                Card(
                    shape = RoundedCornerShape( topEnd = 30.dp, bottomEnd =25.dp, bottomStart = 30.dp),
                    colors = CardDefaults.cardColors(
                        containerColor =  Pink80
                    ),
                    elevation = CardDefaults.cardElevation(1.dp),
                    modifier = Modifier.wrapContentSize()


                    ) {
                    Text(
                        text = message,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(16.dp).wrapContentWidth(),
                        maxLines = Int.MAX_VALUE,
                        color = White
                    )
                }
            }
        }

    }



}