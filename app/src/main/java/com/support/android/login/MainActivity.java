package com.support.android.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mRegistration;
    EditText email;
    EditText pass;
    static final String KEY_EMAIL = "username";
    static final String KEY_PASSWORD = "password";
    Button mSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Intent intent = new Intent(getApplicationContext(),Reg_Form.class);
        startActivity(intent);

        UID();

/*        mRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Reg_Form.class);
                startActivity(intent);
            }
        });
        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences myPrefs = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE);
                String mail = myPrefs.getString("email","None");
                String password = myPrefs.getString("passWord","");
                String emailText = email.getText().toString();
                String passtext = pass.getText().toString();
                if ( emailText.equals(mail) && passtext.equals(password)) {

                    Intent intent = new Intent(getApplicationContext(), AfterLogIn.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Email or Password Please Check again" ,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
*/
    }

    public  void UID () {

        email = findViewById(R.id.your_email_address);
        pass = findViewById(R.id.create_new_password);
        mRegistration = findViewById(R.id.registration);
        mSignIn = findViewById(R.id.signin);

    }

    public void SP (){

    }
}
