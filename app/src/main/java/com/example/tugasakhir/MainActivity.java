package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnmasuk, btndaftar;
    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                String email = "okky";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG);
                    edemail.setError("Email dan Password tidak boleh kosong");
                    edpassword.setError("Email dan Password tidak boleh kosong");
                    t.show();

                } else {

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), HomeActivity.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        edemail.setError("Login Gagal");
                        edpassword.setError("Login Gagal");
                        t.show();
                    }
                }
            }
        });
    }
}