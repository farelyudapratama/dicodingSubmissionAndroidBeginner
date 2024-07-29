package com.yuch.ngeresep.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yuch.ngeresep.NgeresepViewModel
import com.yuch.ngeresep.R
import com.yuch.ngeresep.ViewModelFactory
import com.yuch.ngeresep.data.RecipeRepository
import com.yuch.ngeresep.model.Recipe
import com.yuch.ngeresep.model.RecipeData
import com.yuch.ngeresep.ui.components.RecipeList
import com.yuch.ngeresep.ui.components.SearchBar
import com.yuch.ngeresep.ui.navigation.Screen

@Composable
fun HomeScreen(
    onRecipeClick: (Recipe) -> Unit,
    viewModel: NgeresepViewModel = viewModel(factory = ViewModelFactory(RecipeRepository())),
    modifier: Modifier = Modifier
) {
    val groupedRecipes by viewModel.groupedRecipes.collectAsState()
    val query by viewModel.query

//    Scaffold (
//        floatingActionButton = {
//            FloatingActionButton(
//                onClick = {
//                    navController.navigate(Screen.AddRecipe.route)
//                }
//            ) {
//                Icon(
//                    imageVector = Icons.Filled.Add,
//                    contentDescription = "Add Recipe",
//                    tint = MaterialTheme.colorScheme.onPrimary
//                )
//            }
//        }
//    ){
//
//    }
    Column(modifier = modifier
        .fillMaxSize()
        .padding(0.dp)) {
        SearchBar(
            query = query,
            onQueryChange = { viewModel.search(it) }
        )
        RecipeList(
            recipeList = groupedRecipes.values.flatten(),
            onClick = onRecipeClick,
        )
    }
}
