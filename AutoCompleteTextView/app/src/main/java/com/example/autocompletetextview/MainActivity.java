package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] wisata = new String[] {
            "Kepulauan Raja Ampat, Papua Barat",
            "Kawah Ijen Banyuwangi, Jawa Timur",
            "Nusa Penida, Bali",
            "Danau Toba, Sumatra Utara",
            "Wae Rebo, Nusa Tenggara Timur",
            "Gunung Bromo, Jawa Timur",
            "labuan Bajo, Nusa Tenggara Timur",
            "Terasering Tegallalang Ubud, Bali",
            "Candi Borobudur Magelang, Jawa Tengah",
            "Ngarai Sianok, Sumatra Barat",
            "Kepulauan Bangka Belitung",
            "Kepulauan Derawan, Kalimantan Timur",
            "Lombok, Nusa Tenggara Barat",
            "Uluwatu, Bali",
            "Danau Kelimutu, Nusa Tenggara Timur"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, wisata);
        editText.setAdapter(adapter);
    }
}