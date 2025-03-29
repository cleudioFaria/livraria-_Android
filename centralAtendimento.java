package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class centralAtendimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_atendimento);
    }

    public void voltaMenu(View v){
        Intent voltaMenu = new Intent(this, menuLivraria.class);
        startActivities(new Intent[]{voltaMenu});
    }

    public void sobreApp(View v){
        Intent app = new Intent(this, sobreApp.class);
        startActivities(new Intent[]{app});
    }

}