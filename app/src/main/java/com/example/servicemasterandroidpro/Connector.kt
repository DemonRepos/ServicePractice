package com.example.servicemasterandroidpro

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder

class Connector: ServiceConnection {
    var myBinder:LocalBinder? = null
    override fun onServiceDisconnected(name: ComponentName?) {

    }

    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
       myBinder = service as LocalBinder
    }

}