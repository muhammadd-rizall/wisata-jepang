package com.rizal.tugawisata.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.rizal.tugawisata.DetailWisata
import com.rizal.tugawisata.MainActivity
import com.rizal.tugawisata.R
import com.rizal.tugawisata.adapter.AdapterWisata.MyViewHolder
import com.rizal.tugawisata.model.ModelWisata1

class AdapterWisata1(
    val itemList: ArrayList<ModelWisata1>,
    val getActivity : MainActivity

): RecyclerView.Adapter<AdapterWisata1.MyViewHolder>(){
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemJudul : TextView
        var itemLokasi : TextView

        init {
            itemImage =itemView.findViewById(R.id.gambar1) as ImageView
            itemJudul =itemView.findViewById(R.id.itemjudul) as TextView
            itemLokasi =itemView.findViewById(R.id.itemlokasi) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_wisata1, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
            return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemList[position]
        Log.d("AdapterWisata1", "Item Judul: ${item.judul}, Lokasi: ${item.lokasi}")
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemJudul.setText(itemList[position].judul)
        holder.itemLokasi.setText(itemList[position].lokasi)


        //kita intent
        holder.itemView.setOnClickListener(){
            //inten
            //context atau this --> getActivity
            val intent = Intent(getActivity,DetailWisata::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("image",itemList[position].image)
            intent.putExtra("nama",itemList[position].judul)
            //passed ke detail
            getActivity.startActivity(intent)
        }
    }


}