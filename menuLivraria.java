package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuLivraria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_livraria);
    }

    public void listaLivros(View v){
        Intent listaLivr = new Intent(this, listaLivros.class);
        startActivities(new Intent[]{listaLivr});
    }

    public void valorVenda (View v){
        Intent vendeLivros = new Intent(this, valorVenda.class);
        startActivities(new Intent[]{vendeLivros});
    }

    public void centralAtendimento(View v){
        Intent atendimento =new Intent(this, centralAtendimento.class);
        startActivities(new Intent[]{ atendimento});
    }

    public void voltaTelaPrincipal(View v){
        Intent appPrincipal = new Intent(this, MainActivity.class);
        startActivities(new Intent[]{appPrincipal});
    }

    public void carrinhoCompra(View v){
        Intent carrinhoComra = new Intent(this, CarrinhoCompras.class);
        startActivities(new Intent[]{carrinhoComra});
    }
}