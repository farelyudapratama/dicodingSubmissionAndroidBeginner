package com.yuch.ngeresep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.yuch.ngeresep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Masakan> = arrayListOf()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.addAll(DataMasakan.listData)

        val layoutManager = LinearLayoutManager(this)
        binding.rvHeroes.layoutManager = layoutManager

        val masakanAdapter = MasakanAdapter(list)
        binding.rvHeroes.adapter = masakanAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.menuProfile -> {
            startActivity(Intent(this, ProfileActivity::class.java))
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}