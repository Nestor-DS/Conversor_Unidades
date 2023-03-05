package com.example.conversor_unidades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class temperatura extends AppCompatActivity {


    private EditText editTextCelsius;
    private Button buttonConvertToFahrenheit;
    private Button buttonConvertToKelvin;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        editTextCelsius = findViewById(R.id.editTextCelsius);
        buttonConvertToFahrenheit = findViewById(R.id.buttonConvertToFahrenheit);
        buttonConvertToKelvin = findViewById(R.id.buttonConvertToKelvin);
        textViewResult = findViewById(R.id.textViewResult);

        buttonConvertToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsiusString = editTextCelsius.getText().toString();
                if (!celsiusString.isEmpty()) {
                    double celsius = Double.parseDouble(celsiusString);
                    double fahrenheit = celsius * 1.8 + 32;
                    textViewResult.setText(String.format("%.2f grados Fahrenheit", fahrenheit));
                }
            }
        });

        buttonConvertToKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsiusString = editTextCelsius.getText().toString();
                if (!celsiusString.isEmpty()) {
                    double celsius = Double.parseDouble(celsiusString);
                    double kelvin = celsius + 273.15;
                    textViewResult.setText(String.format("%.2f grados Kelvin", kelvin));
                }
            }
        });



    }

    public void irMain (View view){

        Intent cambio= new Intent(temperatura.this,MainActivity.class);
        startActivity(cambio);

    }

}
