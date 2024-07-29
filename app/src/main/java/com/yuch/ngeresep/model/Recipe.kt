package com.yuch.ngeresep.model

data class Recipe (
    var id : String ?= "",
    var nama : String ?= "",
    var foto : Int ?= 0,
    var bahan: List<String> ?= null,
    var bumbu: List<String> ?= null,
    var langkah: List<String> ?= null,
    var deskripsiSingkat : String ?= ""
)