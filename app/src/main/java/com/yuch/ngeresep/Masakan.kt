package com.yuch.ngeresep

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Masakan (
    var nama : String ?= "",
    var foto : Int ?= 0,
    var bahan: Array<String> ?= null,
    var bumbu: Array<String> ?= null,
    var langkah: Array<String> ?= null,
    var deskripsiSingkat : String ?= ""
) : Parcelable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Masakan

        if (nama != other.nama) return false
        if (foto != other.foto) return false
        if (bahan != null) {
            if (other.bahan == null) return false
            if (!bahan.contentEquals(other.bahan)) return false
        } else if (other.bahan != null) return false
        if (bumbu != null) {
            if (other.bumbu == null) return false
            if (!bumbu.contentEquals(other.bumbu)) return false
        } else if (other.bumbu != null) return false
        if (langkah != null) {
            if (other.langkah == null) return false
            if (!langkah.contentEquals(other.langkah)) return false
        } else if (other.langkah != null) return false
        if (deskripsiSingkat != other.deskripsiSingkat) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nama?.hashCode() ?: 0
        result = 31 * result + (foto ?: 0)
        result = 31 * result + (bahan?.contentHashCode() ?: 0)
        result = 31 * result + (bumbu?.contentHashCode() ?: 0)
        result = 31 * result + (langkah?.contentHashCode() ?: 0)
        result = 31 * result + (deskripsiSingkat?.hashCode() ?: 0)
        return result
    }
}