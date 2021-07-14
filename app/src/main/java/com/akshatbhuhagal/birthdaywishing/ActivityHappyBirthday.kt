package com.akshatbhuhagal.birthdaywishing

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akshatbhuhagal.birthdaywishing.databinding.ActivityHappyBirthdayBinding
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class ActivityHappyBirthday : AppCompatActivity() {

    private lateinit var binding: ActivityHappyBirthdayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHappyBirthdayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }


        binding.viewKonfetti.build()
            .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2000L)
            .addShapes(Shape.Square, Shape.Circle)
            .addSizes(Size(12))
            .setPosition(-50f, binding.viewKonfetti.width + 50f, -50f, -50f)
            .streamFor(300, 5000L)


        val sendName = intent.getStringExtra(SEND_NAME)

        binding.tvBirthday.text = "Happy Birthday $sendName"



    }
}