package com.rizal.tugawisata.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizal.tugawisata.MainActivity
import com.rizal.tugawisata.R
import com.rizal.tugawisata.model.ModelWisata

class AdapterWisata(
    val itemList: ArrayList<ModelWisata>,
    val getActivity : MainActivity
): RecyclerView.Adapter<AdapterWisata.MyViewHolder>(){
    class MyViewHolder (itemView : View):RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemNama : TextView

        init {
            itemImage =itemView.findViewById(R.id.gambar) as ImageView
            itemNama =itemView.findViewById(R.id.judul) as TextView
        }

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val nView = LayoutInflater.from(parent.context)
          .inflate(R.layout.list_item_wisata, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].judul)
    }


}

