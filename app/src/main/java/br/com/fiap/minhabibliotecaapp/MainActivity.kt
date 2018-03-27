package br.com.fiap.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.minhabiblioteca.Calculadora
import br.com.fiap.minhabiblioteca.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomToast().showToast(this, "Apareceeeeeee!!!")
    }
}
