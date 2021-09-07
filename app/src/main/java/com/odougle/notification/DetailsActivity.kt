package com.odougle.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.notification.databinding.ActivityDetailsBinding
import com.odougle.notification.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private val binding : ActivityDetailsBinding by lazy {
        ActivityDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}