package com.example.tapfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jogo extends AppCompatActivity {
    Button btnstatus;
    Integer dano,vida;
    Button  btnataque;
    TextView txtvida;
    String stringvida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        txtvida = findViewById(R.id.txtvida);
        btnataque = findViewById(R.id.btnataque);
        btnstatus = findViewById(R.id.btnstatus);

        vida = 10000;
        dano = 5;


        btnataque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               vida= vida-dano;
               if (vida<9950){
                   dano=dano +1;
               }
               if (vida <= 0){
                   abrir2();
               }

               stringvida=Integer.toString(vida);
               txtvida.setText(stringvida);



            }
        });

        btnstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrir();
            }
        });
    }

    public void abrir(){
        Intent intent=new Intent(this,status.class);
        startActivity(intent);
    }
public void abrir2() {
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
}
}