package com.example.spinner_array;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    Spinner spinner;
    Button user;
    String[]name = {"India", "Pakistan","Bangladesh","Iran","Japan","Singapore"};
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item,name);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        }
@Override
public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView mytext = (TextView) view;
        String text = mytext.getText().toString();
        Toast.makeText(this, "You have selected"+mytext, Toast.LENGTH_SHORT).show();
        }
@Override
public void onNothingSelected(AdapterView<?> parent) {
        }
        public void clickme(View view) {
                // Get the text from the selected item in the spinner
                String selectedCountry = spinner.getSelectedItem().toString();

                // Pass the selected country to the next activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("selected_country", selectedCountry);
                startActivity(intent);
        }
}