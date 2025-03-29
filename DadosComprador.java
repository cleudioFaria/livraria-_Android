package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DadosComprador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_comprador);
    }



    public void finalizarCompra (View v){
        Intent finalizarCompra = new Intent(this, DadosCompra.class);
        startActivities(new Intent[]{finalizarCompra});
    }

    public void menuPrincipal (View v){
        Intent menu = new Intent(this, android.R.menu.class);
        startActivities(new Intent[]{menu});
    }
}