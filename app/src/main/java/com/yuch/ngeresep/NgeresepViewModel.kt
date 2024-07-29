package com.yuch.ngeresep

import androidx.lifecycle.ViewModel
import com.yuch.ngeresep.data.RecipeRepository
import com.yuch.ngeresep.model.Recipe
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class NgeresepViewModel(private val repository: RecipeRepository): ViewModel() {
    private val _groupedRecipes = MutableStateFlow(
        repository.getRecipes()
            .sortedBy { it.nama }
            .groupBy { it.nama?.get(0) ?: ' ' }
    )
    val groupedRecipes: StateFlow<Map<Char, List<Recipe>>> get() = _groupedRecipes

    private val _query = mutableStateOf("")
    val query: State<String> get() = _query

    fun search(newQuery: String) {
        _query.value = newQuery
        _groupedRecipes.value = repository.searchRecipes(_query.value)
            .sortedBy { it.nama }
            .groupBy { it.nama?.get(0) ?: ' ' }
    }
}
