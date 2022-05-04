package com.cnon.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import com.google.android.material.navigation.NavigationView

class splashscreen : AppCompatActivity() {

    var ggfg = 3;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
    }


    fun UiHere()
    {


    }

    override fun onResume() {

        ggfg = 3;

        super.onResume()
        object : CountDownTimer (3000,1000)
        {




            override fun onTick(p0: Long) {

                findViewById<TextView>(R.id.textView2).setText(""+ggfg)
                ggfg--

                println(ggfg.toString())
            }

            override fun onFinish() {

                val intent = Intent(this@splashscreen, MainActivity :: class.java)
               startActivity(intent)
            }

        }.start()

    }

}