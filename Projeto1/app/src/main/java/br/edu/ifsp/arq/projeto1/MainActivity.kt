package br.edu.ifsp.arq.projeto1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var edtName: TextView
    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edtName = findViewById(R.id.edt_name)
        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener(View.OnClickListener {
            val nome: String = edtName.text.toString()
            android.widget.Toast.makeText(this, getString(R.string.message) + " " + nome,
                android.widget.Toast.LENGTH_SHORT).show()
        })
    }
}