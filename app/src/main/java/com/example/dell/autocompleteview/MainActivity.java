package com.example.dell.autocompleteview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String alist[] = {"aamin", "anamika", "richa", "aditya", "rishav", "shimran", "shikha",  "rahul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autocompview);
        ArrayAdapter<String> adt = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item ,alist);
        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(adt);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tx = (TextView)view;
                String str = tx.getText().toString();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });
    }
}
