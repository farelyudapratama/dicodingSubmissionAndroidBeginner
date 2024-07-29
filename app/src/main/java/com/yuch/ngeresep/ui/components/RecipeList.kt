package com.yuch.ngeresep.ui.components

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuch.ngeresep.model.Recipe
import com.yuch.ngeresep.model.RecipeData
import com.yuch.ngeresep.ui.theme.NgeresepTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecipeList(
    recipeList: List<Recipe>,
    onClick: (Recipe) -> Unit,
) {
    LazyColumn {
        items(
            items = recipeList,
            key = { it.id!! }
        ) { recipe ->
            RecipeCard(
                recipe = recipe,
                onClick = onClick,
                modifier = Modifier.animateItemPlacement(tween(durationMillis = 300))
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun RecipeListPreview() {
    NgeresepTheme {
        RecipeList(
            recipeList = RecipeData.recipes,
            onClick = {}
        )
    }
}
