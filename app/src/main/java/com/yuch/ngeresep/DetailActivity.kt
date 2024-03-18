package com.yuch.ngeresep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yuch.ngeresep.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_MASAKAN ="extra_masakan"
    }

    private lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val data = intent.getParcelableExtra<Masakan>(EXTRA_MASAKAN)

        supportActionBar?.title = "Detail Masakan"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        with(detailBinding){
            imageMasakan.setImageResource(data?.foto ?: R.drawable.telur_balado)
            textNamaMasakan.text = "Resep ${data?.nama}"
            textDeskripsiSingkat.text = data?.deskripsiSingkat
            textBahan.text = data?.bahan?.mapIndexed { _, bahan -> "- $bahan" }?.joinToString(separator = "\n") ?: ""
            textBumbu.text = data?.bumbu?.mapIndexed{_, bumbu -> "- $bumbu"}?.joinToString(separator = "\n") ?: ""
            textLangkah.text = data?.langkah?.mapIndexed{index, langkah -> "${index + 1}. $langkah"}?.joinToString(separator = "\n\n") ?: ""

            actionShare.setOnClickListener {
                val shareIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    putExtra(Intent.EXTRA_SUBJECT, "Resep ${data?.nama}")
                    putExtra(Intent.EXTRA_TEXT, "Resep ${data?.nama}:\n\n" +
                            "Bahan-bahan:\n${detailBinding.textBahan.text}\n\n" +
                            "Bumbu:\n${detailBinding.textBumbu.text}\n\n" +
                            "Langkah-langkah:\n${detailBinding.textLangkah.text}")
                }

                startActivity(Intent.createChooser(shareIntent, "Bagikan resep melalui"))
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
