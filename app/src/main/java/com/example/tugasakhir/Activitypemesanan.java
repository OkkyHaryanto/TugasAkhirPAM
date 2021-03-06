package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activitypemesanan extends AppCompatActivity {
    TextView dtlpesanan, dtlnama, dtlalamat, dtltelepon; //deklarasi variabel
    Button btnkembalii, btndtlpesan;
    EditText dtlnamaa, dtlalamatt, dtlteleponnn, dtlpesanann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitypemesanan);

        dtlpesanan = findViewById(R.id.pesanaan);
        dtlnama = findViewById(R.id.namaa); //untuk menghubungkan pada tampilan yang ada dilayout
        dtlalamat = findViewById(R.id.alamatt);
        dtltelepon = findViewById(R.id.teleponn);
        btnkembalii = findViewById(R.id.btnkembali);
        btndtlpesan = findViewById(R.id.btnpsan);
        dtlnamaa = findViewById(R.id.nama);
        dtlalamatt = findViewById(R.id.alamat);
        dtlteleponnn = findViewById(R.id.telepon);
        dtlpesanann = findViewById(R.id.pesanan);

        btnkembalii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class); //untuk berpindah layout homeactivity
                startActivity(i);
            }
        });

        btndtlpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dtlnamaa.getText().toString().isEmpty() || //input harus diisi
                        dtlalamatt.getText().toString().isEmpty() ||
                        dtlnamaa.getText().toString().isEmpty() ||
                        dtlpesanann.getText().toString().isEmpty() ||
                        dtlteleponnn.getText().toString().isEmpty()) {
                    dtlnamaa.setError("Masukkan Nama");
                    dtlalamatt.setError("Masukkan Alamat"); //memberi tanda eror dan harus diisi
                    dtlteleponnn.setError("Masukkan Nomor Telepon");
                    dtlpesanann.setError("Masukkan Berapa pesanan");
                } else {
                    Toast.makeText(getApplicationContext(), "Pesanan sedang diBuat dan Akan Dikirim", //untuk memunculakn pemberitahuan kalau makan akan dibuat
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), HomeActivity.class); //untuk berpindah layout
                    startActivity(i);
                }
            }
        });
    }
}