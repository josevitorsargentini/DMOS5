package br.edu.ifsp.arq.ads.dmos5.calculadoraimc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var edtPeso: TextView
    lateinit var edtAltura: TextView
    lateinit var btnCalc: Button
    lateinit var txtImc: TextView
    lateinit var txtCond: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edtPeso = findViewById(R.id.edt_peso)
        edtAltura = findViewById(R.id.edt_altura)
        btnCalc = findViewById(R.id.btn_calc)
        txtImc = findViewById(R.id.txt_imc)
        txtCond = findViewById(R.id.txt_condicao)

        btnCalc.setOnClickListener(View.OnClickListener {
            val imc: Float = (edtPeso.getText().toString().toFloat()/(edtAltura.getText().toString().toFloat()*edtAltura.getText().toString().toFloat()))
            txtImc.setText("Seu IMC é " + imc.toString())

            if (imc < 18.5){
                txtCond.setText("Você está abaixo do peso.")
            } else if (imc >= 18.5 && imc < 24.9){
                txtCond.setText("Você está na com o peso normal.")
            } else if (imc >= 24.9 && imc < 29.9){
                txtCond.setText("Você está acima do peso.")
            } else if (imc >= 30){
                txtCond.setText("Você está obeso.")
            }
        })
    }
}