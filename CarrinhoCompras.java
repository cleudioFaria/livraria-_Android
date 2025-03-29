package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CarrinhoCompras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho_compras);
    }

    public void  dadosComprador(View v){
        Intent dadosComprador = new Intent(this, DadosComprador.class);
        startActivities(new Intent[]{dadosComprador});
    }

    public void menu(View v){
        Intent voltaMenu = new Intent(this, android.R.menu.class);
        startActivities(new Intent[]{voltaMenu});
    }
}