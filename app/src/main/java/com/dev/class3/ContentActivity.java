package com.dev.class3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    private TextView txtTitle, txtContent;
    private ImageView imgLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        txtTitle = findViewById(R.id.txt_title);
        txtContent = findViewById(R.id.txt_content);
        imgLanguage = findViewById(R.id.img_language);

        Intent i = getIntent();

        String title = i.getStringExtra("title");
        String content = i.getStringExtra("content");
        Integer image = i.getIntExtra("image", 0);

        txtTitle.setText(title);
        txtContent.setText(content);
        imgLanguage.setImageResource(image);

    }
}
