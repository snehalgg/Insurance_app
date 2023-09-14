package com.example.insuranceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FAQ extends AppCompatActivity {

    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        LinearLayout faqContainer = findViewById(R.id.faqContainer);
        String[][] faqs = {
                {"Q1: What types of insurance are available?", "A1: There are various types of insurance available, including health insurance, life insurance, auto insurance, home insurance, and many others."},
                {"Q2: How does health insurance work?", "A2: Health insurance is a contract between you and an insurance company. You pay regular premiums, and in return, the insurer covers a portion of your medical expenses when you require healthcare services. The coverage may include doctor visits, hospital stays, prescriptions, and preventive care, among other things."},
                {"Q3: What is the difference between life insurance and health insurance?", "A3: Life insurance provides a financial benefit to your beneficiaries upon your death. It helps provide financial security to your loved ones. In contrast, health insurance covers medical expenses while you are alive."},
                {"Q4: Do I need insurance for my car?", "A4: Yes, if you own a car, you typically need auto insurance. Auto insurance is mandatory in many places and provides financial protection in case of accidents, theft, or damage to your vehicle."},
                {"Q5: How can I lower my insurance premiums?", "A5: You can lower your insurance premiums by maintaining a good driving record (for auto insurance), opting for a higher deductible, bundling multiple insurance policies."}
        };

        for (String[] faq : faqs) {
            String question = faq[0];
            String answer = faq[1];

            TextView questionTextView = new TextView(this);
            questionTextView.setText(question);
            questionTextView.setTextSize(18);
            questionTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            questionTextView.setPadding(0, 16, 0, 8);

            TextView answerTextView = new TextView(this);
            answerTextView.setText(answer);
            answerTextView.setTextSize(16);
            answerTextView.setPadding(0, 0, 0, 16);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(0, 0, 0, 16);

            faqContainer.addView(questionTextView, params);
            faqContainer.addView(answerTextView, params);
        }

        back = findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent faqToHome = new Intent(FAQ.this, HomePage.class);
                startActivity(faqToHome);
            }
        });
    }


}