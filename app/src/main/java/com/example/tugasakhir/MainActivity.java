package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnmasuk, btndaftar; //deklaasi variabel
    EditText edemail, edpassword;

    //menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk menghubungkan pada button yang ada ditampilan layout
        btnmasuk = findViewById(R.id.btnsignin);
        edemail = findViewById(R.id.username);
        edpassword = findViewById(R.id.password);
        btndaftar = findViewById(R.id.btndaftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Daftar.class);
                startActivity(i);
            }
        });

        btnmasuk.setOnClickListener(new View.OnClickListener() { //agar tombol button bisa diklik
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString(); //untuk menyimpan nama pengguna
                password = edpassword.getText().toString();
                String email = "okky"; //untuk mendeteksi apa benar email yang dimasukan
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) { //untuk mendekteksi kalau email dan password tidak boleh dikosongkan / harus diisi
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG);
                    edemail.setError("Email dan Password tidak boleh kosong");
                    edpassword.setError("Email dan Password tidak boleh kosong"); //memunculkan tulisan kalau email dan password haarus diisi
                    t.show();

                } else {

                    //untuk cek kalau email dan password yang dimasukan udah benar dan sukses login

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());


                        //untuk berpindah ke layout homeactivity
                        Intent i = new Intent(getApplicationContext(), HomeActivity.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        edemail.setError("Login Gagal"); //untuk memunculkan tulisan login gagal
                        edpassword.setError("Login Gagal");
                        t.show();
                    }
                }
            }
        });
    }
}