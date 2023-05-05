package com.example.chuckersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chuckerteam.chucker.api.ChuckerInterceptor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val interceptor = ChuckerInterceptor
    }
}