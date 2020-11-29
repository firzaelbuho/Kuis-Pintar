package com.proximastudio.kuispintar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.proximastudio.kuispintar.model.Db
import com.proximastudio.kuispintar.model.QuestionSet
import kotlinx.android.synthetic.main.activity_start.*

class Start : AppCompatActivity() {

    var setSoal : MutableList<QuestionSet> = mutableListOf()
    var soalMax = 0
    var soalCount = 0
    var key = "x"
    var isWrong = false
    var scoreCount = 0
    val isClassic = Db.isClassic
    lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        MobileAds.initialize(this) {}
        val adRequest = AdRequest.Builder().build()
        spanduk.loadAd(adRequest)

        // check mode

        setup()


    }

    private fun setup() {
        if(isClassic){
            soalMax = 10
            var category = Db.category
            when(category){
                "umum" -> addSoal("umum")
                "sains" -> addSoal("sains")
                "tekno" -> addSoal("tekno")
                "hiburan" -> addSoal("hiburan")

            }
        }else{
            soalMax = (Db.questionList.size)
            addSoalAll()
        }

        // shuffle soal

        setSoal = setSoal.shuffled() as MutableList<QuestionSet>

        // start quiz

        startQuiz(0)


        // btn clicklistener

        btnNext.setOnClickListener {
            if(soalCount >= soalMax){

                // move to result
                Db.score = scoreCount
                startActivity(Intent(this, Result::class.java))

            }else if(!isClassic && isWrong){

                // move to result
                Db.score = scoreCount
                startActivity(Intent(this, Result::class.java))

            }else{

                btnIsEnabled(true)
                resetBtn()
                startQuiz(soalCount)

            }

        }

        btnA.setOnClickListener{
            checkAnswer(btnA , "a")
        }
        btnB.setOnClickListener{
            checkAnswer(btnB , "b")
        }
        btnC.setOnClickListener{
            checkAnswer(btnC , "c")
        }
        btnD.setOnClickListener{
            checkAnswer(btnD , "d")
        }
        btnE.setOnClickListener{
            checkAnswer(btnE , "e")
        }
    }


    fun startQuiz(indexSoal : Int){

        // set countdown

        countDownTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timer.text = "${millisUntilFinished/1000}"
            }
            override fun onFinish() {
                timer.setText("waktu habis !")
                timer.setBackgroundResource(R.drawable.button_bg_false)
                btnNext.isEnabled = true
                btnNext.setBackgroundResource(R.drawable.button_bg1)
                findAnswer()
            }
        }

        countDownTimer.start()

        // setup button and view
        timer.setBackgroundResource(R.drawable.button_bg_true)
        btnNext.isEnabled = false
        btnNext.setBackgroundResource(R.drawable.button_bg0)


        nomor.text = "${indexSoal+1}"
        soal.text = setSoal.get(indexSoal).question
        btnA.text = setSoal.get(indexSoal).opta
        btnB.text = setSoal.get(indexSoal).optb
        btnC.text = setSoal.get(indexSoal).optc
        btnD.text = setSoal.get(indexSoal).optd
        btnE.text = setSoal.get(indexSoal).opte
        key = setSoal.get(indexSoal).key


        soalCount ++

    }

    fun addSoal(category : String) {
        for (i in 0 until Db.questionList.size) {

            if (Db.questionList.get(i).cat.equals(category)) {

                setSoal.add(Db.questionList.get(i))
            }
        }
    }

    fun checkAnswer(btn:Button, answer:String){

        countDownTimer.cancel()

        if(answer.equals(key)){

            // true answer
            timer.text = "✔"
            timer.setBackgroundResource(R.drawable.button_bg_true)
            btn.setBackgroundResource(R.drawable.button_bg_true)
            Db.playSound(R.raw.benar , this)
            scoreCount += 10
        }else{
            // wrong answer
            timer.text = "✖"
            timer.setBackgroundResource(R.drawable.button_bg_false)
            btn.setBackgroundResource(R.drawable.button_bg_false)
            Db.playSound(R.raw.salah, this)
            isWrong = true
            findAnswer()
        }
        btnNext.isEnabled = true
        btnNext.setBackgroundResource(R.drawable.button_bg)
        btnIsEnabled(false)

    }

    fun btnIsEnabled(status : Boolean){
        btnA.isEnabled = status
        btnB.isEnabled = status
        btnC.isEnabled = status
        btnD.isEnabled = status
        btnE.isEnabled = status
    }

    fun findAnswer(){

        when(key){
            "a" -> btnA.setBackgroundResource(R.drawable.button_bg_true)
            "b" -> btnB.setBackgroundResource(R.drawable.button_bg_true)
            "c" -> btnC.setBackgroundResource(R.drawable.button_bg_true)
            "d" -> btnD.setBackgroundResource(R.drawable.button_bg_true)
            "e" -> btnE.setBackgroundResource(R.drawable.button_bg_true)
        }

    }

    fun resetBtn(){

        btnA.setBackgroundResource(R.drawable.button_bg)
        btnB.setBackgroundResource(R.drawable.button_bg)
        btnC.setBackgroundResource(R.drawable.button_bg)
        btnD.setBackgroundResource(R.drawable.button_bg)
        btnE.setBackgroundResource(R.drawable.button_bg)

    }

    fun addSoalAll(){
        setSoal = Db.questionList!! as MutableList<QuestionSet>
    }
}


