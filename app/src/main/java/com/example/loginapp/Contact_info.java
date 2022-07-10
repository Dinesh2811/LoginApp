package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.loginapp.UI_1.About_Us;
import com.example.loginapp.UI_1.Contact_Us;
import com.example.loginapp.UI_1.Disclaimer;
import com.example.loginapp.UI_1.Privacy_Policy;

public class Contact_info extends MainActivity {

    TextView Contact_info_About_Us,Contact_info_Disclaimer,Contact_info_Privacy_Policy,
            Contact_info_Contact_Us,Contact_info_Plans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_info_fragment);

        Contact_info_About_Us = (TextView) findViewById(R.id.Contact_info_About_Us);
        Contact_info_Disclaimer = (TextView) findViewById(R.id.Contact_info_Disclaimer);
        Contact_info_Privacy_Policy = (TextView) findViewById(R.id.Contact_info_Privacy_Policy);
        Contact_info_Contact_Us = (TextView) findViewById(R.id.Contact_info_Contact_Us);
        Contact_info_Plans = (TextView) findViewById(R.id.Contact_info_Plans);

        Contact_info_About_Us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), About_Us.class);
                startActivity(intent);
            }
        });

        Contact_info_Disclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Disclaimer.class);
                startActivity(intent);
            }
        });

        Contact_info_Privacy_Policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Privacy_Policy.class);
                startActivity(intent);
            }
        });

        Contact_info_Contact_Us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Contact_Us.class);
                startActivity(intent);
            }
        });

    }
}
