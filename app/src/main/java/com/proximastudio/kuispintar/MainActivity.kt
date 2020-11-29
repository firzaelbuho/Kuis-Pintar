package com.proximastudio.kuispintar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.proximastudio.kuispintar.model.DataRepository
import com.proximastudio.kuispintar.model.Db
import com.proximastudio.kuispintar.model.QuestionSet
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {



    private val SPLASH_TIME_OUT:Long = 3100 // 1 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,Home::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }

    private fun getData() {

        val postServices = DataRepository.create()
        postServices.getQuestion().enqueue(object :
            Callback<List<QuestionSet>> {



            override fun onResponse(call: Call<List<QuestionSet>>, response: Response<List<QuestionSet>>) {
                if (response.isSuccessful) {
                    val data = response.body()

                    if (data != null) {

                        Db.questionList = data
                        // Log.d("tag",data.toString())
                    }



                }
            }


            override fun onFailure(call: Call<List<QuestionSet>>, error: Throwable) {
                Log.e("tag", "errornya ${error.message}")
            }


        })
    }
}
