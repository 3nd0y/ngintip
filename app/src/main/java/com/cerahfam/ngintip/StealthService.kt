package com.example.mystealthapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class StealthService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("StealthService", "Service is running in background...")
        // Your background logic here
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
