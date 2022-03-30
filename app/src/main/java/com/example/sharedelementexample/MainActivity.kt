package com.example.sharedelementexample

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat

//개인적으로 좋아하는 기능이다. Shared Element Transition
 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Activity 1")
        val imageView : ImageView = findViewById(R.id.image_activity_1)
        val button : Button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent : Intent = Intent(this, MainActivity2::class.java)
            val options : ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, imageView,
                ViewCompat.getTransitionName(imageView)!!)
            startActivity(intent, options.toBundle())
        }
    }
}