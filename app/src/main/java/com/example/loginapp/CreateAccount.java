package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends MainActivity {

    TextView SignIN;
    EditText SignUP_Name,SignUP_No,SignUP_email,SignUP_OTP,SignUP_Password;
    Button SignUP_OTPVerify,SignUP_getOTP,SignUP;

    TextView textView10;

    String name, contact, email, otp, password;
    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);

        SignIN = (TextView) findViewById(R.id.SignIN);
        SignUP_OTPVerify = (Button) findViewById(R.id.SignUP_OTPVerify);
        SignUP_getOTP = (Button) findViewById(R.id.SignUP_getOTP);
        SignUP = (Button) findViewById(R.id.SignUP);
        SignUP_Name = (EditText) findViewById(R.id.SignUP_Name);
        SignUP_No = (EditText) findViewById(R.id.SignUP_No);
        SignUP_email = (EditText) findViewById(R.id.SignUP_email);
        SignUP_OTP = (EditText) findViewById(R.id.SignUP_OTP);
        SignUP_Password = (EditText) findViewById(R.id.SignUP_Password);

        textView10 = (TextView) findViewById(R.id.textView10);

        db = new DatabaseHandler(this);

        SignIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
            }
        });


        SignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = SignUP_Name.getText().toString();
                contact = SignUP_No.getText().toString();
                email = SignUP_email.getText().toString();
                otp = SignUP_OTP.getText().toString();
                password = SignUP_Password.getText().toString();

                if(name.equals("") | contact.equals("") | email.equals("") | otp.equals("") | password.equals("")){
                    Toast.makeText(CreateAccount.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }else{
                    db.addEmployee(name,contact,email,otp,password);

                    Toast.makeText(CreateAccount.this,"Data saved successfully.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = db.getEmployee();

                if (data.equals("")){
                    Toast.makeText(CreateAccount.this,"No data found.", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(CreateAccount.this, test.class);
                    startActivity(intent);
                }
            }
        });


    }
}
