package com.odougle.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

object NotificationUtils {
    val CHANNEL_ID = "default"

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(context: Context){
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channelName = context.getString(R.string.notif_channel_name)
        val channelDescription = context.getString(R.string.notif_channel_description)
        val channel = NotificationChannel(CHANNEL_ID,
        channelName,
        NotificationManager.IMPORTANCE_DEFAULT).apply {
            description = channelDescription
            enableLights(true)
            lightColor = Color.GREEN
            enableVibration(true)
            vibrationPattern = longArrayOf(100,200,300,400,500,400,300,200,100)
        }
        notificationManager.createNotificationChannel(channel)
    }

    fun notificationSimple(mainActivity: MainActivity) {
        TODO("Not yet implemented")
    }

    fun notificationWithTapAction(mainActivity: MainActivity) {
        TODO("Not yet implemented")
    }

    fun notificationBigText(context: Context) {
        TODO("Not yet implemented")
    }

    fun notificationWithButtonAction(mainActivity: MainActivity) {


    }

    fun notificationAutoReply(mainActivity: MainActivity) {
        TODO("Not yet implemented")
    }

    fun notificationInbox(mainActivity: MainActivity) {
        TODO("Not yet implemented")
    }

    fun notificationHeadsUp(mainActivity: MainActivity) {
        TODO("Not yet implemented")
    }


}