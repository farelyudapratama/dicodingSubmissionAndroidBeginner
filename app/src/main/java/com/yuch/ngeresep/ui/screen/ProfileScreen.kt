package com.yuch.ngeresep.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuch.ngeresep.R
import com.yuch.ngeresep.model.User

@Composable
fun ProfileScreen(
    user: User,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(16.dp)
        ) {
            Box(modifier = Modifier.size(250.dp)) {
                Image(
                    painter = painterResource(id = user.foto),
                    contentDescription = "Photo Profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(250.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                IconButton(
                    onClick = { /* Implement edit functionality here */ },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(x = 16.dp, y = -16.dp)
                        .padding(4.dp)
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit Photo",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
            Text(
                text = user.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black,
            )
            Text(
                text = user.email,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    ProfileScreen(
        user = User(
            nama = "Farel Yuda Pratama",
            email = "farelyudapratama51@gmail.com",
            foto = R.drawable.poto
        )
    )
}
