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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuch.ngeresep.R
import com.yuch.ngeresep.model.Recipe
import com.yuch.ngeresep.ui.theme.NgeresepTheme

@Composable
fun RecipeCard(
    recipe: Recipe,
    onClick: (Recipe) -> Unit,
    modifier: Modifier = Modifier
) {
    val nameMaxLines = remember { mutableStateOf(1) }
    Card(
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        modifier = modifier
            .padding(8.dp)
            .clickable { onClick(recipe) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.padding(6.dp)
        ) {
            Image(
                painter = painterResource(id = recipe.foto ?: R.drawable.ic_launcher_background),
                contentDescription = recipe.nama,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .padding(8.dp)
                    .size(90.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(
                modifier = modifier.fillMaxWidth()
            ) {
                Text(
                    text = recipe.nama ?: "Unknown Recipe",
                    modifier = modifier
                        .fillMaxWidth(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    onTextLayout = { result: TextLayoutResult ->
                        val lineCount = result.lineCount
                        nameMaxLines.value = if (lineCount > 1) 2 else 1
                    }
                )
                Spacer(modifier = modifier.height(4.dp))
                val maxLinesForDescription = if (nameMaxLines.value > 1) 2 else 3
                Text(
                    text = recipe.deskripsiSingkat ?: "No description available",
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    fontSize = 12.sp,
                    maxLines = maxLinesForDescription,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CartItemPreview() {
    NgeresepTheme {
        RecipeCard(
            recipe = Recipe(
                id = "1",
                nama = "Telur Balado",
                foto = R.drawable.telur_balado,
                deskripsiSingkat = "Telur Balado  hidangan tradisional Indonesia yang terkenal dengan rasa pedas dan nikmatnya."
            ),
            onClick = {}
        )
    }
}
