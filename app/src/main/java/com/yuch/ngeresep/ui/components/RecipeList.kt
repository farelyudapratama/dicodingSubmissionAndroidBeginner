package com.yuch.ngeresep.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuch.ngeresep.model.Recipe
import com.yuch.ngeresep.model.RecipeData
import com.yuch.ngeresep.ui.theme.NgeresepTheme

@Composable
fun RecipeList (
    recipeList: List<Recipe>,
    onClick: (Recipe) -> Unit,
    ) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(recipeList.size) { index ->
            RecipeCard(
                recipe = recipeList[index],
                onClick = onClick
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