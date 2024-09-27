package com.rizal.tugawisata.model

import com.rizal.tugawisata.R

data class ModelWisata(
    val image : Int,
    val judul : String
)

object MockList{
    fun getModel() : List<ModelWisata>{
        val  itemModel1 = ModelWisata(
            R.drawable.hakone,
              "Hakone"
        )

        val  itemModel2 = ModelWisata(
            R.drawable.honshu,
              "Honshu"
        )
        val  itemModel3 = ModelWisata(
            R.drawable.asakusa,
              "Asakusa"
        )
        val  itemModel4 = ModelWisata(
            R.drawable.osaka,
              "Osaka"
        )

        val itemList : ArrayList<ModelWisata> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)

        return itemList


    }

}
