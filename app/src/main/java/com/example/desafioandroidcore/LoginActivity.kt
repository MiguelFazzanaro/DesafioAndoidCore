package com.example.desafioandroidcore

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_body.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        bt_login_login.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        bt_login_register.setOnClickListener {
            startActivity(Intent (this, CadastroActivity::class.java))
        }
    }
}