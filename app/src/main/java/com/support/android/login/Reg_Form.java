package com.support.android.login;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by emd on 3/29/2018.
 */


public class Reg_Form extends AppCompatActivity {

    static final String KEY_USERNAME = "username";
    static final String KEY_PASSWORD = "password";
    static final String KEY_EMAIL = "email";
    static final String KEY_PHONE = "phone";

    EditText usernameEditText;
    EditText passwordEditText;
    EditText emailEditText;
    EditText phoneEditText;



    Button mSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_form);

        usernameEditText = findViewById(R.id.your_full_name);
        passwordEditText = findViewById(R.id.create_new_password);
        phoneEditText = findViewById(R.id.create_new_number);
        emailEditText = findViewById(R.id.your_email_address);


        mSignUp = findViewById(R.id.signup);
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usern = usernameEditText.getText().toString();
                String passow = passwordEditText.getText().toString();
                String phone = passwordEditText.getText().toString();
                String email = passwordEditText.getText().toString();

                SharedPreferences prefs = getSharedPreferences("mySharedPref",MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("userName", usern );
                editor.putString("passWord", passow );
                editor.putString("phone", phone );
                editor.putString("email", email );
                editor.apply();
                finish();
            }
        });
    }


}
