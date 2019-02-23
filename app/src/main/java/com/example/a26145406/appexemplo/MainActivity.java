package com.example.a26145406.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText valor;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.inputValor);
        resultado = findViewById(R.id.textResult);
    }

    public void calcularValor(View v){
        double valorConta = Double.parseDouble(valor.getText().toString());
        double res = valorConta * 1.1;
        String texto = "O valor da conta é " + res;
        resultado.setText(texto);
    }


}
