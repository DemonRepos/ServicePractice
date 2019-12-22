package com.example.servicemasterandroidpro

import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //6 вариант (3 в степени n)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButt.setOnClickListener {
            val k = Intent(this,SuperCoolService::class.java)
            val n = editText.text.toString().toIntOrNull()
            if (n==null || n<0) ans.text = ""
            else {
                val m = Connector()
                bindService(k,m, Context.BIND_AUTO_CREATE)
                val bind = m.myBinder!!
                ans.text = bind.action(n)
            }

        }
    }
}
