package com.odougle.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding :  ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSimple.setOnClickListener {

        }

        binding.btnTapAction.setOnClickListener {

        }

        binding.btnBigText.setOnClickListener {

        }

        binding.btnActionButton.setOnClickListener {

        }

        binding.btnDirectReply.setOnClickListener {

        }

        binding.btnInbox.setOnClickListener {

        }

        binding.btnHeadsUp.setOnClickListener {

        }


    }
}