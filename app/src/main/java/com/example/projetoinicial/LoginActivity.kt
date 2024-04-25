package com.example.projetoinicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)
        val edtsenha = findViewById<EditText>(R.id.edtSenha)
    }
    fun btnEntrar_click(view: View) {
        val senha=findViewById<EditText>(R.id.edtSenha)
        if(senha.text.toString().toInt()=="123456".toInt()){
            val intent = Intent(this,InicioActivity::class.java).apply {
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Usuário não encontrado", Toast.LENGTH_SHORT).show()
        }
        }
    }

