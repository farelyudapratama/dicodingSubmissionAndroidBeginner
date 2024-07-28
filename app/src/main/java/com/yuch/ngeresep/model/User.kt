package com.yuch.ngeresep.model

import com.yuch.ngeresep.R

data class User(
    val nama: String,
    val email: String,
    val foto: Int
)

object UserData {
    val user = User(
        "Farel Yuda Pratama",
        "farelyudapratama51@gmail.com",
        R.drawable.poto
    )
}