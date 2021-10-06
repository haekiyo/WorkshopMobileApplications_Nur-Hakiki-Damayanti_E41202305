package com.kiyo.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    ListView listViewMonth;
    String[] months;

    private static final String[] Kota = new String[]{
            "Ambulu", "Bondowoso", "Cilacap", "Denpasar",
            "Enaratoli", "Fakfak", "Gorontalo", "Indramayu",
            "Jember", "Kebumen", "Lamongan", "Mataram",
            "Nganjuk", "Oksibil", "Pamekasan", "Rantau",
            "Sampang", "Tulungagung", "Ungaran", "Wonogiri"
    };

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Provinsi, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String Provinsi = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),"Choose: "+ Kota , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        listViewMonth = findViewById(R.id.lvmonth);
        months = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        listViewMonth.setAdapter(monthAdapter);
        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String month = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(), "Clicked"+month, Toast.LENGTH_SHORT).show();
            }
        });

        AutoCompleteTextView editText =findViewById(R.id.actv);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Kota);
        editText.setAdapter(adapter1);
    }
}