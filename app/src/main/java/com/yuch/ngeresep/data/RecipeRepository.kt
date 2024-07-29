package com.yuch.ngeresep.data

import com.yuch.ngeresep.model.Recipe
import com.yuch.ngeresep.model.RecipeData

class RecipeRepository {
    fun getRecipes(): List<Recipe> {
        return RecipeData.recipes
    }

    fun searchRecipes(query: String): List<Recipe> {
        return if (query.isEmpty()) {
            getRecipes()
        } else {
            getRecipes().filter {
                it.nama?.contains(query, ignoreCase = true)
                it.deskripsiSingkat?.contains(query, ignoreCase = true) ?: false
            }
        }
    }
}
