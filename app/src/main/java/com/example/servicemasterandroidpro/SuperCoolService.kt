package com.example.servicemasterandroidpro

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class SuperCoolService : Service() {

    private val loc = LocalBinder()
    override fun onBind(intent: Intent): IBinder {
        return loc
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent,startId)
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}
class LocalBinder: Binder() {
    fun action(q:Int):String
    {
        val exec = Executer()
        var x = ""
        Thread(Runnable{
            val ans = (exec.stepen(q))
            for (i in ans)
                x += i
        }).start()
        return x
    }
}
