package com.yuch.ngeresep.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuch.ngeresep.R
import com.yuch.ngeresep.model.Recipe

@Composable
fun RecipeDetailScreen(
    recipe: Recipe,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Column (
                modifier = modifier
                    .fillMaxSize()
            ){
                Text(
                    text = recipe.nama ?: "Unknown Recipe",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(bottom = 16.dp)
                )
                Image(
                    painter = painterResource(id = recipe.foto ?: R.drawable.ic_launcher_background),
                    contentDescription = recipe.nama,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .size(150.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = recipe.deskripsiSingkat ?: "No description available")
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
        item {
            RecipeList(title = "Bahan:", items = recipe.bahan ?: listOf("No ingredients available"))
            Spacer(modifier = Modifier.height(16.dp))
            RecipeList(title = "Bumbu:", items = recipe.bumbu ?: listOf("No spices available"))
            Spacer(modifier = Modifier.height(16.dp))
            RecipeList(title = "Langkah-langkah:", items = recipe.langkah ?: listOf("No steps available"), useNumber = true)
        }
    }
}

@Composable
fun RecipeList(
    title: String,
    items: List<String>,
    useNumber: Boolean = false
) {
    Column {
        Text(text = title, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        items.forEachIndexed { index, item ->
            val number = if (useNumber) "${index + 1}. " else "- "
            Text(
                text = "$number$item",
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(vertical = 4.dp)
            )
        }
    }
}