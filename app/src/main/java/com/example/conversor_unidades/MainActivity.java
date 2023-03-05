package com.example.conversor_unidades;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonL = findViewById(R.id.buttonL);
        buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, longitud.class);
                startActivity(intent);
            }
        });

        ImageButton buttonP = findViewById(R.id.buttonP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, peso.class);
                startActivity(intent);
            }
        });

        ImageButton buttonV = findViewById(R.id.buttonV);
        buttonV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, volumen.class);
                startActivity(intent);
            }
        });

        ImageButton buttonT = findViewById(R.id.buttonT);
        buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, temperatura.class);
                startActivity(intent);
            }
        });
    }
}