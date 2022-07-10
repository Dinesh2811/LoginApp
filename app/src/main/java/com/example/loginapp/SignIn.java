package com.example.loginapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginapp.UI_1.About_Us;

public class SignIn extends MainActivity {

    EditText Email,Password;
    TextView ForgotPassword,new_SignUp;
    Button SignIN_User;

    String email,password;
    DatabaseHandler databaseHandler = new DatabaseHandler(this);

    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), About_Us.class);
        startActivity(intent);
        Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show();
        SignIn.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_page);

        Email = (EditText) findViewById(R.id.Email);
        Password = (EditText) findViewById(R.id.Password);
        ForgotPassword = (TextView) findViewById(R.id.ForgotPassword);
        new_SignUp = (TextView) findViewById(R.id.new_SignUp);
        SignIN_User = (Button) findViewById(R.id.SignIN_User);

        new_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CreateAccount.class);
                startActivity(intent);
            }
        });

        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });


        SignIN_User.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("Range")
            @Override
            public void onClick(View view) {

                email = Email.getText().toString();
                password = Password.getText().toString();

                if (email.equals("") | password.equals("")){
                    Toast.makeText(SignIn.this, "Please fill all field", Toast.LENGTH_SHORT).show();
                }

                Cursor  cursor = databaseHandler.getData();
                if(cursor.getCount() == 0){
                    Toast.makeText(SignIn.this,"No entries Exists",Toast.LENGTH_LONG).show();
                }
                if (loginCheck(cursor,email,password)) {
                    Intent intent = new Intent(getApplicationContext(), Contact_info.class);
                    startActivity(intent);
                    Toast.makeText(SignIn.this, "logged in", Toast.LENGTH_SHORT).show();
                }else {
//                    AlertDialog.Builder builder = new AlertDialog.Builder(SignIn.this);
//                    builder.setCancelable(true);
//                    builder.setTitle("Wrong Credential");
//                    builder.setMessage("Wrong Credential");
//                    builder.show();

                    Intent intent = new Intent(getApplicationContext(), FragMain1_Deals.class);
                    startActivity(intent);
                }
                databaseHandler.close();
            }
        });
    }

    public static boolean loginCheck(Cursor cursor,String emailCheck,String passCheck) {
        while (cursor.moveToNext()){
            if (cursor.getString(3).equals(emailCheck)) {
                if (cursor.getString(5).equals(passCheck)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
