package com.proximastudio.kuispintar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.proximastudio.kuispintar.model.Db

import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.spanduk

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()
        spanduk.loadAd(adRequest)

        btnStart.setOnClickListener {
            startActivity(Intent(this,Category::class.java))
        }
        btnChal.setOnClickListener {
            Db.isClassic = false
            startActivity(Intent(this,Start::class.java))
        }
        btnAbout.setOnClickListener {
            startActivity(Intent(this,About::class.java))
        }
    }
}
