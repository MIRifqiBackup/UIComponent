package com.mobile.miftakhulilmanrifqi.a205410082.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mobile.miftakhulilmanrifqi.a205410082.uicomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imgButton = binding.imgButtonAdd
        val txtNama = binding.editNama
        imgButton.setOnClickListener {
            Toast.makeText(this, "Anda " + txtNama.text.toString(), Toast.LENGTH_LONG).show()
        }
    }
}