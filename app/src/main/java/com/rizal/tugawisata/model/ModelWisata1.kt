package com.rizal.tugawisata.model

import android.media.Image
import com.rizal.tugawisata.R

data class ModelWisata1(
    val image: Int,
    val judul : String,
    val lokasi : String
)

object MockListt{
        fun getModel() : List<ModelWisata1>{
            val  itemModel1 = ModelWisata1(
                R.drawable.sensojitemple,
                "Osaka Castil",
                "Osaka"
            )
            val  itemModel2 = ModelWisata1(
                R.drawable.osakacastil,
                "Sensojima Temple",
                "Asakusa"
            )

            val  itemModel3 = ModelWisata1(
                R.drawable.okayama,
                "Okayama castil ",
                "Okayama"
            )
            val  itemModel4 = ModelWisata1(
                R.drawable.matsumoto,
                "Matsumoto castil ",
                "Nagano"
            )

            val itemList : ArrayList<ModelWisata1> = ArrayList()
            itemList.add(itemModel1)
            itemList.add(itemModel2)
            itemList.add(itemModel3)
            itemList.add(itemModel4)


            return itemList

        }

}
