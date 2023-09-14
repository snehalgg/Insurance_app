package com.example.insuranceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class Register2 extends AppCompatActivity {

    private EditText editTextName,editTextEmail;
    private ImageView back;
    private Button continuebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register2);
        setregister2var();
        continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register2validate();
            }
        });

        back = findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Register2ToRegister1 = new Intent(Register2.this, Register1.class);
                startActivity(Register2ToRegister1);
            }
        });
    }


    public void register2validate(){
        if(editTextName.getText().toString().isEmpty() || editTextEmail.getText().toString().isEmpty() ){
            editTextName.setError("Please enter Name");
            editTextEmail.setError("Please enter email");


            return;
        }
        else{
            editTextName.setError(null);
            editTextEmail.setError(null);

            Intent reg2ToTermsAndCondition = new Intent(Register2.this, TermsAndCondition.class);
            startActivity(reg2ToTermsAndCondition);
        }
    }
    public void setregister2var(){
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);

        continuebtn = findViewById(R.id.continuebtn);
    }
}