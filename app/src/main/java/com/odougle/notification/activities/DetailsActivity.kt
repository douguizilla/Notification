package com.odougle.notification.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.notification.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private val binding : ActivityDetailsBinding by lazy {
        ActivityDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.txtMessage.text = intent.getStringExtra(EXTRA_MESSAGE)
    }

    companion object{
        const val EXTRA_MESSAGE = "message"
    }
}