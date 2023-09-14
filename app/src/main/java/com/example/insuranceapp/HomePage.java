package com.example.insuranceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class HomePage extends AppCompatActivity {
    private boolean isMenuOpen = false;
    private View sideMenu;
    private View hamburger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        hamburger = findViewById(R.id.hamburger);
        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(HomePage.this, hamburger);
                popupMenu.getMenuInflater().inflate(R.menu.drawer_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        // Handle menu item clicks here
                        if(menuItem.getItemId() == R.id.UserProfile) {
                            Intent homeToUser = new Intent(HomePage.this, UserProfile.class);
                            startActivity(homeToUser);
                            return true;
                        }
                        else if(menuItem.getItemId() == R.id.Login){
                            Intent homeToLogin = new Intent(HomePage.this, MainActivity.class);
                            startActivity(homeToLogin);
                            return true;
                        }
                        else if(menuItem.getItemId() == R.id.Signup){
                            Intent homeToRegister1 = new Intent(HomePage.this, Register1.class);
                            startActivity(homeToRegister1);
                            return true;
                        }
                        else if(menuItem.getItemId() == R.id.ContactUs){
                            Intent homeToContact = new Intent(HomePage.this, ContactUs.class);
                            startActivity(homeToContact);
                            return true;
                        }
                        else if(menuItem.getItemId() == R.id.faq){
                            Intent homeToFAQ = new Intent(HomePage.this, FAQ.class);
                            startActivity(homeToFAQ);
                            return true;
                        }
                        else{
                            Intent homeToHome = new Intent(HomePage.this, HomePage.class);
                            startActivity(homeToHome);
                            return false;
                        }

                    }
                });

                popupMenu.show();
            }
        });
    }
}