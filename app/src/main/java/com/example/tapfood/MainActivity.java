package com.example.tapfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnjogar;
Button btncredito;
Button btnreceita;
Button btnhistoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhistoria =(Button)findViewById(R.id.btnhistoria);
        btnhistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir4();
            }

        });

        btnreceita =(Button)findViewById(R.id.btnreceita);
        btnreceita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir3();
            }

        });

        btncredito =(Button)findViewById(R.id.btncredito);
        btncredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir2();
            }

        });


        btnjogar =(Button)findViewById(R.id.btnjogar);
        btnjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              abrir();
            }

        });






    }
    public void abrir(){
        Intent intent=new Intent(this,jogo.class);
        startActivity(intent);
    }
    public void abrir2(){
        Intent intent=new Intent(this,creditos.class);
        startActivity(intent);
    }
    public void abrir3(){
        Intent intent=new Intent(this,receita.class);
        startActivity(intent);
    }
    public void abrir4(){
        Intent intent=new Intent(this,configuracao.class);
        startActivity(intent);
    }
}