package com.example.a26145406.appexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cubo extends AppCompatActivity {

    double raio = 3.141559;
    double altura;

    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        raio = findViewById(R.id.inputValor);
        altura = findViewById(R.id.textResult);


    }
    public void calcularCubo(View c){
        double valorConta = Double.parseDouble(valor.getText().toString());
        double res = valorConta * 1.1;
        String texto = "O valor da conta é " + res;
        resultado.setText(texto);
    }

    }
}
