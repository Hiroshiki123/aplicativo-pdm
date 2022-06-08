package com.example.tapfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class creditos extends AppCompatActivity {
Button btncacto;
Button btnhenri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

            btncacto = findViewById(R.id.btncacto);
            btncacto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                abrir();
                }
            });
        btnhenri = findViewById(R.id.btnhenri);
        btnhenri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir2();
            }
        });
    }
    public void abrir(){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cactocareca/"));
        startActivity(intent);
    }
    public void abrir2(){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/henritubosaka/"));
        startActivity(intent);
    }
}