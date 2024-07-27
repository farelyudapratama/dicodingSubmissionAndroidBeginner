package com.yuch.ngeresep.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuch.ngeresep.R
import com.yuch.ngeresep.model.Recipe
import com.yuch.ngeresep.ui.theme.NgeresepTheme

@Composable
fun RecipeCard (
    recipe: Recipe,
    onClick: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier
            .padding(8.dp)
            .clickable { onClick(recipe) }
    ){
        Column {
            Image(
                painter = painterResource(id = recipe.foto ?: R.drawable.ic_launcher_background),
                contentDescription = recipe.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = recipe.nama ?: "Unknown Recipe",
                modifier = Modifier.padding(horizontal = 8.dp),
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = recipe.deskripsiSingkat ?: "No description available",
                modifier = Modifier.padding(horizontal = 8.dp),
                fontSize = 12.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}


@Composable
@Preview(showBackground = true)
fun CartItemPreview() {
    NgeresepTheme {
        RecipeCard(
            recipe = Recipe(
                nama = "Telur Balado",
                foto = R.drawable.telur_balado,
                deskripsiSingkat = "Telur Balado adalah hidangan tradisional Indonesia yang terkenal dengan rasa pedas dan nikmatnya."
            ),
            onClick = {}
        )
    }
}