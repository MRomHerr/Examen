package com.example.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.examen.ui.theme.ExamenTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenTheme {
                    MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        "Amigo",
                        maxLines = 1
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.arrow_top_left),
                            contentDescription = "flecha",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },

                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.edit),
                            contentDescription = "edit",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.star_rate),
                            contentDescription = "star",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.settings),
                            contentDescription = "ajustes",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color(0xFFC04F15), //bars y fab
                    titleContentColor = Color(0xFFFDF3D0), //iconos y texto en barras
                    navigationIconContentColor = Color(0xFFFDF3D0),
                    actionIconContentColor = Color(0xFFFDF3D0)

                )
            )
        },

        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFFF6C6AD),
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        FloatingActionButton(
                            onClick = { /*TODO*/ },
                            containerColor = Color(0xFFC04F15),
                            modifier = Modifier
                                .size(56.dp) // Tamaño del FloatingActionButton
                                .align(Alignment.CenterVertically) // Alineado verticalmente al centro
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.group_add),
                                contentDescription = "add",
                                modifier = Modifier.size(35.dp)
                            )
                        }
                    }
                }
            )
        }


    ) { innerPadding ->
        Spacer(modifier = Modifier.height(35.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(colorResource(id = R.color.teal_200))
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp,25.dp)

            ) {
                item { //item1

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))

                    ) {
                        Column(
                            modifier = Modifier.padding(vertical = 20.dp)
                                .align(Alignment.Center)
                        ) {
                            Text(
                                text = "          José Luis Varela",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color(0xFF656565))
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            Box(
                                modifier = Modifier
                                    .width(250.dp)
                                    .height(160.dp)
                                    .background(Color(0xFFF2AA84))
                                    .clip(RoundedCornerShape(8.dp))
                                    .border(width = 3.dp, color = Color.Black)
                                    .padding(12.dp,12.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.letter_j), // Reemplaza con tu imagen
                                    contentDescription = "J",
                                    modifier = Modifier.size(100.dp,100.dp)
                                        .align(Alignment.CenterStart)

                                )

                                Image(
                                    painter = painterResource(id = R.drawable.letter_l), // Reemplaza con tu imagen
                                    contentDescription = "L",
                                    modifier = Modifier.size(100.dp,100.dp)
                                        .align(Alignment.CenterEnd)
                                )
                            }

                        }
                    }
                }

                item { //item2
                    Box(
                        modifier = Modifier
                            .padding(25.dp)
                            .fillMaxWidth()
                            .background(Color(0xFFF2AA84))
                            .border(width = 3.dp, color = Color.Black)
                            .padding(25.dp)

                    ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Row(
                                    modifier = Modifier.fillMaxWidth()

                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.video), // Reemplaza con tu imagen
                                        contentDescription = "video",
                                        modifier = Modifier.size(40.dp,40.dp)
                                    )

                                    Spacer(modifier = Modifier.width(9.dp))

                                    Column(
                                        horizontalAlignment = Alignment.Start
                                    ) {

                                    Text(
                                        text = "523 556 7799",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565))
                                        )

                                    Text(
                                        text = " ID_Webex",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565))
                                    )

                                        }
                                }

                                Spacer(modifier = Modifier.height(25.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth()

                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.call), // Reemplaza con tu imagen
                                        contentDescription = "call",
                                        modifier = Modifier.size(40.dp,40.dp)
                                    )

                                    Spacer(modifier = Modifier.width(9.dp))

                                    Column(
                                        horizontalAlignment = Alignment.Start
                                    ) {

                                        Text(
                                            text = "+34 555 687 443",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                fontFamily = FontFamily.Serif,
                                                color = Color(0xFF656565))
                                        )

                                        Text(
                                            text = "Móvil",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                fontFamily = FontFamily.Serif,
                                                color = Color(0xFF656565))
                                        )
                                    }

                                }

                                Spacer(modifier = Modifier.height(25.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth()

                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.mail), // Reemplaza con tu imagen
                                        contentDescription = "mail",
                                        modifier = Modifier.size(40.dp,40.dp)
                                    )

                                    Spacer(modifier = Modifier.width(9.dp))

                                    Column(
                                        horizontalAlignment = Alignment.Start
                                    ) {

                                        Text(
                                            text = "jlvarela@gmail.com",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                fontFamily = FontFamily.Serif,
                                                color = Color(0xFF656565))
                                        )

                                        Text(
                                            text = "Email",
                                            style = TextStyle(
                                                fontSize = 20.sp,
                                                fontFamily = FontFamily.Serif,
                                                color = Color(0xFF656565))
                                        )
                                    }

                                }


                            }
                    }
                }


                item { //item3

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))

                    ) {
                        LazyRow(
                            modifier = Modifier.fillMaxWidth()
                                .padding(32.dp,0.dp),
                            horizontalArrangement = Arrangement.spacedBy(32.dp)
                        ) {
                            item  {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.call), // Reemplaza con tu imagen
                                        contentDescription = "llamar",
                                        modifier = Modifier.size(40.dp, 40.dp)
                                    )

                                    Text(
                                        text = "Llamar",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565)
                                        )
                                    )
                                    Spacer(modifier = Modifier.height(25.dp))
                                }

                                Spacer(modifier = Modifier.width(32.dp))

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.whatshot),
                                        contentDescription = "what",
                                        modifier = Modifier.size(40.dp, 40.dp)
                                    )

                                    Text(
                                        text = "Whats’p",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565)
                                        )
                                    )
                                }

                                Spacer(modifier = Modifier.width(32.dp))


                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.video), // Reemplaza con tu imagen
                                        contentDescription = "video",
                                        modifier = Modifier.size(40.dp, 40.dp)
                                    )

                                    Text(
                                        text = " Vídeo",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565)
                                        )
                                    )

                                }

                                Spacer(modifier = Modifier.width(32.dp))

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.swap_call), // Reemplaza con tu imagen
                                        contentDescription = "swap",
                                        modifier = Modifier.size(40.dp, 40.dp)
                                    )

                                    Text(
                                        text = " Swap",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565)
                                        )
                                    )
                                }

                                Spacer(modifier = Modifier.width(32.dp))

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.sms), // Reemplaza con tu imagen
                                        contentDescription = "sms",
                                        modifier = Modifier.size(40.dp, 40.dp)
                                    )

                                    Text(
                                        text = "SMS",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565)
                                        )
                                    )
                                }

                                Spacer(modifier = Modifier.width(32.dp))

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.mail), // Reemplaza con tu imagen
                                        contentDescription = "mail",
                                        modifier = Modifier.size(40.dp, 40.dp)
                                    )
                                    Text(
                                        text = "Email",
                                        style = TextStyle(
                                            fontSize = 20.sp,
                                            fontFamily = FontFamily.Serif,
                                            color = Color(0xFF656565)
                                        )
                                    )
                                }

                            }
                        }
                    }
                }

                item { //item4

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFF2AA84))
                            .clip(RoundedCornerShape(8.dp))
                            .border(width = 3.dp, color = Color.Black)
                            .padding(40.dp,25.dp)

                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Alignment.Center)

                        ) {
                            Row(
                                modifier = Modifier.padding(vertical = 20.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.music_note),
                                    contentDescription = "nota",
                                    modifier = Modifier.size(40.dp, 40.dp)
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Text(
                                    text = " Tono de llamada",
                                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        color = Color(0xFF656565)
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.height(25.dp))

                            Row(
                                modifier = Modifier.padding(vertical = 20.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.share),
                                    contentDescription = "share",
                                    modifier = Modifier.size(40.dp, 40.dp)
                                )
                                Spacer(modifier = Modifier.width(20.dp))

                                Text(
                                    text = "Compartir",
                                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        color = Color(0xFF656565)
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.height(25.dp))

                            Row(
                                modifier = Modifier.padding(vertical = 20.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.voicemail),
                                    contentDescription = "voicemail",
                                    modifier = Modifier.size(40.dp, 40.dp)
                                )

                                Spacer(modifier = Modifier.width(20.dp))

                                Text(
                                    text = " Buzón de voz",
                                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        color = Color(0xFF656565)
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.height(25.dp))

                            Row(
                                modifier = Modifier.padding(vertical = 20.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.block),
                                    contentDescription = "block",
                                    modifier = Modifier.size(40.dp, 40.dp)
                                )

                                Spacer(modifier = Modifier.width(20.dp))

                                Text(
                                    text = "Bloquear amigo",
                                    style = TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.Serif,
                                        color = Color(0xFF656565)
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenTheme {
        MainScreen()
    }
}