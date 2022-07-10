package com.example.loginapp.UI_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.loginapp.MainActivity;
import com.example.loginapp.R;
import com.example.loginapp.SignIn;

public class Contact_Us extends MainActivity {

    TextView Contact_us_SignIN;
    Button Contact_us;
    EditText et_Contact_us_Email,et_Subject,et_Message;

    String mail,sub,msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);

        Contact_us_SignIN = (TextView) findViewById(R.id.Contact_us_SignIN);
        Contact_us = (Button) findViewById(R.id.Contact_us);
        et_Contact_us_Email = (EditText) findViewById(R.id.et_Contact_us_Email);
        et_Subject = (EditText) findViewById(R.id.et_Subject);
        et_Message = (EditText) findViewById(R.id.et_Message);

        Contact_us_SignIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignIn.class);
                startActivity(intent);
            }
        });


    }
}
