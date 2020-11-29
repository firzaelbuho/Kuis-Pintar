package com.proximastudio.kuispintar.model

import android.content.Context
import android.media.MediaPlayer

object Db {

        lateinit var questionList : List<QuestionSet>
        var isClassic = true
        var category = "default"
        var score = 0
        val interstitialID = "ca-app-pub-8201627220488781/7384950320"





        fun playSound(source: Int, context: Context) {
            val mediaPlayer = MediaPlayer.create(context, source)
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener {
                mediaPlayer.stop();
                mediaPlayer.release();
            }

        }
}