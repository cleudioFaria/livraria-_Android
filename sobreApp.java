package com.example.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sobreApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_app);
    }

    public void voltaMenu(View v){
        Intent voltaMenu = new Intent(this, menuLivraria.class);
        startActivities(new Intent[]{voltaMenu});
    }
}