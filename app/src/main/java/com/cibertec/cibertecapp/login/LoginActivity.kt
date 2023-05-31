package com.cibertec.cibertecapp.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cibertec.cibertecapp.R

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar?.hide()
    }
}