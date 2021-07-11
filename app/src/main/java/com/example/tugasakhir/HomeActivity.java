package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btngulai, btnsate, btntongseng, btntengkleng; //deklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btngulai = findViewById(R.id.btngulaiii); //untuk menghubungkan pada button yang ada ditampilan layout
        btnsate = findViewById(R.id.btnsateee);
        btntongseng = findViewById(R.id.btntongsenggg);
        btntengkleng = findViewById(R.id.btntengklenggg);

        btngulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activitypemesanan.class); //untuk berpindah layout ke activitypemesanan
                startActivity(i);
            }
        });

        btnsate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activitypemesanan.class);
                startActivity(i);
            }
        });

        btntongseng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activitypemesanan.class);
                startActivity(i);
            }
        });

        btntengkleng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activitypemesanan.class);
                startActivity(i);
            }
        });
    }
}