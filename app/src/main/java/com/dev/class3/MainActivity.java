package com.dev.class3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

import static com.dev.class3.Utils.emailChecker;
import static com.dev.class3.Utils.isTextEntered;
import static com.dev.class3.Utils.passwordChecker;
import static com.dev.class3.Utils.phoneChecker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText edtFirstName,edtLastName,edtPhone,edtEmail,edtPassword,edtConfirmPassword;
    private Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstName=findViewById(R.id.edt_firstname);
        edtLastName=findViewById(R.id.edt_lastname);
        edtPhone=findViewById(R.id.edt_phone);
        edtPassword=findViewById(R.id.edt_password);
        edtEmail=findViewById(R.id.edt_email);
        edtConfirmPassword=findViewById(R.id.edt_confirm_password);
        btnSignUp=findViewById(R.id.btn_signup);
        btnSignUp.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_signup){

            if(isTextEntered(edtFirstName)&&isTextEntered(edtLastName)&&isTextEntered(edtEmail)&&isTextEntered(edtPhone)&&isTextEntered(edtPassword)&&isTextEntered(edtConfirmPassword)
                    &&emailChecker(edtEmail)&&phoneChecker(edtPhone)&&passwordChecker(edtPassword,edtConfirmPassword)){

                Intent i=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);

            }
        }

    }


}
