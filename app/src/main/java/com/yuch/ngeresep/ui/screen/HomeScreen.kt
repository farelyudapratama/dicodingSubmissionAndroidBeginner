package com.yuch.ngeresep.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.yuch.ngeresep.R
import com.yuch.ngeresep.model.RecipeData
import com.yuch.ngeresep.ui.components.RecipeList

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        RecipeList(
            recipeList = RecipeData.recipes,
            onClick = { }
        )
    }
}