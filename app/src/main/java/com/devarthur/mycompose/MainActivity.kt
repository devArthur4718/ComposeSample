package com.devarthur.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row {
                Column {
                    NameAndMessageTime(name = "Jimmy Hendrix", messageTime = "10 dias atrás")
                    NameAndMessageTime(name = "Jimmy Hendrix", messageTime = "25 dias atrás")
                    NameAndMessageTime(name = "Jimmy Hendrix", messageTime = "8 dias atrás")
                    NameAndMessageTime(name = "Jimmy Hendrix", messageTime = "22 dias atrás")
                }
            }
        }
    }
}

@Composable
fun NameAndMessageTime(
    name: String,
    messageTime: String,
) {
    Spacer(modifier = Modifier.height(8.dp))
    Column {
        Row {
            Spacer(modifier = Modifier.width(8.dp))
            AvatarImage(imageResource = R.drawable.hendrix1)
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = messageTime, color = Color.Gray)
            }
        }
        Text(text = stringResource(id = R.string.message_ipsum))
    }
}

@Composable
private fun AvatarImage(@DrawableRes imageResource: Int) {
    Image(
        painter = painterResource(imageResource),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .border(1.dp, Color.Gray, CircleShape),
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewNameAndMessageTime() {
    NameAndMessageTime(name = "Hendrix", messageTime = "5 days ago")
}
