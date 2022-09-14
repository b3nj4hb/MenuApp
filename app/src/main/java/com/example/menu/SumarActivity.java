package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SumarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
    }

    // Metodo para ir al menu de inicio
    public void IrMenu(View view) {
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }
}