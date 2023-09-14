package com.example.insuranceapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Login page */
    private EditText username,password;
    private Button loginButton;
    private TextView signupText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        setLoginpageVar();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    username.setError(null);
                    password.setError(null);

                    Intent homepageFromLogin = new Intent(MainActivity.this, HomePage.class);
                    startActivity(homepageFromLogin);
                }
                else{
                    username.setError("Please enter valid username");
                    password.setError("Please enter valid password");
                    Toast.makeText(MainActivity.this, "Login Failed",Toast.LENGTH_LONG).show();

                }
            }
        });

        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg1 = new Intent(MainActivity.this, Register1.class);
                startActivity(reg1);
            }
        });

    }






    public void setLoginpageVar(){
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signupText = findViewById(R.id.signupText);
    }
}