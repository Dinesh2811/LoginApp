package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPassword extends MainActivity {

    TextView SignIN;
    Button FP_SetPassword,FP_OTPVerify,FP_getOTP;
    EditText FP_email,FP_OTP,FP_Password,FP_confirmPassword;

    String email,otp,password,confirmPasswprd;
    DatabaseHandler db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpass_page);

        SignIN = (TextView) findViewById(R.id.SignIN);
        FP_SetPassword = (Button) findViewById(R.id.FP_SetPassword);
        FP_OTPVerify = (Button) findViewById(R.id.FP_OTPVerify);
        FP_getOTP = (Button) findViewById(R.id.FP_getOTP);
        FP_email = (EditText) findViewById(R.id.FP_email);
        FP_OTP = (EditText) findViewById(R.id.FP_OTP);
        FP_Password = (EditText) findViewById(R.id.FP_Password);
        FP_confirmPassword = (EditText) findViewById(R.id.FP_confirmPassword);

        FP_SetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = FP_email.getText().toString();
                otp = FP_OTP.getText().toString();
                password = FP_Password.getText().toString();
                confirmPasswprd = FP_confirmPassword.getText().toString();

                if (email.equals("") | otp.equals("") | password.equals("") | confirmPasswprd.equals("")){
                    Toast.makeText(ForgotPassword.this, "Please fill all field", Toast.LENGTH_SHORT).show();
                }else if(confirmPasswprd.equals(password)){
                    Toast.makeText(ForgotPassword.this, "Please make sure your password match", Toast.LENGTH_SHORT).show();
                    
                }
            }
        });

        SignIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
            }
        });
    }
}
