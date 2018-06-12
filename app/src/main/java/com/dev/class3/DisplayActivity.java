package com.dev.class3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {


    private TextView txtFirstName, txtLastName, txtPhone, txtEmail, txtPassword, txtConfirmPassword;

    private ImageView imgProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        imgProfile = findViewById(R.id.img_profile_image);
        txtFirstName = findViewById(R.id.txt_first_name);
        txtLastName = findViewById(R.id.txt_lastname);
        txtPhone = findViewById(R.id.txt_phone);
        txtEmail = findViewById(R.id.txt_email);


        Intent i = getIntent();
        User us = (User) i.getSerializableExtra("data");
        if (us != null) {
            txtFirstName.setText(us.getFirstName());
            txtLastName.setText(us.getLastName());
            txtPhone.setText(us.getPhone());
            txtEmail.setText(us.getEmail());

            imgProfile.setImageResource(R.drawable.imagetest);

        }
      
    }
}
