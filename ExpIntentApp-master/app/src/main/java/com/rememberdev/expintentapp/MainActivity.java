package com.rememberdev.expintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText edtNama;
    Button btnSend;

    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = findViewById(R.id.edt_nama);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = edtNama.getText().toString();
                    if (nama.length() > 0) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra(KEY_NAME, nama);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "YOU NEED TO FILL YOUR NAME", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}