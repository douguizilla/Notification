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
            NotificationUtils.notificationSimple(this)
        }

        binding.btnTapAction.setOnClickListener {
            NotificationUtils.notificationWithTapAction(this)
        }

        binding.btnBigText.setOnClickListener {
            NotificationUtils.notificationBigText(this)
        }

        binding.btnActionButton.setOnClickListener {
            NotificationUtils.notificationWithButtonAction(this)
        }

        binding.btnDirectReply.setOnClickListener {
            NotificationUtils.notificationAutoReply(this)
        }

        binding.btnInbox.setOnClickListener {
            NotificationUtils.notificationInbox(this)
        }

        binding.btnHeadsUp.setOnClickListener {
            NotificationUtils.notificationHeadsUp(this)
        }


    }
}