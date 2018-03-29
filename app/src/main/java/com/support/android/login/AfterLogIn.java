package com.support.android.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by emd on 3/29/2018.
 */

public class AfterLogIn extends AppCompatActivity {

    TextView name;
    TextView hello;
    TextView email;
    TextView number;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        SharedPreferences myPrefs = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE);
        final String email1 = myPrefs.getString("email","None");
        final String name1 = myPrefs.getString("userName","None");
        final String number1 = myPrefs.getString("phone","None");
        final String password1 = myPrefs.getString("passWord","");

        name = findViewById(R.id.full_name);
        email = findViewById(R.id.Email);
        number = findViewById(R.id.Phone);
        password = findViewById(R.id.Password);
        hello = findViewById(R.id.hello);

        name.setText(name1);
        email.setText(email1);
        number.setText(number1);
        password.setText(password1);
        hello.setText(name1);
    }
}
