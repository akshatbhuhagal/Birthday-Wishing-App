package com.akshatbhuhagal.birthdaywishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.akshatbhuhagal.birthdaywishing.databinding.ActivityMainBinding


const val SEND_NAME = "send_name"


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }

        binding.goBtn.setOnClickListener {

            val sendName = binding.inputName.editableText.toString()

            val gtHappyBirthdayActivity = Intent(this, ActivityHappyBirthday::class.java).apply {
                putExtra(SEND_NAME, sendName)
            }
            startActivity(gtHappyBirthdayActivity)

        }


    }
}