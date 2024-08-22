package com.example.kotlinbtk_2


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinbtk_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("On Create çalıştırıldı.")
    }

    override fun onStart() {
        super.onStart()
        println("On Start çalıştırıldı.")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume çalıştırıldı.")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause çalıştırıldı.")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop çalıştırıldı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy çalıştırıldı.")
    }


    fun sonrakiSayfa(view: View) {
        val intent = Intent(this, SecondActivity::class.java)

        val kullaniciGirdisi = binding.editTextText.text.toString()

       intent.putExtra("isim", kullaniciGirdisi)
        startActivity(intent)

            binding.textView.text = "Isim : $kullaniciGirdisi"
    }

}