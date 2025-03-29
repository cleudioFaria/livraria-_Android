package com.example.livraria;

import static com.example.livraria.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DadosCompra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_dados_compra);

    }

    public void  menu(View v){
        Intent voltaMenu = new Intent(this, menuLivraria.class);
        startActivities(new Intent[]{voltaMenu});
    }
}