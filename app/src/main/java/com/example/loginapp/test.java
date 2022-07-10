package com.example.loginapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {
    DatabaseHandler db;
    TextView textView;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.viewSavedData);
        db = new DatabaseHandler(this);

        data = db.getEmployee();
        textView.setText(data);
    }
}
