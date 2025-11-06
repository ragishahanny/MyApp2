package com.example.myfirstappbp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1. Ini data yang bakal tampil
        val dataList = arrayListOf(
            Mahasiswa("Wonwoo", "23.12.1796"),
            Mahasiswa("Shinyu", "23.12.1107"),
            Mahasiswa("Naravit", "23.12.3182"),
            Mahasiswa("Eric", "23.12.1122"),
            Mahasiswa("Phuwin", "23.12.2255")
        )

        // 2. Inisialisasi RecyclerView
        val rv_mahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)

        // 3. Atur LayoutManager
        rv_mahasiswa.layoutManager = GridLayoutManager(this,2)

        // 4. Inisialisasi Adapter
        val adapter = MahasiswaAdapter(dataList)

        // 5. Set Adapter ke RecyclerView
        rv_mahasiswa.adapter = adapter
    }
}