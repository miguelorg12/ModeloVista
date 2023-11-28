package com.example.modelo_vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.modelo_vista.ViewModel.SumaviewModel;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SumaviewModel Miviewmodel = new ViewModelProvider(this).get(SumaviewModel.class);

        Button suma = findViewById(R.id.buttonsumar);
        Button resta = findViewById(R.id.buttonrestar);
        EditText num1 = findViewById(R.id.valor1);
        EditText num2 = findViewById(R.id.valor2);
        TextView resultado = findViewById(R.id.textViewResultado);

        suma.setOnClickListener(view -> {
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            ((SumaviewModel) Miviewmodel).Sumar(n1, n2);
        });
        resta .setOnClickListener(view -> {
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            ((SumaviewModel) Miviewmodel).Restar(n1, n2);
        });
        ((SumaviewModel) Miviewmodel).getResultado().observe(this, s -> resultado.setText(s));
    }
}