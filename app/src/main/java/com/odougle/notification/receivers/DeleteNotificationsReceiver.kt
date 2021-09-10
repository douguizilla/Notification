package com.odougle.notification.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class DeleteNotificationsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,
            "Notificação excluída!",
            Toast.LENGTH_SHORT).show()
    }
}