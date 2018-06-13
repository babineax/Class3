package com.dev.class3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.dev.class3.Utils.emailChecker;
import static com.dev.class3.Utils.isTextEntered;

public class LoginActivity extends AppCompatActivity {

    Intent data;
    User user;
    String email, password;
    private EditText edtEmail,edtPasswords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail=findViewById(R.id.edt_email_login);
        edtPasswords=findViewById(R.id.edt_password_login);

        data = getIntent();

        user = data.getParcelableExtra("data");

        email = user.getEmail();
        password = user.getPassword();


    }

    public void loggin(View view) {

        if(isTextEntered(edtEmail)&&isTextEntered(edtPasswords)&&emailChecker(edtEmail)){

            if (email.equals(edtEmail.getText().toString())) {
                if (password.equals(edtPasswords.getText().toString())) {

                    Intent intent = new Intent(LoginActivity.this, DisplayActivity.class);
                    intent.putExtra("data", user);
                    startActivity(intent);
                } else {
                    edtPasswords.requestFocus();
                    edtPasswords.setError("Wrong password");
                }
            } else {
                edtEmail.requestFocus();
                edtEmail.setError("Wrong email");
            }

        }

    }
}
