package com.example.pert3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void kebiodata(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(a);
    }
    public void kehome(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(a);
    }
}