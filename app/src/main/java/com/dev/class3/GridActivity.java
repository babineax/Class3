package com.dev.class3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    GridView gridView;

    public ArrayList<Contact> generateContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact c;
        for (int a = 0; a < 50; a++) {
            c = new Contact();
            c.setFirstName("Mr firstname.." + a);
            c.setSecondName("Mr lastname.." + a);
            c.setPhone("07*********" + a);
            c.setImage(R.drawable.java);

            if (a % 2 == 0) {
                c.setBloocked(false);
            } else {
                c.setBloocked(true);
            }


            contacts.add(c);

        }


        return contacts;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.grid_contacts);
        gridView.setNumColumns(GridView.AUTO_FIT);

        gridView.setAdapter(new GridAdapter(this, generateContacts()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridActivity.this, "Clicked ", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
