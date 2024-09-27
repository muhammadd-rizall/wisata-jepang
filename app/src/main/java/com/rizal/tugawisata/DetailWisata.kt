package com.rizal.tugawisata

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailWisata : AppCompatActivity() {
    private lateinit var txtnama : TextView
    private lateinit var btnseedetail : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_wisata)

        txtnama = findViewById(R.id.txtnama)
        btnseedetail =findViewById(R.id.btnseedetail)

        val detailTeks = intent.getStringExtra("judul")
        txtnama.setText(detailTeks)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnseedetail.setOnClickListener(){
            val intent =Intent(this@DetailWisata,DetailView::class.java)
            startActivity(intent)
        }
    }
}