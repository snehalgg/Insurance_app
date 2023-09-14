package com.example.insuranceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TermsAndCondition extends AppCompatActivity {

    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);

        TextView termsConditionsTextView = findViewById(R.id.tvTermsConditions);
        Button acceptButton = findViewById(R.id.btnAccept);

        // Set your terms and conditions text here
        String termsAndConditionsText = "By using our insurance services, you agree to these Terms and Conditions. If you disagree, please refrain from using our services.\n" +
                "\n" +
                "Your data is subject to our Privacy Policy, which details how we collect and use your information.\n" +
                "\n" +
                "Insurance coverage is subject to policy terms. Read your insurance policy for specific details on coverage, exclusions, and limitations.\n" +
                "\n" +
                "Premiums are due as per your policy. Failure to pay may result in the cancellation of your insurance coverage.\n" +
                "\n" +
                "Claims are subject to our claims process, which you must follow for consideration.\n" +
                "\n" +
                "You can cancel your policy according to the terms outlined in your insurance policy.\n" +
                "\n" +
                "We reserve the right to terminate services in accordance with our policies.\n" +
                "\n" +
                "We provide insurance services \"as is\" without warranties. We are not liable for indirect or consequential damages.\n" +
                "\n" +
                "These Terms are governed by the laws of [Your Jurisdiction].\n" +
                "\n" +
                "For specific details, please refer to your insurance policy document.\n" +
                "\n" +
                "Last updated: 23 Aug 2023";
        termsConditionsTextView.setText(termsAndConditionsText);

        // Handle the button click to accept
        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your logic for handling acceptance here
                // For example, you can start the next activity or save acceptance status.

                Intent TermsToHome = new Intent(TermsAndCondition.this, HomePage.class);
                startActivity(TermsToHome);

            }
        });


        back = findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TermsToReg2 = new Intent(TermsAndCondition.this, Register2.class);
                startActivity(TermsToReg2);
            }
        });
    }

}