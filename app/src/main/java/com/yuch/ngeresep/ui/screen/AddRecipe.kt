package com.yuch.ngeresep.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yuch.ngeresep.R
import com.yuch.ngeresep.model.Recipe
import java.util.UUID

@Composable
fun AddRecipeScreen(
    onRecipeAdded: (Recipe) -> Unit
) {
    val id = remember { mutableStateOf(UUID.randomUUID().toString()) }
    val nama = remember { mutableStateOf("") }
    val bahanInput = remember { mutableStateOf("") }
    val bumbuInput = remember { mutableStateOf("") }
    val langkahInput = remember { mutableStateOf("") }
    val deskripsiSingkat = remember { mutableStateOf("") }

    // Helper function to convert comma-separated strings to List<String>
    fun parseCommaSeparatedString(input: String): List<String> {
        return input.split(",").map { it.trim() }.filter { it.isNotEmpty() }
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TextField(
            value = nama.value,
            onValueChange = { nama.value = it },
            label = { Text("Name") }
        )
        TextField(
            value = bahanInput.value,
            onValueChange = { bahanInput.value = it },
            label = { Text("Ingredients (comma separated)") }
        )
        TextField(
            value = bumbuInput.value,
            onValueChange = { bumbuInput.value = it },
            label = { Text("Spices (comma separated)") }
        )
        TextField(
            value = langkahInput.value,
            onValueChange = { langkahInput.value = it },
            label = { Text("Steps (comma separated)") }
        )
        TextField(
            value = deskripsiSingkat.value,
            onValueChange = { deskripsiSingkat.value = it },
            label = { Text("Brief Description") }
        )
        Button(onClick = {
            val newRecipe = Recipe(
                id = id.value,
                nama = nama.value,
                bahan = parseCommaSeparatedString(bahanInput.value),
                bumbu = parseCommaSeparatedString(bumbuInput.value),
                langkah = parseCommaSeparatedString(langkahInput.value),
                deskripsiSingkat = deskripsiSingkat.value
            )
            onRecipeAdded(newRecipe)
        }) {
            Text("Add Recipe")
        }
    }
}