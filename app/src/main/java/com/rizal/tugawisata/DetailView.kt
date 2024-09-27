package com.rizal.tugawisata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailView : AppCompatActivity() {
    private lateinit var imgDetail : ImageView
    private lateinit var txtLokasi : TextView
    private lateinit var txtTanggal : TextView
    private lateinit var txtKeterangan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_view)

        imgDetail = findViewById(R.id.imgDetail)
        txtLokasi = findViewById(R.id.txtLokasi)
        txtTanggal = findViewById(R.id.txtTanggal)
        txtKeterangan = findViewById(R.id.txtKeterangan)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}