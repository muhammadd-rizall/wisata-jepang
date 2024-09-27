package com.rizal.tugawisata

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rizal.tugawisata.adapter.AdapterWisata
import com.rizal.tugawisata.adapter.AdapterWisata1
import com.rizal.tugawisata.model.MockList
import com.rizal.tugawisata.model.MockListt
import com.rizal.tugawisata.model.ModelWisata
import com.rizal.tugawisata.model.ModelWisata1

class MainActivity : AppCompatActivity() {

    private lateinit var rv_image : RecyclerView
    private lateinit var rv_image1 : RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rv_image = findViewById(R.id.rv_image)
        rv_image1 = findViewById(R.id.rv_image1)


        //recyclerView
        rv_image.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true)
        val adapter = AdapterWisata(MockList.getModel() as ArrayList<ModelWisata> , this)
        rv_image.adapter = adapter

        rv_image1.layoutManager = GridLayoutManager(this, 2)
        val adapter1 = AdapterWisata1(MockListt.getModel() as ArrayList<ModelWisata1>, this)
        rv_image1.adapter = adapter1


        //

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}