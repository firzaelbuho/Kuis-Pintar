package com.proximastudio.kuispintar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.proximastudio.kuispintar.model.Db
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_category.spanduk


class Category : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        //show ads

        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()
        spanduk.loadAd(adRequest)

        btn1.setOnClickListener {
            Db.category = "umum"
            startActivity(Intent(this,Start::class.java))
        }
        btn2.setOnClickListener {
            Db.category = "sains"
            startActivity(Intent(this,Start::class.java))
        }
        btn3.setOnClickListener {
            Db.category = "tekno"
            startActivity(Intent(this,Start::class.java))
        }
        btn4.setOnClickListener {
            Db.category = "hiburan"
            startActivity(Intent(this,Start::class.java))
        }

    }
}
