package com.dev.class3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] values = {"Java", "Php", "C++", "C#", "Html", "Golang", "D", "Java", "Php", "C++", "C#", "Html", "Golang", "D", "Java", "Php", "C++", "C#", "Html", "Golang", "D"};
    private String name = "kjnkjl";
    private ListView lstLanguages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lstLanguages = findViewById(R.id.lst_languages);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                values);

        lstLanguages.setAdapter(arrayAdapter);

        lstLanguages.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "Item " + values[position] + " Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
