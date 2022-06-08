package com.example.tapfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class configuracao extends AppCompatActivity {
    Button btninspiracao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);

        btninspiracao = findViewById(R.id.btninspiracao);
        btninspiracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            abrir();
            }
        });

    }
    public void abrir(){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.adorocinema.com/filmes/filme-133535/"));
        startActivity(intent);
    }
}