package com.yuch.ngeresep.model

data class Recipe (
    var nama : String ?= "",
    var foto : Int ?= 0,
    var bahan: Array<String> ?= null,
    var bumbu: Array<String> ?= null,
    var langkah: Array<String> ?= null,
    var deskripsiSingkat : String ?= ""
)