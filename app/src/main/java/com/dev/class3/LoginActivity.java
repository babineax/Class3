package com.dev.class3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.dev.class3.Utils.emailChecker;
import static com.dev.class3.Utils.isTextEntered;

public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail,edtPasswords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail=findViewById(R.id.edt_email_login);
        edtPasswords=findViewById(R.id.edt_password_login);

    }

    public void loggin(View view) {

        if(isTextEntered(edtEmail)&&isTextEntered(edtPasswords)&&emailChecker(edtEmail)){

        }

    }
}
