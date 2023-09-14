package com.example.insuranceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Register1 extends AppCompatActivity {

    /*Register first page*/
    private EditText editTextPhone;
    private Button buttonGetStarted;
    private ImageView productsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        setregisterfirstvar();


        buttonGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setValidation();
            }
        });

        productsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg1ToProduct = new Intent(Register1.this, Products.class);
                startActivity(reg1ToProduct);
            }
        });
    }


    public void setValidation(){
        String regexPattern = "^[2-9]\\d{9}$";

        if(editTextPhone.getText().toString().isEmpty() || editTextPhone.getText().toString().length()!=10){
            editTextPhone.setError("Please enter valid number");
        }
        else if(editTextPhone.getText().toString().matches(regexPattern)){
            editTextPhone.setError(null);
            Intent Reg1ToReg2 = new Intent(Register1.this, Register2.class);
            startActivity(Reg1ToReg2);
        }
    }

    public void setregisterfirstvar(){
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonGetStarted = findViewById(R.id.buttonGetStarted);
        productsbtn = findViewById(R.id.productsbtn);
    }
}