package com.example.tapfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class receita extends AppCompatActivity {
    Button btnsorvete;
    Button btnbatata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);
        btnbatata =findViewById(R.id.btnbatata);
        btnsorvete =findViewById(R.id.btnsorvete);

        btnsorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir();
            }
        });
        btnbatata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir2();
            }
        });
    }
    public void abrir(){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.receitasdemae.com.br/receitas/sorvete-de-menta-com-chocolate/"));
        startActivity(intent);
    }
    public void abrir2(){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.panelinha.com.br/receita/Batata-frita-tradicional"));
        startActivity(intent);
    }
}