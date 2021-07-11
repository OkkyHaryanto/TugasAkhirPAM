package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tugasakhir.MainActivity;
import com.example.tugasakhir.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Daftar extends AppCompatActivity {

    EditText usr, email, alamat, pwd, repwd; //deklarasi variabel
    Button btnrgs, btnbatal;
    CheckBox jenisklm, agama;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        usr = findViewById(R.id.redtnama);//untuk menghubungkan pada tampilan yang ada dilayout
        email = findViewById(R.id.redtemail);
        alamat = findViewById(R.id.redtalamat);
        pwd = findViewById(R.id.redtpassword);
        repwd = findViewById(R.id.redtrepassword);
        btnrgs = findViewById(R.id.rbtndaftar);
        btnbatal = findViewById(R.id.rbtnbatal);
        jenisklm = findViewById(R.id.checkBox);
        jenisklm = findViewById(R.id.checkBox2);

        btnrgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().isEmpty() || //input yang harus diisi dan tidak boleh kosong
                        email.getText().toString().isEmpty() ||
                        alamat.getText().toString().isEmpty() ||
                        pwd.getText().toString().isEmpty() ||
                        repwd.getText().toString().isEmpty() ||
                        jenisklm.getText().toString().isEmpty() ||
                        agama.getText().toString().isEmpty()) {
                    usr.setError("Masukkan Nama"); //memunculkan tanda perintah kalau harus dimasukan
                    email.setError("Masukkan Email");
                    alamat.setError("Masukkan Alamat");
                    pwd.setError("Masukkan Password");
                    repwd.setError("Masukkan Re-Password");
                } else {
                    if (pwd.getText().toString().equals(repwd.getText().toString())) { //untuk mengecek isi dari password dan repassword kalau yang dimasukan udah sama
                        Toast.makeText(getApplicationContext(), "registration is successful",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "password and repassword must be same",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
        btnbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class); //untuk berpindah layout
                startActivity(i);
            }
        });

    }
}