package com.vallejo.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultadoActivity extends AppCompatActivity{

    TextView txtResultado;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.txtResultado);

        double resultado =getIntent().getDoubleExtra("resultado", 0.0);

        txtResultado.setText("Resultado: " + resultado);
    }
}