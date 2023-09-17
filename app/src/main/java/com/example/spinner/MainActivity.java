package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    AutoCompleteTextView actview;
    ArrayList<String> messages = new ArrayList<String>();
    ArrayList<String> messages2 = new ArrayList<String>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Spinner
        spinner = (Spinner) findViewById(R.id.spinner);
        messages.addAll(Arrays.asList("Adhar Card", "Pan Card", "Voter Id Card", "Driving License"));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, messages);
        spinner.setAdapter(adapter);
        
        //AutoCompleteTextView 
        actview = findViewById(R.id.actview);
        messages2.addAll(Arrays.asList("Adhar Card", "Pan Card", "Voter Id Card", "Driving License"));
        ArrayAdapter<String> aview = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,messages2);
        actview.setAdapter(aview);

    }
}