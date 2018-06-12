package com.dev.class3;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

public class Utils {
    public static boolean  phoneChecker(EditText edtPhone){
        String regEx = "^[0-9]{10}$";

        if(!edtPhone.getText().toString().matches(regEx)){
            edtPhone.requestFocus();
            edtPhone.setError("Invalid number");
            return false;
        }
        return true;
    }
    public static boolean emailChecker(EditText edtEmail){
        if(!Patterns.EMAIL_ADDRESS.matcher(edtEmail.getText().toString()).matches()){
            edtEmail.requestFocus();
            edtEmail.setError("Email is incorrect");
            return false;
        }
        return true;
    }

    public static boolean isTextEntered(EditText editText){
        if(TextUtils.isEmpty(editText.getText().toString())){
            editText.requestFocus();
            String h;
            editText.setError("Required");
            return  false;
        }
        return true;
    }

    public static boolean passwordChecker(EditText password,EditText edtConfirmPassword){

        if(password.getText().toString().length()>=6){
            if(password.getText().toString().equals(edtConfirmPassword.getText().toString())){
                return true;
            }else {
                edtConfirmPassword.requestFocus();
                edtConfirmPassword.setError("Password does not match");
                return false;
            }
        }else {
            password.requestFocus();
            password.setError("Must be six characters");
            return false;
        }
    }


}
