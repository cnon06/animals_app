package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detailactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailactivity)

        var intent = intent

        if(intent != null)
        {
            findViewById<TextView>(R.id.detailText).setText(intent.getStringExtra("name"))

           // findViewById<ImageView>(R.id.flagImage).setImageResource(R.drawable.animal8)

       findViewById<ImageView>(R.id.animalImage).setImageResource(intent.getIntExtra("image",R.drawable.animal10))
        }




    }
}