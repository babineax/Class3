package com.dev.class3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    String[] values = {"Java", "Php", "C++", "C#", "Html", "Golang", "D", "Java", "Php", "C++", "C#", "Html", "Golang", "D", "Java", "Php", "C++", "C#", "Html", "Golang", "D"};
    private String name = "kjnkjl";
    private ListView lstLanguages;
    String title, content;
    Integer image;

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
        setContentView(R.layout.activity_list);

        lstLanguages = findViewById(R.id.lst_languages);


        ListAdapter listAdapter = new ListAdapter(ListActivity.this, R.layout.itemlistrow, generateContacts());

        lstLanguages.setAdapter(listAdapter);

//
//
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
//                this,
//                android.R.layout.simple_list_item_1,
//                android.R.id.text1,
//                values);
//
//        lstLanguages.setAdapter(arrayAdapter);

//        lstLanguages.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                switch (position) {
//                    case 0:
//                        image = R.drawable.java;
//                        title = values[position];
//                        content = getResources().getString(R.string.java_content);
//                        break;
//                    case 1:
//                        image = R.drawable.php;
//                        title = values[position];
//                        content = getResources().getString(R.string.php_content);
//                        break;
//                    case 2:
//                        image = R.drawable.download;
//                        title = values[position];
//                        content = getResources().getString(R.string.cPlus_content);
//                        break;
//                    case 3:
//                        title = values[position];
//                        content = getResources().getString(R.string.c_Sharp);
//                        break;
//                    case 4:
//                        title = values[position];
//                        content = getResources().getString(R.string.Kotlin);
//                        break;
//                    case 5:
//                        title = values[position];
//                        content = getResources().getString(R.string.java_content);
//                        break;
//
//
//                    default:
//                        Toast.makeText(ListActivity.this, "Not found", Toast.LENGTH_SHORT).show();
//
//
//                }
//
//                if (title != null && content != null) {
//                    Intent i = new Intent(ListActivity.this, ContentActivity.class);
//                    i.putExtra("title", title);
//                    i.putExtra("content", content);
//                    i.putExtra("image", image);
//
//
//                    startActivity(i);
//
//                    title = null;
//                    content = null;
//                    image = 0;
//                }
//
//            }
//        });
    }
}
