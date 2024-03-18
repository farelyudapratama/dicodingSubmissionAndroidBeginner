package com.yuch.ngeresep

import android.content.Intent
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yuch.ngeresep.databinding.ItemMasakanBinding

class MasakanAdapter(private val listMasakan : ArrayList<Masakan>) : RecyclerView.Adapter<MasakanAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val itemMasakanBinding:ItemMasakanBinding):RecyclerView.ViewHolder(itemMasakanBinding.root){
        fun bindItem(masakan: Masakan){
            with(itemMasakanBinding){
                tvItemName.text = masakan.nama
                tvItemDescription.text = masakan.deskripsiSingkat
            }
            val bitmap = masakan.foto?.let { BitmapFactory.decodeResource(itemView.resources, it) }
            itemMasakanBinding.imgItemPhoto.setImageBitmap(bitmap)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_MASAKAN, masakan)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMasakanBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = listMasakan.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(listMasakan[position])
    }
}
