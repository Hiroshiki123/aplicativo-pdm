package com.example.shadowplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    float levels = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void back(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }

    public void level1(View view){
        levels = 1;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level2(View view){
        levels = 2;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level3(View view){
        levels = 3;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level4(View view){
        levels = 4;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level5(View view){
        levels = 5;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level6(View view){
        levels = 6;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level7(View view){
        levels = 7;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level8(View view){
        levels = 8;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void level9(View view){
        levels = 9;
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }

}